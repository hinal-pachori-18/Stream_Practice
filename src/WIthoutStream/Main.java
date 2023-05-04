package WIthoutStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

class Product{
    int p_id;
    String name;
    float price;
    Product(int p_id, String name,float price)
    {
        this.p_id = p_id;
        this.name = name;
        this.price = price;
    }
}
public class Main {
    public static void main(String[] args) {
        List <Product> numbers = new ArrayList<>();
        numbers.add(new Product(101,"Grocery",900));
        numbers.add(new Product(201,"choclate",232));
        numbers.add(new Product(202,"choclate",112));
        numbers.add(new Product(203,"choclate",442));
        numbers.add(new Product(204,"choclate",552));

        List<Float> productPrice = new ArrayList<>();
        for(Product p : numbers){
            if(p.price>400)
            {
                productPrice.add(p.price);
            }
        }
        System.out.println(productPrice);
    }
}
