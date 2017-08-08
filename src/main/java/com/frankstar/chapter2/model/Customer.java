package com.frankstar.chapter2.model;

import lombok.Data;

/**
 * Author    :  frankstar
 * AddTime   :  2017/8/8
 * EMail     :  yehongxing@meituan.com
 * Project   :  chapter1
 */
@Data
public class Customer {

    /**
     * ID
     */
    private long id;

    /**
     * name
     */
    private String name;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     *  邮箱地址
     */
    private String email;

    /**
     * 备注
     */
    private String remark;

}
