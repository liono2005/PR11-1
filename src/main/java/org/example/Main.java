package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class FileStatistics {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите путь к текстовому файлу: ");
                String filePath = scanner.nextLine();
                scanner.close();

                try {
                    File file = new File(filePath);
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    int lineCount = 0;
                    int totalCharCount = 0;
                    int totalWordCount = 0;
                    String line;

                    while ((line = bufferedReader.readLine()) != null) {
                        lineCount++;
                        int charCount = line.length();
                        int wordCount = line.split("\\s+").length;
                        totalCharCount += charCount;
                        totalWordCount += wordCount;

                        System.out.println("Строка " + lineCount + ":");
                        System.out.println("Количество символов: " + charCount);
                        System.out.println("Количество слов: " + wordCount);
                        System.out.println();
                    }

                    System.out.println("Общее количество строк: " + lineCount);
                    System.out.println("Общее количество символов: " + totalCharCount);
                    System.out.println("Общее количество слов: " + totalWordCount);

                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при чтении файла.");
                }
    }
}}}