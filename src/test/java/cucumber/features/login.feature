# language: es

Característica: Inicio de sesión

Escenario: Inicio de sesion con el administrador
	Dada la siguiente lista de usuarios:
		| email				| password		|
		| admin@gmail.com	| 1234			|
	Cuando introduzco el email "admin@gmail.com" y la password "1234"
	Entonces puedo entrar al sistema y se muestra la pantalla de Bienvenida

