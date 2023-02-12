package ir.webapp.startup.model.entity;

import com.google.gson.Gson;
import ir.webapp.startup.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "personEntity")
@Table(name = "person")
@NamedQueries({@NamedQuery(name = "findAllPerson", query = "select oo from personEntity oo")})

public class Person extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private UserAccess userAccess;

//    @OneToOne(cascade = CascadeType.ALL)
//    private PersonBirthCertificate birthCertificate;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    private UserAccess userAccess;

//
//    @OneToMany(cascade = CascadeType.ALL)
//    private Set<PersonSocialMedia> socialMedias;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<PersonSkill> skills = new ArrayList<>();

    //LowerCase And Trim
    @Column(columnDefinition = "NVARCHAR2(30)")
    private String firstName;

    //LowerCase And Trim
    @Column(columnDefinition = "NVARCHAR2(30)")
    private String lastName;

//    @Column(columnDefinition = "VARCHAR2(10)")
//    private String nationalCode;

    @Column(unique = true)
    private String email;

    private Date birthDate;

    @Column(columnDefinition = "NVARCHAR2(30)")
    private String city;

    public Person(String firstName, String lastName, String email, Date birthDate, String city) {
        this.firstName = firstName.toLowerCase().trim();
        this.lastName = lastName.toLowerCase().trim();
        this.email = email.trim();
        this.birthDate = birthDate;
        this.city = city;
    }

    public Person(String email) {
        this.email = email.trim();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
