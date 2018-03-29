import java.util.Scanner;
public class MovieMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Put in the name of a movie");
Movie Movie1 = new Movie("John Wick", "Action", "R");
Movie Movie2 = new Movie("Pirates of the Carribean", "Action", "PG-13");
Movie Movie3 = new Movie("The Conjuring", "Horror", "R");
Movie Movie4 = new Movie("Insidious", "Horror", "PG-13");
Movie Movie5 = new Movie("Kevin Hart", "Comedy", "R");
Movie Movie6 = new Movie("Grown Ups", "Comedy", "PG-13");
Movie[] movies= {Movie1, Movie2, Movie3, Movie4, Movie5, Movie6};
String user = input.nextLine();
int i = 0;
for( i = 0; i<= movies.length-1; i++ )
if(user.equals(movies[i].Name)) {
	System.out.println(movies[i].Name + " , " + movies[i].genre + " , " + movies[i].rating);	
break;
}else {
	System.out.println("Not Found");
	System.out.println("Put in a movie");
	break;
}

	}

}
