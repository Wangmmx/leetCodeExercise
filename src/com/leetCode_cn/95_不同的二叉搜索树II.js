// 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
//
//  
//
// 示例：
//
// 输入：3
// 输出：
// [
//     [1,null,3,2],
//     [3,2,null,1],
//     [3,1,null,null,2],
//     [2,1,3],
//     [1,null,2,null,3]
// ]
// 解释：
// 以上的输出对应以下 5 种不同结构的二叉搜索树：
//
//    1         3     3      2      1
//     \       /     /      / \      \
//      3     2     1      1   3      2
// /     /       \                 \
//    2     1         2                 3
//



/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number} n
 * @return {TreeNode[]}
 */
var generateTrees = function(n) {

};



var result = generateTrees(3);
console.log(result)


//todo 没写这个

//二叉搜索树（二叉查找树，二叉排序树）
//每个节点的值唯一，根节点的值大于左子树任一节点的值，小于右子树任一节点的值，左右子树都是二叉搜索树

