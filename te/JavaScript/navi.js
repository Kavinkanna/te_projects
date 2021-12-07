var x = document.getElementById("nav");

function geoLocation(){

    if(window.navigator.geolocation){
        window.navigator.geolocation.getCurrentPosition(showPosition);
    }else{
        x.innerHTML = "this is not supp"
    }
}

function showPosition(position){
 x.innerHTML = ` lattitude : ${position.coords.latitude} <br>   
                 longitude ${position.coords.longitude}`
                 
}