/**
 * Created by Abdul Ali
 */
package com.aan.ml;

/**
 * @author Abdul Ali
 *
 */
public class MainClass {

	public static void main(String[] args) {

		CandidateElimination ce = new CandidateElimination();
		TrainingData ex = new TrainingData();
		ReadFromFile rff = new ReadFromFile();
		rff.initialize();
		while (rff.takeNextValue(ex)) {
			if (ex.EnjoySport == true)
				ce.positiveEncounter(ex);
			else
				ce.negativeEncounter(ex);
		}
		try {
			rff.br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ce.display();
		System.out.println("the version space is : ");
		ce.getVersionSpace();
	}
}
