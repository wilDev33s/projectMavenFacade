package com.example.demo.main.dao.impl;

import com.example.demo.main.bussines.dto.NotasInt;
import com.example.demo.main.bussines.dto.NotasOut;
import com.example.demo.main.dao.InterfaceDao;
import com.example.demo.main.dao.mapper.InterfaceDaoMapper;
import com.example.demo.main.dao.mapper.impl.ImplementacionDaoMapper;
import com.example.demo.main.facade.dto.NotasSalida;

public class ImplementacionDao implements InterfaceDao {
    ImplementacionDaoMapper implementacionDaoMapper = new ImplementacionDaoMapper();


    public NotasOut MapeoResult(NotasInt notasInt) {
        int resultado =(notasInt.getNum1()+notasInt.getNum2()+notasInt.getNum3()+notasInt.getNum4()+notasInt.getNum5()/5);
        NotasOut notasOut = implementacionDaoMapper.MapeoResult(resultado);
        return notasOut;
    }
}
