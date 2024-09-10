package ageria.u5s5l2.services;

import ageria.u5s5l2.entities.Author;
import ageria.u5s5l2.entities.BlogPost;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {

    @Getter
    List<Author> authorList = new ArrayList<>();

    public Author findAuthorById(int id){
        return authorList.stream().filter(author -> author.getId() == id).findFirst().orElse(null);
    }
    public void saveAuthor(Author body){
        Random random = new Random();
        body.setId(random.nextInt(1,1000000));
        body.setAvatar("https://localhost:8080/api/?name=" + body.getName() + body.getSurname());
        this.authorList.add(body);
    }
}
