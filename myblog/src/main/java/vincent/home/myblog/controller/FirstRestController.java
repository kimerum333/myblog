package vincent.home.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vincent.home.myblog.entity.User;
import vincent.home.myblog.repo.UserRepo;


@RestController
public class FirstRestController {
	
	private UserRepo userRepo;

	@Autowired
	public FirstRestController(UserRepo userRepo) {
		this.userRepo=userRepo;
	}
	
	 @GetMapping(value = "/hello")
	    public User findUser(){
	        return new User();
	    }
}
