var name = '                         NARENDRAMODI'
console.log(name);
console.log(name.length);

var newName = name.toLowerCase()
console.log("toLowerCase()  "+ newName);

var upperName = newName.toUpperCase()
console.log("toUpperCase() "+upperName);

var char = name.charAt(3)
console.log(char);


var index = name.indexOf('N',1) ;
 console.log(index);

var concatString = name.concat(" HI ",'PM ' ,' INDIA')
 console.log(concatString);
 
var res = name.includes('R',8)
console.log(res);

var newString = name.replace('N',"O")
console.log(newString);

var newString = name.substr(0,8)
console.log(newString);

var newString = name.trim()
console.log(newString);


