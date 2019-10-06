package edu.uc.gamelibrarymanager.security;

        import com.google.api.core.ApiFuture;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseToken;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
        import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
        import org.springframework.security.core.AuthenticationException;
        import org.springframework.security.core.userdetails.UserDetails;
        import org.springframework.security.web.authentication.session.SessionAuthenticationException;
        import org.springframework.stereotype.Component;
        import org.springframework.util.Assert;

@Component
public class FirebaseAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    private FirebaseAuth firebaseAuth;

    @Override
    public boolean supports(Class<?> authentication){
        return (FirebaseToken.class.isAssignableFrom(authentication));
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                  UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        Assert.notNull(firebaseAuth, "FirebaseAuth null -- check DI container");
        final FirebaseAuthenticationToken authenticationToken = (FirebaseAuthenticationToken) authentication;

        ApiFuture<FirebaseToken> task = firebaseAuth.verifyIdTokenAsync(authenticationToken.getToken());
        try {
            FirebaseToken token = task.get();
            return new FirebaseUser(token.getEmail(), token.getUid());
        } catch (Exception e) {
            throw new SessionAuthenticationException(e.getMessage());
        }
    }

}
