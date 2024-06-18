/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var filteredArr = [];
    arr.forEach((el,i)=>{
        if(fn(el,i)){
            filteredArr.push(el);
        }
    })
    return filteredArr;
};