package edu.uc.gamelibrarymanager;

import com.google.common.base.Strings;
import edu.uc.gamelibrarymanager.dto.FirebaseAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirebaseAuthenticationFilter extends AbstractAuthenticationProcessingFilter {
    private final static String TOKEN_HEADER = "X-Firebase-Auth";

    public FirebaseAuthenticationFilter(){
        super("/auth");
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        final String authToken = httpServletRequest.getHeader(TOKEN_HEADER);
        if(Strings.isNullOrEmpty(authToken)){
            throw new RuntimeException("Auth token is invalid.");
        }
        return getAuthenticationManager().authenticate(new FirebaseAuthenticationToken(authToken));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult)
            throws IOException, ServletException {
        super.successfulAuthentication(request, response, chain, authResult);

        chain.doFilter(request, response);
    }
}
