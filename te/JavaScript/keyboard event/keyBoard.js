
var pelement = document.createElement('p')
var isAppended = false;

function test(){
    var x= document.getElementById('demo')
    console.log(x.value);
    x.value = x.value.toUpperCase()   

    if(isAppended){
        pelement.innerText = x.value;
    }else{     
        pelement.innerText = x.value;
        isAppended = true;
        document.body.appendChild(pelement)
    }



}

