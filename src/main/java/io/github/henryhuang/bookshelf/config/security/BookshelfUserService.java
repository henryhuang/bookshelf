package io.github.henryhuang.bookshelf.config.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Custom user service
 *
 * @author Henry Huang
 * @create 2017-12-29 17:48:59
 */
public class BookshelfUserService implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    // TODO
    return null;
  }

}
