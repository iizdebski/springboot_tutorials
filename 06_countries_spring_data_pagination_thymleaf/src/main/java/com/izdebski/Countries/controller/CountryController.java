package com.izdebski.Countries.controller;

import com.izdebski.Countries.entities.Country;
import com.izdebski.Countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepo;

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("data", countryRepo.
                findAll(new PageRequest(page, 4)));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @PostMapping("/save")
    public String save(Country c){
        countryRepo.save(c);

        return "redirect:/";
    }
    @GetMapping("/delete")
    public String deleteCountry(Integer id){
        countryRepo.delete(id);

        return "redirect:/";
    }
    @GetMapping("/findOne")
    @ResponseBody
    public Country findOne(Integer id){
        return countryRepo.findOne(id);
    }
}