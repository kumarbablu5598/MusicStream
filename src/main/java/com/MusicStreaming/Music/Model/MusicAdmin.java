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
@Table(name = "tbl_music_admin")
public class MusicAdmin {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="admin_id")
	  private Integer adminId;
	  
	  @Column(name="admin")
	  private String adminName;
	  
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

}
