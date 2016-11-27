package com.sandeep.examples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sandeep.examples.model.Note;
import com.sandeep.examples.service.NoteService;

@Controller
public class NoteController {
	private static final String FAILURE = "FAILURE";
	
	@Autowired
	private NoteService noteService;
	
	//@Autowired
	//public void setNoteService(NoteService noteService){
	//	this.noteService = noteService;
	//}

	@RequestMapping("/")
	public String homepage() {
		return "home";
	}
	
	@RequestMapping(value = "/addNote", method = RequestMethod.POST)	
	@ResponseBody
	public String addNote(@RequestBody Note note){
		System.out.println("note: "+note.toString());
		noteService.addNote(note);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/getNotes", method = RequestMethod.GET)
	@ResponseBody
	public List<Note> getNotes(){
		System.out.println("Getting all notes");
		return noteService.getNotes();
	}
}
