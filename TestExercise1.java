import java.util.Scanner;
import static java.lang.System.out;

public class TesteFicha1 {
        /* 1, convert Celcius to Farenheit; */
        public static void main(String [] args){
        Ficha1 f = new Ficha1();
        double celsius, farenheit;

        Scanner sc = new Scanner(System.in);
        out.print("Insira os graus Celsius que quer converter:\n");
        celsius = sc.nextDouble();

        out.print("A conversão em graus Farenheit é: ");
        farenheit = f.celsiusParaFarenheit(celsius);
        out.format("\n" + "%.2f", farenheit);
    }
        /* 2, max of two numbers; */
        public static void main(String[] args){
        Ficha1 f = new Ficha1();
        int num1, num2, major;

        Scanner sc = new Scanner(System.in);
        out.print("O primeiro número é: ");
        num1 = sc.nextInt();
        out.print("O segundo número é: ");
        num2 = sc.nextInt();

        major = f.maximoNumeros(num1, num2);
        out.format("O maior dos números %d e %d é %d.", num1, num2, major);
    }
        /* 3, create account with a value associated (no interface) */
        public static void main (String[] args){
        Ficha1 f = new Ficha1();
        String name;
        double value;
        Scanner sc = new Scanner(System.in);

        out.print("Bem-vindo ao banco dos Palhacinhos do Circo. Por favor, insira o seu nome: ");
        name = sc.nextLine();
        out.print("Para criar conta neste grande forrobodó, tem de introduzir o seu saldo: ");
        value = sc.nextDouble();

        out.print(f.criaDescricaoConta(name, value));
    }
    
