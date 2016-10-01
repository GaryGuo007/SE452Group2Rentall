package edu.depaul.se.worker.jpa;

import java.io.Serializable;
import edu.depaul.se.worker.*;
import javax.persistence.*;

@Entity
public class Worker implements Serializable, iWorker{
 
	private static final long serialVersionUID = 1L;
	@Id
	private String name;
	
	public Worker(String name) {
		this.name = name;
	}
	
}