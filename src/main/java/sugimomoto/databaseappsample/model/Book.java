package sugimomoto.databaseappsample.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String detail;
}
