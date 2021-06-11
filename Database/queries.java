public boolean checkUser(String email, String password){
	String query = "loginCheck("+email+")";
	pass = executeQUery(query);

	if (pass == password) return true
	else return false
}

public boolean registerUser(String name, String surname,String email, String password){
	String query = "registerUser("+name+","+surname+","+email+","+password+")";
	try{
		(executeQUery(query))
		return true
	}catch(Exception e){
		return false
	}
}

public boolean addFriend(String user1, String user2){
	String query = "addFriend("+user1+","+user2+")";
	try{
		(executeQUery(query))
		return true
	}catch(Exception e){
		return false
	}
}

public boolean removeFriend(String user1, String user2){
	String query = "removeFriend("+user1+","+user2+")";
	try{
		(executeQUery(query))
		return true
	}catch(Exception e){
		return false
	}
}

public boolean suggestMovie(String movieTitle){
	String query = "suggestMovie("+movieTitle+")";
	try{
		(executeQUery(query))
		return true
	}catch(Exception e){
		return false
	}
}
