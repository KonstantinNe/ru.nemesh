package ru.nemesh;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Send {

    public static String checkOrg(String a, String b) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        Stream stream = list.stream();
        String c = null;
        String result = null;

        URL url = new URL("https://core.telegram.org/bots/api/egr?req=" + a + "&key=" + b);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try {
            OutputStream output = connection.getOutputStream();
            PrintStream sender = new PrintStream(output);
            sender.println(a);
        } catch (ConnectException e) {
            System.out.println(e.getMessage());
        }

        try {
            InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            while (reader.ready()) {

                c = reader.readLine();
                //        result = Check.getCheckjson(c);     //обратить
                //        return result;                      //обратить
                return c;                            //убрать
            }
        } catch (ConnectException e) {
            System.out.println(e.getMessage());
        }
        return result;
        //return c;

        //  result = JsonConvert.convertJson(c);
    }
}


//        try (OutputStream output = connection.getOutputStream();
//             PrintStream sender = new PrintStream(output)) {
//            sender.println(a);
//        }
//
//        try (InputStream input = connection.getInputStream();
//             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
//            while (reader.ready()) {
//                //           System.out.println(reader.readLine());
//                c = reader.readLine();
//            //  result = JsonConvert.convertJson(c);
//                return c;
//            }
//        }
//        return c;
//    }
//}





//        URL url = new URL("https://api-fns.ru/api/egr");    //Создаем объект URL с путем к странице
//        URLConnection connection = url.openConnection();   //  Создаем двустороннее соединение

// получили поток для отправки данных
//     OutputStream output = connection.getOutputStream();   //Получаем поток вывода
//     output.write(Integer.parseInt(a));
//      output.write(Integer.parseInt()); // отправляем данные               //Выводим в него данные
//      output.write(Integer.parseInt()); // отправляем данные               //Выводим в него данные

// получили поток для чтения данных
//        InputStream input = connection.getInputStream();
//        String data = String.valueOf(input.read()); // читаем данные                // Читаем из него данные
//        String b = JsonConvert.convertString(data);




//        int serverPort = 8000;
//        HttpServer server = HttpServer.create(new InetSocketAddress(serverPort), 0);
//        server.createContext("/api/hello", (exchange -> {
//            String respText = "Hello!";
//            exchange.sendResponseHeaders(200, respText.getBytes().length);
//            OutputStream output = exchange.getResponseBody();
//            output.write(respText.getBytes());
//            output.flush();
//            exchange.close();
//        }));
//        server.setExecutor(null); // creates a default executor
//        server.start();

///https://api-fns.ru/api/egr
/// API: Метод egr
/// поле 1  req *
/// поле 2  key *
//return serverPort;
//    }
//}


//    URL url = new URL("http://httpbin.org/post");
//    URLConnection conn = url.openConnection();
//        conn.setDoOutput(true);
//                conn.setDoInput(true);
//                try (OutputStream outputStream = conn.getOutputStream();
//                PrintStream sender = new PrintStream(outputStream) )
//                {
//
//                sender.println();
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
//
//                byte[] buffer = new byte[0];
//                try (InputStream inputStream = conn.getInputStream();
//                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)))
//                {
//                while (reader.ready())
//                System.out.println(reader.readLine());
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
//                String string = new String(buffer);
//                System.out.println(string);