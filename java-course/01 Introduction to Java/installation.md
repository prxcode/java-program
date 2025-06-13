
# Java Development Environment Installation Guide

This guide will help you set up a Java development environment by installing the Java Development Kit (JDK) and an Integrated Development Environment (IDE) of your choice.

## Prerequisites

* A computer running **Windows**, **macOS**, or **Linux**
* Internet access
* Administrative privileges on the machine

---

## Step 1: Install Java JDK

### 🔗 Download JDK

1. Go to the official Oracle JDK page:
   [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)

2. Select the latest **Java SE** version.

3. Choose the installer for your operating system:

   * Windows: `.exe` installer
   * macOS: `.dmg` installer
   * Linux: `.rpm` or `.tar.gz`

### 🛠️ Install JDK

#### Windows

1. Run the downloaded `.exe` file.
2. Follow the installation prompts and complete the setup.
3. (Optional) Add JDK to `PATH`:

   * Open **Environment Variables**.
   * Add the `bin` folder of the JDK (e.g., `C:\Program Files\Java\jdk-XX\bin`) to the `Path` variable.

#### macOS

1. Open the `.dmg` file and follow the installation instructions.
2. Verify with:

   ```bash
   java -version
   ```

#### Linux

1. Use your distribution’s package manager, or extract the `.tar.gz` manually.

   ```bash
   sudo apt install openjdk-XX-jdk  # for Debian/Ubuntu
   ```
2. Verify installation:

   ```bash
   java -version
   ```

---

## Step 2: Install an IDE

### Option 1: IntelliJ IDEA

1. Download from: [https://www.jetbrains.com/idea/download](https://www.jetbrains.com/idea/download)
2. Choose **Community Edition** (free).
3. Install it using the installer for your OS.
4. Launch IntelliJ and configure the JDK:

   * Go to **File > Project Structure > SDKs**.
   * Click **+** to add a new JDK and select your JDK installation path.

### Option 2: Eclipse

1. Download from: [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)
2. Choose **Eclipse IDE for Java Developers**.
3. Run the installer and complete the setup.
4. Launch Eclipse and configure the JDK:

   * Go to **Preferences > Java > Installed JREs**.
   * Add your JDK directory.

---

## Step 3: Verify Setup

1. Create a simple Java file:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

2. Run it in your IDE or using the terminal:

   ```bash
   javac HelloWorld.java
   java HelloWorld
   ```

---

## ✅ You're Ready!

You now have a working Java development environment. Start building Java applications using your preferred IDE.
