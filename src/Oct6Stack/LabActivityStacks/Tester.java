package Oct6Stack.LabActivityStacks;

import java.io.FileNotFoundException;

public class Tester
{
    public static void main(String[] args) throws FileNotFoundException
    {
        MachineCodeGenerator machineCodeGenerator = new MachineCodeGenerator("src/Oct6Stack/LabActivityStacks/MachineCommands1.txt");
        machineCodeGenerator.printStack();
    }

}
