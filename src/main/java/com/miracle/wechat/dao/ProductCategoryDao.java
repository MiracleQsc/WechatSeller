package com.miracle.wechat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.miracle.wechat.entity.ProductCategory;
import com.miracle.wechat.mappers.ProductCategoryMapper;

/*
 * 
 */
@Component
public class ProductCategoryDao {
	
	@Autowired
	ProductCategoryMapper productCategoryMapper;
	
	public void insertProductCategory(ProductCategory productCategory){
		productCategoryMapper.insertProductCategory(productCategory);
	}
	
	public void updateProductCategory(ProductCategory productCategory){
		productCategoryMapper.updateProductCategory(productCategory);
	}
	
	public void deleteProductCategory(ProductCategory productCategory){
		productCategoryMapper.deleteProductCategory(productCategory);
	}
	
	public ProductCategory findProductCategoryById(int id){
		return productCategoryMapper.findProductCategoryById(id);
	}
}
