package com.java.file.operations;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingCSVFileAndSaveInDB {

	public static void main(String[] args) {

		String line = "";
		String splitBy = ",";

		try {
            // buffererd reader 
			// line = br.readline() !=null
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arpan\\Desktop\\data.csv"));
			while ((line = br.readLine()) != null) {
				String[] employee = line.split(splitBy);
				System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1]
						+ ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4]
						+ ", City= " + employee[5] + "]");

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
