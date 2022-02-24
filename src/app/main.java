package app;

import entities.Products;

import java.util.Locale;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Products produto = new Products();

        produto.name = "TV";
        produto.price = 2580.56;
        produto.quantity = 5;

        System.out.println(produto);
        System.out.println();

        produto.AddProducts(4);
        System.out.println(produto);
        System.out.println();

        produto.RemoveProducts(5);
        System.out.println(produto);
        System.out.println();

    }
}
