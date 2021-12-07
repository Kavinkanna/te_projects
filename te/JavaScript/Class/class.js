
class Car {

    constructor(brand){
        this.brand = brand;
    }

    getName() {
        return this.brand
    }

    static getBrand(){
        return "BBT"
    }


}

class Model extends Car{
    constructor(brand , model){
        super(brand)
        this.model = model;
    }

    getModel(){
        console.log(this.brand +' '+ this.model);
    }

    get mode(){
       return this.model 
    }

    set modeName(model){
        this.model = model
    }
}


let carModel = new Model("Ford" ,"ZXI");
console.log(carModel);
carModel.getModel();


