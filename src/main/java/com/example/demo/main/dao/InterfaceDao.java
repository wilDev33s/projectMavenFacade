package com.example.demo.main.dao;

import com.example.demo.main.bussines.dto.NotasInt;
import com.example.demo.main.bussines.dto.NotasOut;

public interface InterfaceDao {
    NotasOut MapeoResult(NotasInt notasInt);
}
