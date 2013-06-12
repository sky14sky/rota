package com.headfirstjava.rota.simpleDotCom;

import java.util.*;

public class DotCom {

	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}

	public String checkYourself(String userInput) {
		String result = "miss";

		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
		}

		if (locationCells.isEmpty()) {
			result = "kill";
		} else {
			result = "hit";
		}
		return result;
	}

}
