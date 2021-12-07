function test() {
    let id = 10;
     console.log(id);
 }
 
 console.log(id);

let name = "SRK"
if(true){
    let name = "HRX"
    console.log(name); // HRX
}
console.log(name); //HRX

let id = 10;
id = 20;

function test(){
    console.log(id); //un
    let id = 12;
}
test()