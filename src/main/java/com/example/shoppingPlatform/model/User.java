package com.example.shoppingPlatform.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private String usrName;
  private String nickName;
  private String phone;
  private String email;
  private Integer gender;
  private String address;
  private List<Long> orderHistory;
}
