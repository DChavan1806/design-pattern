package design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Step 1: Create the Component
interface FileSystemComponent {
    void showDetails();
}

// Step 2: Create Leaf classes
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Step 3: Create Composite class
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

// Step 4: Demonstrate the Composite Pattern
public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // Create directories
        Directory directory1 = new Directory("Directory1");
        Directory directory2 = new Directory("Directory2");

        // Add files to directories
        directory1.addComponent(file1);
        directory1.addComponent(file2);
        directory2.addComponent(file3);
        directory2.addComponent(directory1);  // Nested directory

        // Display directory contents
        directory2.showDetails();
    }
}

