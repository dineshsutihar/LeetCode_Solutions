function createCounter(n: number): () => number {
    let counter: number = n-1; 
    return function() {
        counter +=1;
        return counter;
    }
}


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */