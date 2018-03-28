package net.sara.shoppingback.dao;

import java.util.List;

import net.sara.shoppingback.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
