//颜值判断器
//颜值>80 帅哥 <=80 衰哥
fun checkFace(score: Int) {
//	if (score > 80) {
//		println("这是个帅哥")
//	} else {
//		println("这是个衰哥")
//	}
	
	if (score > 80) println("这是个帅哥") else  println("这是个衰哥")
	
}

fun main(args: Array<String>) {
	var score = 65
	checkFace(score)
}