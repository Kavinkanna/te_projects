
async function getData(){
    console.log("inside getData Method");//2
    console.log("before returning data");//3
    console.log("before fetch");
    let data = await fetch('https://api.github.com/users');
    console.log("after fetch");
    console.log("before extract");
    let finalData = await data.json(); 
    console.log("after Extract");



    return finalData;
}
    let user ;
    console.log("before calling method");//1
    let data = getData();
    console.log("after calling the method");//5
    data.then((resp)=>{
    // console.log(resp);
    user = resp[0];
    console.log(user);

    }).catch((err)=>{
    console.log(err);
    })

console.log("Some imp code");