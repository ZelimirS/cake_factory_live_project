package cakes.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cakes.InMemoryCatalog;


@Controller
@RequestMapping("/catalog")
public class CatalogController {
	
	@ModelAttribute
	public void addCakesToModel(Model model) {
		List<InMemoryCatalog> cakes = Arrays.asList(
				new InMemoryCatalog("chocolate cake", 12.50),
				new InMemoryCatalog("vanilla cake", 16.15),
				new InMemoryCatalog("cheese cake", 13.45),
				new InMemoryCatalog("banana cake", 10.12),
				new InMemoryCatalog("lemon cake", 11.35)
				);
		model.addAttribute("cake", cakes);
		
	}
	
	@GetMapping
	public String showCatalog() {
		return "catalog";
	}

}
