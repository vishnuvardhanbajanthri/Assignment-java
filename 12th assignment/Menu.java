package Com.MultiPlayer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {

	public void playAllSong(ArrayList<String> arrayList) throws InterruptedException {

		String st1 = "Now All Song is Play one by one..........\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(60);
		}
		for (String string : arrayList) {

			System.out.println(string);

			Thread.sleep(1000);
		}
	}

	public void searchSong(ArrayList<String> arrayList) throws InterruptedException {
		String st1 = "Enter the song Name\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(60);
		}
		Scanner sc1 = new Scanner(System.in);
		String userOption = sc1.next();

	}

	public void PlayRandomSong(ArrayList<String> arrayList) {
		System.out.println("Playing a random Song... ");
		int indexno = (int) (Math.random() * (arrayList.size() - 1));
		System.out.println(arrayList.get(indexno));
	}

	public void PlayParticularSong(ArrayList<String> arrayList) throws InterruptedException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Which song you want to Play ");
		int no1 = 1;
		for (String string : arrayList) {
			System.out.print(no1++ + ".");
			System.out.println(string);
		}
		int userInput = sc2.nextInt();
		for (int i = 1; i <= arrayList.size(); i++) {

			if (i == userInput) {
				System.out.println(arrayList.get(i - 1));
			}
		}
		String searchString = "Now Song is Playing....";
		char[] chr = searchString.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			Thread.sleep(100);
		}

	}

}
	