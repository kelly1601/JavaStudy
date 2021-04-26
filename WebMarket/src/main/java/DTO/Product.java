package DTO;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -8943425380512267111L;

	private String productId; // �긽�뭹 �븘�씠�뵒
	private String name; // �긽�뭹紐�
	private int unitPrice; // �긽�뭹 媛�寃�
	private String description; // �긽�뭹 �꽕紐�
	private String manufacturer; // �젣議곗궗
	private String category; // 遺꾨쪟
	private long unitsInStock; // �옱怨� �닔
	private String condition; // �떊�긽�뭹 or 以묎퀬�뭹 or �옱�깮�뭹
	private String imagepath; // 이미지 파일 경로
	
	public Product(String productId, String name, int unitPrice) {
		setProductId(productId);
		setName(name);
		setUnitPrice(unitPrice);
	}
	
	public Product(String productId, String name, String unitPrice, String description, String manufacturer, String category, String unitsInStock, String condition) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = Integer.parseInt(unitPrice);
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.unitsInStock = Integer.parseInt(unitsInStock);
		this.condition = condition;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
