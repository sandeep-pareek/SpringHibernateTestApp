package com.sandeep.examples.dao;

import java.util.List;

import com.sandeep.examples.model.Note;

/**
 * 
 * @author Sandeep Pareek
 *
 */

public interface NoteDao {
	public void addNote(Note note);
	
	public List<Note> getNotes();

	public boolean deleteNote(long id);
}
