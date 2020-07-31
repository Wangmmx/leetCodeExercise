// 给你两个整数，n 和 start 。
//
// 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
//
// 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
//
//  
//
// 示例 1：
//
// 输入：n = 5, start = 0
// 输出：8
// 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
//      "^" 为按位异或 XOR 运算符。




/**
 * @param {number} n
 * @param {number} start
 * @return {number}
 */
var xorOperation = function(n, start) {
    var nums = [];
    var temp;

    for (var i =0; i< n; i ++){
        nums[i] = start + 2*i;
        if(i === 0) {
            temp = nums[i]
        } else{
            temp = temp ^ nums[i]
        }
        console.log('i', i + ' ' +nums[i-1] + '^'+nums[i] + ' ' + result)

    }
    console.log('nums',nums)
    return temp;
};



var result = xorOperation(10, 5);
console.log(result)

