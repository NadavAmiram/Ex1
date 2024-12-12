# Ex1

## Overview
This project includes utility methods for number conversion and validation. It provides functionality for converting numbers between decimal and other bases (2-16), checking if a number string is valid, and comparing or analyzing numbers in different bases.

## Features

1. **Number Conversion**
   - Convert an integer to a string representation in a given base.
   - Convert a string representation of a number in a specific base to a decimal integer.

2. **Validation**
   - Check if a string is a valid number representation for a given base.
   - Ensure that numbers conform to specific formats.

3. **Comparison and Analysis**
   - Compare two numbers in different bases for equality.
   - Find the index of the largest number in an array of numbers represented in various bases.

4. **Helper Functions**
   - Convert characters to their numerical equivalents.
   - Validate the structure and legality of number strings.

## Classes and Methods

### `Ex1.Java`

#### Conversion Methods
- `int2Number(int num, int base)`: Converts a decimal number to a string representation in the specified base.
- `number2Int(String num)`: Converts a number string in a specified base to its decimal equivalent.

#### Validation Methods
- `isNumber(String a)`: Checks if the input string is a valid number in the specified format.
- `checkValid(String num, int base)`: Verifies that all digits in the number are valid for the given base.

#### Utility Methods
- `equals(String n1, String n2)`: Checks if two numbers in different bases have the same value.
- `maxIndex(String[] arr)`: Returns the index of the largest number in an array of number strings.
- `returnCharInInt(char base)`: Converts a character representing a number or base to its integer equivalent.
- `returnStringInString(String base)`: Converts a base representation string to its equivalent letter (e.g., `"16"` to `"G"`).

### `Ex1Test`

- `number2IntTest()`: Tests conversion of number strings to integers.
- `int2NumberTest()`: Tests conversion of integers to number strings.
- `isNumberTest()`: Tests validation of number strings.
- `equalsTest()`: Tests equality comparison between number strings.
- `maxIndexTest()`: Tests finding the maximum value index in an array.
- `returnCharInIntTest()`: Tests conversion of characters to integers.
- `checkValidTest()`: Tests validity checks for numbers based on their base.
- `computeNumberTest()`: Tests consistency of conversions and equality.
- `isBasisNumberTest()`: Tests validation for various correct and incorrect base-number strings.

## Notes
- Bases are limited to the range 2 to 16. Attempts to use unsupported bases will return default or error values.
- Negative numbers are not supported in some methods and will return empty strings.
- Strings are expected to follow the format `number-b-base` .


