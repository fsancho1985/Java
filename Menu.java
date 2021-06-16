import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {    
        
        Scanner menu = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("|   Menu          |");
            System.out.println("|   Opções        |");
            System.out.println("|   1. Opção 1    |");
            System.out.println("|   2. Opção 2    |");
            System.out.println("|   3. Sair       |");
            
            System.out.print(" Selecione uma opção: ");
            opcao = menu.nextInt();

            if(opcao == 1){
                System.out.println("Opção 1 Selecionada - Cálculo de IMC");
                System.out.print(" Insira o seu peso em Kg: ");
                double peso = menu.nextDouble();
                System.out.print(" Insira a sua altura: ");
                double altura = menu.nextDouble();
                double resultado = peso / (altura*altura);
                System.out.printf("Seu IMC é: " + "%.2f\n", resultado);
                if(resultado <= 18.5){
                    System.out.println("Abaixo do peso");
                }
                if(resultado >18.5 && resultado <= 24.9){
                    System.out.println("Peso ideal");
                }
                if(resultado >= 25.0 && resultado <= 29.9){
                    System.out.println("Levemente acima do peso");
                }
                if(resultado >=30 && resultado <= 34.9){
                    System.out.println("Obesidade grau I");
                }
                if(resultado >= 35.0 && resultado <= 39.9){
                    System.out.println("Obesidade grau II (Severa)");
                }
                if(resultado >= 40){
                    System.out.println("Obesidade grau III (Mórbida)");
                }
            }
            if(opcao == 2){
                System.out.println("Opção 2 Selecionada");
            }
            if(opcao == 3){
                System.out.println("Programa finalizado");
            }

        }while(opcao != 3);   
    }
}