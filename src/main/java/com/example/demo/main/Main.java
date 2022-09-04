package com.example.demo.main;

import com.example.demo.main.facade.dto.NotasEntrada;
import com.example.demo.main.facade.impl.ImplementacionFacade;

public class Main {
    public static void main(String[] args) {

        ImplementacionFacade implementacionFacade= new ImplementacionFacade();
        int result = implementacionFacade.SabermiNota(mapperEntrada());
        System.out.println( "sunnota es :"+ result );

    }
    public static NotasEntrada mapperEntrada(){
        NotasEntrada notasEntrada= new NotasEntrada();
        notasEntrada.setNum1(2);
        notasEntrada.setNum2(2);
        notasEntrada.setNum3(2);
        notasEntrada.setNum4(2);
        notasEntrada.setNum5(2);
        return  notasEntrada;
    }
}
