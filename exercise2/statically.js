class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";
    

    moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        stats.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        Statically.stubborn();
        console.log(this.#glue);
        console.log("");
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.
//  Do NOT remove the 'static' keyword from the explain() method.
console.log("All I had to do was call the class and the static method. In javascript you use the class name to call the method");



const stats = new Statically();

stats.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(Statically.explain());
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
