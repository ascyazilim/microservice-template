package com.muhammet.repository;

import com.muhammet.entity.Auth;

public interface AuthRepository extends MyGenericRepo<Auth,Long> {
    Boolean existsByUserNameAndPassword(String userName, String password);
}
