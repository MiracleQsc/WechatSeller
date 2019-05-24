package com.miracle.wechat.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.wechat.App;
import com.miracle.wechat.entity.ProductCategory;
import com.miracle.wechat.service.ProductCategoryService;

@RestController
@RequestMapping("/Wechat")
public class SellerController {
	
	private static Logger logger = Logger.getLogger(SellerController.class);
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@RequestMapping("/addProductCategory")
	@ResponseBody
	public ProductCategory addProductCategory(){
		ProductCategory productCategory  = new ProductCategory();
		productCategory.setProductname("主食");
		productCategory.setProductdesc("米饭，馒头，面条，应有尽有");
		productCategory.setCreatetime(new Date());
		productCategory.setUpdatetime(new Date());
		
		productCategoryService.insertProductCategory(productCategory);
		
		logger.debug("add one row into table product_category");
		
		return productCategory;
		
	}
	
	@RequestMapping("/updateProductCategory")
	@ResponseBody
	public ProductCategory updateProductCategory(){
		ProductCategory productCategory  = new ProductCategory();
		productCategory.setId(1);
		productCategory.setProductname("主食1");
		productCategory.setProductdesc("米饭1，馒头，面条，应有尽有");
		
		productCategoryService.updateProductCategory(productCategory);
		
		logger.debug("add one row into table product_category");
		
		return productCategory;
		
	}
	
	@RequestMapping("/deleteProductCategory")
	@ResponseBody
	public ProductCategory deleteProductCategory(){
		ProductCategory productCategory  = new ProductCategory();
		
		productCategory.setId(2);
		productCategoryService.deleteProductCategory(productCategory);
		
		logger.debug("add one row into table product_category");
		
		return productCategory;
		
	}
	
	@RequestMapping("/findProductCategory")
	@ResponseBody
	public ProductCategory findProductCategory(){
		
		ProductCategory productCategory = productCategoryService.findProductCategoryById(3);
		System.out.println(productCategory.getProductname());
		//Assert.hasText(productCategory.getProductname(), "肉类1");
		return productCategory;
		
	}
}
