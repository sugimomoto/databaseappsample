package sugimomoto.databaseappsample.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@Entity
public class Comment {
    
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String content;
}
