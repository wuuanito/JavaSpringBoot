package com.apirest.ValidationBasic.repositories;

import com.apirest.ValidationBasic.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long> {
}
