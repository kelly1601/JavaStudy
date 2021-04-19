package DAO;

import java.util.ArrayList;

import DTO.Product;

public class Text {
	public static void main(String[] args) {
		ProductRepository p = new ProductRepository();
		ArrayList<Product> t = p.getAllProducts();
		System.out.println(t);
	}
}
