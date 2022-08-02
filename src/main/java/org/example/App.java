package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.checkout("Cancelled");
        shoppingCart.quantity();
    }
}
