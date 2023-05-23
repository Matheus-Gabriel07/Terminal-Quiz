/*
 * Esse programa é um quiz de conhecimentos gerais, feito para ser rodado pelo terminal, 
 * e pela quantidade de perguntas acertadas, receberá uma mensagem diferente.
 */

import java.util.Scanner;

public class terminalQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        int resp = 0, valid = 0;

        while (resp != 2) {
            System.out.println("```Seja bem vindo ao Quiz ```"
                        +"\n> Digite 1 para jogar"
                        +"\n> Digete 2 para sair");
            resp = sc.nextInt();

            System.out.println("=== INSTRUÇÕES ===\n"
                        +"\nApós receber a pergunta e ler as alternativas, digite o número"
                        +"\nque ache que é a correta;"
                        +"\n"
                        +"\nA pontuação será dada no final ^^"
                        +"\n"
                        +"\nBoa sorte!");

            //Pergunta 1
            System.out.println("=== Primeira pergunta ===");
            System.out.println("De onde é a invenção do chuveiro eletrico?"
                            +"\n"
                            +"\n1. França" 
                            +"\n2. Inglaterra"
                            +"\n3. Brasil"
                            +"\n4. Austrália");
            
            resp = sc.nextInt();

            switch (resp) {
                case 3:
                    System.out.println("Você acertou!!");
                    valid++;
                    break;
            
                default:
                System.out.println("A não, você erro -_-"
                                +"\nEra Brasil");
                    break;
            }

            //Pergunta 2
            System.out.println("=== Segunda pergunta ===");
            System.out.println("\nQual o livro mais vendido no mundo a seguir à Bíblia?"
                            +"\n"
                            +"\n1. Dom Queixote" 
                            +"\n2. Harry Poter"
                            +"\n3. O Pequeno Príncipe"
                            +"\n4. Ela, a Feticeira");
            
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Você acertou!!");
                    valid++;
                    break;
            
                default:
                    System.out.println("A não, você erro -_-"
                                +"\nEra Dom Queixote");
                    break;
            }

            //Pergunta 3
            System.out.println("=== Terceira pergunta ===");
            System.out.println("Quem pintou 'Guernica'?"
                            +"\n"
                            +"\n1. Paul Cézanne" 
                            +"\n2. Diego Rivera"
                            +"\n3. Pablo Picasso"
                            +"\n4. Salvador Dalí");
            
            resp = sc.nextInt();

            switch (resp) {
                case 3:
                    System.out.println("Você acertou!!");
                    valid++;
                    break;
            
                default:
                System.out.println("A não, você erro -_-"
                                +"\nEra Pablo Picasso");
                    break;
            }

            //Pergunta 4
            System.out.println("=== Penúltima pergunta ===");
            System.out.println("Quanto é 2+4*2-(5^2)/2?"
                            +"\n"
                            +"\n1. -0.5" 
                            +"\n2. -0,4"
                            +"\n3. 0"
                            +"\n4. 5");
            
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Você acertou!!");
                    valid++;
                    break;
            
                default:
                System.out.println("A não, você erro -_-"
                                +"\nEra -0.5");
                    break;
            }

            //Pergunta 5
            System.out.println("=== Última pergunta ===");
            System.out.println("Que animal gruguleja?'"
                            +"\n"
                            +"\n1. Pavão" 
                            +"\n2. Peru"
                            +"\n3. Cacatua"
                            +"\n4. Garça");
            
            resp = sc.nextInt();

            switch (resp) {
                case 2:
                    System.out.println("Você acertou!!");
                    valid++;
                    break;
            
                default:
                System.out.println("A não, você erro -_-"
                                +"\nEra o peru");
                    break;
            }
            
            //Resultados
            System.out.println("\n\n\n"
                        +"=== RESULTADOS ===");
                        System.out.println(valid);
            
            if (valid > 1) {
                switch (valid) {
                    case 1:
                        System.out.println("Que pena, você acetou só 1!\n");
                        break;

                    case 2:
                        System.out.println("Que pena, você acetou só 2!\n");
                        break;

                    case 3:
                        System.out.println("Na metada da corda! Você acetou metade das perguntas!\n");
                        break;

                    case 4:
                        System.out.println("Que show, você acetou quase todas!\n");
                        break;

                    case 5:
                        System.out.println("Que espetáculo, você acetou todas!\n");
                        break;
                }
            } else if (valid == 0) {
                System.out.println("Você não acertou nenhuma, tente outra vez \n");
            }
        }
        continuar = false;
        sc.close();
    }
}