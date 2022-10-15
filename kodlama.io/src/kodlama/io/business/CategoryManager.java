package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;

	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}



	public void add(Category category) throws Exception {
		
		Category[] categories = {new Category(1,"Object Oriented Programing"),new Category(2,"Structured Programming"),
				new Category(3,"Modular Programming"),new Category(4,"Event Based Programming")};
		for (Category category1 : categories) {
			if(category.getName() == category1.getName()) {
				
				throw new Exception("Kategori ismi tekrar edemez");
			}
			
		}
		
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	

}
