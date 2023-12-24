package project.commerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.commerce.domain.SignUpForm;
import project.commerce.domain.model.User;
import project.commerce.service.SignUpUserService;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CommerceApplicationTests {

	@Autowired
	private SignUpUserService service;

	@Test
	void signUp() {
		SignUpForm form = SignUpForm.builder()
				.id(1234L)
				.password("peach12")
				.name("김복숭")
				.contact("01012345678")
				.address("서울시 복숭구 복숭아동")
				.build();
		User u = service.signUp(form);

		assertNotNull(u.getUser_id());
	}

}
