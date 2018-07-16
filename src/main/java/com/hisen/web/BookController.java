package com.hisen.web;

import com.hisen.entity.Book;
import com.hisen.service.BookService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hisen on 17-4-24.
 */
@Controller
@RequestMapping("/book")
public class BookController {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private BookService bookService;

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  private String list(Model model) {
    List<Book> list = bookService.getList(0, 1000);
    model.addAttribute("list", list);
    return "list";// WEB-INF/jsp/"list".jsp
  }

  @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
  private String detail(@PathVariable("id") Long id, Model model) {
    Book book = bookService.getById(id);
    model.addAttribute("book", book);
    return "detail";
  }

  @RequestMapping(value = "/padd",method = RequestMethod.GET)
  @ResponseBody
  private ModelAndView padd() {
    ModelAndView mv=new ModelAndView("padd");
    return mv;
  }

  @RequestMapping(value = "/add", method = RequestMethod.GET)
  @ResponseBody
  public Book add(@RequestParam("id") long id,@RequestParam("name") String name,@RequestParam("number") int number,@RequestParam("detail") String detail) {
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    Book book=new Book();
    book.setId(id);
    book.setName(name);
    book.setNumber(number);
    book.setDetail(detail);
    bookService.addBook(book);
    return book;
  }

//  @RequestMapping(value = "/add", method = RequestMethod.GET)
//  @ResponseBody
//  public String add(@RequestBody Book book) {
//    Book hasBook = bookService.getById(book.getId());
//    System.out.println(book);
//    int i = -2;
//    if (hasBook == null) {
//      i = bookService.addBook(book);
//    }
//    return i > 0 ? "success" : "error";
//  }

  @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
  @ResponseBody
  private String deleteBookById(@PathVariable("id") Long id) {
    int i = bookService.deleteBookById(id);
    return i > 0 ? "success" : "error";
  }
}
