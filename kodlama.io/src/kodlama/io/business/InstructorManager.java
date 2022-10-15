package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;

	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}



	public void add(Instructor instructor) {
		
		Instructor[] instructors = {new Instructor(1,"Engin","DEMİROĞ")};
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirtName()+" "+instructor.getLastName());
		}
	}

}
