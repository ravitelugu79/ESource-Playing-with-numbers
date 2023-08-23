# Project README

This project demonstrates the ability to extract numbers from arrays, find available numbers, and identify the largest prime number among them. The project is available in both Java (using Spring Boot) and Python, and includes a testing framework.

## Instructions

1. **Setup and Build:**
   - Clone or download the project.
   - Open the project in your preferred Integrated Development Environment (IDE).
   - Load, compile, and build the application.

2. **User Story 1 - Extract Available Numbers:**
   - Generate 3 arrays, each containing 15 random numbers from 0 to 50.
   - The service class provides a function to extract all numbers between 0 and 50 that are not present across all three arrays.
   - These extracted numbers are referred to as "available numbers."

3. **User Story 2 - Find Largest Prime Number:**
   - Check if the "available numbers" array contains any prime numbers.
   - Implement functionality to return the largest prime number in the array if present.

4. **Testing:**
   - The project includes JUnit (Java) or PyTest (Python) files for testing.
   - These tests demonstrate code coverage of the application logic.

5. **Execution:**
   - A main class method is provided to execute the service and display output.
   - The output includes:
     - The three generated arrays.
     - The array of "available numbers."
     - The largest prime number (if present).

6. **Dockerization:**
   - Build a Docker image from the compiled project.
   - Use the following commands:
     ```
     mvn clean package
     docker build -t app-1.0.0 .
     docker run app-1.0.0
     ```

7. **Running the Docker Image:**
   - After building and running the Docker image, view the output.

