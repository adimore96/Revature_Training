console.log("Arrays in JS");

let names = ["Alice", "Bob", "Charlie"];
console.log("Names Array:", names);

// for(let i = 0; i < names.length; i++){
//     console.log(`Name at index ${i}: ${names[i]}`);
// }

let fruits = [];

function addFruit(){
    let fruit = document.getElementById("fruitInput").value;
    fruits.push(fruit);
    document.getElementById("fruitInput").value = "";
    displayFruits();
}

function displayFruits(){
    let fruitList = document.getElementById("fruitList");
    fruitList.innerHTML = "";
    for(let i = 0; i < fruits.length; i++){
        let li = document.createElement("li");
        li.innerText = fruits[i];
        fruitList.appendChild(li);
    }
    console.log(fruits);
    
}

function clearFruits(){
    fruits = [];
    displayFruits();
}
