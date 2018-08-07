package examples.boot.myshop.domain;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    // declare field
    private Long id;
    private String name;
    private String email;
    private String password;
}
