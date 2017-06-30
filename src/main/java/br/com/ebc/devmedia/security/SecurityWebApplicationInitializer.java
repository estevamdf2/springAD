package br.com.ebc.devmedia.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Classe responsável por chamar uma instância da classe
 * SecurityConfig. Nesta classe são definidas as configurações
 * de segurança e carrega-se o módulo do springSecurity
 * 
 * @author Estevamdf2
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}
}
