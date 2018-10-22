//接收一个参数 ，类型是非空类型的String ，加上问号代表的是参数可以为空
//fun heat(str: String): String {
//	return "热" + str
//}

fun heat(str: String?): String {
	return "热" + str
}

fun main(args: Array<String>) {
	var result = heat("水")
	println(result)

	var result2 = heat(null)//java中的空指针异常 ，在kotlin中在语法阶段完美的解决
	println(result2)

}