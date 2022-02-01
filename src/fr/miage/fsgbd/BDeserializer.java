package fr.miage.fsgbd;

import java.io.*;

public class BDeserializer<Type> 
{	
	  public  BTreePlus getArbre(String path) 
	  {
		BTreePlus arbre = null; 
	    try {
	      
	      FileInputStream fichier = new FileInputStream(path);
	      ObjectInputStream ois = new ObjectInputStream(fichier);
	      arbre = (BTreePlus) ois.readObject();
	      
	    } 
	    catch (java.io.IOException e) {
	      e.printStackTrace();
	    }
	    catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	    return arbre;
	   }
	
}

