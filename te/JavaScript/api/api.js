var date = document.getElementById("time")
function setDate() {
    date.innerText = new Date();
}


setTimeout( setDate ,2000)
setInterval(setDate,1000)


function setName(event){
    console.log(event);
    console.log("Somthing");
}