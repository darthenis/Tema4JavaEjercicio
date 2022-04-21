package org.ejercicio;

public class SmartWatch extends SmartDevice{

    int mallaAncho;
    boolean monitorCardiaco;
    int presionArterialmax;
    int getPresionArterialmin;
    int oxigenoEnSangreMmHg;

    public SmartWatch(){}

    public SmartWatch(int bateriaMAh, String sistemaOperativo, String carcasaColor, int pantallaPulgadas, int mallaAncho, boolean monitorCardiaco, int presionArterialmax, int getPresionArterialmin, int oxigenoEnSangreMmHg) {
        super(bateriaMAh, sistemaOperativo, carcasaColor, pantallaPulgadas);
        this.mallaAncho = mallaAncho;
        this.monitorCardiaco = monitorCardiaco;
        this.presionArterialmax = presionArterialmax;
        this.getPresionArterialmin = getPresionArterialmin;
        this.oxigenoEnSangreMmHg = oxigenoEnSangreMmHg;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "mallaAncho=" + mallaAncho +
                ", monitorCardiaco=" + monitorCardiaco +
                ", presionArterialmax=" + presionArterialmax +
                ", getPresionArterialmin=" + getPresionArterialmin +
                ", oxigenoEnSangreMmHg=" + oxigenoEnSangreMmHg +
                ", bateriaMAh=" + bateriaMAh +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", carcasaColor='" + carcasaColor + '\'' +
                ", pantallaPulgadas=" + pantallaPulgadas +
                '}';
    }
}
