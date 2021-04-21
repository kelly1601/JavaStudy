package DAO;

import java.util.ArrayList;
import java.util.List;

import DTO.Product;

public class ProductRepository {
	private List<Product> listOfProducts;
	{
		listOfProducts = new ArrayList<Product>();
	}
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone6", 80000);
		phone.setDescription("4.7-inch, 1334X750 Retina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P12345", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processor");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitPrice(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "Galaxy Tab 5", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(10000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts() {
		return (ArrayList<Product>) listOfProducts;
	}
	
	public Product getProduct(String productId) {
		Product product = null;
		
		// 사용자가 원하는 상품의 상세 정보를 가져와서
		// product 객체에 저장하는 코드
		for(Product nthProduct : listOfProducts) {
			String nthProductId = nthProduct.getProductId();
			
			if(nthProductId.equals(productId)) {
				product = nthProduct;
				break;
			}
		}
		
		return product;
	}
}
