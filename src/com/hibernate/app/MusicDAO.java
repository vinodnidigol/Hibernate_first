package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MusicDAO {
	public static void main(String[] args) {
		
		//create obj of DTO and populate the values
		
		MusicDTO music=new MusicDTO();
		music.setName("Despacito");
		music.setArtist("Fonsi");
		music.setLength(4);
		music.setYearOfRelease(2017);
		
		
		//create an object of configuration
		Configuration config=new Configuration();
		
		//To load the resources
		// load hibernate.cfg.xml
		config.configure();
		
		
		//To load mapping class
		
		config.addAnnotatedClass(MusicDTO.class);
		
//obtain sessionfactory obj using a helper method
SessionFactory sf=config.buildSessionFactory();


//obtain Session obj for performing CRUD operations
Session sess=sf.openSession();
sess.save(music);		
		

//Transaction
		Transaction tx=sess.beginTransaction();

//beginTransaction
		
		tx.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
