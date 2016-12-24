package com.sandeep.examples.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Sandeep Pareek
 *
 */

@Entity
@Table(name = "T_NOTE")
public class Note implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String description;
	private String header;
	private String status;
	
	
	private Date deleteTsp;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public String toString() {
		return "id: " + id + "descrition: " + description.toString() + "header: " + header.toString();
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDeleteTsp() {
		return deleteTsp;
	}

	public void setDeleteTsp(Date deleteTsp) {
		this.deleteTsp = deleteTsp;
	}
}
