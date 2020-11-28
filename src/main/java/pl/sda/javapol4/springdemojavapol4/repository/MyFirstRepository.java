package pl.sda.javapol4.springdemojavapol4.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import pl.sda.javapol4.springdemojavapol4.service.MyFirstService;

@Slf4j
@Repository
public class MyFirstRepository {

    private String mySecret = "sekret hahadcw";

    public String mySecret() {
        return mySecret;
    }
}
