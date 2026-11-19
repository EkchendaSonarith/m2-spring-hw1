package restapi.org.istad.istadhw.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "slug", length = 255)
    private String slug;

    @Column(name = "duration", length = 255)
    private String duration;

    @Column(name = "thumbnail", length = 255)
    private String thumbnail;

    @Column(name = "youtube", length = 255)
    private String youtube;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "is_published")
    private Boolean isPublished;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;
}
