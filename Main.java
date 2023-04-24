package ico.unam.fes;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area del cuadrado = " + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(3.1);
        System.out.println("Area del circulo = " + circulo.calcularArea());
    }
}
