import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String cont = "y";
		Movie a = new Movie();
//		Loop start
		do {
			System.out.println("Please enter a movie name:  ");
			String name = input.nextLine(); 
			a.setTitle(name);
			System.out.println("Please enter the movie's rating:  ");
			String rate = input.nextLine(); 
			a.setRating(rate);
			System.out.println("Please enter the movie's tickets sold:  ");
			int sold = input.nextInt(); 
			input.nextLine();
			a.setSoldTickets(sold);
			System.out.println(a);
			System.out.println("Would you like to continue? y or n:  ");
			cont = input.nextLine();
			
			
		} while (cont.equals("y"));
		
//		Loop end
		input.close();

	}

}
