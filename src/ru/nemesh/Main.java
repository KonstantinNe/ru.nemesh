package ru.nemesh;

import javax.servlet.http.HttpServlet;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Scanner;
//import TelegramBotsApi


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String botName = "infotestkosbot";
        String keyapi = "6355226138:AAHytO7aAhiG6SS82uxH1-pXmMSQ1j5DDwc";
        String result;
        boolean flag = true;

 //       System.out.println("/start");

        result = Send.checkOrg(botName, keyapi);

        System.out.println(result);
    }
    
//
//    TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
//        try
//
//    {
//        telegramBotsApi.registerBot(Bot.getBot());
//    } catch(
//    TelegramApiRequestException e)
//
//    {
//        e.printStackTrace();
//    }
}