package main.java.br.com.design_patters.creational.singleton.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.br.com.design_patters.creational.singleton.enuns.Turno;

public class Dia {
    private static Dia singleton = new Dia();
    private Date data;
    private Turno turno;

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Dia() {
        data = new Date();
        turno = Turno.MANHA;
    }

    public static Dia getInstance() {
        return singleton;
    }

    public String getData() {
        return dateFormat.format(data);
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

}