package com.MusicStreaming.Music.Controller;

import java.security.PublicKey;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MusicStreaming.Music.Model.Music;
import com.MusicStreaming.Music.Model.MusicUser;
import com.MusicStreaming.Music.Service.UserService;
import com.MusicStreaming.Music.Utils.UserUtil;

@RestController
@RequestMapping("api/userController")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserUtil userUtil;
	
			
	@PostMapping(value = "/addUser")
	public ResponseEntity<String> addUser(@RequestBody String user){
		JSONObject jsonObject=new JSONObject(user);
		JSONObject isValidJsonObject=userUtil.validateAdmin(jsonObject);
		
		if(isValidJsonObject.isEmpty()) {
			int id=userService.addUser(jsonObject);
			return new ResponseEntity<String>("User added " +id,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(isValidJsonObject.toString(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value="getPlaylist/{id}")
	public List<Music> getPlayList(@PathVariable Integer id){
		return userService.getPlaylist(id);
				
	}
	
	@DeleteMapping(value = "deleteMusic/{id}/{musicId}")
	public String deleteMusic(@PathVariable Integer id,@PathVariable Integer musicId) {
		return userService.deleteMusic(id,musicId);
		 
		
	}
}
		

