package az.shoppingbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import az.shoppingbackend.dao.CategoryDao;
import az.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		Category category = new Category(1, "Television", "This is some description for television", "tl.png", true);
		categories.add(category);
		
		Category category2 = new Category(2, "Mobile", "This is some description for mobile", "mob.png", true);
		categories.add(category2);
		
		Category category3 = new Category(3, "Laptop", "This is some description for laptop", "lp.png", true);
		categories.add(category3);
	}


	@Override
	public List<Category> list() {
		return categories;
	}


	@Override
	public Category get(long id) {
		for(Category category: categories){
			if(category.getId()==id)
				return category;
		}
		return null;
	}



	
}
