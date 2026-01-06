package eapli.base.studentCourseManagment.domain;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {

    public static boolean checkIfFileIsValid(File file) throws IOException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        if (in.readLine().contains(",") || in.readLine().contains("\"")) {
            return true;
        }
        return false;
    }

    public ArrayList<String> newStudentFromCSV(File file) throws IOException{
        FileInputStream fileInputStream;
        Scanner in;
        ArrayList<String> arrayList = new ArrayList<>();

        if (checkIfFileIsValid(file)) {
            fileInputStream = new FileInputStream(file);
            in = new Scanner(fileInputStream, StandardCharsets.UTF_8);
            try {
                while (in.hasNextLine()) {

                    arrayList.add(in.nextLine());
                }
            } finally {
                fileInputStream.close();
                in.close();
            }
        }
        return arrayList;
    }
}
