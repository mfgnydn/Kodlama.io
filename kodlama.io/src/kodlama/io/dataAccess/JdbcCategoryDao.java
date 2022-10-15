package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("JDBC ile veri tabanına eklendi : " + category.getName());
		
	}

}
