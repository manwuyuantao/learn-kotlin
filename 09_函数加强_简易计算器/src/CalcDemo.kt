fun main(args: Array<String>) {
	var a = 8
	var b = 2
	println("a+b=" + plus(a, b))
	println("a-b=" + sub(a, b))
	println("a*b=" + mutl(a, b))
	println("a/b=" + devide(a, b))

}

//fun 固定写法   plus 函数名称（a第一个参数，类型Int）:Int返回值是Int类型
fun plus(a: Int, b: Int): Int {
	return a + b
}

fun sub(a: Int, b: Int): Int {
	return a - b
}

fun mutl(a: Int, b: Int): Int {
	return a * b

}

fun devide(a: Int, b: Int): Int {
	return a / b
}




