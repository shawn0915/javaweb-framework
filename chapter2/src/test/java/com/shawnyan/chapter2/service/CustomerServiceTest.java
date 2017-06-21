package com.shawnyan.chapter2.service;

import com.shawnyan.chapter2.helper.DatabaseHelper;
import com.shawnyan.chapter2.model.Customer;
import com.shawnyan.chapter2.service.CustomerService;
import org.junit.Assert;

import java.util.List;


/**
 * Created by SHAWN on 6/21/2017.
 *
 * CustomerService 单元测试
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = null;
    }

    @org.junit.Before
    public void init() throws Exception {
        DatabaseHelper.executeSqlFile("sql/demo_test.sql");
    }

    @org.junit.Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2,customerList.size());
    }

    @org.junit.Test
    public void getCustomer() throws Exception {
//        long id = 1;
//        Customer customer = getCustomer(id);
//        Assert.assertNotNull(customer);
        return;
    }

    @org.junit.Test
    public void createCustomer() throws Exception {
    }

    @org.junit.Test
    public void updateCustomer() throws Exception {
    }

    @org.junit.Test
    public void deleteCustomer() throws Exception {
    }

}