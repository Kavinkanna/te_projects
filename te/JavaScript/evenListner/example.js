var x = document.getElementById('demo')

x.addEventListener("click" , generateRandomNum)

function generateRandomNum() {
    x.innerText = Math.random()*100
}

function remove() {
    x.removeEventListener("click" , generateRandomNum)
}