
var x = document.getElementById('test')

    x.addEventListener("click" ,clickEvent)
    x.addEventListener("mouseover" , mouseOverEvent)
    x.addEventListener("mouseout" , mouseOutEvent)

function clickEvent() {
    document.getElementById('demo').innerHTML += 'Cliked <br>'
}

function mouseOverEvent() {
    document.getElementById('demo').innerHTML += 'Mouse Over <br>'
}
function mouseOutEvent() {
    document.getElementById('demo').innerHTML += 'Mouse Out <br>'
}
