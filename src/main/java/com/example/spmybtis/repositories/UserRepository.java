package com.example.spmybtis.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.spmybtis.entities.User;

@Mapper
public interface UserRepository {
	public List<User> selectAll();
	
	public User selectById(Long id);
	
	public int insert(User user);
}
