package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.entity.enums.Level;
import jakarta.persistence.*;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    @Column(name = "gpx_coordinates", nullable = false, columnDefinition = "LONGTEXT")
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Column(nullable = false)
    private String name;

    @OneToOne(optional = false)
    private User author;

    @Column(name = "video_url")
    private String videoUrl;

    public Route() {}

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public Route setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public Route setLevel(Level level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public Route setName(String name) {
        this.name = name;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Route setAuthor(User author) {
        this.author = author;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Route setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
}
