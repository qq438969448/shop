package com.vito16.shop.dao;

import com.vito16.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * @author Vito
 * @email zhouwentao16@gmail.com
 * @date 2013-7-9
 * 
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	public List<Product> findByOrderByCreateTimeDesc();
    public List<Product> findByOrderByCreateTimeAsc();

	@Query("FROM Product p")
	public List<Product> findPopProducts();

}
