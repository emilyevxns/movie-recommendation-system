package Final;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Data {
	
	ArrayList<String> titles;
	ArrayList<String> year;
	ArrayList<String> genre;
	ArrayList<String> rating;
	public ArrayList<Movie> movies;
		
		public Data() {
			movies = new ArrayList<Movie>();
			Scanner filescan = new Scanner(System.in);
			genre = new ArrayList<String>();
			titles = new ArrayList<String>();
			year = new ArrayList<String>();
			rating = new ArrayList<String>();
			try {
				filescan = new Scanner(new File("Ratings.txt"));
				while (filescan.hasNext()) {
					genre.add(filescan.nextLine());
					titles.add(filescan.nextLine());
					year.add(filescan.nextLine());
					rating.add(filescan.nextLine());
				}
				filescan.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public ArrayList<Movie> searchByYear(String[] keywords) {
			//Searches the movie array for the user's input
			ArrayList<Movie> selected = new ArrayList <Movie>();
			int[] iYear = new int[year.size()];
			for (int i = 0; i < iYear.length; i++) {
				iYear[i] = Integer.parseInt(year.get(i));
			}
			int[] key = new int[keywords.length];
			for (int i = 0; i < key.length; i++) {
				key[i] = Integer.parseInt(keywords[i]);
			}
			for (int i = 0; i < iYear.length; i++) {
				if (iYear[i] >= key[0]) {
					selected.add(new Movie(genre.get(i),titles.get(i), iYear[i]));
				}
			}
			return selected;
		}
		public ArrayList<Movie> searchByGenre(String[] keywords) {
			ArrayList<Movie> selected = new ArrayList <Movie>();
			//Searches the movie array for the user's input
			for (String k : keywords) {
				if (k.equals("action") || k.equals("Action")) {
					for (int i = 0; i < 10; i++) {
						selected.add(new Movie(genre.get(i),titles.get(i),Integer.parseInt(year.get(i))));
					}
				}
				if (k.equals("animation") || k.equals("Animation")) {
					for (int i = 10; i < 20; i++) {
						selected.add(new Movie(genre.get(i),titles.get(i),Integer.parseInt(year.get(i))));
					}
				}
				if (k.equals("comedy") || k.equals("Comedy")) {
					for (int i = 20; i < 30; i++) {
						selected.add(new Movie(genre.get(i),titles.get(i),Integer.parseInt(year.get(i))));
					}
				}
				if (k.equals("horror") || k.equals("Horror")) {
					for (int i = 30; i < 40; i++) {
						selected.add(new Movie(genre.get(i),titles.get(i),Integer.parseInt(year.get(i))));
					}
				}
				if (k.equals("mystery") || k.equals("Mystery")) {
					for (int i = 40; i < 50; i++) {
						selected.add(new Movie(genre.get(i),titles.get(i),Integer.parseInt(year.get(i))));
					}
				}
				if (k.equals("scifi") || k.equals("SciFi")) {
					for (int i = 50; i < 60; i++) {
						selected.add(new Movie(genre.get(i),titles.get(i),Integer.parseInt(year.get(i))));
					}
				}
			}
			return selected;
		}
	}