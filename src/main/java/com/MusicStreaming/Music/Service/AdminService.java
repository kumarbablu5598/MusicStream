package com.MusicStreaming.Music.Service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MusicStreaming.Music.Model.MusicAdmin;
import com.MusicStreaming.Music.Repository.IMusicAdmin;
import com.MusicStreaming.Music.Utils.AdminUtil;

@Service
public class AdminService {
	
	@Autowired
	AdminUtil adminUtil;
	
	@Autowired
	IMusicAdmin iMusicAdmin;

	public int addAdmin(JSONObject admin) {
		MusicAdmin musicAdmin=adminUtil.setAdmin(admin);
		MusicAdmin musicAdmin2=iMusicAdmin.save(musicAdmin);
		return musicAdmin2.getAdminId();
	}

}
