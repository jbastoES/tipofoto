package net.electrosoftware.sigcom.ms.tipofoto.configuracion;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(new Info()
						.title("Microservicio SigCom Tipo Foto")
						.version("1.0")
						.description("Microservicio de Tipo Foto, realiza todo la gestión de Tipo Foto"));
	}

}
