package org.example;


import org.example.config.ProductConfig;
import org.example.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //to access the bean declared
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(ProductConfig.class);

        System.out.println(con.getBean("product1", Product.class));
        System.out.println("----------------------------------------------");
        System.out.println( con.getBean("product2", Product.class));
    }


}
