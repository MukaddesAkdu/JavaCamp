package kodlama.io;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.userNumber = 2;
		student.name = "Mukaddes";
		student.lastName = "Akdu";
		student.mailAddress = "mukaddesakdu00@gmail.com";
		student.studentNumber = 101;
		student.successRate = 90;

        Instructor instructor = new Instructor();
        instructor.userNumber = 1;
        instructor.name = "Engin";
        instructor.lastName = "Demiroğ";
        instructor.mailAddress = "engindemirog@gmail.com";
        instructor.instructorNumber = 101;
        instructor.preferenceRate = 100;
        
        Student student2 = new Student();
		student2.name = "Ayşe";
		student2.lastName = "Yıldız";
        
        System.out.println(student.mailAddress);
        System.out.println(instructor.instructorNumber);
        System.out.println(student2.name);
        
        UserManager userManager = new UserManager();
        
        User[] users = {instructor, student, student2};
        userManager.addMultiple(users);
	}

}
