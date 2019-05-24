package com.miracle.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.wechat.dao.ProductCategoryDao;
import com.miracle.wechat.entity.ProductCategory;

@Service
public class ProductCategoryService {

	@Autowired
	ProductCategoryDao productCategoryDao;
	
	public void insertProductCategory(ProductCategory productCategory){
		productCategoryDao.insertProductCategory(productCategory);
	}
	
	public void updateProductCategory(ProductCategory productCategory){
		productCategoryDao.updateProductCategory(productCategory);
	}
	
	public void deleteProductCategory(ProductCategory productCategory){
		productCategoryDao.deleteProductCategory(productCategory);
	}
	
	public ProductCategory findProductCategoryById(int id){
		return productCategoryDao.findProductCategoryById(id);
	}
}
