let arr1 = [1,2,3,4,5]
let arr2 =[6,7,8,9 ,...arr1]
//spread  ...name(arr/Object)
// console.log(arr2); //[1,2,3,4,5,6,7,8,9]
var person= {
    age:29,
    name:"kiran"
}

var personOne={
    ...person
}
console.log(person);


//rest  ...varName
function add(...args){
    //args is array 
    var sum = 0;       
    for(let i=0 ;i<args.length;i++){
        sum+=args[i];
    }
    console.log(sum);
}

 add(1,2,3,4)

 console.log("-------");
 console.log("some imp code");