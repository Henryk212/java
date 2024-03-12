public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Carro uno = new Carro();

        uno.marca = "Fiat";
        uno.modelo = "uno";

        System.out.println(uno.marca);
        System.out.println(uno.modelo);
        System.out.println(uno.ligado);
        System.out.println(uno.andando);

        Carro vectra = new Carro("Chevrolet", "Vectra");
        vectra.desligar();
        System.out.println(vectra.marca);
        System.out.println(vectra.modelo);
        System.out.println(vectra.ligado);
        System.out.println(vectra.andando);
    }
}
