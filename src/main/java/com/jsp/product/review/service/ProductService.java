package com.jsp.product.review.service;

import com.jsp.product.review.dao.ProductDao;
import com.jsp.product.review.dao.ReviewDao;
import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;

public class ProductService {

	ProductDao productDao = new ProductDao();
	ReviewDao reviewDao = new ReviewDao();

	public Product saveProduct(Product product, Review review) {
		return productDao.saveProduct(product, review);
	}

	public Product getByIdProduct(Product product) {
		return productDao.getByIdProduct(product);
	}

	public void getAllDetails() {
		productDao.getAllDetails();
	}

}
