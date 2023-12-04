// bootJar 태스크 활성화, jar 태스크 비활성화
// 이 설정은 서브 모듈에서 Spring Boot 실행 가능 Jar를 생성할 때 필요
tasks.getByName("bootJar"){
	enabled = true
}

tasks.getByName("jar"){
	enabled = false
}


dependencies {
	api("org.springframework.boot:spring-boot-starter-web")
	implementation(project(":order-service:order-domain:order-application-service"))
}