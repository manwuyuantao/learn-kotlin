fun main(args: Array<String>) {
	//正序 until
//	var nums = 1 until 100  //[1,100)
//	for(num in nums){
//		println(num)
//	}

	//步长 step
	var num2 = 1..16
//	for (a in num2 step 2) {
//		println(a)
//	}

	//反转 reversed
	var num3 = num2.reversed()
	for (a in num3) {
		println(a)
	}
	//统计数量
	println("总数为：" + num3.count())


}


