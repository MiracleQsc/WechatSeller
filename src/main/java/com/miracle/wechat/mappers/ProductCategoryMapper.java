package com.miracle.wechat.mappers;

import com.miracle.wechat.entity.ProductCategory;

public interface ProductCategoryMapper {

	public void insertProductCategory(ProductCategory productCategory);
	
	public void updateProductCategory(ProductCategory productCategory);
	
	public void deleteProductCategory(ProductCategory productCategory);
	
	public ProductCategory findProductCategoryById(int id);
	
}
