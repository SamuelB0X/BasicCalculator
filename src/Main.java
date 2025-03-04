public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        //prueba de sumar
        System.out.println(myCalculator.sumar(5,7));

        //prueba de restar
        System.out.println(myCalculator.restar(5,7));

        //prueba de multiplicar
        System.out.println(myCalculator.multiplicar(5,7));

        //prueba de dividir
        System.out.println(myCalculator.dividir(5,7));

        //prueba de module
        System.out.println(myCalculator.module(5,7));
    }
}
