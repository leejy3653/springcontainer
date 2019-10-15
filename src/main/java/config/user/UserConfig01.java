package config.user;

import org.springframework.context.annotation.Bean;

import kr.co.itcen.springcontainer.user.User;
import kr.co.itcen.springcontainer.user.Friend;


public class UserConfig01 {
	
	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public Friend friend() {
		return new Friend("둘리");
	}
}