package com.shawnyan.chapter2.service;

import com.shawnyan.chapter2.helper.DatabaseHelper;
import com.shawnyan.chapter2.model.Customer;
import com.shawnyan.chapter2.util.PropsUtil;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;

/**
 * 提供客户数据服务
 * <p>
 * Created by SHAWN on 6/21/2017.
 */
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);


    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
// TODO
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
