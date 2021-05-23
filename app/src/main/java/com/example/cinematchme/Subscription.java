package com.example.cinematchme;

public class Subscription {
    int id;
    float price;
    enum tier {
        free,
        lite,
        premium
    }
    int duration_left;
}
