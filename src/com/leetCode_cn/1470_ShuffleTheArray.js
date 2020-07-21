//给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
//
// 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
//  
//
// 示例 1：
//
// 输入：nums = [2,5,1,3,4,7], n = 3
// 输出：[2,3,5,4,1,7]
// 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]


/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    var arr1 = []
    for(var i = 0; i < n; i++) {
        arr1.push(nums[i])
    }
    console.log(arr1)

    var arr2 = []
    for(var i = n; i < 2*n; i++) {
        arr2.push(nums[i])
    }
    console.log(arr2)

    var result = [];
    for (var i = 0; i < n; i++) {
        result.push(arr1[i])
        result.push(arr2[i])
    }


    return result;

};

//second way
var shuffle2 = function(nums, n) {
    var arr1 = []
    var arr2 = []
    for (var i = 0; i < 2 * n; i++) {
        if (i < n) {
            arr1.push(nums[i])
        } else {
            arr2.push(nums[i])
        }

    }

    var result = [];
    for (var i = 0; i < n; i++) {
        result.push(arr1[i])
        result.push(arr2[i])
    }


    return result;
}

var result = shuffle([2,5,1,3,4,7], 3);
console.log(result)
