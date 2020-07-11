package com.swat018;

import com.swat018.di.ContainerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AccountService accountService = ContainerService.getObject(AccountService.class);
        accountService.join();
    }
}
