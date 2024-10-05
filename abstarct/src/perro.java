public class perro  extends animal{

    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public void sonido() {
        System.out.println("el sonido que emite el perro es ladrar");
    }

    @Override
    public void sonido(String texto) {
        System.out.println("el sonido emitido por el perro:" + texto);

    }

    @Override
    public void sonido(int tiempo, String texto) {
        if(tiempo > 20){
            System.out.println("perro emite el sonido " + texto +  " demasiado tiempo");
        }

    }

    @Override
    public boolean sonido(int tiempo) {
        return tiempo ==1;
    }

    @Override
    public void deponer(boolean tipo) {
        System.out.println(tipo ? "la deposicion es papo":"la deposicion es orina");

    }

}

