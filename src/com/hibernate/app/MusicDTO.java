package com.hibernate.app;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music_table")
public class MusicDTO implements Serializable {
	@Id
	@Column(name="music_name")
	private String name;
	@Column(name="music_artist")
	private String artist;
	@Column(name="music_length")
	private double length;
	@Column(name="year_of_release")
	private int yearOfRelease;

	
	//generate geters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public MusicDTO() {
	}

}
