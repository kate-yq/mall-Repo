package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.ProductCategory;
import com.example.shoppingPlatform.model.ProductCategoryPO;
import com.example.shoppingPlatform.repository.ProductCategoryRepository;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.annotation.Resource;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
  @Resource
  ProductCategoryRepository productCategoryRepository;
  @Override
  public void createProductCategory(ProductCategory productCategory) {
    Mapper mapper = new DozerBeanMapper();
    ProductCategoryPO productCategoryPO = mapper.map(productCategory, ProductCategoryPO.class);
    productCategoryRepository.save(productCategoryPO);
  }

  @Override
  public void updateProductCategory(ProductCategory productCategory) {
    Mapper mapper = new DozerBeanMapper();
    ProductCategoryPO productCategoryPO = mapper.map(productCategory, ProductCategoryPO.class);
    productCategoryRepository.save(productCategoryPO);
  }

  @Override
  public ProductCategory getProductCategoryById(Long id) {
    Mapper mapper = new DozerBeanMapper();
    Optional<ProductCategoryPO> productCategoryPO = productCategoryRepository.findById(id);
    return mapper.map(productCategoryPO, ProductCategory.class);
  }

  @Override
  public void deleteProductCategory(Long id) {
    productCategoryRepository.deleteById(id);
  }

  @Override
  public List<ProductCategory> getAllProductCategory() {
    Mapper mapper = new DozerBeanMapper();
    List<ProductCategory> res = new ArrayList<>();
    List<ProductCategoryPO> productCategoryPOs = productCategoryRepository.findAll();
    for (ProductCategoryPO pc : productCategoryPOs){
      res.add(mapper.map(pc, ProductCategory.class));
    }
    return res;
  }
}
