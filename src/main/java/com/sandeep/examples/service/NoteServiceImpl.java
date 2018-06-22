package com.sandeep.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sandeep.examples.dao.NoteDao;
import com.sandeep.examples.model.Note;

@Service
public class NoteServiceImpl implements NoteService{

	@Autowired
	private NoteDao noteDao;
	
//	public void setNoteDao(NoteDao noteDao){
//		this.noteDao = noteDao;
//	}
	
	@Transactional
	public void addNote(Note note) {
		noteDao.addNote(note);
	}
	
	@Transactional
	public List<Note> getNotes(){
		return noteDao.getNotes();
	}

}
