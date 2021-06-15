package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.CSV;

public class threadController extends Thread {


		   
	    String ano;
	    
	    private Semaphore semaforo;
	    
	    public threadController(String ano, Semaphore semaforo ){
	    	
	        this.ano = ano;
	        this.semaforo = semaforo;
	    }
	    
	    @Override
	    public void run(){
	    	buscar();
	          
	    }  
	    public void buscar () {
	       
	    	
	    	
	    	
		    	try {
		    		this.semaforo.acquire();
		    		System.out.println("Thread do ano: " + ano + " realizando busca \n");
		    		
		    		new CSV().lerCSV(ano);
		    		Thread.sleep(4000);
					
		    		 semaforo.release();
		    		 System.out.println("\n");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    }
	    
	    
	    
	    
	    
	
	    
	
	  

	   
}
