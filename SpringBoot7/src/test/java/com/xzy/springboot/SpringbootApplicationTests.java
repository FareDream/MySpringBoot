package com.xzy.springboot;

import com.xzy.springboot.entity.User;
import com.xzy.springboot.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class SpringbootApplicationTests{

	@Autowired
	private UserRepository userRepository;

	@Before
	public void before() {
//		userRepository.save(new User("AAA", 10));
	}

	@Test
	public void test() throws Exception {
		User u1 = userRepository.findByName("AAA");
		System.out.println("第一次查询：" + u1.getAge());

		User u2 = userRepository.findByName("AAA");
		System.out.println("第二次查询：" + u2.getAge());

		User u3 = userRepository.findByName("AAA");
		System.out.println("第三次查询：" + u3.getAge());

		User u4 = userRepository.findByName("AAA");
		System.out.println("第四次查询：" + u4.getAge());

		User u5 = userRepository.findByName("AAA");
		System.out.println("第五次查询：" + u5.getAge());

		User u6 = userRepository.findByName("AAA");
		System.out.println("第六次查询：" + u6.getAge());

		User u7 = userRepository.findByName("AAA");
		System.out.println("第七次查询：" + u7.getAge());

		User u8 = userRepository.findByName("AAA");
		System.out.println("第八次查询：" + u8.getAge());
	}


}