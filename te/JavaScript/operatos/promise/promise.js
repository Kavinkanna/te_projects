function fulfuill(){
    var arr = [1,2,3,4,5]
    return arr;
}

let myPromise = new Promise( (resolve,reject)=>{

    var arr = fulfuill();
    var isPromiseKept = true;

    if (isPromiseKept) {
        resolve(arr)
    } else {
        reject("Promise is not kept")
    }

} )

myPromise.then((resp)=>{
        console.log(resp); //arr
}).catch((err)=>{
    console.log(err);
})

let data = fetch('https://api.github.com/users');

data.then((resp)=>{
    console.log(resp.json()  );
}).catch((err)=>{
    console.log(err);
})