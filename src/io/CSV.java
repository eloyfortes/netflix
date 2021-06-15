package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV {

	public void lerCSV(String ano) {
		 String arquivoCSV = "netflix.csv";
		    BufferedReader br = null;
		    String linha = "";
		    String csvDivisor = ";";
		    try {

		        br = new BufferedReader(new FileReader("C:/temp/" + arquivoCSV));
		        while ((linha = br.readLine()) != null) {

		        	
		            String[] lin = linha.split(csvDivisor);
		        	
		            if (lin[4].equals(ano))  {
		            
		            
		            System.out.println("Titulo: " + lin[1] 
		                                 + " , Genero:  " + lin[0] + ", Subgenero: " + lin[2]);
		            }

		        }

		    } catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        if (br != null) {
		            try {
		                br.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		  }
}

