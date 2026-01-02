package com.githubUserActivity.githubUserActivity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        if(args.length<2){
            System.out.println("Usage: github-activity <github-username>");
            return;
        }
        String username = args[1];
        System.out.println("Output: ");
        System.out.println(username);
    }
}
