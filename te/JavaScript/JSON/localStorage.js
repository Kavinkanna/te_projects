// JavaSCript Object
var person  =  {
    name : "sushanth",
    age : 29,
    hobbies : [ "singing" , "dancing","cricekt"],
   
}

// coverting javascript Object to JSON String
var jsonForm = JSON.stringify(person)

// coverting JSON String to javascript Object 
var jsob = JSON.parse(jsonForm);

var other  =  {
    name : "sushanth",
    age : 29,
}
var newOther = JSON.stringify(other)

// to store the data
localStorage.setItem("first" ,jsonForm);
localStorage.setItem("second" , jsonForm)
localStorage.setItem("first" , newOther)

// to get the data by specifying key
var pe = localStorage.getItem("first")

// returns the key string present at given index
localStorage.key(0)

// returns the lenth of local storage - number
localStorage.length

//removes the data specified key
localStorage.removeItem("first")

// clears the localstorage
localStorage.clear()


 
