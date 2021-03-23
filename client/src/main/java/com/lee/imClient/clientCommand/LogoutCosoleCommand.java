package com.lee.imClient.clientCommand;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("LogoutConsoleCommand")
public class LogoutCosoleCommand implements BaseCommand {

    public static final String KEY = "10";

    @Override
    public void exec(Scanner scanner) {
    }

    @Override
    public String getKey() {
        return KEY;
    }

    @Override
    public String getTip() {
        return "退出";
    }
}
