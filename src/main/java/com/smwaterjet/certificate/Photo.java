package com.smwaterjet.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    private Integer year;

    @Column(nullable = false)
    private String path;

    @CreationTimestamp
    @JsonProperty("created_at")
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    protected Photo() {
    }

    @Builder
    public Photo(String title, Integer year, String path) {
        this.title = title;
        this.year = year;
        this.path = path;
    }
}
