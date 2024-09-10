import java.util.Scanner;

public class trabalho2 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("   -Inicio do Programa-   ");
        String operacao;
        int valor1;
        int valor2;
        do{
            System.out.println("        -MENU-        ");
            System.out.println("Digite a Operação ou sair: ");
            operacao = entrada.nextLine().trim();
            switch (operacao) {
                case "+":
                    try{
                        System.out.println("Primeiro valor: ");
                        valor1 = entrada.nextInt();
                        System.out.println("Segundo valor: ");
                        valor2 = entrada.nextInt();
                        System.out.println("Resultado Da Soma: " +
                                (valor1 + valor2));
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;} catch (Exception e) {
                        System.out.println("Valor Invalido!");
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}
                case "-":
                    try {
                        System.out.println("Primeiro valor: ");
                        valor1 = entrada.nextInt();
                        System.out.println("Segundo valor: ");
                        valor2 = entrada.nextInt();
                        System.out.println("Resultado Da Subtração: " +
                                (valor1 - valor2));
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}catch (Exception e) {
                        System.out.println("Valor Invalido!");
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}
                case "*":
                    try {
                        System.out.println("Primeiro valor: ");
                        valor1 = entrada.nextInt();
                        System.out.println("Segundo valor: ");
                        valor2 = entrada.nextInt();
                        System.out.println("Resultado Da Multiplicação: " +
                                (valor1 * valor2));
                        entrada.nextLine();
                        break;}catch (Exception e) {
                        System.out.println("Valor Invalido!");
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}
                case "/":
                    try{
                        System.out.println("Primeiro valor: ");
                        valor1 = entrada.nextInt();
                        System.out.println("Segundo valor: ");
                        valor2 = entrada.nextInt();
                        if (valor2 != 0) {
                            int resltDivisão = (valor1 / valor2);
                            if (resltDivisão == 0) {
                                int resto = valor1 % valor2;
                                System.out.println("Resultado Da Divisão: " + resltDivisão +
                                        "\nResto da Divisão: " + resto);
                            } else {
                                System.out.println("Resultado Da Divisão: " + resltDivisão);
                            }
                        } else {
                            System.out.println("valor invalido");}
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}catch (Exception e) {
                        System.out.println("Valor Invalido!");
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}

                case "%":
                    try{
                        System.out.println("Primeiro valor: ");
                        valor1 = entrada.nextInt();
                        System.out.println("Segundo valor: ");
                        valor2 = entrada.nextInt();
                        System.out.println("Resultado Do Modulo: " + (valor1 % valor2));
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}catch (Exception e) {
                        System.out.println("Valor Invalido!");
                        System.out.println("----------------------\n");
                        entrada.nextLine();
                        break;}
                default:
                    System.out.println("Operação Invalida! ");
                    System.out.println("----------------------\n");}
        }while(!operacao.equalsIgnoreCase("sair"));
        System.out.println("   -FIM DO PROGRAMA!-   ");
        entrada.close();
    }
}
