function getPara() {
    var x = document.getElementsByTagName('p');
    console.log(x);

    for (const key in x) {
        console.log(x[key]);
        
        x[key].style.color = "white"
        x[key].style.background = "black"
    }
    
}

function getClass(){
    var x = document.getElementsByClassName('demo')
    console.log(x);
    for (const key in x) {
        console.log(x[key]);
        
        x[key].style.color = "blue"
        x[key].style.background = "grey"
    }

}

function getName(){
    var x = document.getElementsByName("simple")
    console.log(x);
    for (const key in x) {
        console.log(x[key]);
        
        x[key].style.color = "blue"
        x[key].style.background = "grey"
    }
}

function querySelect() {
  var x =   document.querySelector(".demo")
    console.log(x);
    
}

function querySelectAll() {
    var x = document.querySelectorAll(".demo")
    console.log(x);
    
}