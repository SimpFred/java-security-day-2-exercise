package com.booleanuk.api.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "video_games")
public class VideoGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "game_studio")
    private String gameStudio;
    @Column(name = "age_rating")
    private int ageRating;
    @Column(name = "number_of_players")
    private int numberOfPlayers;
    @Column(name = "genre")
    private String genre;

    public VideoGame(String title, String gameStudio, int ageRating, int numberOfPlayers, String genre) {
        this.title = title;
        this.gameStudio = gameStudio;
        this.ageRating = ageRating;
        this.numberOfPlayers = numberOfPlayers;
        this.genre = genre;
    }

    public VideoGame(int id) {
        this.id = id;
    }
}
