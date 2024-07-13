package vincent.home.myblog.repo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vincent.home.myblog.entity.User;

@SpringBootTest
class UserRepoTest {
	@Autowired
	private UserRepo userRepo;

	@Test
	void testSelectFirstUser() {
		User firstUser = userRepo.selectFirstUser();
		assertTrue(firstUser.getType()==9);
	}

}
