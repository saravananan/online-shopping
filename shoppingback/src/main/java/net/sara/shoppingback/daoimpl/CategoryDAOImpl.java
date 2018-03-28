package net.sara.shoppingback.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sara.shoppingback.dao.CategoryDAO;
import net.sara.shoppingback.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<Category>();

	static{
		
		Category category = new Category();
		
		//first category 
		category.setId(1);
		category.setName("Laptop");
		category.setDescription("Redmi 5a super series smart laptops");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//SECOND category 
		
		category = new Category();
		category.setId(2);
		category.setName("Headphones");
		category.setDescription("Redmi 5a super series smart headphones");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);

		
		//Third category 
		
		category = new Category();
		category.setId(3);
		category.setName("Mobile");
		category.setDescription("Redmi 5a super series smart phones");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);


		
		
	}
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories){
			if(category.getId() == id) return category;
		}
		return null;
	}

}
