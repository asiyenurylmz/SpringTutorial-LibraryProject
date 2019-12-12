package com.tutorial.library.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "book")
public class BookEntity extends BaseEntity {
	@Id
	@SequenceGenerator(name = "book_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "author")
	private String author;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "library_book", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "library_id", referencedColumnName = "id"))
	private List<LibraryEntity> libraries;
	
	@Override
	public String toString() {
		return "[name:"+name+", author:"+author+"]";
	}
}
