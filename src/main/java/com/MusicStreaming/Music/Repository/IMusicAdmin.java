package com.MusicStreaming.Music.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MusicStreaming.Music.Model.MusicAdmin;

public interface IMusicAdmin extends JpaRepository<MusicAdmin, Integer>{

}
