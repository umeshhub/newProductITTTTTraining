package com.niit.skillmapper.dao;

import java.util.List;

import com.niit.skillmapper.model.Skills;

public interface SkillDAO {

	 List<Skills>  getSkillsByStatus();
	 int insertSkills(Skills skills);
	
}
