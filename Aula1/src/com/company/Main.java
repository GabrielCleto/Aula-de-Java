package com.company;

public class Main {
    public static void main(String[] args) {

        int idade = 23, n1 = 5 ,n2 = 5 ,n3 = 5, n4 = 5;
        double media = n1 + n2 + n3 + n4 / 4;

        String PrimeiroNome = "Gabriel ", SegundoNome = "Henrique", NomeCompleto = PrimeiroNome + SegundoNome, bairro = "Vila moraes";
        double pagamento = 1000, vale = 800.50, salario = pagamento + vale;

        System.out.println("Seu nome: " + NomeCompleto + "  / Seu Bairro: " + bairro + " / Sua idade  " + idade + " / Seu Salario: " + salario);
        if (media >=5 ) {
            System.out.println("Aluno Aprovado ");
        }else {
            System.out.println("Aluno de recuperaçao");

        }
    }
}