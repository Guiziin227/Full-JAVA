package petshop;

import petshop.model.entities.Address;
import petshop.model.entities.Pets;
import petshop.model.entities.enums.Sexo;
import petshop.model.entities.enums.Tipo;
import petshop.model.exceptions.DomainExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String NAO_INFORMADO = "NÃO INFORMADO";
    public static final double NAO_INFORMADO_DOUBLE = -1.0;
    public static final int NAO_INFORMADO_INT = -1;

    public static void main(String[] args) {

        String path = "./ATIVIDADES/src/petshop/formulario.txt";
        Scanner sc = new Scanner(System.in);
        List<Pets> list = new ArrayList<>();

        System.out.println("Bem vindo ao petshop do gui");
        int escolha;

        int contadorDeLinhas = 0;
        try {
            do {
                System.out.println("Menu: ");
                System.out.println("1 - Cadastrar pet");
                System.out.println("2 - Alterar os dados do pet cadastrado");
                System.out.println("3 - Deletar um pet cadastrado");
                System.out.println("4 - Listar todos os pets cadastrados ");
                System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
                System.out.println("6 - Sair\n");

                escolha = sc.nextInt();
                if (escolha <= 0 || escolha > 6) {
                    System.out.println("Numero inválido");
                }

                switch (escolha) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Cadastro do pet");

                        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                            List<String> perguntas = new ArrayList<>();
                            String line;
                            while ((line = br.readLine()) != null) {
                                perguntas.add(line);
                            }

                            String nomeCompleto = "";
                            Tipo tipo = null;
                            Sexo sexo = null;
                            int numeroCasa = 0;
                            String rua = "";
                            String cidade = "";
                            double idade = 0.0;
                            double peso = 0.0;
                            String raca = "";
                            String bairro = "";

                            System.out.println(perguntas.size());
                            for (int i = 0; i < perguntas.size(); i++) {
                                System.out.println(perguntas.get(i));

                                switch (i) {
                                    case 0:
                                        nomeCompleto = sc.nextLine();
                                        if (!nomeCompleto.matches("[a-zA-ZÀ-ú\\s]+") || !nomeCompleto.contains(" ")) {
                                            throw new DomainExceptions("Nome inválido. Deve conter nome e sobrenome, apenas letras.");
                                        } else if (nomeCompleto.isEmpty()){
                                            System.out.println("Nome nao informado");
                                            nomeCompleto = NAO_INFORMADO;
                                        }
                                        break;
                                    case 1:
                                        tipo = Tipo.valueOf(sc.nextLine().toUpperCase());
                                        break;
                                    case 2: // Sexo
                                        sexo = Sexo.valueOf(sc.nextLine().toUpperCase());
                                        break;
                                    case 3: // Endereço
                                        System.out.println("Digite o nome da sua rua");
                                        rua = sc.nextLine();
                                        System.out.println("Digite o nome da sua cidade");
                                        cidade = sc.nextLine();
                                        System.out.println("Qual o nome do bairro");
                                        bairro = sc.nextLine();
                                        System.out.println("Numero da casa");
                                        numeroCasa = sc.nextInt();
                                        if (numeroCasa == 0){
                                            System.out.println("Numero nao informado");
                                            numeroCasa = NAO_INFORMADO_INT;
                                            sc.nextLine();
                                            break;
                                        }
                                        sc.nextLine();
                                        break;
                                    case 4: // Idade

                                        String idadeStr = sc.nextLine().replace(",", ".");
                                        idade = Double.parseDouble(idadeStr);
                                        if (idade > 20)
                                            throw new DomainExceptions("Idade inválida. Máximo permitido: 20 anos.");
                                        if (idade < 1) idade = idade / 12.0;
                                        if (idade == 0) {
                                            System.out.println("Idade nao informada");
                                            idade = NAO_INFORMADO_DOUBLE;
                                            break;
                                        }
                                        break;
                                    case 5: // Peso
                                        String pesoStr = sc.nextLine().replace(",", ".");
                                        peso = Double.parseDouble(pesoStr);
                                        if ((peso < 0.5 || peso > 60) && peso != 0)
                                            throw new DomainExceptions("Peso inválido. Deve estar entre 0.5kg e 60kg.");
                                        if (peso == 0) {
                                            System.out.println("Peso nao informado");
                                            peso = NAO_INFORMADO_DOUBLE;
                                        }
                                        break;
                                    case 6:
                                        raca = sc.nextLine().toUpperCase();
                                        if (raca.isEmpty()) {
                                            System.out.println("Raça nao informada");
                                            raca = NAO_INFORMADO;
                                        }
                                        break;
                                }
                            }

                            Address address = new Address(numeroCasa, cidade, rua, bairro);
                            Pets p = new Pets(nomeCompleto, address, idade, peso, raca, tipo, sexo);
                            list.add(p);
                            System.out.println("Pet cadastrado com sucesso: " + p.getNomeCompleto());

                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: tipo ou sexo inválido.");
                        } catch (Exception e) {
                            System.out.println("Erro inesperado: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Alterar");
                        break;
                    case 3:
                        System.out.println("Deletar");
                        break;
                    case 4:
                        System.out.println("Listar");
                        System.out.println(list.get(0));
                        break;
                    case 5:
                        System.out.println("Listar ordenado");
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                }


            } while (escolha != 6);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            sc.next();
        }
    }
}