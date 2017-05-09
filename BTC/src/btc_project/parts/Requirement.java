package btc_project.parts;

import java.util.*;
import javax.persistence.*;

@Entity
public class Requirement {

	@Basic
	private String name;
	private String sh_desc;
	private String lg_desc;
	private Date creation;
	private Date last_modified;
	private User creator;
	
	public Requirement(String name, String sh_desc, String lg_desc) {
		this.name = name;
		this.sh_desc = sh_desc;
		this.lg_desc = lg_desc;
		this.creator = creator;
		creation= new Date();
		last_modified= new Date();
		//creator to be implemented
	}


	@Id
	@GeneratedValue
	private int ID;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		last_modified = new Date();
	}

	public String getSh_desc() {
		return sh_desc;
	}

	public void setSh_desc(String sh_desc) {
		this.sh_desc = sh_desc;
		last_modified = new Date();
	}

	public String getLg_desc() {
		return lg_desc;
	}

	public void setLg_desc(String lg_desc) {
		this.lg_desc = lg_desc;
		last_modified = new Date();
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\nDescription: " + sh_desc;
	}
}
