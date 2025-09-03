package com.autoescalable.kubernetes_crud.repositories;

import com.autoescalable.kubernetes_crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long> {
}
