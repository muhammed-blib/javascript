console.log("hello");
console.log("ahmed" == "ahmed");
var m = true;
var m = "m";
var m =1.5

var array =[1,2,3,4,5,6,7,8,9,10];
console.log(array[0]);
console.log(array.length);
var dict ={
    name:"aly",
    age:20,
    job:"student",
    fullname:function(){
        return this.name +" "+this.age;
    }

};
console.log(dict.fullname());
x = false;
if(x){
    console.log("right");
}
else{
    console.log("wrong");
}

x?console.log("right"):console.log("wrong");
while(x){
    console.log("right");
}
do{
    console.log("wrong");
}while(x);

var string = "hello";
;
function hello(){
console.log("hello")}

function reverse(str){
   
    for(var i = str.length-1;i>=0;i--){
       console.log(str[i]);
    }
}
reverse("hello");
var a =1; 
var b =2;
var add = (a,b) => a+b;
console.log(add(a,b));
class Person{
    constructor(name,age,job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    say(){
        console.log("hello");
    }
}
var p = new Person("aly",20,"student");
console.log(p.name);
p.say();
function choose(){
    var asks = ["mohammed","raheem","yossef","mai","sama","hassan"];
    var asked = ["mohammed","raheem","yossef","mai","sama","hassan"];
   
        var x = asked[Math.floor(Math.random()*asked.length)];
        var y = asks[Math.floor(Math.random()*asks.length)];
        if(x==y){
            choose();}
            else
            { return "will ask: "+asks[Math.floor(Math.random()*asks.length)]+" will be asked: "+asked[Math.floor(Math.random()*asked.length)];
        }
           
    

}

console.log(choose());