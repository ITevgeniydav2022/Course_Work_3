package me.davydovep.course_work_3.model;

import org.springframework.lang.Nullable;

public enum Color {

    RED,
    BLACK,
    GRAY,
    WHITE,
    BLUE;

    @Nullable
    public static Color parse(String color) {
        for (Color c: values()) {
            if (c.name().equals(color)) {
                return c;
            }
        }
        return null;
    }

}
