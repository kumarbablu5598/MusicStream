package com.MusicStreaming.Music.Controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.MusicStreaming.Music.Service.AdminService;
import com.MusicStreaming.Music.Service.MusicService;
import com.MusicStreaming.Music.Utils.AdminUtil;
import com.MusicStreaming.Music.Utils.MusicUtil;

import io.micrometer.common.lang.Nullable;
@RestController
@RequestMapping("api/adminController")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@Autowired
	AdminUtil adminUtil;
	
	@Autowired
	MusicUtil musicUtil;
	
	@Autowired
	MusicService musicService;
	
	@PostMapping(value = "/addAdmin")
	public ResponseEntity<String> addAdmin(@RequestBody String admin){
		JSONObject jsonObject=new JSONObject(admin);
		JSONObject isValidJsonObject=adminUtil.validateAdmin(jsonObject);
		
		if(isValidJsonObject.isEmpty()) {
			int id=adminService.addAdmin(jsonObject);
			return new ResponseEntity<String>("Admin added " +id,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(isValidJsonObject.toString(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PostMapping(value="/addMusic")
	public ResponseEntity<String> addMusic(@RequestBody String music){
		
		JSONObject jsonObject=new JSONObject(music);
		JSONObject isValidJsonObject=musicUtil.validateMusic(jsonObject);
		
		if(isValidJsonObject.isEmpty()) {
			int id=musicService.addMusic(jsonObject);
			return new ResponseEntity<String>("Music added " +id,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(isValidJsonObject.toString(),HttpStatus.BAD_REQUEST);
		}
	}
		
    @GetMapping("/getMusic")
    public ResponseEntity<String> getMusic(@Nullable @RequestParam Integer id){
        JSONArray jsonArray=musicService.getMusic(id);
        return new ResponseEntity<String>(jsonArray.toString(),HttpStatus.OK);
    }
    
    @PutMapping("/updateMusic/{id}")
    public ResponseEntity<String> updateMusic(@PathVariable int id,@RequestBody String music){
    	JSONObject jsonObject=new JSONObject(music);
		JSONObject isValidJsonObject=musicUtil.validateMusic(jsonObject);
		
		if(isValidJsonObject.isEmpty()) {
			String msgString=musicService.updateMusic(id,jsonObject);
			return new ResponseEntity<String>(msgString ,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(isValidJsonObject.toString(),HttpStatus.BAD_REQUEST);
		}
    	
    }
    
    @DeleteMapping("/deleteMusic/{id}")
    public ResponseEntity<String> deleteMusic(@PathVariable int id){
    	String msgString=musicService.deleteMusic(id);
    	return new ResponseEntity<String>(msgString,HttpStatus.ACCEPTED);
    }
		
		
}	
	

