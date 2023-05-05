package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing //DB에 데이터를 저장하거나 업데이트시 @CreatedDate같은 어노테이션이 붙은 애들을 찾아줌
public class JpaAuditingConfiguration {

}
