
public class Movie {
	
		int id = 101;
		String Moviename = "SpiderMan";
	    String Actorname = "Prakash";    
		
			
		void playMovie()
		{
			System.out.println("Moving is Running without error");
		}
		void printMovieDetails() {
			System.out.println("Movie Id : "+id);
			System.out.println("Name : "+Moviename);
			System.out.println("actor: "+ Actorname);
			
			
			

	}
		public static void main(String[] args) {
			Movie m1 = new Movie();
			m1.playMovie();
			m1.printMovieDetails();
		}
}