package com.java.array.based.programmes;

import java.util.Objects;

public class StringDuplicateCheckInArray {

	public static void main(String[] args) {

		String[] stringList = { "ab", "nb", "abm", "nb", "ab", "neb" };

		String[] finalValue = new String[6];

		for (int i = 0; i < stringList.length; i++) {

			String tempVar = stringList[i];

			for (int j = i + 1; j < stringList.length; j++) {

				if (!Objects.equals(tempVar, stringList[j]) )
					finalValue[i] = tempVar;
				else
					continue;
			}
		}
		
		for(int k =0 ; k < finalValue.length ; k++) {
			System.out.println(finalValue[k]);
		}

	}

}
