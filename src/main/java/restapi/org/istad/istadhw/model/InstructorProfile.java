package restapi.org.istad.istadhw.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "instructor_profiles")
public class InstructorProfile {

    @Id
    @Column(name = "user_id", length = 255, nullable = false)
    private String userId;

    @Column(name = "biography", length = 255)
    private String biography;

    @Column(name = "facebook_link", length = 255)
    private String facebookLink;

    @Column(name = "github_link", length = 255)
    private String githubLink;

    @Column(name = "job_title", length = 255)
    private String jobTitle;

    @Column(name = "phone_number", length = 255)
    private String phoneNumber;
}
