package github.agomezuc.taskservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    private Long id;
    private String firstName;
    private String lastName;
    private String role;
}
