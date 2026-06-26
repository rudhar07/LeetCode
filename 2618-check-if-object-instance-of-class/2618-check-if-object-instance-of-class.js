/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    if(obj == null || typeof classFunction !== 'function'){
        return false;
    }
    let pr = Object.getPrototypeOf(obj);
    while(pr!==null){
        if(pr === classFunction.prototype){
            return true;
        }
        pr = Object.getPrototypeOf(pr);
    }
    return false;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */