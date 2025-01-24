# Circle Class and Test Program

This project implements a `Circle` class in Java and a `TestCircle` program to demonstrate its functionality. The `Circle` class provides methods to calculate the area, diameter, and circumference of a circle based on a user-provided radius. The `TestCircle` program allows users to input the radius and displays the results using the class methods.


## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Requirements](#requirements)
- [File Output](#file-output)
- [License](#license)
- [Important Note](#important-note)


## Features

- **Circle Class**: 

  - Encapsulates the circle's radius as a private field and uses a constant `PI` value
  
  - Provides:

      - A constructor to initialize the radius

      - A setter method to update the radius

      - Getter methods for:

           - Area

           - Diameter

           - Circumference

           - Current radius

    
- **TestCircle Program**: 

  - Accepts user input for the circle's radius

  - Uses the Circle class to calculate the area, diameter, and circumference
    
  - Displays the results formatted to three decimal places
      

## Usage

1. **Clone the files**:
   
   ```bash
   javac Circle.java TestCircle.java

2. **Run the program**:
   
   ```bash
   javac TestCircle
   
3. **Input the radius**:
   
   - When prompted, enter a numeric value for the circle's radius
   
4. **View results**:
   
   - The program will display the area, diameter, and circumference


## Code Structure

- **Circle.java**:
  
  - Defines the `Circle` class with fields, methods, and logic for calculations

- **TestCircle.java**:
  
   - A test program that:
     
           - Reads input from the user

           - Creates a `Circle` object

           - Outputs calculated properties of the circle
     

## Requirements

- **Python**:
  
  - Java Development Kit (JDK) 8 or later


## File Output

- **The program outputs**:

  - Circle area, diameter, and circumference

  - Formatted to three decimal places in the console
 

## License

This project is licensed under the MIT License. See the LICENSE file for details.


## Important Note

This project was created as part of a learning exercise and demonstrates basic Java programming concepts, including object-oriented design and user interaction.
