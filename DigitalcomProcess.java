package assignment1;
import java.util.*;
public class DigitalcomProcess {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	User user=new User();
	GameService service=new GameService();
	int choice=0;
	while(choice!=4)
	{
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1:
				System.out.println("Enter UseriId: ");
				String uid=sc.nextLine();
				System.out.println("Enter Password: ");
				String pass=sc.nextLine();
				user.addUser(uid,pass);
				System.out.println("user is registered");
				break;
			case 2:
				List<Game> games=service.viewAll();
				for(Game g:games)
					System.out.println(g);
				break;
			case 3:
				System.out.println("Enter Author name:");
				String author=sc.nextLine();
				String result=service.authorSearch(author);
				System.out.println(result);
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice");
				}
		choice=sc.nextInt();
	}
}
}