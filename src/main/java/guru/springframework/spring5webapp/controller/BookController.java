package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    @RequestMapping("/books")
    public String getBooks(Model model){

        Iterable<Book> books = new ArrayList<>();
        books = bookRepository.findAll();
        model.addAttribute("books",bookRepository.findAll());

        return "books";
    }
}
