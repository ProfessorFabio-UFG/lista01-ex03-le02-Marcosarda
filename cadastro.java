package poo1.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroComLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MoradorEncapsulado> lista = new ArrayList<>();
        String resp;

        do {
            System.out.println("Novo Morador");
            MoradorEncapsulado m = new MoradorEncapsulado();

            System.out.print("Nome: ");
            m.setNome(sc.nextLine());

            System.out.print("CPF: ");
            m.setCpf(sc.nextLine());

            System.out.print("Celular: ");
            m.setCelular(sc.nextLine());

            System.out.print("Data de nascimento: ");
            m.setDataNascimento(sc.nextLine());

            System.out.print("Sexo: ");
            m.setSexo(sc.nextLine());

            System.out.print("Bloco: ");
            m.setBloco(sc.nextLine());

            System.out.print("Apartamento: ");
            m.setApartamento(sc.nextLine());

            System.out.print("Código de acesso: ");
            m.setCodigoAcesso(sc.nextLine());

            lista.add(m);

            System.out.print("Cadastrar mais um? (s/n): ");
            resp = sc.nextLine().trim().toLowerCase();
        } while (resp.equals("s"));

        System.out.println("Todos os moradores cadastrados");
        for (MoradorEncapsulado mor : lista) {
            mor.mostrarDados();
        }

        sc.close();
    }
}
