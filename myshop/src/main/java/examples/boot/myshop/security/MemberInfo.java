package examples.boot.myshop.security;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberInfo  {
    private Long id;
    private String email;
}
