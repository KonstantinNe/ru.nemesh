package ru.nemesh;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    /**
     * ����� ��� ������ ���������.
     * @param update �������� ��������� �� ������������.
     */

    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        sendMsg(update.getMessage().getChatId().toString(), message);
    }

    /**
     * ����� ��� ��������� ��������� � ��� ��������.
     * @param chatId id ����
     * @param s ������, ������� ����������� ��������� � �������� ���������.
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
     * ����� ���������� ��� ����, ��������� ��� �����������.
     * @return ��� ����
     */
    public String getBotUsername() {
        return �BotName�;
    }

    /**
     * ����� ���������� token ���� ��� ����� � �������� Telegram
     * @return token ��� ����
     */
    @Override
    public String getBotToken() {
        return �BotToken�;
    }

    public void onUpdateReceived(Update update) {

    }
}

