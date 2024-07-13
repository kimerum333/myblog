package vincent.home.myblog.entity;

import lombok.Data;

@Data
public class User {
	private int id;
	private String email;
	private String password;
	private int type;
}
