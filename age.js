function checkAge() {
	var name = document.getElementById("name").value;
	var age = document.getElementById("age").value;

	if (age < 18) {
		document.getElementById("message").innerHTML = "Hello, " + name + ". You are not authorized to visit this site.";
	} else {
		document.getElementById("message").innerHTML = "Welcome to the site, " + name + "!";
	}
}
