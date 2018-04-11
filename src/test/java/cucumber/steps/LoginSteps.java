package cucumber.steps;

import java.util.List;

import com.uniovi.model.User;

import cucumber.api.java.en.*;

public class LoginSteps {

	@Given("^una lista de usuarios:$")
	public void una_lista_de_usuarios(List<User> usuarios) throws Throwable {
		for (User u : usuarios)
			System.out.println(u.getEmail());
	}
	
	@When("^introduzco el email \"(.+)\" y contraseña \"(.+)\"$")
	public void introduzco_el_email_y_contrasena(String email, String contrasena) throws Throwable {
		System.out.println("Logeado usuario con email " + email);
	}
}
