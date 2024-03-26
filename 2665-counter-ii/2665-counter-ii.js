/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let constant = init; 
    function increment(){
        constant +=1;
        return constant; 
    }
    function decrement(){
        constant -=1; 
        return constant; 
    }
    
    function reset(){
        constant = init; 
        return constant;
    }
    
    return {increment, decrement, reset };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */