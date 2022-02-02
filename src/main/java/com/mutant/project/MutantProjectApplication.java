package com.mutant.project;

import java.util.Arrays;
import java.util.List;

import com.mutant.project.usecases.DetailMutantBusinessImpl;
import com.mutant.project.usecases.MutantBusinessImpl;
import com.mutant.project.utils.Constants;
import com.mutant.project.utils.UtilsString;



public class MutantProjectApplication {
	
	/***
	 * Metodo Main Inicial donde se realiza los llamados a la validación de los caracteres ingresados en
	 * la estructura DNA
	 * @param args
	 */

	public static void main(String[] args) {
		List<String> listAdn = Arrays.asList(args);
		if (!listAdn.stream().allMatch(itemToEvaluate -> UtilsString.containsCharactersValids(itemToEvaluate))
				|| listAdn.isEmpty()) {
			System.out.println(Constants.MESSAGE_VALIDATION_CHARACTERS);
		} else {
			MutantBusinessImpl mutantBusiness = new MutantBusinessImpl(new DetailMutantBusinessImpl());
			if (mutantBusiness.isMutant(listAdn)) {
				System.out.println(Constants.MESSAGE_RESULT_MUTANT);
			} else {
				System.out.println(Constants.MESSAGE_RESULT_HUMAN);
			}
			
		}
		

	}

}
