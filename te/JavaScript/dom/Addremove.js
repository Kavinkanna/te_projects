function append() {
    var x = document.createElement('h1')
    x.innerText = "Happy Birthday"
    //to add the child at the last
    // document.body.appendChild(x) 
    //add the element at specified location

    // document.body.insertBefore(x , document.body.firstChild)
    console.log(document.body.childNodes);

     document.body.insertBefore(x, document.body.childNodes[4])

}

function appenToList() {
    var x = document.getElementById('demo')
    var li = document.createElement("li")
    li.innerText = "Express Js"

    //  x.appendChild(li)
    // x.insertBefore(li , x.firstChild)
    // x.insertBefore(li , x.childNodes[5])
    // x.insertBefore(li , x.firstElementChild.nextElementSibling )
    //  x.insertBefore(li, x.lastElementChild)
}

function remove() {
    console.log("inside Remove");
    var x = document.getElementById('demo')
    //  x.removeChild(x.childNodes[1])
    // x.removeChild(x.firstElementChild.nextElementSibling)
   // x.removeChild(x.lastElementChild.previousElementSibling)
   x.removeChild(document.querySelector(".delete"))
}