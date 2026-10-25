import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reprovado = 0;
        int recuperacao = 0;
        int aprovado = 0;
        double nota = 0.0;
        double media = 0.0;
        double menorNota = 10.0, maiorNota = 0.0;

        System.out.println("===== SISTEMA DE ANÁLISE DE NOTAS =====\n");

        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        System.out.println("");
        
        while (n <= 0) {
            System.out.println("ERROR: Quantidade de alunos inválida, digite novamente!\n");
            
            System.out.print("Digite a quantidade de alunos: ");
            n = sc.nextInt();
            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Digite a nota: ");
            nota = sc.nextDouble();

            System.out.println("");

            while (nota < 0.0 || nota > 10.0) {
                System.out.println("ERROR: Nota inválida, digite novamente!\n");

                System.out.println("Aluno " + i);
                System.out.print("Digite a nota: ");
                nota = sc.nextDouble();

                System.out.println("");
            }

            if (nota < 5.0) {
                reprovado++;
            } 
            else if (nota < 7.0) {
                recuperacao++;
            } 
            else {
                aprovado++;
            }

            media += nota;

            if (maiorNota < nota) {
                maiorNota = nota;
            }
            if (nota < menorNota){
                menorNota = nota;
            }
        }

        double percentualAprovacao = ((double) aprovado / n) * 100;

        System.out.println("========== RELATÓRIO FINAL ==========\n");

        System.out.println("Total de alunos: " + n);
        System.out.printf("Média geral: %.1f\n\n", media / n);

        System.out.println("Aprovados: " + aprovado);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovado + "\n");

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota + "\n");
        
        System.out.printf("Percentual de aprovação: %.1f%%\n\n", percentualAprovacao);

        System.out.println("=====================================");

        sc.close();
    }
}
