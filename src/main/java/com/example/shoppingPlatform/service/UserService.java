package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.User;

public interface UserService {
  void saveUser(User usr);
  void deleteUser(Long id);
  void updateUser(User usr);
  User getUser(Long id);
}
