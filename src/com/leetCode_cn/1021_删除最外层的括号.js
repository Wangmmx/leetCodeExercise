/**
 * @param {string} S
 * @return {string}
 */
var removeOuterParentheses = function(S) {
    var stack = [];
    var arr = [];

    var i =0;
    while(i < S.length) {
        console.log('S', S)
        var c = S[i];

        if (c === '(') {
            stack.push(c)
        } else stack.pop();

        if(stack.length === 0) {

            arr.push(i);
            var str = S;
            console.log(str);
            console.log(S)
            S = S.slice(i +1 , S.length)

            console.log(i)
            str = str.slice(0, i+1)


            console.log('str', str)
            str = str.slice(1, str.length-1)
            console.log('str2', str)
            S = S.slice(i +1 , S.length)
            console.log('S', S)
            // console.log(S)

            removeOuterParentheses(S)

            console.log(S.slice(0, i + 1))
        }
        i++
    }


    // console.log(arr)
    // for (var j = 0; j < arr.length; j++) {
    //
    //
    // }
    // // return stack;

};

var result = removeOuterParentheses("(()())(())");
console.log(result);

var removeOuterParentheses = function(S) {
    let stack = [S[0]],
        i = 1,
        startIndex = 0,
        str = '';
    while(i<S.length){
        if(S[i]==='(') stack.push('(');
        else stack.pop();
        if(!stack.length){
            str += S.substring(startIndex + 1,i)
            startIndex = i + 1
        }
        i++
    }
    return str
};







