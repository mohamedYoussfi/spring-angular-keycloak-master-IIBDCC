package net.youssfi.orderservice.interceptors;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
public class FeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        JwtAuthenticationToken jwtAuthenticationToken= (JwtAuthenticationToken) authentication;
        String jwtAccessToken = jwtAuthenticationToken.getToken().getTokenValue();
        requestTemplate.header("Authorization","Bearer "+jwtAccessToken);
    }
}
