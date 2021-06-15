package main;

import java.util.concurrent.Semaphore;

import controller.threadController;
import io.CSV;

public class Principal {

	public static void main (String[] args) {
		
		 Semaphore semaforo = new Semaphore(1);
		 
		 for (int n = 0; n  < 4; n ++) {
			 int number = 2013 + n;
			 threadController c = new threadController(number + "", semaforo);
		      c.start();
		 }
   
   
		 
		 
		
	}
}
