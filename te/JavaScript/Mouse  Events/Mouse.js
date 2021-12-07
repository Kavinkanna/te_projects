
var x = document.getElementById('demo')
var previousData = x.innerHTML;

x.addEventListener("mouseover" , mouseOver)
x.addEventListener("mouseout" , mouseOut)


function mouseOver(){
    x.innerHTML = "Java Script"
}

function mouseOut(){
    x.innerHTML = previousData;
}
