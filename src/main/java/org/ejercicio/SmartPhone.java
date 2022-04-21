package org.ejercicio;



public class SmartPhone extends SmartDevice{

    boolean camara;
    boolean flash;
    boolean linterna;
    boolean funda;

    public SmartPhone(){}

    public SmartPhone(int bateriaMAh, String sistemaOperativo, String carcasaColor, int pantallaPulgadas, boolean camara, boolean flash, boolean linterna, boolean funda) {
        super(bateriaMAh, sistemaOperativo, carcasaColor, pantallaPulgadas);
        this.camara = camara;
        this.flash = flash;
        this.linterna = linterna;
        this.funda = funda;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara=" + camara +
                ", flash=" + flash +
                ", linterna=" + linterna +
                ", funda=" + funda +
                ", bateriaMAh=" + bateriaMAh +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", carcasaColor='" + carcasaColor + '\'' +
                ", pantallaPulgadas=" + pantallaPulgadas +
                '}';
    }
}
