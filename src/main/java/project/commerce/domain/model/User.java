package project.commerce.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.AuditOverride;
import project.commerce.domain.BaseEntity;
import project.commerce.domain.SignUpForm;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@AuditOverride(forClass = BaseEntity.class)
public class User extends BaseEntity {
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String user_password;
    private String user_name;
    private String user_contact;
    private String user_address;

    public static User from(SignUpForm form){
        return User.builder()
                .user_password(form.getPassword())
                .user_name(form.getName())
                .user_contact(form.getContact())
                .user_address(form.getAddress())
                .build();
    }

}
