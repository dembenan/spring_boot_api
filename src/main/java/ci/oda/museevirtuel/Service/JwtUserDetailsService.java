package ci.oda.museevirtuel.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ci.oda.museevirtuel.Model.UserDTO;
import ci.oda.museevirtuel.Model.Users;
import ci.oda.museevirtuel.Repositories.UsersRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService{

    @Autowired
    private UsersRepository userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
	public UserDetails loadUserByUsername(String username) {
        Users user = userDao.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("user not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }
    
    public Users save(UserDTO user) {
        Users newUser = new Users();
        newUser.setNom_user(user.getNom_user());
        newUser.setPrenom_user(user.getPrenom_user());
        newUser.setType_user(user.getType_user());
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return userDao.save(newUser);
    }
    
}
