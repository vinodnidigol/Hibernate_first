package com.hibernate.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadMusicDAO {

	public static void main(String[] args) {
	
		
		Configuration config=new Configuration();
		
		config.configure();
		
		config.addAnnotatedClass(MusicDTO.class);
		
		
		SessionFactory sf=config.buildSessionFactory();
		
		
		Session sess=sf.openSession();
		
		//using session we have to load a record
		
		
		//  load(DTO.class , PK);
		
	/*	
		MusicDTO music=sess.load(MusicDTO.class, "shape of you");
		
		System.out.println(music.getArtist());
		System.out.println(music.getYearOfRelease());
		System.out.println(music.getLength());*/
		
		
		
		
		
		//update a record in the DB
		
		MusicDTO music=sess.load(MusicDTO.class, "shape of you");
		System.out.println(music.getArtist());
		/*music.setLength(5);
		music.setYearOfRelease(2018);
		*/
	/*	sess.update(music);
		
		
		Transaction tx=sess.beginTransaction();
		tx.commit();
		
		*/
		
		
	}
}
