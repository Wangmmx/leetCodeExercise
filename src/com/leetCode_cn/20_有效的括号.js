/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const stack = [];
    for (var i = 0; i< s.length; i++) {
        if ( s[i] === '(' || s[i] === '{' || s[i] === '[') {
            stack.push(s[i])
        } else {
            if (s[i] === ')' && stack[stack.length-1] === '(') {
                stack.pop()
            } else if(s[i] === ']' && stack[stack.length-1] === '[') {
                stack.pop()
            } else if(s[i] === '}' && stack[stack.length-1] === '{') {
                stack.pop()
            } else return false;
        }
    }
    if(stack.length === 0) {
        return true
    } else return false

};

var result = isValid("(({{}(})");
console.log(result);


// 优化：
// 1.判断字符串是否为奇数
// 2.if else改为 ||
// 3.定义需要的元素
