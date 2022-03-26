package sugimomoto.databaseappsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import sugimomoto.databaseappsample.model.*;
import sugimomoto.databaseappsample.repository.*;

@Controller
public class CommentController {
    
    private final CommentRepository repository;

    public CommentController(CommentRepository repository){
        this.repository = repository;
    }

    @GetMapping("/")
    public String getAllComments(@ModelAttribute Comment comment, Model model){
        model.addAttribute("comments", repository.findAll());
        return "list";
    }

    @PostMapping("/add")
    public String addComment(@Validated @ModelAttribute Comment comment, BindingResult result, Model model){
        model.addAttribute("comments", repository.findAll());
        if(result.hasErrors()){
            return "list";
        }

        repository.save(comment);

        return "redirect:/";
    }
}
