var myPromise = new Promise((resolve, reject) =>{

    let condition = true;
    if( condition){
        resolve(" promise is kept")
    }else{
        reject(" promise is not kept")
    }
})

myPromise.then( resp =>{
    console.log(resp);
    
} ).catch(err =>{
    console.log(err);
})

fetch('person.json').then(resp => {
    console.log(resp);
}).catch( err =>{
    console.log(err);
})
