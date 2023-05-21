package com.MusicStreaming.Music.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MusicStreaming.Music.Model.UserStatus;

public interface IUserStatusRepo extends JpaRepository<UserStatus, Integer> {

}
