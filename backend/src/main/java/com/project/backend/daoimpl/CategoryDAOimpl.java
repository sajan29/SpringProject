package com.project.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.backend.dao.CategoryDAO;
import com.project.backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	
	static
	{
		//First Category 
		
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("There is some description for television");
		category.setImageuRL("CAT_1.png");
		
		//Adding First Category in ArrayList
		
		categories.add(category);
		
		//Second Category 
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("There is some description for Mobile");
		category.setImageuRL("CAT_2.png");

		//Adding Second Category in ArrayList

		categories.add(category);
		
		//Third Category 
		
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("There is some description for laptop");
		category.setImageuRL("CAT_3.png");

		//Adding Third Category in ArrayList

		categories.add(category);

	}
	
	
	@Override
	public List<Category> list() {
		
		return categories;
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category:categories)
		{
			if(category.getId()==id)
			{
				return category;
			}
		}
		return null;
	}
	

}
