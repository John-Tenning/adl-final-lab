var n = prompt("Enter a number:");

// Initialize multiplication table string
var table = "";

// Loop through numbers 1 to 10 and multiply with n
for (var i = 1; i <= 10; i++) {
  var result = n * i;
  table += n + " x " + i + " = " + result + "\n";
}

// Display multiplication table using alert
alert(table);
