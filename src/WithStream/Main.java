package WithStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<String> productname =  productsList.stream().filter(p->p.price>20000).map(p->p.name).collect(Collectors.toList());
        System.out.println(productname);

        //based on product price we fetch data name of product
        //List<String> productname = productPrice.stream().filter(product->product==28000).forEach(product-> System.out.println(product));

       Optional <Float> totalPrice = productsList.stream()
                .map(product->product.price).reduce((sum, price)->
                       {
                           return sum+price;
                       });
        System.out.println(totalPrice);
        }

                 // accumulating price

    }

