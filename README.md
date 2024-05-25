# Grade Calculator

This Java program calculates the grade of a student based on their marks relative to the class's mean and variance.

## How to Use

1. **Input Mean and Variance:**
   - When prompted, enter the mean (average) marks for the subject.
   - Enter the variance of marks for the subject.

2. **Input Highest Marks:**
   - Enter the highest marks obtained in the class.

3. **Input Student's Marks:**
   - Enter the student's marks.

4. **View Grade:**
   - The program will calculate the grade based on the entered data and display it.

## Grade Calculation

The grade is determined based on the student's marks relative to the class's highest marks and the calculated z-score.

- **Z-Score Calculation:** The z-score measures how many standard deviations a data point is from the mean. It's calculated using the formula:
  \[ Z = \frac{(X - \mu)}{\sigma} \]
  Where:
  - \( X \) is the student's marks.
  - \( \mu \) is the mean of the class.
  - \( \sigma \) is the standard deviation of the class.

- **Grade Mapping:** The z-score is mapped to a grade according to the following criteria:
  - If the student's marks are less than 35% of the highest marks, the grade is "F".
  - If the student's marks are more than 50% of the highest marks, the grade is determined by the z-score using the standard grading scale.

## Grade Scale

The program uses the following grade scale based on the z-score:

- A⁺: z-score ≥ 1.282
- A: z-score ≥ 0.841
- B⁺: z-score ≥ 0.675
- B: z-score ≥ 0.524
- C⁺: z-score ≥ 0.385
- C: z-score ≥ 0.253
- D: z-score ≥ 0.126
- E: Otherwise

## Example

Here's an example run of the program:

```
Enter the mean (average) marks for the subject: 75
Enter the variance of marks for the subject: 100
Enter the highest marks obtained in the class: 100
Enter the student's marks: 80
Grade: A⁺
```

In this example, the mean marks are 75, the variance is 100, the highest marks in the class are 100, and the student's marks are 80, resulting in a grade of A⁺.

## Author

This program was authored by Sambhav Mahajan.
