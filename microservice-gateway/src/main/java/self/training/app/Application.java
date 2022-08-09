package self.training.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route(p -> p
//                        .path("/companyName/teacher/**")
//                        .filters(f -> f.rewritePath("/companyName/teacher/(?<segment>.*)", "/${segment}")
//                                .addResponseHeader("X-Response-Time", new Date().toString()))
//                        .uri("lb://microservice-teacher"))
//                .route(p -> p
//                        .path("/companyName/student/**")
//                        .filters(f -> f.rewritePath("/companyName/student/(?<segment>.*)", "/${segment}")
//                                .addResponseHeader("X-Response-Time", new Date().toString()))
//                        .uri("lb://microservice-student"))
//                .route(p -> p
//                        .path("/companyName/payment/**")
//                        .filters(f -> f.rewritePath("/companyName/payment/(?<segment>.*)", "/${segment}")
//                                .addResponseHeader("X-Response-Time", new Date().toString()))
//                        .uri("lb://microservice-payment"))
//                .build();
//    }
}
