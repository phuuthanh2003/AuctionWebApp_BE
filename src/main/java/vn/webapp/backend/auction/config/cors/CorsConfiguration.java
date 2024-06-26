package vn.webapp.backend.auction.config.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/**")
                .allowedOrigins(
                        "http://localhost:3000",
                        "http://localhost:3001",
                        "https://fe-deploy-hazel.vercel.app",
                        "https://auction-webapp-production.up.railway.app",
                        "https://admin-manager-auction-production.vercel.app",
                        "https://website-auction-production.vercel.app"
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);
    }

}