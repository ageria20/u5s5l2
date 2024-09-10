package ageria.u5s5l2.entities;


import ageria.u5s5l2.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {

    private int id;
    private String category;
    private String title;
    private String cover;
    private String contenuto;
    private int readingTime;
}
