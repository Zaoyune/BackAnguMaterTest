package com.example.explastmain;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("hotel")
@CrossOrigin(value = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE} )
public class RestController {
    public final UserRepository userRepository;
    public final ExpRepository expRepository;

    public RestController(UserRepository userRepository, ExpRepository expRepository) {
        this.userRepository = userRepository;
        this.expRepository = expRepository;
    }

    @PostMapping(value="/Add")
   public Exp Ajouter(@RequestBody Exp exp){
        return expRepository.save(exp);
    }


    @GetMapping("/exp")
    public List<Exp> all(){

        return expRepository.findAll();
    }
    @GetMapping("/users")
    public List<User> allUsers(){

        return userRepository.findAll();
    }
    @GetMapping("/exp/{id}")
    Exp one(@PathVariable Long id) {

        return expRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Achat not found for this id :: " +id));
    }

    @GetMapping("/av")
    public List<Exp> Avril(){

       return expRepository.findExpByDateBetweenAnd();
    }
    @GetMapping("/ma")
    public List<Exp> Mai(){
        return expRepository.findByMai();
    }
    @GetMapping("/ju")
    public List<Exp> Juin(){
        return expRepository.findByJuin();
    }
    @GetMapping("/jl")
    public List<Exp> Jluy(){
        return expRepository.findByJuly();
    }
    @GetMapping("/ao")
    public List<Exp> Aout(){
        return expRepository.findByAout();
    }
    @GetMapping("/sep")
    public List<Exp> Sptember(){
        return expRepository.findBySeptember();
    }
    @GetMapping("/oc")
    public List<Exp> Ocotber(){
        return expRepository.FindByOctober();
    }
}
