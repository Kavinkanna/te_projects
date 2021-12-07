
function first() {
    setTimeout(() => {
        console.log("start of App");
        console.log("first function");
    },1000)
}

function second() {
    setTimeout(() => {
        console.log("second function");
        console.log("end of app");
    }, 1000)
}

first()
second()

// output  -->  start of app
//              end of app
//              second  function
//              first function
                
