package com.cg.pl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.entity.Author;
import com.cg.entity.Book;
import com.cg.service.AuthorService;

public class Main {

	public static void main(String[] args) {

		AuthorService as = new AuthorService();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1. insert author");
			System.out.println("2. get all the authors");
			System.out.println("3. update the price of book");
			System.out.println("4. delete the book");
			System.out.println("5. delete the author");
			System.out.println("6. exit");

			System.out.println("Enter the option");
			int op = sc.nextInt();

			switch (op) {

			case 1: {
				List<Book> books = new ArrayList<>();
				Author a = new Author();

				System.out.println("Enter the author name : ");
				a.setAuthorName(sc.next());

				System.out.println("Enter the author email : ");
				a.setEmail(sc.next());

				System.out.println("Enter the number of books");
				int n = sc.nextInt();

				while (n-- > 0) {
					Book b = new Book();

					System.out.println("Enter the book title");
					b.setTitle(sc.next());

					System.out.println("Enter the book price");
					b.setPrice(sc.nextInt());

					b.setAuthor(a);
					books.add(b);
				}

				System.out.println(as.insertAuthor(a, books));
				break;
			}

			case 2: {
				as.getAuthors();
				break;
			}

			case 3: {
				System.out.println("Enter book id");
				int id = sc.nextInt();

				System.out.println("Enter new price");
				int price = sc.nextInt();

				System.out.println(as.updateBookPrice(id, price));
				break;
			}

			case 4: {
				System.out.println("Enter book id to delete");
				int id = sc.nextInt();

				System.out.println(as.deleteBookById(id));
				break;
			}

			case 5: {
				System.out.println("Enter author id to delete");
				int id = sc.nextInt();

				System.out.println(as.deleteAuthorById(id));
				break;
			}

			case 6: {
				System.out.println("Exited");
				sc.close();
				System.exit(0);
			}

			default:
				System.out.println("Invalid option");
			}
		}
	}
}
