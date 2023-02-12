package ru.clevertec;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyTask extends DefaultTask {
    @TaskAction
    public void resolveCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("This task was executed at " + dtf.format(now));
    }
}
