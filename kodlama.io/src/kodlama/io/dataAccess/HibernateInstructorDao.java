package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veri tabanına eklendi : " + instructor.getFirtName()+" "+instructor.getLastName());
		
	}

}
