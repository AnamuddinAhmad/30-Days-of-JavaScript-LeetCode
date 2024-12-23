var createCounter = function(init) {
    let persentCount = init;

    function increment(){
        return ++persentCount
    }

    function decrement(){
        return --persentCount
    }

    function reset(){
        return (persentCount = init);
    }

    return {increment,decrement,reset};
};
