package com.sandeep.examples.service;

import java.util.List;

import com.sandeep.examples.model.Note;

public interface NoteService {
	
	public void addNote(Note note);
	
	public List<Note> getNotes();

}
