package com.vito16.shop.test;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.vito16.shop.model.Admin;
import com.vito16.shop.model.Product;
import com.vito16.shop.service.AdminService;
import com.vito16.shop.service.ProductService;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/03/14
 */
public class ProductTest extends BaseTest {

    @Autowired
    AdminService adminService;
    @Autowired
    ProductService productService;

    @Test
    public void testAddProduct() {
        Admin admin = adminService.findOne(1);
        Product product = new Product();
        product.setCreateTime(new Date());
        product.setInputUser(admin);
        product.setCode("KDF-SD1-200");
        product.setStock(200l);
        product.setModel("400CM");
        product.setPoint(200);
        product.setTitle("3T Pro 铝坐管");

        Product product2 = new Product();
        product2.setCreateTime(new Date());
        product2.setInputUser(admin);
        product2.setCode("BMC-SLR01-54");
        product2.setStock(200l);
        product2.setModel("54");
        product2.setPoint(19999);
        product2.setTitle("MBC SLR01 车队版碳纤维车架");

        productService.save(product2);
        productService.save(product);

    }

}
