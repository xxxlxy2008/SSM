package org.example.service;


import org.example.beans.UserBean;

public interface ILoginService {

    UserBean Login(String username, String password);
}