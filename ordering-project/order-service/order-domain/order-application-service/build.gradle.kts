plugins {
	// 필요한 경우 여기에 플러그인을 추가하세요
}

dependencies {
	implementation(project(":order-service:order-domain:order-domain-core"))
	implementation(project(":common:common-domain"))


	// 스프링 부트 Validation 의존성 추가
	implementation("org.springframework.boot:spring-boot-starter-validation")

	// 단순 트랜잭션 관리하는 의존성 추가
	implementation("org.springframework:spring-tx")
}