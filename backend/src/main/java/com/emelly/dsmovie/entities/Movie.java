package com.emelly.dsmovie.entities;

<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

=======
>>>>>>> 0449e71f8a9e4746a3c405d20e615204b4b28e68
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.OneToMany;
=======
>>>>>>> 0449e71f8a9e4746a3c405d20e615204b4b28e68
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
<<<<<<< HEAD
	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>();
	
=======
>>>>>>> 0449e71f8a9e4746a3c405d20e615204b4b28e68
	public Movie() {	
	}

	public Movie(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
<<<<<<< HEAD

	public Set<Score> getScores() {
		return scores;
	}

		
=======
	
	
	
>>>>>>> 0449e71f8a9e4746a3c405d20e615204b4b28e68
}
