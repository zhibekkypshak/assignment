[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/dNGVz-yX)
# oop-assignment-02

Inheritance, Polymorphism and Abstraction

## Task 1: Shape, Circle, Rectangle (3 points)

+ Create a package named `task1`.
+ Design a class named `Shape` inside the package `task1` to represent a geometrical 2D shape. The class contains:
  + `color` field of type `String` with its getter and setter methods;
  + `filled` field of type `boolean` that represents if the object is filled, with its getter and setter methods;
  + `dateCreated` field of type `java.util.Date`, with the getter only;
  + a no-arg constructor that constructs a not `filled` and `"Black"` shape with `dateCreated` set to the current date;
  + a 2-arg constructor to initialize the `color` and the `filled`, that sets `dateCreated` to the current date;
  + overridden `toString()` method that returns a string description of the shape;
  + `getType()` methods that returns `"Shape"` string.
+ Design a class name `Circle` that inherits from the `Shape` class and additionally defines the following fields and methods:
  + `radius` field of type `double` with accessors methods;
  + a no-arg constructor that constructs a not `filled` and `"Green"` circle with `dateCreated` set to the current date;
  + a 3-arg constructor to initialize the `color`, the `filled` and the `radius`, that sets `dateCreated` to the current date;
  + `getArea()` method returns the area of this circle;
  + `getPerimiter()` method that returns the perimeter of this circle;
  + overridden `toString()` method that returns a string description of the circle;
  + overridden `getType()` methods that returns `"Circle"` string.
+ Design a class named `Rectangle` that inherits from the `Shape` class and additionally defines the following fields and methods:
  + `height` and `width` of type `double` with accessors methods;
  + a no-arg constructor that constructs a not `filled` and `"Black"` shape with `dateCreated` set to the current date;
  + a 4-arg constructor to initialize the `height`, the `width`, the `color` and the `filled`, that sets `dateCreated` to the current date;
  + `getArea()` method returns the area of this rectangle;
  + `getPerimiter()` method that returns the perimeter of this rectangle;
  + overridden `toString()` method that returns a string description of the rectangle;
  + overridden `getType()` methods that returns `"Circle"` string.
+ Create a separate class `TestTask1` outside the package with the static `main` method to test all the classes in this task:
  + create an array of type `Shape` that contains random shapes, circles and rectangles;
    + (hint: you may use `java.util.Random` class);
  + print the area for each circle, the perimeter for each rectangle and the color for each shape which is not a circle or a rectangle;
    + (hint: you may use down-casting carefully).

## Task 2: PlanarShape, Circle, Rectangle, Comparator<PlanarShape> (3 points)

+ Create a package named `task2`.
+ Design an **abstract** class named `PlanarShape` inside the package `task2` to represent an abstract geometrical shape on a 2D plane.
+ The `PlanarShape` should inherit from `task1.Shape` and should additionally contain:
  + the `x` and `y` coordinates of type `double` with accessors and modifiers;
  + a no-arg constructor that initialized the object with reasonable default values;
  + a constructor that accepts all the values for all the fields and initializes the object with the values;
  + overridden `toString()` method that returns a string description of the planar shape;
  + abstract method `getArea()` that returns a `double` value;
  + abstract method `getPerimeter()` that returns a `double` value;
  + overridden `getType()` methods that returns `"PlanarShape"` string.
+ Design a class named `task2.Circle` that extends `PlanarShape` and should contain the following fields and methods:
  + inherited `x` and `y` fields of type `double` that represent the center of the circle;
  + `radius` field of type `double`;
  + implementations of all the abstract methods;
  + all necessary getters and setters and constructors;
  + overridden `toString()` and `getType()`;
+ Design a class named `task2.Rectangle` that extends `PlanarShape` and should contain the following fields and methods:
  + inherited `x` and `y` fields of type `double` that represent the center of rectangle;
  + `height` and `width` fields of type `double`;
  + implementations of all the abstract methods;
  + all necessary getters and setters and constructors;
  + overridden `toString()` and `getType()`;
+ Create a separate class `TestTask2` outside the package with the static `main` method to test all the classes in this task:
  + create an `ArrayList` of planar shapes and populate it with some random circles and rectangles and use it the next subtasks;
  + create a small class that implements `Comparator<PlanarShape>` interface and use it to find the planar shape with the largest perimeter;
  + create a small class that implements `Comparator<PlanarShape>` interface and use it to find the planar shape with the smallest perimeter;
  + create a small class that implements `Comparator<PlanarShape>` interface and use it to sort the shapes in ascending order according to their distance from the origin (i.e. point `(0,0)`).

## Task 3: Rational extends Number implement Comparable<Rational> (3 points)

+ Create a package named `task3`.
+ Design a class named `Rational` of rational numbers that extends the abstract class `java.lang.Number` and implements `Comparable<Rational>`.
+ The class `Rational` should additionally contain the following fields and methods:
  + `numerator` and `denominator` fields of type `long`;
  + all necessary constructors and accessor methods;
  + methods `add()` that accepts a rational number and returns the sum of this rational and the one provided as the argument;
  + methods `subtract()` that accepts a rational number and returns the difference of this rational and the one provided as the argument;
  + methods `multiply()` that accepts a rational number and returns the product of this rational and the one provided as the argument;
  + methods `divide()` that accepts a rational number and returns the division of this rational and the one provided as the argument.
+ Create a separate class `TestTask3` outside the package with the static `main` method to test the `Rational` classes:
  + create an array of `100` rational numbers and populate it with some random rational numbers and use it the next subtasks;
  + sort the array in ascending order;
  + find the sum and product of all numbers;
  + find the difference and division between the largest and the smallest rational numbers.
