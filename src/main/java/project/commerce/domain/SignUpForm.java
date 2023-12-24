package project.commerce.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpForm {
    private Long id;
    private String password;
    private String name;
    private String contact;
    private String address;
}
