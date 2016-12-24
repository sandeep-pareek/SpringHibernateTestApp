package com.sandeep.examples.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sandeep.examples.model.Note;

/**
 * 
 * @author Sandeep Pareek
 *
 */

@Repository
public class NoteDaoImpl implements NoteDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addNote(Note note) {
		try {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(note);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Note> getNotes(){
		List<Note> list = null;
		try {
			Session session = this.sessionFactory.getCurrentSession();
			 Criteria criteria = session.createCriteria(Note.class);
			 criteria.add(Restrictions.isNull("deleteTsp"));
			 list = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deleteNote(long id) {
		boolean isSuccessFlag = false;
		try {
			Session session = this.sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Note.class);
			criteria.add(Restrictions.eq("id", id));
			Note note = (Note) criteria.uniqueResult();
			note.setDeleteTsp(new Date());

			session.update(note);
			isSuccessFlag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(isSuccessFlag)
			return true;
		else
			return false;
	}

}
