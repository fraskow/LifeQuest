package f5.frasko.services;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import f5.frasko.models.SecurityUser;
import f5.frasko.repositories.UserRepo;

@Service
public class JpaUserDetailsService implements UserDetailsService{

    UserRepo repo;

    public JpaUserDetailsService(UserRepo repo){
        this.repo = repo;
    }

   @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repo.findByemail(username).map(SecurityUser::new).orElseThrow(()-> new UsernameNotFoundException("User not found"+ username));
    }
    
}
