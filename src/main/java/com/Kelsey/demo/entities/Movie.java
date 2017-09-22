package com.Kelsey.demo.entities;

import javax.persistence.*;

/**
 * Created by kelseynewman on 9/21/17.
 */

@Entity
@Table(name="movies")
public class Movie {
  @Id
  @GeneratedValue
  int id;

  @Column(nullable = false)
  String title;

  @Column(nullable = false)
  String genre;

  @Column(nullable = false)
  String releaseDate;

  @Column(nullable = false)
  boolean adult;



  public Movie() {
  }

  public Movie(Integer id, String title, String genre, String releaseDate, Boolean adult) {
    this.id = id;
    this.title = title;
    this.genre = genre;
    this.releaseDate = releaseDate;
    this.adult = adult;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public boolean isAdult() {
    return adult;
  }

  public void setAdult(boolean adult) {
    this.adult = adult;
  }
}

