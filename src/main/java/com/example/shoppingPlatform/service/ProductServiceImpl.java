package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.Product;
import com.example.shoppingPlatform.model.ProductPO;
import com.example.shoppingPlatform.repository.ProductRepository;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import jakarta.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService{
  @Resource
  private ProductRepository productRepository;
  @Override
  public void createProduct(Product product) {
    Mapper mapper = new DozerBeanMapper();
    ProductPO productPO = mapper.map(product, ProductPO.class);
    productRepository.save(productPO);
  }

  @Override
  public void updateProduct(Product product) {
    Mapper mapper = new DozerBeanMapper();
    ProductPO productPO = mapper.map(product, ProductPO.class);
    productRepository.save(productPO);
  }

  @Override
  public Product getProductById(Long id) {
    Mapper mapper = new DozerBeanMapper();
    Optional<ProductPO> productPO = productRepository.findById(id);
    return mapper.map(productPO, Product.class);
  }

  @Override
  public void deleteProduct(Long id) {
    productRepository.deleteById(id);
  }

  @Override
  public List<Product> getAllProduct() {
    Mapper mapper = new DozerBeanMapper();
    List<Product> res = new ArrayList<>();
    List<ProductPO> productPOs = productRepository.findAll();
    for (ProductPO p : productPOs){
      res.add(mapper.map(p, Product.class));
    }
    return res;
  }

  @Override
  public List<Product> getProductsByCategoryId(Long id) {
    Mapper mapper = new DozerBeanMapper();
    List<Product> res = new ArrayList<>();
    List<ProductPO> productPOs = productRepository.findAll();
    for (ProductPO p : productPOs){
      if (p.getProductCategoryId() == id) {
        res.add(mapper.map(p, Product.class));
      }
    }
    return res;
  }
}
