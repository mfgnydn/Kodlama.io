package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veri tabanına eklendi : " + instructor.getFirtName()+" "+instructor.getLastName());
		
	}

}
