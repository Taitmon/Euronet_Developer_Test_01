package com.company;

import java.io.File;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter desired file pathname and press enter." +
                "\n" + "Example: C:\\folder\\folders\\filename.txt");

        String pathname = input.nextLine();
        // takes user input file path ^^^
        File file = new File(pathname);
        //   File path goes here ^^^

        String fileData = "";

        try
        {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine())
            {
                fileData = fileReader.nextLine();
            }
        } catch (Exception except)
        {
            System.out.println("Program Error: " + except.getMessage());
        }

        int min = 0;
        int max = 10;
        int streetAddressLength;
        int hobbiesLength;

        while (max < fileData.length())
        {
            Record record = new Record();
            String hobbies = "";

            record.setFirstName(fileData.substring(min, max).trim());

            if (record.getFirstName().matches("^[ A-Za-z]+$"))
            {
                System.out.println("First Name: " + record.getFirstName());
            } else if (record.getFirstName().length() < 1)
            {
                System.out.println("First Name: N/A");
            } else
            {
                System.out.println("First Name: Error detected. " + record.getFirstName() + " is not a valid first name.");
            }

            min = min + 10;
            max = max + 10;
            record.setMiddleName(fileData.substring(min, max).trim());

            if (record.getMiddleName().matches("^[ A-Za-z]+$"))
            {
                System.out.println("Middle Name: " + record.getMiddleName());
            } else if (record.getMiddleName().length() < 1)
            {
                System.out.println("Middle Name: N/A");
            } else
            {
                System.out.println("Middle Name: Error detected. " + record.getMiddleName() + " is not a valid middle name.");
            }


            min = min + 10;
            max = max + 30;
            record.setLastName(fileData.substring(min, max).trim());

            if (record.getLastName().matches("^[ A-Za-z]+$"))
            {
                System.out.println("Last Name: " + record.getLastName());
            } else if (record.getLastName().length() < 1)
            {
                System.out.println("Last Name: N/A");
            } else
            {
                System.out.println("Last Name: Error detected. " + record.getLastName() + " is not a valid Last name.");
            }

            min = min + 30;
            max = max + 3;
            streetAddressLength = Integer.parseInt(fileData.substring(min, max));
            min = min + 3;
            max = max + streetAddressLength;

            record.setStreetAddress(fileData.substring(min, max));

            if (record.getStreetAddress().matches("^[a-zA-Z0-9 #./,]+$"))
            {
                System.out.println("Street Address: " + record.getStreetAddress());
            } else if (record.getStreetAddress().length() < 1)
            {
                System.out.println("Street Address: N/A");
            } else
            {
                System.out.println("Street Address: ERROR detected. " + record.getStreetAddress() + " is not a valid address.");
            }

            min = min + streetAddressLength;
            max = max + 1;

            hobbiesLength = Integer.parseInt(fileData.substring(min, max));
            min = min + 1;
            max = max + 10;


            for (int i = 1; i <= hobbiesLength; i++)
            {
                record.setHobbies(fileData.substring(min, max));

                min = min + 10;
                max = max + 10;
            }

            System.out.print("Hobbies:  ");
            if (record.getHobbies().size() > 0)

            {
                for (int i = 0; i < record.getHobbies().size(); i++)
                {
                    if (record.getHobbyName(i).matches("^[ A-Za-z ,]+$"))
                    {
                        System.out.print(record.getHobbyName(i) + " ");
                    } else
                    {
                        System.out.println("ERROR Detected  " + record.getHobbyName(i) + " is invalid.");
                    }
                }
            } else
            {
                System.out.print("N/A");
            }
            System.out.println("\n");
        }
    }
}
