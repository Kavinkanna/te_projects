var current = sessionStorage.getItem("current");
var demo = document.getElementById("demo")
console.log(current);
if(current === null){
       demo.innerHTML = "please Login  "
}else{
     var userData = JSON.parse(current)
       demo.innerText =  userData.name + userData.Email

}

function logout(){
    localStorage.removeItem("current");
    location.href = "./login.html"
}