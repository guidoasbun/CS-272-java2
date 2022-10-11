package Oct6Stack.LabActivityStacks;

// Programmer: Guido Asbun

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MachineCodeGenerator
{
    // Object Creation
    Stack<String> machineCommandStack;

    // Constructors
    public MachineCodeGenerator()
    {
        machineCommandStack = new Stack<>();
    }

    public MachineCodeGenerator(String filename) throws FileNotFoundException
    {
        machineCommandStack = new Stack<>();
        Scanner fileInput = new Scanner(new File(filename));
        while (fileInput.hasNext())
        {
            String command = fileInput.nextLine();
            machineCommandStack.push(command);
        }

        fileInput.close();
    }

    // Instance Methods
    public void addCommand(String command)
    {
        // Could also use linked list .contains() method
        ArrayList<String> commandList = new ArrayList<>();
        commandList.add("G00");
        commandList.add("G02");
        commandList.add("G03");
        commandList.add("G40");
        commandList.add("G41");
        commandList.add("G42");
        commandList.add("M03");
        commandList.add("M04");
        commandList.add("M06");
        commandList.add("M08");
        commandList.add("M09");
        commandList.add("M00");

        if (!commandList.contains(command))
        {
            throw new IllegalArgumentException("Invalid Command");
        }
        else
        {
            machineCommandStack.push(command);
        }
    }

    public String undo()
    {
        if (machineCommandStack.empty())
        {
            throw new IllegalArgumentException("Can Not Undo Because No Valid Command in the Machine Code Generator");
        }
        else
        {
            return machineCommandStack.pop();
        }
    }

    public String showLastValidCommand()
    {
        if(machineCommandStack.empty())
        {
            throw new IllegalArgumentException("Can Not Show Last Valid Command Because No Valid Command in the Machine Code Generator");
        }
        else
        {
            return machineCommandStack.peek();
        }
    }

    public int saveCommands(String filename) throws FileNotFoundException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        int commandsSaved = 0;

        while (!machineCommandStack.empty())
        {
            fileWriter.println(machineCommandStack.pop());
            commandsSaved++;
        }
        fileWriter.close();
        return commandsSaved;
    }

    public int resetMachineCodeGenerator()
    {
        int commandsRemoved = 0;
        while (!machineCommandStack.empty())
        {
            machineCommandStack.pop();
            commandsRemoved++;
        }
        return commandsRemoved;
    }
}
