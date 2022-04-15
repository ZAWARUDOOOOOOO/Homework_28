package hv.bd.shop.controller;


import hv.bd.shop.dao.entityservices.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//http://localhost:8080/books
@Slf4j
@Controller
@RequestMapping("/bookShop")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //http://localhost:8080/books/home
    /*@GetMapping("/home")
    public String home(Model model){
        return "home";
    }*/

    //http://localhost:8080/books/catalog
    @GetMapping("/catalog")
    public String books(Model model){
        model.addAttribute("books",bookService.getBooks());
        return "books";
    }

    //http://localhost:8080/books/book
    /*@GetMapping("/book")
    public String createPage(Model model){
        model.addAttribute("book", new Book());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String createBook(@ModelAttribute Book book, Model model){
        log.debug("{}",book);
        model.addAttribute("books",book);
        return "addBook";
    }*/
}
