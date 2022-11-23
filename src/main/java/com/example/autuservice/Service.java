package com.example.autuservice;

import java.time.LocalDate;
import java.time.LocalTime;

public class Service {
    LocalDate date;
    LocalTime time;
    Type type;

    public Service(LocalDate date, LocalTime time, Type type) {
        this.date = date;
        this.time = time;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        PUMP_WHEELS("Накачати колеса"),
        CHECK_CAR("Повірка стану авто"),
        INTERIOR_TRIM("Обшивка салону"),
        AUDIO_SYSTEM("Звуковасистема"),
        PAINTING("Покраска машини або обклейка пльонки");

        private final String friendlyName;

        Type(String friendlyName) {
            this.friendlyName = friendlyName;
        }

        public String getFriendlyName() {
            return friendlyName;
        }
    }
}
