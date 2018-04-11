package cucumber.steps;

import java.util.List;

import com.uniovi.model.User;

import cucumber.api.java.en.Given;

public class LoginSteps {

	@Given("^una lista de usuarios:$")
	public void una_lista_de_usuarios(List<User> usuarios) throws Throwable {
		for (User u : usuarios)
			System.out.println(u.getEmail());
	}
}
