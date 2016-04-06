/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * muyu@yiji.com 2016-04-06 21:00 创建
 *
 */
package com.vito16.shop.order;

/**
 * 分页查询基础Order
 *
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/06
 */
public class QueryPageOrder extends QueryOrder {
    private int pageSize;
    private int currentPage;
    private int total;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
