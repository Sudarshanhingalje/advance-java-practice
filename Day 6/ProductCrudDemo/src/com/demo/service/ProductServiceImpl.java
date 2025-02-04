package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;
	public ProductServiceImpl()
	{
		pdao=new ProductDaoImpl();
	}
	@Override
	public List<Product> getAllProducts()
	{
		return pdao.findAll();
	}
	@Override
	public int addProduct(Product p) {
		
		return pdao.save(p);
	}
	@Override
	public Product getById(int pid) {
		return pdao.findById(pid);
	}
	@Override
	public int updateProduct(Product p) {
		return pdao.modifyProduct(p);
	}
}
