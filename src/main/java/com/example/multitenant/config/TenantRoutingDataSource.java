//package com.example.multitenant.config;
//
//import com.example.multitenant.interceptor.TenantContext;
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TenantRoutingDataSource extends AbstractRoutingDataSource {
//
//    @Override
//    protected Object determineCurrentLookupKey() {
//        return TenantContext.getCurrentTenant();
//    }
//
//}
