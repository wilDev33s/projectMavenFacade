package com.example.demo.main.dao.mapper.impl;

import com.example.demo.main.bussines.dto.NotasInt;
import com.example.demo.main.bussines.dto.NotasOut;
import com.example.demo.main.dao.InterfaceDao;
import com.example.demo.main.dao.mapper.InterfaceDaoMapper;

public class ImplementacionDaoMapper  implements InterfaceDaoMapper {

    @Override
    public NotasOut MapeoResult(int resultado) {
        NotasOut notasOut=new NotasOut();
        notasOut.setResultado(resultado);
        return notasOut;
    }
}
