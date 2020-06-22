package com.mp.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mp.dao.UserMapper;
import com.mp.entity.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {
	
	@Autowired
	private UserMapper usrMapper;
	
	@Test
	public void select(){
		List<User>  list=usrMapper.selectList(null);
		Assert.assertEquals(5, list.size());
		list.forEach(System.out::println);
	}

}
