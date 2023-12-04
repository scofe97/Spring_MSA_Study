plugins {
	// 필요한 경우 여기에 플러그인을 추가하세요
}

dependencies {
	implementation(project(":order-service:order-domain:order-domain-core"))
	implementation(project(":order-service:order-domain:order-application-service"))
	implementation(project(":order-service:order-application"))
	implementation(project(":order-service:order-dataaccess"))
	implementation(project(":order-service:order-messaging"))
}