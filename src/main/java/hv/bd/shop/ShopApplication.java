package hv.bd.shop;

import hv.bd.shop.dao.entity.Author;
import hv.bd.shop.dao.entity.Book;
import hv.bd.shop.dao.entity.Product;
import hv.bd.shop.dao.entityservices.AuthorService;
import hv.bd.shop.dao.entityservices.BookService;
import hv.bd.shop.dao.entityservices.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@EnableCaching
public class ShopApplication {

    private static final Logger log = LoggerFactory.getLogger(ShopApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShopApplication.class, args);

        //Сделать страничку со списком книг на Spring MVC + thymeleaf

    }

}
