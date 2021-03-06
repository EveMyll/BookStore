package fi.syksy2021.Bookstore.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fi.syksy2021.Bookstore.domain.Book;

public class BookController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String greetingForm(Model model) {
		model.addAttribute("book", new Book());
		return "index";
	}
}
