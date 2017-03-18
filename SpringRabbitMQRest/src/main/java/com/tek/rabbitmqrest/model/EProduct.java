package com.tek.rabbitmqrest.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EProduct implements Serializable {

	private String productId;
	private String productName;

	public EProduct(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public EProduct() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "EProduct [productId=" + productId + ", productName=" + productName + "]";
	}

}
