package ru.nemesh;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    /**
     * ћетод дл€ приема сообщений.
     * @param update —одержит сообщение от пользовател€.
     */

    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        sendMsg(update.getMessage().getChatId().toString(), message);
    }

    /**
     * ћетод дл€ настройки сообщени€ и его отправки.
     * @param chatId id чата
     * @param s —трока, которую необходимот отправить в качестве сообщени€.
     */
    public synchronized void sendMsg(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            log.log(Level.SEVERE, "Exception: ", e.toString());
        }
    }

    /**
     * ћетод возвращает им€ бота, указанное при регистрации.
     * @return им€ бота
     */
    public String getBotUsername() {
        return ФBotNameФ;
    }

    /**
     * ћетод возвращает token бота дл€ св€зи с сервером Telegram
     * @return token дл€ бота
     */
    @Override
    public String getBotToken() {
        return ФBotTokenФ;
    }

    public void onUpdateReceived(Update update) {

    }
}

