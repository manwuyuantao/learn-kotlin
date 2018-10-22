fun main(args: Array<String>) {
	var nums = 1..9999   //区间  [1,100] 闭区间  
	var result = 0
	for (num in nums) {  //for循环
		result = result + num
	}
	println("结果：${result}")
}