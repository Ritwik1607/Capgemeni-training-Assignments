package com.cg.dao;

import java.util.List;

import com.cg.entity.Author;
import com.cg.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AuthorDao {

	static EntityManagerFactory emf;
	static EntityManager em;

	static {
		emf = Persistence.createEntityManagerFactory("my-pu");
		em = emf.createEntityManager();
	}

	public void saveAuthor(Author author, List<Book> books) {

		author.setBooks(books);
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();

	}

	public List<Author> getAllAuthor() {

		List<Author> authors = em.createQuery("from Author", Author.class).getResultList();

		return authors;
	}

	public void updateBook(int id, int newPrice) {

		em.getTransaction().begin();
		Book curr = em.find(Book.class, id);
		curr.setPrice(newPrice);
		em.getTransaction().commit();
	}

	public void deleteBook(int id) {

		em.getTransaction().begin();

		Book book = em.find(Book.class, id);

		if (book != null) {
			em.remove(book);
		}

		em.getTransaction().commit();
	}

	public void deleteAuthor(int id) {
		em.getTransaction().begin();
		Author auth = em.find(Author.class, id);
		if (auth != null) {
			em.remove(auth);
		}
		em.getTransaction().commit();
	}

}
