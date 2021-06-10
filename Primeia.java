import java.util.Scanner;

class Primeira {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Curso de Java");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello, What's your name?");
        String name = entrada.next();

        System.out.println("Hi " + name + ", How are you?");
    }
}