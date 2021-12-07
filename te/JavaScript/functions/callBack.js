var add = function(a,b){
    return   a+b
}

var avg = function(callback ,a  , b ){
    return callback(a , b)/2

}

console.log(  avg(add , 2 ,8)      );



 