// Get input from user
var n = prompt("Enter a number:");

// Get confirmation from user for additional number
var confirmMsg = "Do you want to add another number to " + n + "?";
var addNumber = confirm(confirmMsg);

// If user confirms, ask for additional number
if (addNumber) {
  var additionalNumber = prompt("Enter an additional number:");
  n += "," + additionalNumber;
}

// Split input into array of numbers
var numbers = n.split(",");

// Calculate sum of all numbers
var sum = 0;
for (var i = 0; i < numbers.length; i++) {
  sum += parseInt(numbers[i]);
}

// Display sum using alert
alert("The sum of the numbers is " + sum);