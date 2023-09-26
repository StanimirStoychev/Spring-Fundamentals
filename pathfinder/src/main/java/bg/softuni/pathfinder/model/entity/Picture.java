package bg.softuni.pathfinder.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pictures")
public class Picture extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String url;

    @OneToOne(optional = false)
    private User author;

    @OneToOne
    private Route route;

    public Picture() {}

    public String getTitle() {
        return title;
    }

    public Picture setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Picture setUrl(String url) {
        this.url = url;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Picture setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public Picture setRoute(Route route) {
        this.route = route;
        return this;
    }
}
