fun main(args: Array<String>) {
//	var i = 18   //计算机给我一块存储空间 ，名字叫i ,里面存放数据为整数18
	var i: Int = 18   //计算机给我一块存储空间 ，名字叫i ,里面存放数据为整数18
	i = 19
//	i = 99999999999  //Multiple markers at this line - The value '99999999999' assigned to 'var i: Int defined in main' is never used - The integer literal does not conform to the expected type Int
//	var j = 99999999999999   //计算机给我一块存储空间 ，名字叫j,存放的数据类型为长整形数据
	var j: Long = 99999999999999   //计算机给我一块存储空间 ，名字叫j,存放的数据类型为长整形数据
	var s: String = "hehe"   //s是字符串类型的数据

//	var a =   如果不赋值 ，编译器则报错，即编译器不知道是什么类型的数据

	var b: String = "13"
	var c: Int = 13

	val number = "NO.123456"   //只读的数据类型
//	number = "hehe" //Multiple markers at this line - Val cannot be reassigned - The value '"hehe"' assigned to 'val number: String defined in main' is never used


}