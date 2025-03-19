package com.goodaftergood.userservice.users;

import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class User {
  @Id private String username;
  @NonNull private String password;
}