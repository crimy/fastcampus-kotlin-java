data class HeroKt(
    val name: String,
    val age: Int,
    val address: String,
) {
}

// 방법 1. Delombok 하기 : 복잡하고 단순 노동이 될 수 있다.
// 2. data class 로 점진적으로 전환하기 : 가장 추천하는 방법
// 3. kotlin lombok