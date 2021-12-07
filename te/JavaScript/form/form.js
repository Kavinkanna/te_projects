function validate(){

    var form = document.forms['MyForm']
    console.log(form);
    var use = form['user'].value
    console.log(use);
    

    var err =  document.getElementById('err')
    if(use === "" ){
      err.innerText = " user name should not be empty"
      err.style.display = "block"
      err.style.color = "red"
      return false;
    }else if( use.length <= 5 ) {
      err.innerText = " user name should not be less than 5"
      err.style.display = "block"
      err.style.color = "red"
      return false;
    }else{
      console.log("here");
      document.MyForm.submit()
    }
}


function  test() {
console.log("numver validation");


  var x = document.getElementById('number').value 
  var numlen = x.length
  console.log(typeof(numlen));
  
  console.log(x);

  

  if(isNaN(x) || x < 10 || x > 1000 ||  x.length === 2 ){
    alert('Improper Number')
  }else{
      
  }
}
