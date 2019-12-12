package com.tutorial.library.init;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorial.library.entity.LibraryEntity;
import com.tutorial.library.service.BookEntityService;
import com.tutorial.library.service.LibraryEntityService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DatabaseInitializer implements CommandLineRunner {
	@Autowired
	private BookEntityService bookService;
	@Autowired
	private LibraryEntityService libraryService;

	@Override
	public void run(String... args) throws Exception {
//		BookEntity book01 = new BookEntity();
//		book01.setName("Book01");
//		book01.setAuthor("Author01");
//		book01 = bookService.save(book01);
//
//		BookEntity book02 = new BookEntity();
//		book02.setName("Book02");
//		book02.setAuthor("Author02");
//		book02 = bookService.save(book02);
//
//		LibraryEntity library01 = new LibraryEntity();
//		library01.setName("Library01");
//		library01.setCity("TRABZON");
//		library01.setDistrict("AKÇAABAT");
//		library01 = libraryService.save(library01);
//
//		LibraryEntity library02 = new LibraryEntity();
//		library02.setName("Library02");
//		library02.setCity("TRABZON");
//		library02.setDistrict("AKÇAABAT");
//		library02 = libraryService.save(library02);

//		Optional<BookEntity> optionalBook01 = bookService.findByName("Book01");
//		if (optionalBook01.isPresent()) {
//			BookEntity book01 = optionalBook01.get();
//		}
//
//		BookEntity book01 = bookService.findByName("Book01").orElseThrow(EntityNotFoundException::new);
//		System.out.println(book01.getName());

		List<LibraryEntity> libraryList = libraryService.findByCity("TRABZON");

//		book01.setLibraries(libraryList);
//		book01 = bookService.save(book01);
		
		
		System.out.println(Arrays.asList(libraryList.get(0).getBooks()).toString());
		log.info("fİNİSHED");
	}
}
