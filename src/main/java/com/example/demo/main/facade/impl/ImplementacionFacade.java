package com.example.demo.main.facade.impl;

import com.example.demo.main.bussines.dto.NotasInt;
import com.example.demo.main.bussines.dto.NotasOut;
import com.example.demo.main.bussines.impl.ImplementacionBussines;
import com.example.demo.main.facade.InterfaceFacade;
import com.example.demo.main.facade.dto.NotasEntrada;
import com.example.demo.main.facade.dto.NotasSalida;
import com.example.demo.main.facade.mapper.impl.ImplementacionFacadeMapper;

public class ImplementacionFacade implements InterfaceFacade {

    ImplementacionFacadeMapper implementacionFacadeMapper= new ImplementacionFacadeMapper();
    ImplementacionBussines implementacionBussines= new ImplementacionBussines();
    @Override
    public int SabermiNota(NotasEntrada notasEntrada) {

        NotasInt notasInt=implementacionFacadeMapper.MapeoEntrada(notasEntrada);
        NotasOut notasOut =implementacionBussines.generarSaberMinota(notasInt);
        NotasSalida notasSalida= implementacionFacadeMapper.MapeoSalida(notasOut);
        return notasSalida.getResultado();
    }
}
