package com.example.shoppingPlatform.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {
  private long id;
  private String name;
  private String icon;
  private String description;
}
