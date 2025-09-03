package com.autoescalable.kubernetes_crud.services;

import com.autoescalable.kubernetes_crud.models.UserModel;
import com.autoescalable.kubernetes_crud.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }
}
