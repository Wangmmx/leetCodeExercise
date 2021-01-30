/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const stack = [];
    for (var i = 0; i< s.length; i++) {
        const c = s[i];
        if ( c === '(' || c === '{' || c === '[') {
            stack.push(c)
        } else {
            const top = stack[stack.length-1];
            if (c === ')' && top === '(' ||
                c === ']' && top === '[' ||
                c === '}' && top === '{'
            ) {
                stack.pop()
            } else return false;
        }
    }

    return stack.length === 0

};

var result = isValid("(({{}(})");
console.log(result);


// 优化：
// 1.判断字符串是否为奇数
// 2.if else改为 ||
// 3.定义需要的元素
