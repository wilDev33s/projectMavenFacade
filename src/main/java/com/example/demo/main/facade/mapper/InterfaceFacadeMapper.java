package com.example.demo.main.facade.mapper;

import com.example.demo.main.bussines.dto.NotasInt;
import com.example.demo.main.bussines.dto.NotasOut;
import com.example.demo.main.facade.dto.NotasEntrada;
import com.example.demo.main.facade.dto.NotasSalida;

public interface InterfaceFacadeMapper {
    NotasInt MapeoEntrada(NotasEntrada notasEntrada);
    NotasSalida MapeoSalida(NotasOut notasOut);
}
