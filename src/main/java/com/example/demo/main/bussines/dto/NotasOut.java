package com.example.demo.main.bussines.dto;

public class NotasOut {
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
