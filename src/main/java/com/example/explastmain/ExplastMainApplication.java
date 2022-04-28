package com.example.explastmain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExplastMainApplication implements CommandLineRunner {


    private final ExpRepository expRepository;
    private final UserRepository userRepository;

    public ExplastMainApplication(ExpRepository expRepository, UserRepository userRepository) {
        this.expRepository = expRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExplastMainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //User user1=userRepository.save(new User(null,"Hicham","Kassouani"));
        //DateFormat df = new SimpleDateFormat("")
        //expRepository.save(new Exp(null, "bus ticket", 2, "RATP", 1, null,user1));
       // expRepository.save(new Exp(null, "Chocolate", 2, "Kinder", 1, new Date()));
       // expRepository.save(new Exp(null, "Test", 2, "game", 1, new Date()));



    }
}











































































































































