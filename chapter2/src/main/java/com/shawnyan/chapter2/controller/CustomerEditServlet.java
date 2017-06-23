package com.shawnyan.chapter2.controller;

import com.shawnyan.chapter2.service.CustomerService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 客户编辑
 *
 * Created by SHAWN on 6/21/2017.
 */
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet{

    private CustomerService customerService;


}
