/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * muyu@yiji.com 2016-04-06 20:57 创建
 *
 */
package com.vito16.shop.result;

import java.io.Serializable;

import com.vito16.shop.common.Status;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/06
 */
public class Result implements Serializable {
    /**
     * 处理结果码
     */
    private String code;

    /**
     * 处理结果信息
     */
    private String message;

    /**
     * 处理结果状态
     */
    private Status status;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
