

function changeData(){
    var ele = document.getElementById("demo")
    ele.style.display = "none"
    ele.style.color = " white"
    ele.style.background = "black"
    ele.innerText = "Good Evening"

}

function innerTextMode(){
    console.log("inside InnerText");
    
    var divElem = document.getElementById("sample")
    alert(divElem.innerText)
}

function innerHTMLMode(){
    console.log("inside innerHTML");
    
    var divElem = document.getElementById("sample")
    alert(divElem.innerHTML)
}