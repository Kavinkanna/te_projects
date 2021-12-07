var x =document.getElementById('demo');
console.log(x);
function addCss(){
    //  x.className = "myStyle myStyle2"
    x.classList.add("myStyle")
    x.classList.add("myStyle2")
     console.log(x);

}

function removeCss(){
    // x.className = ""
    x.classList.remove("myStyle2")
    x.classList.remove("myStyle")
    console.log(x);
   
}

