package com.goodaftergood.userservice.users;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
  private UserService service;

  UserController(UserService service){
    this.service = service;
  }

  //TODO: Create
  //Read
  //Update
  //Delete
  
  public void deleteUser(String user) {
    service.delete(user);
  }
}
