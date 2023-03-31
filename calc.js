// Function to perform addition
function add(num1, num2) {
    return num1 + num2;
  }
  
  // Function to perform subtraction
  function subtract(num1, num2) {
    return num1 - num2;
  }
  
  // Function to perform multiplication
  function multiply(num1, num2) {
    return num1 * num2;
  }
  
  // Function to perform division
  function divide(num1, num2) {
    return num1 / num2;
  }
  
  // Function to get user input and perform calculation
  function calculate() {
    // Get input from user
    let num1 = parseFloat(prompt("Enter first number:"));
    let num2 = parseFloat(prompt("Enter second number:"));
  
    // Perform calculation based on user input
    let sum = add(num1, num2);
    let difference = subtract(num1, num2);
    let product = multiply(num1, num2);
    let quotient = divide(num1, num2);
  
    // Display the result to the user
    alert("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: " + quotient);
  }
  
  // Call the calculate function to start the program
  calculate();
  