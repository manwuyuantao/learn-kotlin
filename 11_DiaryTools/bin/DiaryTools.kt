//日记生成器
fun diaryGenerator(placeName: String): String {
	var temp = """
	今天天气晴朗，万里无云，我们去${placeName}游玩，
 首先映入眼帘的是，${placeName} ${placeName.length}个鎏金大字。
 """
	return temp
}

fun main(args: Array<String>) {
	var diary = diaryGenerator("金銮殿")
	println(diary)
	
	diary = diaryGenerator("天安门")
	println(diary)
	
	diary = diaryGenerator("人民大会堂")
	println(diary)
	
	diary = diaryGenerator("故宫")
	println(diary)
}