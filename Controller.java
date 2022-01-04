package Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
	Data movieData;
	Scanner reader;
	
	public ArrayList<Movie> searchYear;
	public ArrayList<Movie> searchGenre;
	public ArrayList<Movie> getRec;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Controller().run();
	}
	
	public Controller() {
		searchYear = new ArrayList<Movie>();
		searchGenre = new ArrayList<Movie>();
		getRec = new ArrayList<Movie>();
		movieData = new Data();
	}
	
	public void searchYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Note, the results will inlcude movies released from that year forward.");
		System.out.println("Enter the year: ");
		String key1 = input.next();
		String[] keywords = {key1};
		ArrayList<Movie> searchResults = movieData.searchByYear(keywords);
		for (int i = 0; i < searchResults.size(); i++) {
			System.out.println(searchResults.get(i));
		}
	}

	public void searchGenre() {
		Scanner input = new Scanner(System.in);
		System.out.print("Current supported genres are:"
				+ "\n Animation "
				+ "\n Action"
				+ "\n Comedy"
				+ "\n Horror"
				+ "\n Mystery"
				+ "\n Sci-Fi");
		System.out.println("\n Enter your choice: ");
		String key = input.next();
		String[] keywords = {key};
		ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
		for (int i = 0; i < searchResults.size(); i++) {
			System.out.println(searchResults.get(i));
		}
	}
	
	public void questionnaire() throws FileNotFoundException {
		int act = 0;
		int ani = 0;
		int com = 0;
		int hor = 0;
		int mys = 0;
		int sci = 0;
		int max = 0;
		String input;
		Scanner ans = new Scanner(System.in);
		Scanner reader = new Scanner(new File("Questions.txt"));
		ArrayList<Movie> results = new ArrayList<Movie>();
		while (reader.hasNext()) {
			// question 1
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				act++;
			}
			if (input.equals("b")) {
				hor++;
			}
			if (input.equals("c")) {
				ani++;		
			}
			if (input.equals("d")) {
				sci++;
			}
			// question 2
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				ani++;
			}
			if (input.equals("b")) {
				mys++;
			}
			if (input.equals("c")) {
				com++;	
			}
			if (input.equals("d")) {
				hor++;
			}
			// question 3
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				ani++;
			}
			if (input.equals("b")) {
				act++;
			}
			if (input.equals("c")) {
				com++;	
			}
			if (input.equals("d")) {
				mys++;
			}
			// question 4
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				act++;
			}
			if (input.equals("b")) {
				ani++;
			}
			if (input.equals("c")) {
				sci++;	
			}
			if (input.equals("d")) {
				hor++;
			}
			// question 5
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				act++;
				com++;
			}
			if (input.equals("b")) {
				ani++;
			}
			if (input.equals("c")) {
				mys++;		
			}
			if (input.equals("d")) {
				hor++;
			}
			// question 6
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				mys++;
			}
			if (input.equals("b")) {
				ani++;
			}
			if (input.equals("c")) {
				com++;		
			}
			if (input.equals("d")) {
				hor++;
			}
			// question 7
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				act++;
			}
			if (input.equals("b")) {
				com++;
			}
			if (input.equals("c")) {
				sci++;
			}
			if (input.equals("d")) {
				ani++;
			}
			// question 8
			printQuestions(reader);
			input = ans.next();
			if (input.equals("a")) {
				sci++;
			}
			if (input.equals("b")) {
				act++;
			}
			if (input.equals("c")) {
				com++;			
			}
			if (input.equals("d")) {
				ani++;
			}
			}
			int[] totals = {hor, sci, mys, com, ani, act};
			
			for (int i = 0; i < totals.length; i++) {
				if (totals[i] > totals[max]) {
					max = i;
				}
			}
			if (max == 0) {
				String[] keywords = {"horror"};
				ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
				for (int i = 0; i < searchResults.size(); i++) {
					System.out.println(searchResults.get(i));
				}
			}
			else if (max == 1) {
				String[] keywords = {"scifi"};
				ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
				for (int i = 0; i < searchResults.size(); i++) {
					System.out.println(searchResults.get(i));
				}	
			}
			else if (max == 2) {
				String[] keywords = {"mystery"};
				ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
				for (int i = 0; i < searchResults.size(); i++) {
					System.out.println(searchResults.get(i));
				}
			}
			else if (max == 3) {
				String[] keywords = {"comedy"};
				ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
				for (int i = 0; i < searchResults.size(); i++) {
					System.out.println(searchResults.get(i));
				}
			}
			else if (max == 4) {
				String[] keywords = {"animation"};
				ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
				for (int i = 0; i < searchResults.size(); i++) {
					System.out.println(searchResults.get(i));
				}
			}
			else if (max == 5) {
				String[] keywords = {"action"};
				ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
				for (int i = 0; i < searchResults.size(); i++) {
					System.out.println(searchResults.get(i));
				}
			}
			else {
				String[] keywords = {"action"};
				ArrayList<Movie> searchResults = movieData.searchByGenre(keywords);
				for (int i = 0; i < searchResults.size(); i++) {
					System.out.println(searchResults.get(i));
				}
			}
		}
	
	public void printQuestions(Scanner scanner) {
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		while (choice != 0) {
			try {
				System.out.println("\n" + "Welcome to the greatest movie recommendation system of all time! \n Select an option from the menu.");
				System.out.println("1 to search by genre");
				System.out.println("2 to search by year");
				System.out.println("3 get recommenations");
				System.out.println("0 to quit");
			
				try {
					System.out.println("Enter your choice: ");
					choice = Integer.parseInt(scanner.nextLine());
				}
				catch(NumberFormatException e){ 
					System.out.println("Invalid Input. Type a number.");
					choice = -1;
				}
				
				switch(choice) {
				
				case 0:
					System.out.println("Thank you for participating! Bye!");
					break;

				case 1:
					searchGenre();
					break;

				case 2:
					searchYear();
					break;

				case 3:
					try {
						questionnaire();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			} finally {
				System.out.println("THANKS!");
			}
		}
	}
}


