package kodlama.io;

public class UserManager {
     public void add(User user) {
    	 System.out.println(user.name + " eklendi.");
     }
     
     public void delete(User user) {
    	 System.out.println(user.userNumber + " silindi.");
     }
     
     public void addMultiple(User[] users) {
    	 for(User user : users) {
    		 add(user);
    	 }
     }
     
     public void update(User user) {
    	 System.out.println(user.userNumber + " numaralı kullanıcı güncellendi.");
     }
     
     
	 
     
}
