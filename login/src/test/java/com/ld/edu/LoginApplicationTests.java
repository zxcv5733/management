package com.ld.edu;



import com.ld.edu.util.JwtTokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginApplicationTests {
	@Resource
	private JwtTokenUtil jwtTokenUtil;


	@Test
	public void contextLoads(){
//		String token = jwtTokenUtil.generateToken("admin");
//		System.out.println(token);
		String token = "eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE2MDAzMjEyODAsInN1YiI6ImFkbWluIiwiY3JlYXRlZCI6MTYwMDMxNzY4MDM4NX0.T6-yQCA1VRGavDeYyvmIV1vhhNEIo0dL9yrgC_j38wyHFiQquXKpBCeWszRqSos1SgTqislj06C0wtLCaKewMw";
		String username = jwtTokenUtil.getUsernameFromToken(token);
		System.out.println(username);
		Boolean result = jwtTokenUtil.isTokenExpired(token);
		System.out.println(result);
	}

}
