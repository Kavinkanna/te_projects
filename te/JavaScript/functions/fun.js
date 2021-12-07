// Named Function
 // return a+b
function sum(a , b){
    var sum = a + b;
    return sum;
}

var res = sum(2, 4)
console.log(res);

 
// //Function Expression
var add =  function (){
    var a = 2
    var b = 3
    var sum = a+b
    console.log(sum + " fun exp")
    
 }
 add();


(function (a,b){
    
    var sum = a+b;
    console.log(sum + " IINF");
    
 })(2,9);
 
 
//IIFE
(function() {
     console.log("IIFE");
    
 })()



//Arrow Functions
 var getDate = () =>{
     return new Date()
 }

 console.log(getDate());


