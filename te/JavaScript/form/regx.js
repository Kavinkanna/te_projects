// let numPattern =  /0-9/;
// console.log(numPattern);

// let patter = new RegExp('0-9');
// console.log(patter);

function validate() {
    let namePattern = /^(?=.{1,40}$)[a-zA-Z]+(?:[-'\s][a-zA-Z]+)*$/;

var name = document.getElementById('user').value;

// console.log(namePattern.test(name));
if ( namePattern.test(name)) {
 alert('valid name');
} else {
  alert('invalid name')
}

return false;
}












































//  var name = "Virat"
//  var patter = new RegExp("i")
//  console.log(patter);

//  var res = patter.test(name);
//  console.log("Result - "  ,res);



