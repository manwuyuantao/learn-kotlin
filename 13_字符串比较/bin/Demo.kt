fun main(args: Array<String>) {
	var str1 = "jack"
	var str2 = "Jack"
	println(str1 == str2)   //相当于java中的.equals()方法 ，java中的==代表的是比较两个对象的内存地址是否相同
	println(str1.equals(str2))   //相当于java中的.equals()方法 ，java中的==代表的是比较两个对象的内存地址是否相同

	
	//第二个参数：是否忽略字母的大小写
	println(str1.equals(str2, false))
	println(str1.equals(str2, true))
}