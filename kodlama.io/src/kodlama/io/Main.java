package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InstructorManager;
import kodlama.io.core.logging.DataBaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.HibernateCategoryDao;
import kodlama.io.dataAccess.HibernateInstructorDao;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;


public class Main {

	public static void main(String[] args) throws Exception {
	
		Logger[] loggers = {new FileLogger(),new MailLogger(),new DataBaseLogger()};
		
		Category category = new Category(5,"Backend Programing");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category);
		
		Course course = new Course(3,"Python","Programlamaya Giriş İçin Temel Kurs",30);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course);
		
		Instructor instructor = new Instructor(2,"Muhammet Furkan","GÜNAYDIN");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
		instructorManager.add(instructor);
		
		
	}
		
		
}
