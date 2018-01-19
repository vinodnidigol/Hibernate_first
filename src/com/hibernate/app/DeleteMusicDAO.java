package com.hibernate.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteMusicDAO {

	public static void main(String[] args) {
		MusicDTO music=new MusicDTO();
		music.setName("slim shady");
		music.setArtist("eminem");
		music.setLength(4);
		music.setYearOfRelease(2008);
		
		MusicDTO music2=new MusicDTO();
		music2.setName("slim shady");
		music2.setArtist("eminem");
		music2.setLength(4);
		music2.setYearOfRelease(2008);

		Configuration config=new Configuration();
		
		config.configure();
		
		config.addAnnotatedClass(MusicDTO.class);
		
		Session sess=config.buildSessionFactory().openSession();
		
		
		sess.save(music);
		sess.beginTransaction().commit();
		
		
		//MusicDTO music=sess.load(MusicDTO.class, "Despacito");
		
		//delete using sess.delete
		
		
	/*	sess.delete(music);
		
		sess.beginTransaction().commit();*/
		
		
		
	}
}
