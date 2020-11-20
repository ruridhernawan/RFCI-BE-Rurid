package com.example.demo;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoalNomor1 {

	@PostMapping("/nomor1")
	public String nomor1(@RequestBody ArrayList<Integer> List) {
		int temp;
		int swap = 0;
		String output = "";
		String outputTotal = "";
		String tempArray = "";
		int[] intArray = new int[List.size()];
		for (int i = 0; i < List.size(); i++)
			intArray[i] = List.get(i);

		for (int j = 0; j < intArray.length; j++) {

			boolean swapped = false;
			int i = 0;
			while (i < intArray.length - 1) {

				if (intArray[i] > intArray[i + 1]) {
					output = swap + 1 + ". ";
					tempArray = "";
					output = output + "[" + intArray[i + 1] + "," + intArray[i] + "] ->";

					temp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = temp;

					swapped = true;
					for (int x = 0; x < List.size(); x++)
						tempArray = tempArray + " " + intArray[x];
					output = output + tempArray + "\n";
					swap++;
					outputTotal = outputTotal + output;
				}
				i++;
			}
			if (!swapped) 
				break;			
		}
		return outputTotal + "\n" + "Jumlah swap: " + swap;
	}

}
