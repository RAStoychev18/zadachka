package com.example.zadachka.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NumberController {

    @GetMapping("/numbers")
    public String printNumbers(Model model, @RequestParam int n) {

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n ; i++) {
            if (i % 3 == 0) {


                list.add(i);
            }
        }

        model.addAttribute("printNumb1", list);

        return "index";
    }
}