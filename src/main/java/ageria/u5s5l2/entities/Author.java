package ageria.u5s5l2.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String avatar;
}
