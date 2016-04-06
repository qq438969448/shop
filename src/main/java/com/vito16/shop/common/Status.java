/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * muyu@yiji.com 2016-04-06 20:58 创建
 *
 */
package com.vito16.shop.common;

/**
 * 状态枚举
 *
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/06
 */
public enum Status {
    SUCCESS("SUCCESS","成功"),
    FAIL("FAIL","失败")
    ;

    Status(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
