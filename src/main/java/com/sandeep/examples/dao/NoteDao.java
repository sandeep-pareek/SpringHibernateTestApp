package com.sandeep.examples.dao;

import java.util.List;

import com.sandeep.examples.model.Note;

public interface NoteDao {
	public void addNote(Note note);
	
	public List<Note> getNotes();

}
