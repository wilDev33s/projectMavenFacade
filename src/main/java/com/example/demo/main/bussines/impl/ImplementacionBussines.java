package com.example.demo.main.bussines.impl;

import com.example.demo.main.bussines.InterfaceBussines;
import com.example.demo.main.bussines.dto.NotasInt;
import com.example.demo.main.bussines.dto.NotasOut;
import com.example.demo.main.dao.InterfaceDao;
import com.example.demo.main.dao.impl.ImplementacionDao;
import com.example.demo.main.facade.dto.NotasSalida;

public class ImplementacionBussines  implements InterfaceBussines {
        ImplementacionDao implementacionDao = new ImplementacionDao();


    @Override
    public NotasOut generarSaberMinota(NotasInt notasInt) {

        NotasOut notasOut= implementacionDao.MapeoResult(notasInt);
        return notasOut;
    }
}
