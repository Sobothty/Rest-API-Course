package com.bothty.restapihw1.repository;

import java.util.List;

public interface Repository<T, B> {
    List<T> findAll();
    T save();
    B delete(B status);
}
