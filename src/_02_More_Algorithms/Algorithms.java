package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				return i;
			}
		}
		return -1;

	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;

	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		if (message1.contains("... --- ...")) {
			return true;
		} else {
			return false;
		}
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= results.size() - 1; i++) {
			for (int j = 0; j < results.size() - 1; j++) {
				if (results.get(j) > results.get(j + 1)) {
					double temp = results.get(j);
					results.set(j, results.get(j + 1));
					results.set(j + 1, temp);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= unsortedSequences.size() - 1; i++) {
			for (int j = 0; j < unsortedSequences.size() - 1; j++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(j + 1).length()) {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j + 1));
					unsortedSequences.set(j + 1, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= words.size() - 1; i++) {
			for (int j = 0; j < words.size() - 1; j++) {
				if (words.get(j).compareTo(words.get(j + 1)) > 0) {
					String temp = words.get(j);
					words.set(j, words.get(j + 1));
					words.set(j + 1, temp);
				}
			}
		}
		return words;
	}
}