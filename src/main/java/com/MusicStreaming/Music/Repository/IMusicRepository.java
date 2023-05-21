package com.MusicStreaming.Music.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MusicStreaming.Music.Model.Music;

public interface IMusicRepository extends JpaRepository<Music, Integer> {

}
