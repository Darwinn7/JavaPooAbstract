public class Main {
    public static void main(String[] args) {
        perro operro = new perro();
        operro.setNombre("Trosky");
        operro.setColorPelo("negro");

        System.out.println(operro.getNombre());

        operro.sonido();
        operro.sonido(12);
        operro.sonido("guau");
        operro.sonido(23,"grrrr");


        gato ogato = new gato();
        ogato.setNombre("Luna");
        ogato.sonido();
        ogato.sonido(4);
        ogato.sonido("miua");
        ogato.sonido(5,"grrrr");







    }
}
