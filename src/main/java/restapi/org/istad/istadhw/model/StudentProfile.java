package restapi.org.istad.istadhw.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class StudentProfile {

    @Id
    @Column(name = "user_id", length = 255, nullable = false)
    private String userId;

    @Column(name = "biography", length = 255)
    private String biography;

    @Column(name = "facebook_link", length = 255)
    private String facebookLink;

    @Column(name = "github_link", length = 255)
    private String githubLink;

    @Column(name = "major", length = 255)
    private String major;

    @Column(name = "phone_number", length = 255)
    private String phoneNumber;

    @Column(name = "university", length = 255)
    private String university;
}
