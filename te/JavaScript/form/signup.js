function validate(){
    var form = document.SignUp
    var phoneNumber = form['phn'].value;
    console.log(phoneNumber);

    var pattern = new RegExp("^[a-zA-Z]")
    var res = pattern.test(phoneNumber);
    //console.log(res);

    var checkRes = document.getElementById("gridCheck").checked;
   
    console.log(checkRes + " check Box");


    if(!(res) && checkRes===true ){
        form.submit()
    }else{
        document.getElementById("errPhoneNum").innerText = "Invalid Phone Number"
            return false;
    }
    
        if(!checkRes){
            document.getElementById("email").focus()
            document.getElementById("email").setAttribute("placeholder","Enter Email Id As Well")
            alert("u should select the check box")
            return false;
        }
return false;
    
}