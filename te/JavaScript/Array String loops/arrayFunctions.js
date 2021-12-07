//  var arr = [1,2,3,2, 4, 5,6, 7]
// arr['name'] = ' ajay'

// isArray 
// var isArray = Array.isArray(arr)
// console.log(isArray);

// includes(searchElement,[fromIndex])

// var isIncluded = arr.includes(2);
// console.log(isIncluded); //true

// var isIncluded = arr.includes(2,6);
// console.log(isIncluded); //false

//indexOf(searchElement,fromIndex)

// var index = arr.indexOf(2)
// console.log(index); //1

// var index = arr.indexOf(2,2)
// console.log(index); // 4

// push(item ) - it is used the insert the item at last index
// console.log("before push  -> " + arr);  

// var num =  arr.push(10,12,134,19)

// console.log("after push  -> " + arr);
// console.log(num); // 9

// arr.push(11,12,13,14)
// console.log(" "+ arr);

//pop() -- it removes the element at the last index
// console.log(" before pop => " + arr);
// var num = arr.pop()
// console.log(num);

// console.log(" after pop => " + arr);

//unshift(value) insert the value/values at the first index
// console.log(" before unshift -> " + arr);
// arr.unshift(22,33,44,55)
// console.log(" after unshift -> " + arr);

//shift() removes the value at the first index

// console.log(" before shift -> " + arr);
//  var num = arr.shift()
//  console.log(num);
// console.log(" after shift -> " + arr);


// Join()  it will join all the elements with separator that we pass

// var newString = arr.join('*')
// console.log(newString);


//splice() remove the elements from the array 
//  var hobbies = ['playing','singing','dance','coding','reading','writing']
// //                                     // 2      3         4        

// console.log("===============");

// console.log(hobbies);
// hobbies.splice(2,3,"Testing","FreeLancing","sleeping" )
// console.log(hobbies);
// console.log("===============");

// slice()  returns the subarray or subset of the original array 
// console.log("brefore slicing " + arr);
// var newArray = arr.slice(1,1) 
// //if start and end index are same we will get Empty array
// console.log(" new Array " + newArray);

// console.log("after slicing " + arr);

var todos = [1,2,3,2, 4, 5,6, 7]

//forEach 
    // arr.forEach( (element, index) =>{
    //         console.log(element);
    //         console.log("index is "+index);
    // } )

//map()

//  var newArry =    arr.map((value, index)=>{
//         console.log(value);
//             console.log("index is "+index);
//        if(value%2 == 0 ){
//            return value;
//        }
//        return 0;
//     })

//     console.log(newArry); //1,2,3,2, 4, 5,6, 7

 var newArry =    todos.filter( (todo)=>{
       

         return todo%2 == 0;
    })

    console.log(newArry);