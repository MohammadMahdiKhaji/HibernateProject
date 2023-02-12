package ir.webapp.startup.model.entity;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.base.BaseEntity;
import ir.webapp.startup.model.entity.enumeration.Classification;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "userAccessEntity")
@Table(name = "useraccess")
@NamedQueries({@NamedQuery(name = "findAllUserAccess", query = "select oo from userAccessEntity oo")})

public class UserAccess extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    //LowerCase And Trim
    @Column(columnDefinition = "NVARCHAR2(30)", unique = true)
    private String username;

    //Trim
    @Column(columnDefinition = "NVARCHAR2(30)", unique = true)
    private String password;

    @Enumerated(EnumType.STRING)
    private Classification classification;

    public UserAccess(String username, String password) {
        this.username = username.toLowerCase().trim();
        this.password = password.trim();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
