package BankCardManSys.backend.config;


/*

@Configuration
public class SecurityConfig {

*/
/*    @Bean
    public PersonDetailsService personDetailsService() {
        return new PersonDetailsService();
    }*//*


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable();
        http
                .authorizeHttpRequests((authorize) -> authorize
                                .anyRequest().authenticated()
//                        .requestMatchers("/api/adm").hasRole("ADMIN")
//                        .requestMatchers().permitAll()
//                        .anyRequest().hasAnyRole("USER", "ADMIN")
                );

//        http.formLogin(fL -> {
//            fL
//                    .loginPage("/auth/login")
//                    .loginProcessingUrl("/process_login")
//                    .defaultSuccessUrl("/login", true)
//                    .failureUrl("/auth/login?error");
//        });
//
//        http.logout(l -> {
//            l
//                    .logoutUrl("/logout")
//                    .logoutSuccessUrl("/auth/login");
//        });

        return http.build();
    }



    protected void configure(AuthenticationManagerBuilder auth) {
//        auth.authenticationProvider(authenticationProvider);
    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

//    @Bean
//    public boolean configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenticationProvider);
//        auth.inMemoryAuthentication()
//                .withUser("user").password(passwordEncoder().encode("password")).roles("USER");
//        return true;
//    }
}*/
