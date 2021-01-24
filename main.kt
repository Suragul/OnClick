suspend fun main() = Korge(width = 1280, height = 720, bgcolor = Colors["#2b2b2b"]) {
	val rect = solidRect(1280, 720, Colors.WHITE)
	onClick{
		rect.color=Colors.PALEVIOLETRED
	}
}