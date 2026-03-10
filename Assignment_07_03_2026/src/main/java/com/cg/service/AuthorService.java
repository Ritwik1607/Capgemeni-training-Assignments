package com.cg.service;

import java.util.List;

import com.cg.dao.AuthorDao;
import com.cg.entity.Author;
import com.cg.entity.Book;

public class AuthorService {
	
	private AuthorDao dao = new AuthorDao();
	
	public String insertAuthor(Author author , List<Book> books) {
		
		dao.saveAuthor(author, books);
		
		return "Saved successfully";
	}
	
	public void getAuthors() {
		
		List<Author> authors = dao.getAllAuthor();
		
		for(Author auth : authors) {
			System.out.println("AuthorId" + auth.getAuthorId());
			System.out.println("AuthorId" + auth.getAuthorName());
			
			System.out.println("Books Written");
			System.out.println("------------------------------------");
			
			List<Book> books = auth.getBooks();
			
			for(Book book : books) {
				System.out.println(book.getTitle() + "-" + book.getPrice());
			}
			
		}
		
		
	}
	
	public String updateBookPrice(int id , int newPrice){
		
		dao.updateBook(id, newPrice);
		
		return "Price updated successFully";
	}
	
	
	public String deleteBookById(int id) {
		dao.deleteBook(id);
		
		return "Book details deleted successfully";
	}
	
	public String deleteAuthorById(int id) {
		dao.deleteAuthor(id);
		
		return "Author deleted successfully";
	}
	
}
