package io.github.jassonluiz.userRegistration.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_user;
	@Column(nullable = false, length = 150)
	private String name;
	
	@Email
	private String email;
	
	@Column(nullable = false, length = 40)
	private String password;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	//private List<Card> cards;
}
