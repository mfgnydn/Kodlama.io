package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;

	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}



	public void add(Course course) throws Exception{
		
		Course[] courses = {new Course(1,"C#","Yazılım Geliştirici Yetiştirme Kampı",100),
				new Course(2,".Net","Senior Yazılım Geliştirici Yetiştirme Kampı",50)};
		
		for (Course course1 : courses) {
			
			if(course.getName() == course1.getName()) {
				
				throw new Exception("Kurs ismi tekrar edemez");
			}
			else if(course.getPrice()<0) {
				
				throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
	

}
