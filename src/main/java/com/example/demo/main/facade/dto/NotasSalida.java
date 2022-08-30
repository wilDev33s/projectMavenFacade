package com.example.demo.main.facade.dto;

public class NotasSalida {
    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "NotasSalida{" +
                "resultado=" + resultado +
                '}';
    }
}
