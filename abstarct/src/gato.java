public class gato extends animal{
    @Override
    public void sonido() {
        System.out.println("el sonido que emite el gato es Maullar");

    }

    @Override
    public void sonido(String texto) {
        System.out.println(" el gato emite el sonido " + texto);

    }

    @Override
    public void sonido(int tiempo, String texto) {
        System.out.println(" el gato se tarda " + tiempo + " segundos maullando y el sonido " + texto);

    }

    @Override
    public boolean sonido(int tiempo) {
        return tiempo > 3;
    }

    @Override
    public void deponer(boolean tipo) {
        System.out.println(tipo ?"el gato " : "popo");

    }
}
