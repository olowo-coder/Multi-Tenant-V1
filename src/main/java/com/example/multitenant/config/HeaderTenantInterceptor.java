//package com.example.multitenant.config;
//
//import com.example.multitenant.interceptor.TenantContext;
//import org.springframework.stereotype.Component;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.context.request.WebRequestInterceptor;
//
//@Component
//public class HeaderTenantInterceptor implements WebRequestInterceptor {
//
//    public static final String TENANT_HEADER = "X-tenant";
//
//    @Override
//    public void preHandle(WebRequest request) throws Exception {
//        TenantContext.setCurrentTenant(request.getHeader(TENANT_HEADER));
//    }
//
//    @Override
//    public void postHandle(WebRequest request, ModelMap model) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(WebRequest request, Exception ex) throws Exception {
//
//    }
//}
