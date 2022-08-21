package com.example.multitenant.config;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceBasedMultiTenantConnectionProviderImpl extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {
    private static final String DEFAULT_TENANT_ID = "example";
    @Autowired
    private DataSource defaultDS;

    @Autowired
    private ApplicationContext context;

    private Map<Object, Object> map = new HashMap<>();

    boolean init = false;

    @PostConstruct
    public void load() {
        map.put(DEFAULT_TENANT_ID, defaultDS);
    }

    @Override
    protected DataSource selectAnyDataSource() {
        return (DataSource) map.get(DEFAULT_TENANT_ID);
    }

    @Override
    protected DataSource selectDataSource(String tenantIdentifier) {
        DataSourceProperties tenantDataSource = context.getBean(DataSourceProperties.class);
        if (!init) {
            init = true;
            map.putAll(tenantDataSource.getDatasources());
            System.out.println("second: " + tenantDataSource.getDatasources().toString());
        }
        return (DataSource) (tenantDataSource.getDatasources().get(tenantIdentifier) != null ? tenantDataSource.getDatasources().get(tenantIdentifier): map.get(DEFAULT_TENANT_ID));
    }
}
