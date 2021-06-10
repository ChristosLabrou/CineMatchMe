package com.example.myapplication.models;

import com.cometchat.pro.models.TextMessage;
import com.example.myapplication.models.UserWrapper;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;
import com.example.myapplication.models.UserWrapper;
import java.util.Date;

public class MessageWrapper implements IMessage {
    private TextMessage message;

    public MessageWrapper(TextMessage message) {
        this.message = message;
    }

    @Override
    public String getId() {
        return message.getMuid();
    }

    @Override
    public String getText() {
        return message.getText();
    }

    @Override
    public IUser getUser() {
        return new UserWrapper(message.getSender());
    }

    @Override
    public Date getCreatedAt() {
        // * 1000 to get milliseconds
        return new Date(message.getSentAt() * 1000);
    }
}
