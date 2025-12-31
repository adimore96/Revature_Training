console.log("Simple Message from JS!");

function greet() {
    alert("Hello, welcome to JavaScript!");
}

// Addition function
function addNumbers(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let sum = parseFloat(num1) + parseFloat(num2);
    document.getElementById("result").innerText = "Sum: " + sum;
}

// Subtraction function
function subtractNumbers(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let difference = parseFloat(num1) - parseFloat(num2);
    document.getElementById("result").innerText = "Difference: " + difference;
}

// Multiplication function
function multiplyNumbers(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let product = parseFloat(num1) * parseFloat(num2);
    document.getElementById("result").innerText = "Product: " + product;
}

// Division function
function divideNumbers(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let quotient = parseFloat(num1) / parseFloat(num2);
    document.getElementById("result").innerText = "Quotient: " + quotient;
}

// clear result function
function clearResult(){
    document.getElementById("result").innerText = "";
}

// Clear input fields function
function clearInputs(){
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
}