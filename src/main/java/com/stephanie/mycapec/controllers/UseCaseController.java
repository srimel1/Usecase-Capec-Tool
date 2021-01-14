package com.stephanie.mycapec.controllers;

import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import com.stephanie.mycapec.models.Apdb;
import com.stephanie.mycapec.repositories.ApdbRepository;
import com.stephanie.mycapec.repositories.UserRepository;
import groovy.util.logging.Log;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stephanie.mycapec.models.UseCase;
import com.stephanie.mycapec.models.User;
import com.stephanie.mycapec.repositories.UseCaseRepository;
import com.stephanie.mycapec.services.CustomUserDetailsService;

@Controller
public class UseCaseController {
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(UseCaseController.class);



    @Autowired
    private CustomUserDetailsService userService;

    @Autowired
    private UseCaseRepository useCaseRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired ApdbRepository apdbRepository;



    @RequestMapping(value = "/usecases", method = RequestMethod.GET)
    public ModelAndView usecases() {
        System.out.println("Hi this is a test");

        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("usecases", useCaseRepository.findAll());
        modelAndView.addObject("currentUser", user);
        modelAndView.addObject("fullName", "Welcome " + user.getFullname());
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
        modelAndView.setViewName("usecases");
        return modelAndView;
    }

    @RequestMapping("/usecases/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        modelAndView.addObject("currentUser", user);
        modelAndView.addObject("fullName", "Welcome " + user.getFullname());
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
        modelAndView.setViewName("create");
        return modelAndView;
    }

    @RequestMapping("/usecases/save")
    public String save(@RequestParam String title, @RequestParam String content/*, @RequestParam String mitigation*/) {
        UseCase usecase = new UseCase();
        usecase.setTitle(title);
        usecase.setContent(content);
//        Collection<User> test = userRepository.findByEnabled();
//        String mitigation = apdbRepository.findApdbByID(1);
//        String mitigation = mit.getMitigations().toString();


//        String mitigation = test.toString();
//        String mitigation = "1";

        Apdb apdb = apdbRepository.findApdbByID(1);
        String mitigation = apdb.getMitigations();

        usecase.setMitigation(mitigation);
        usecase.setUpdated(new Date());
        useCaseRepository.save(usecase);

        return "redirect:/usecases/show/" + usecase.getId();
    }

    @RequestMapping("/usecases/show/{id}")
    public ModelAndView show(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("currentUser", user);
        modelAndView.addObject("fullName", "Welcome " + user.getFullname());
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
        modelAndView.addObject("usecase", useCaseRepository.findById(id).orElse(null));
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping("/usecases/delete")
    public String delete(@RequestParam Long id) {
        UseCase usecase = useCaseRepository.findById(id).orElse(null);
        useCaseRepository.delete(usecase);
        return "redirect:/usecases";
    }

    @RequestMapping("/usecases/edit/{id}")
    public ModelAndView edit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        UseCase usecase = useCaseRepository.findById(id).orElse(null);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("currentUser", user);
        modelAndView.addObject("fullName", "Welcome " + user.getFullname());
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
        modelAndView.addObject("usecase", useCaseRepository.findById(id).orElse(null));
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @RequestMapping("/usecases/update")
    public String update(@RequestParam Long id, @RequestParam String title, @RequestParam String content/*, @RequestParam String mitigation*/) {
        UseCase usecase = useCaseRepository.findById(id).orElse(null);
//        Collection<User> test = userRepository.findByEnabled();
//        String mitigation = test.toString();
        usecase.setTitle(title);
        usecase.setContent(content);
        usecase.setUpdated(new Date());
//        String mitigation = "1";
        Apdb apdb = apdbRepository.findApdbByID(1);
        String mitigation = apdb.getMitigations();
        //String mitigation = mit.getMitigations().toString();
//        String mitigation = apdbRepository.findUserByStatus(1);
        usecase.setMitigation(mitigation);
        useCaseRepository.save(usecase);

        return "redirect:/usecases/show/" + usecase.getId();
    }



    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

//    public Collection<User> findUserByEnabled(){
//        return userRepository.findByEnabled();
//    }

}
