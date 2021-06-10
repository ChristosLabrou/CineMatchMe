package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;

import com.cometchat.pro.constants.CometChatConstants;
import com.cometchat.pro.core.CometChat;
import com.cometchat.pro.exceptions.CometChatException;
import com.cometchat.pro.models.TextMessage;
import com.google.android.gms.common.internal.Constants;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.messages.MessageInput;
import com.stfalcon.chatkit.messages.MessagesListAdapter;

import models.MessageWrapper;

public class ChatActivity extends AppCompatActivity {

    private String groupid;
    private MessagesListAdapter<IMessage> adapter;

    public static void start(Context context, String groupId){
        Intent starter = new Intent(context, chatActivity.class);
        starter.putExtra(Constant.GROUP_ID,groupID);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Intent intent = getIntent();
        if (intent!=null){
            groupId = intent.getStringExtra(Constants.GROUP_ID);
        }
        initViews();

    }

    private void initViews() {
        MessageInput inputView = findViewById(R.id.input);
        MessageInput messagesList = findViewById(R.id.messagesList);
        inputView.setInputListener(input -> {
            sendMessage(input.toString());
            return true;
        });
        String senderId = CometChat.getLoggedInUser().getUid();
        ImageLoader imageLoader = (imageView, url, payload) -> Picasso.get().load(url).into(imageView);
        adapter = new MessagesListAdapter<>(CometChat.getLoggedInUser().getUid(), imageLoader);

        MessageListAdapter<MessageWrapper> adapter = new MessagesListAdapter<>(senderId,imageLoader);
        messagesList.setAdapter(adapter);
    }

    private void sendMessage(String message) {
        TextMessage textMessage = new TextMessage(groupid, messageText, CometChatConstants.MESSAGE_TYPE_TEXT, CometChatConstants.RECEIVER_TYPE_GROUP);

        CometChat.sendMessage(textMessage, new CometChat.CallbackListener<TextMessage>() {
            @Override
            public void onSuccess(TextMessage textMessage) {
                addMessage(textMessage);
            }

            @Override
            public void onError(CometChatException e) {

            }
        });
    }
        private void addMessage(TextMessage textMessage) {
            adapter.addToStart(new MessageWrapper(textMessage), scroll: true);
        }

    }
}