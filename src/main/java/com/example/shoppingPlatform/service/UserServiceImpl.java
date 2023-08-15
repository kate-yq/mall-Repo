package com.example.shoppingPlatform.service;

import com.example.shoppingPlatform.model.User;
import com.example.shoppingPlatform.model.UserPO;
import com.example.shoppingPlatform.repository.UserRepository;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

import jakarta.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
  @Resource
  private UserRepository userRepository;

  @Override
  public void saveUser(User usr) {
    Mapper mapper = new DozerBeanMapper();
    UserPO userPO = mapper.map(usr, UserPO.class);
    userRepository.save(userPO);
  }

  @Override
  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }

  @Override
  public void updateUser(User usr) {
    Mapper mapper = new DozerBeanMapper();
    UserPO userPO = mapper.map(usr, UserPO.class);
    userRepository.save(userPO);
  }

  @Override
  public User getUser(Long id) {
    Mapper mapper = new DozerBeanMapper();
    Optional<UserPO> userPO = userRepository.findById(id);
    return mapper.map(userPO, User.class);
  }
}
