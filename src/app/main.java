package app;

import entities.Products;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Precione N para Enserar! \nDigite qualquer tecla para continuar ");
            char key = input.next().charAt(0);

            if(Objects.equals(key, "n") || Objects.equals(key, "N")){
                input.close();
                break;
            }else {
                System.out.print("Digite o nome do produto: ");
                String name = input.next();
                System.out.print("Digite o preco do produto: ");
                double price = input.nextDouble();
                System.out.print("Digite a quantidade em estoque: ");
                int quantity = input.nextInt();

                Products produto = new Products(name, price, quantity);

                System.out.println(produto);
                System.out.println();

                while (true){
                    System.out.println("Digite A para add itens no estoque, \nDigite R para remover itens do estoque \nDigite qualquer tecla para retornar: ");
                    key = input.next().charAt(0);

                    if(Objects.equals(key, "add") || Objects.equals(key, "Add") || Objects.equals(key, "ADD")){
                        System.out.print("Adicionar itens no estoque: ");
                        produto.AddProducts(input.nextInt());
                        System.out.println(produto);
                        System.out.println();
                    }else if(Objects.equals(key, "rm") || Objects.equals(key, "Rm") || Objects.equals(key, "RM")) {
                        System.out.print("Remover items do estoque: ");
                        produto.RemoveProducts(input.nextInt());
                        System.out.println(produto);
                        System.out.println();
                    }else {
                        break;
                    }
                }
            }
        }

    }
}
