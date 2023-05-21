package com.MusicStreaming.Music.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_music")
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="music_id")
	private Integer musicId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="artist")
	private String artists;
	
	@Column(name="duration")
	private double duration;
	
	@Column(name="genre")
	private String genre;
	
	
}
