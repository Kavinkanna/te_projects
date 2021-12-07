//Variable Hoisting
var hoist;
console.log(hoist);
hoist="hello"
console.log((hoist));

function hoisting(){
    console.log(msg);
    console.log(hoist);
    
    var msg = "hello world"
    
}
hoisting()