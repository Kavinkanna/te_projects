class MyClass{

    constructor(name){
        this.name = name;
    }
    name ;
    static numb = 20;
    getName() {
        return this.name;
    }

}


class MyClass2 extends MyClass{
    constructor(name){
        super(name);
    }
}

const myObject = new MyClass2('Hemanth');
console.log(myObject.name); 
var name = myObject.getName()
console.log(name);


console.log(MyClass.numb);
