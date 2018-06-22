package com.sandeep.examples.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sandeep.examples.model.Note;

@Repository
public class NoteDaoImpl implements NoteDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	//public void setSessionFactory(SessionFactory sf){
	//	this.sessionFactory =sf;
	//}
	
	public void addNote(Note note) {
		try {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(note);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Note> getNotes(){
		List<Note> list = null;
		try {
			Session session = this.sessionFactory.getCurrentSession();
			//session.get
			 list = session.createCriteria(Note.class).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
