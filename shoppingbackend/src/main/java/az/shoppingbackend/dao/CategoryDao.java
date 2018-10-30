package az.shoppingbackend.dao;

import java.util.List;

import az.shoppingbackend.dto.Category;

public interface CategoryDao {
	public  List<Category> list();

	public Category get(long id);

	
}
