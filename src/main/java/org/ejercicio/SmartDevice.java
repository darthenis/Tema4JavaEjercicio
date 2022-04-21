package org.ejercicio;

public class SmartDevice {

    int bateriaMAh;
    String sistemaOperativo;
    String carcasaColor;
    int pantallaPulgadas;

    public SmartDevice(){}

    public SmartDevice(int bateriaMAh, String sistemaOperativo, String carcasaColor, int pantallaPulgadas) {
        this.bateriaMAh = bateriaMAh;
        this.sistemaOperativo = sistemaOperativo;
        this.carcasaColor = carcasaColor;
        this.pantallaPulgadas = pantallaPulgadas;
    }
}
