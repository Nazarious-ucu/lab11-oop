package ua.edu.ucu.apps.task2;

import lombok.Getter;
import lombok.Setter;


import java.util.List;

import com.mailjet.client.errors.MailjetException;

@Getter @Setter
public class MailBox {
    private List<MailInfo> infos;
    private String api;
    private String apikey;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws MailjetException {
        for (MailInfo information: infos) {
            MailSender.sendMail(information, api, apikey);
        }
    }
}
