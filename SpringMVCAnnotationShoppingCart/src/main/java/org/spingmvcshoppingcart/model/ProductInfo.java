package org.spingmvcshoppingcart.model;

import org.spingmvcshoppingcart.entity.Product;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class ProductInfo {

	private String code;
	private String name;
	private double price;

	private boolean newProduct = false;

	// Upload File
	private CommonsMultipartFile fileData;

	public ProductInfo() {

	}

	public ProductInfo(Product product) {
		this.code = product.getCode();
		this.name = product.getName();
		this.price = product.getPrice();
	}

	// Don't change this constructor
	// used in hibernate query
	public ProductInfo(String code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isNewProduct() {
		return newProduct;
	}

	public void setNewProduct(boolean newProduct) {
		this.newProduct = newProduct;
	}

	public CommonsMultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}

}
