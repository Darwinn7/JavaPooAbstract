public abstract class animal {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    ///metodos abstractos
    public abstract void sonido();

    public  abstract void sonido(String texto);

    public abstract  void sonido(int tiempo, String texto);

    public  abstract  boolean sonido(int tiempo);

    public abstract void deponer(boolean tipo);
}
