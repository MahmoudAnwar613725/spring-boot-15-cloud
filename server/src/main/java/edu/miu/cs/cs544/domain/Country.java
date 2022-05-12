package edu.miu.cs.cs544.domain;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.*;
@Entity
@Table(name = "country")
@Data
@NoArgsConstructor

public class Country {
	@Id
	@Column(name = "country_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "country")
	private String name;

	@Column(name = "last_update")
	private LocalDate lastModified;
}
