package recipediaClasses;

import java.sql.Timestamp;

public class Event {
	private String action;
	private String usernameDidAction;
	private String usernameGotAction;
	private String recipeName;
	private int recipeID;
	private Timestamp timestamp;
	public Event() {
		
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getUsernameDidAction() {
		return usernameDidAction;
	}
	
	public void setUsernameDidAction(String usernameDidAction) {
		this.usernameDidAction = usernameDidAction;
	}
	
	public String getUsernameGotAction() {
		return usernameGotAction;
	}
	
	public void setUsernameGotAction(String usernameGotAction) {
		this.usernameGotAction = usernameGotAction;
	}
	
	public String getRecipeName() {
		return recipeName;
	}
	
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getRecipeID() {
		return recipeID;
	}

	public void setRecipeID(int recipeID) {
		this.recipeID = recipeID;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
