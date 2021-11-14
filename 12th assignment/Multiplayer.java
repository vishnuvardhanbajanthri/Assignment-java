package Com.MultiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplayer extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc2 = new Scanner(System.in);
		String st = "Wellcome to my Playlist\n";
		char[] chr = st.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			Thread.sleep(50);
		}
		int numOfSongs = sc2.nextInt();
		String st2 = "Add Songs now \n";
		char[] chr2 = st2.toCharArray();
		for (int i = 0; i < chr2.length; i++) {
			System.out.print(chr2[i]);
			Thread.sleep(60);
		}
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < numOfSongs; i++) {
			arrayList.add(sc2.next());
		}
		String st1 = "Song Added Successfully...... ";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(60);
		}
		toShowMenu(arrayList);
	}

	private static void toShowMenu(ArrayList<String> arrayList) throws InterruptedException {
		String st1 = "\n1.Play Song\n2.Search for Song\n3.Operate on MultiPlayer\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(60);
		}
		Scanner sc1 = new Scanner(System.in);
		int userOption = sc1.nextInt();
		switch (userOption) {
		case 1:
			playSong(arrayList);
			break;
		case 2:
			searchSong(arrayList);
			break;
		case 3:
			operateMultiMidia(arrayList);
			break;
		}

	}

	private static void operateMultiMidia(ArrayList<String> arrayList) throws InterruptedException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("What you want to do ?\n1.Add New Song\n2.Remove Songs from Playlist");
		int numOfSongsForAddOrRemove = sc2.nextInt();
		switch (numOfSongsForAddOrRemove) {
		case 1:
			AddSong(arrayList);
			break;
		case 2:
			removeSong(arrayList);
			break;
		}

	}

	private static void removeSong(ArrayList<String> arrayList) throws InterruptedException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Which song you want to remove ");
		int no1 = 1;
		for (String string : arrayList) {
			System.out.print(no1++ + ".");
			System.out.println(string);
		}

		int numOfSongsForRemove = sc2.nextInt();
		int index = numOfSongsForRemove - 1;
		arrayList.remove(index);
		System.out.println("Song removed Successfully......\nUpdated Playlist");
		int no = 1;
		for (String string : arrayList) {
			System.out.print(no + ".");
			System.out.println(string);
		}

		System.out.println("Press 1 for Main Menu");
		int userOption = sc2.nextInt();
		if (userOption == 1) {
			toShowMenu(arrayList);
		}
	}

	private static void AddSong(ArrayList<String> arrayList) throws InterruptedException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("How much song you want to Add ");
		int onOfSongs = sc2.nextInt();
		System.out.println(" Add Songs now ");
		int sizeOfArray = arrayList.size() + 1;
		for (int i = sizeOfArray; i < sizeOfArray + onOfSongs; i++) {
			arrayList.add(sc2.next());
		}
		System.out.println("Song Added Successfully......\nUpdated Playlist");

		int no = 1;
		for (String string : arrayList) {
			System.out.print(no++ + ".");
			System.out.println(string);
		}
		System.out.println("Press 1 for Main Menu");
		int userOption = sc2.nextInt();
		if (userOption == 1) {
			toShowMenu(arrayList);
		}

	}

	private static void searchSong(ArrayList<String> arrayList) throws InterruptedException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Song Name :");
		String userInput = sc2.next();
		for (int i = 0; i < arrayList.size(); i++) {
			if (userInput.equals(arrayList.get(i))) {
				System.out.println(arrayList.get(i));
			}
		}
		String searchString = "Now Song is Playing....";
		char[] chr = searchString.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.println(chr[i]);
			Thread.sleep(100);
		}

	}

	private static void playSong(ArrayList<String> arrayList) throws InterruptedException {
		Menu menu = new Menu();

		String st1 = "\n1.Play all Song\n2.Search a random Song\n3.Play a Particular Song";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(60);
		}
		Scanner sc1 = new Scanner(System.in);
		int userOption = sc1.nextInt();
		switch (userOption) {
		case 1:
			menu.playAllSong(arrayList);
			break;
		case 2:
			menu.PlayRandomSong(arrayList);
			break;
		case 3:
			menu.PlayParticularSong(arrayList);
			break;

		}

	}
}
