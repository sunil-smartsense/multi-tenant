package com.ss.master;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.Map;

public class MasterService {
    public static Map<Object, Object> getDataSourceHashMap() {
        DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
        dataSource1.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource1.setUrl("jdbc:mariadb://<host>:<port>/<db_1>");
        dataSource1.setUsername("<un>");
        dataSource1.setPassword("<pw>");

        DriverManagerDataSource dataSource2 = new DriverManagerDataSource();
        dataSource2.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource2.setUrl("jdbc:mariadb://<host>:<port>/<db_2>");
        dataSource2.setUsername("<un>");
        dataSource2.setPassword("<pw>");
        HashMap hashMap = new HashMap();
        hashMap.put("tenantId1", dataSource1);
        hashMap.put("tenantId2", dataSource2);
        return hashMap;
    }
}