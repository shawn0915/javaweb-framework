package com.shawnyan.chapter2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by SHAWN on 6/20/2017.
 *
 * 創建客戶
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet{

    /**
     * 進入 創建客戶 界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        TODO
    }

    /**
     * 處理 創建客戶 請求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        // TODO
    }
}
