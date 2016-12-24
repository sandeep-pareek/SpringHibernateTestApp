package com.sandeep.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sandeep.examples.dao.NoteDao;
import com.sandeep.examples.model.Note;

/**
 * 
 * @author Sandeep Pareek
 *
 */

@Service
public class NoteServiceImpl implements NoteService{

	@Autowired
	private NoteDao noteDao;
	
	@Override
	@Transactional
	public void addNote(Note note) {
		noteDao.addNote(note);
	}
	
	@Override
	@Transactional
	public List<Note> getNotes(){
		return noteDao.getNotes();
	}

	@Override
	@Transactional
	public boolean deleteNote(long id) {
		return noteDao.deleteNote(id);
	}

}
