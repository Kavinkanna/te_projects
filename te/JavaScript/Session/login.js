var user = {
    id: 123 ,
    name:"xyz",
    pwd:"qwertY",
    Email : "xyz@gmail.com"
}


var userId = user.id+""
localStorage.setItem(userId , JSON.stringify(user))

var err = document.getElementById("error")
function validate(){
    var form = document.Login;
    console.log(form);
    
    var id = form["userId"].value;
    var pwd = form["pwd"].value;

    var userfound = localStorage.getItem(id);
    if(userfound === null ){
        err.innerText = "User Not Found"
        err.style.color = "red"
        return false;
    }else{
        var current  = JSON.parse(userfound);
       
        if( current["pwd"] === pwd){
            sessionStorage.setItem("cuurent" , userfound)
            form.submit()
        }else{
            err.innerText = " Invalid Password"
            err.style.color = "blue"
            return false;
        }
    }
    return false;

}


