package com.example;

import com.example.domain.User;
import com.example.domain.User.UserBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LombokBuilderSimpleApplicationTests {


	//TODO 2019/6/25  url: https://www.jianshu.com/p/0d8fc3df3647?from=timeline&isappinstalled=0
	@Test
	public void contextLoads() {
		UserBuilder builder = User.builder();
		User user = User.builder().build();
		System.out.println(builder);
		System.out.println(user);
	}

}
