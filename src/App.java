import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        calculadora c =new calculadora();
        String op;
        int continuar;
        continuar = 1;

        System.out.println("Bem vindo a calculadora de operações simples!");
        while(continuar == 1){
        System.out.println("Digite um numero: ");
        c.setNum1(input.nextDouble());
        System.out.println("Digite o segundo numero: ");
        c.setNum2(input.nextDouble());
        System.out.println("Qual será a operação: ");
        op = input.next();
        switch(op){
            case "+" :
                System.out.println("O resultado da soma entre " + c.getNum1() + " e " + c.getNum2() + " é: " + c.calcularsoma());
                break;
            
            case "-" :
                System.out.println("O resultado da subtração entre " + c.getNum1() + " e " + c.getNum2() + " é: " + c.calcularsub());
                break;

            case "*" :
                System.out.println("O resultado da multiplicação entre " + c.getNum1() + " e " + c.getNum2() + " é: " + c.calcularmult());
                break;

            case "/" :
                System.out.println("O resultado da divisão entre " + c.getNum1() + " e " + c.getNum2() + " é: " + c.calculardiv());
                break;

            default :
                System.out.println("Você não digitou uma operação valida!");
                break;
            
        }
        
        System.out.println("Deseja continuar? (1 para continuar ou 0 para sair)");
            continuar = input.nextInt();
        }

    }
}
