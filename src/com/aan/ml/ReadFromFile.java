/**
 * Created by Abdul Ali
 */
package com.aan.ml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Abdul Ali
 *
 */
public class ReadFromFile {

	File file = null;
	FileReader fr = null;
	BufferedReader br = null;

	public void initialize() {
		try {

			file = new File("D:/test.txt");

			fr = new FileReader(file);

			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	String[] result;

	boolean takeNextValue(TrainingData ex) {
		try {
			String str = br.readLine();
			if (str == null)
				return false;
			result = str.split(" ");
			int i;
			for (i = 0; i < (result.length) - 1; i++) {
				ex.attr.AttributeList[i] = result[i];
			}
			if (result[i].equals("yes"))
				ex.EnjoySport = true;
			else
				ex.EnjoySport = false;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}
