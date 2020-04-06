package com.andile.camboStore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.andile.camboStore.dao.ProductDAO;
import com.andile.camboStore.model.Product;

@Controller
public class HomeController {
	
	private ProductDAO productDAO = new ProductDAO();
	
	@RequestMapping("/")
	public String getProducts(Model model) {
		
		List<Product> productList  = productDAO.getProducttList();
		Product product = productList.get(0);
		model.addAttribute("products",productList);
		
		return "index";
	}
}
