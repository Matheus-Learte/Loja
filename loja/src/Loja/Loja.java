package Loja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Loja {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Produto>[] list = new ArrayList[3];
        Map<Long, Produto> codigo = new HashMap<>();
        Map<String, Produto> nome = new HashMap<>();
        Scanner read = new Scanner(System.in);
        Produto temp;
        long code;

        for (int i = 0; i < 3; i++) {
            list[i] = new ArrayList<Produto>();
        }
        System.out.println();
        while (read.hasNext()) {
            String aux = read.nextLine();
            String[] commands = aux.split(",");

            switch (commands[0]) {
                case "I":
                    code = Long.parseLong(commands[2]);

                    System.out.println(
                            "Operação inserir "
                                    + (commands[1].equals("Livro") ? commands[1].toLowerCase() : commands[1]) + ": "
                                    + code);

                    if (codigo.get(code) == null) {
                        if (commands[1].equals("Livro")) {
                            temp = new Livro(code, commands[3], commands[4], commands[5],
                                    Integer.parseInt(commands[6]), Integer.parseInt(commands[7]),
                                    Integer.parseInt(commands[8]), commands[9]);

                            list[0].add(temp);
                            codigo.put(temp.getCodigo(), temp);

                            if (nome.get(commands[3]) == null) {
                                nome.put(temp.getNome(), temp);
                            }
                        } else if (commands[1].equals("CD")) {
                            temp = new CD(code, commands[3], commands[4],
                                    Integer.parseInt(commands[5]), commands[6], Integer.parseInt(commands[7]));

                            list[1].add(temp);
                            codigo.put(temp.getCodigo(), temp);

                            if (nome.get(commands[3]) == null) {
                                nome.put(temp.getNome(), temp);
                            }
                        } else {
                            temp = new DVD(code, commands[3], commands[4], commands[5],
                                    commands[6], Integer.parseInt(commands[7]), commands[8]);

                            list[2].add(temp);
                            codigo.put(temp.getCodigo(), temp);

                            if (nome.get(commands[3]) == null) {
                                nome.put(temp.getNome(), temp);
                            }
                        }

                        System.out.println("Operação realizada com sucesso\n");
                    } else
                        System.out.println("***Erro: Código já cadastrado: " + code);
                    break;

                case "A":
                    code = Long.parseLong(commands[1]);
                    System.out.println("Operação de compra: " + code);

                    temp = codigo.get(code);

                    if (temp != null) {
                        temp.setEstoque(Integer.parseInt(commands[2]));
                        System.out.println("Operação realizada com sucesso: " + code + "\n");
                    } else
                        System.out.println("***Erro: Código inexistente: " + code + "\n");
                    break;

                case "V":
                    code = Long.parseLong(commands[1]);
                    System.out.println("Operação de venda: " + code);

                    temp = codigo.get(code);

                    if (temp != null) {
                        boolean res = temp.setEstoque(-Integer.parseInt(commands[2]));

                        if (res) {
                            System.out.println("Operação realizada com sucesso: " + code + "\n");
                        } else {
                            System.out.println(
                                    "***Erro: Estoque insuficiente: " + code + " Quantidade: "
                                            + commands[2] + "\n");

                        }
                    } else
                        System.out.println("***Erro: Código inexistente: " + code + "\n");
                    break;

                case "P":
                    if (commands[1].charAt(0) > 47 && commands[1].charAt(0) < 58) {
                        code = Long.parseLong(commands[1]);
                        System.out.println("Procurando: " + commands[1]);

                        temp = codigo.get(code);

                        if (temp != null) {
                            System.out.println("Encontrado:");
                            System.out.println(temp.toString());
                            System.out.println();
                        } else
                            System.out.println("Produto não encontrado: " + commands[1] + "\n");
                    } else {
                        System.out.println("Procurando: " + commands[1]);

                        temp = nome.get(commands[1]);

                        if (temp != null) {
                            System.out.println("Encontrado:");
                            System.out.println(temp.toString());
                            System.out.println();
                        } else
                            System.out.println("Produto não encontrado: " + commands[1] + "\n");
                    }

                    break;

                case "S":
                    System.out.println("Operação de sumarização: ");
                    int aux2 = 0;

                    for (Produto i : list[0]) {
                        System.out.println(i);
                        System.out.println("Quantidade: " + i.getEstoque() + "\n");
                        aux2 += i.getEstoque();
                    }
                    System.out.println("Quantidade de Livros: " + aux2 + "\n");

                    aux2 = 0;
                    for (Produto i : list[1]) {
                        System.out.println(i);
                        System.out.println("Quantidade: " + i.getEstoque() + "\n");
                        aux2 += i.getEstoque();
                    }
                    System.out.println("Quantidade de CDs: " + aux2 + "\n");

                    aux2 = 0;
                    for (Produto i : list[2]) {
                        System.out.println(i);
                        System.out.println("Quantidade: " + i.getEstoque() + "\n");
                        aux2 += i.getEstoque();
                    }
                    System.out.println("Quantidade de DVDs: " + aux2 + "\n\n");
                    break;

                default:
                    break;
            }
        }
        read.close();

    }
}