// function writeData(){

//     document.write('<h1 style="color:red">good Afternoon</h1>')
// }

// // writeData();

// var x = document.createElement("a");

// x.textContent = "JavaScript"

// x.href = 'https://www.flipkart.com/'
// x.style.color = 'green'
// x.style.fontSize = '50px'

// var y = document.createElement('ol');
// var a = document.createElement('li');
// a.innerText = 'java'
// y.append(a)

// // y.appendChild(document.createElement('li').innerText = "JavaScript")
// // y.appendChild(document.createElement('li').innerText = "Python")

// console.log(y);




// console.log(x);

// document.body.appendChild(x)


function hideh1(){
    var x = document.getElementById("test")
    console.log(x);

    x.style.display = "none"
}

var a  = document.getElementById("unhide")
a.addEventListener("click" ,unhide  )

function unhide(){
    
        var x = document.getElementById("test")
        console.log(x);
    
        x.style.display = "block"
    
}
