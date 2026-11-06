# Tutorial Mod

A custom Minecraft mod built using **Java, Fabric, and Gradle**, introducing new resources, ores, blocks, and crafting mechanics to Minecraft.

## 📌 Project Information

| Property | Details |
|---|---|
| Mod Name | Tutorial Mod |
| Mod ID | `tutorialmod` |
| Minecraft Version | 1.21.1 |
| Mod Loader | Fabric |
| Language | Java |
| Build System | Gradle |
| IDE | IntelliJ IDEA |

## ✨ Features

- **Ruby Items:** Introduces custom Ruby-related items.
- **Ruby Ore:** Adds custom ore blocks to the game.
- **Custom Blocks:** Introduces new placeable blocks.
- **Crafting Recipes:** Custom recipes for crafting new items and blocks.
- **Loot Tables:** Configurable block drops and item quantities.

## 📸 Screenshots

### Items
<!-- Add screenshots of your custom items here -->

![Custom Items](docs/images/items.png)

### Blocks and Ores
<!-- Add screenshots of your custom blocks and ores here -->

![Custom Blocks](docs/images/blocks.png)

### Crafting Recipes
<!-- Add screenshots of crafting recipes here -->

![Crafting Recipes](docs/images/recipes.png)

### In-game Showcase
<!-- Add an in-game screenshot here -->

![In-game Showcase](docs/images/gameplay.png)

## 🛠️ Installation

1. Install Minecraft Java Edition 1.21.1.
2. Install Fabric Loader for Minecraft 1.21.1.
3. Install any required dependencies, including Fabric API if required by the mod.
4. Download the mod JAR from the project's GitHub Releases.
5. Place the JAR file inside your Minecraft `mods` folder.
6. Launch Minecraft using the Fabric profile.

## 💻 Building from Source

### Prerequisites
- Java 21
- Git
- IntelliJ IDEA (recommended)

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/YOUR_USERNAME/tutorialmod.git
   ```

2. Navigate to the project directory:

   ```bash
   cd tutorialmod
   ```

3. Build the mod:

   **Windows:**
   ```bash
   gradlew.bat build
   ```

   **Linux/macOS:**
   ```bash
   ./gradlew build
   ```

4. Find the generated JAR file in:

   ```text
   build/libs/
   ```

## 📂 Project Structure

```text
tutorialmod/
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── gradle/
├── build.gradle
├── gradle.properties
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md
```

## 🎯 Project Goals

This project was developed as a hands-on learning experience to understand Java-based Minecraft mod development, object-oriented programming, game mechanics, and the Fabric modding framework.

## 📜 License

License information to be added.

---

**Developed with Java and Fabric.**