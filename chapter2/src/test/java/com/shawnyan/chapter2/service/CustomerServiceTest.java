package com.shawnyan.chapter2.service;

import com.shawnyan.chapter2.model.Customer;
import org.junit.Assert;

import java.util.List;


/**
 * Created by SHAWN on 6/21/2017.
 *
 * CustomerService 单元测试
 */
public class CustomerServiceTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public List<Customer> getCustomerList() throws Exception {
        List<Customer> customerList = getCustomerList();
        Assert.assertEquals(2,customerList.size());
        return customerList;
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