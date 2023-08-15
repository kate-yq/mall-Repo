package com.example.shoppingPlatform.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  private long id;
  private Long productCategoryId;
  private String name;
  private String description;
  private List<String> pics;
  private double price;
}
