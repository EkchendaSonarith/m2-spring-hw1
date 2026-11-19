package restapi.org.istad.istadhw.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "slug", length = 255)
    private String slug;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "keyword", length = 255)
    private String keyword;

    @Column(name = "level", length = 255)
    private String level;

    @Column(name = "thumbnail", length = 255)
    private String thumbnail;

    @Column(name = "price", precision = 38, scale = 2)
    private BigDecimal price;

    @Column(name = "discount_percent")
    private Float discountPercent;

    @Column(name = "total_hours")
    private Float totalHours;

    @Column(name = "star_rating")
    private Float starRating;

    @Column(name = "count_rating")
    private Integer countRating;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "is_published")
    private Boolean isPublished;

    @Column(name = "created_at", columnDefinition = "timestamp(6)")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "timestamp(6)")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;
}
