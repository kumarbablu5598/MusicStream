package com.MusicStreaming.Music.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MusicStreaming.Music.Model.MusicUser;

public interface IMusicUserRepository extends JpaRepository<MusicUser, Integer> {
    
	@Query(value = "Select * from tbl_music_user where usrname= :username and status_id =1", nativeQuery=true)
	List<MusicUser> findByUsername(String username);

}
