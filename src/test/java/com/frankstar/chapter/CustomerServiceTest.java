package com.frankstar.chapter;

import com.frankstar.chapter2.model.Customer;
import com.frankstar.chapter2.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Author    :  frankstar
 * AddTime   :  2017/8/8
 * EMail     :  yehongxing@meituan.com
 * Project   :  chapter1
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init() {
        //初始化数据库
    }

    @Test
    public void getCustomerListTest() {

        List<Customer> customers = customerService.getCustomerList();
        Assert.assertEquals(2, customers.size());
    }




}
