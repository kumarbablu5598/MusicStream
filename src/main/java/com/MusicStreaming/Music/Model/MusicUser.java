package com.MusicStreaming.Music.Model;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_music_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MusicUser {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="user_id")
  private Integer userId;
  
  @Column(name="usrname")
  private String userName;
  
  @Column(name="firstName")
  private String firstName;
  
  @Column(name="lastName")
  private String lastName;
  
  @Column(name="gender")
  private String gender;
  
  @Column(name="age")
  private Integer age;
  @Column(name="email")
  private String email;
  @Column(name="phoneNumber")
  private String phoneNumber;
  
  @ManyToOne
  @JoinColumn(name="status_id")
  private UserStatus statusId;
  
  @Column(name="playlist")
  private List<Integer> playlist;

  
}
