// 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
//
// 请返回 nums 的动态和。
//
//  
//
// 示例 1：
//
// 输入：nums = [1,2,3,4]
// 输出：[1,3,6,10]
// 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。




/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    var sum = new Array(nums.length);
    for(var i =0; i< nums.length; i++) {
        if(i == 0) {
            sum[i] = nums[i]
        } else {
            sum[i] = sum[i-1] + nums[i]
        }
    }
    return sum;

};

var result = runningSum([1,2,3,4]);
console.log(result)