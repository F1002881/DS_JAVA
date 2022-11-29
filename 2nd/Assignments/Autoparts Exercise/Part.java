//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Axel Fontaine

public class Part implements Comparable<Part> {
	private String make, model, rest;
	private int year;

	public Part(String line) {
		String[] list = line.split(" ");
		for (int i = 0; i < list.length; i++) {
			String word = list[i];
			if (i == 0) {
				rest = word;
			} else if (i == 1 || i < list.length - 3) {
				rest += " " + word;
			} else if (i == list.length - 3) {
				make = word;
			} else if (i == list.length - 2) {
				model = word;
			} else if (i == list.length - 1) {
				year = Integer.parseInt(word);
			}
		}
	}

	// have to have compareTo if implements Comparable
	public int compareTo(Part rhs) {
		if (this.make.compareTo(rhs.make) != 0) {
			return this.make.compareTo(rhs.make);
		} else if (this.model.compareTo(rhs.model) != 0) {
			return this.model.compareTo(rhs.model);
		} else if(rhs.year - this.year != 0){
			return rhs.year - this.year;
		}
		else{
			return this.rest.compareTo(rhs.rest);
		}
	}

	public String toString() {
		return make + " " + model + " " + year + " " + rest;
	}
}