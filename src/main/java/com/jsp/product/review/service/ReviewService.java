package com.jsp.product.review.service;

import com.jsp.product.review.dao.ReviewDao;
import com.jsp.product.review.dto.Review;

public class ReviewService {
	ReviewDao reviewDao = new ReviewDao();

	public Review deleteReview(Review review) {
		return reviewDao.deleteReview(review);
	}

	public Review updaReview(Review review) {
		return reviewDao.updateReview(review);
	}

	public Review saveReview(Review review) {
		return reviewDao.saveReview(review);
	}
}
