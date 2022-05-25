package io.github.jassonluiz.userRegistration.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_card;
	
	@Column(nullable = false, length = 8, unique = true)
	private String cardNumber;
	
	@Column(nullable = false, length = 150)
	private String name;
	
	@Column(nullable = false)
	private Boolean status;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CardType cardType;
}
