# Library System

A small Java console program I built to practice object-oriented programming. It models books in a library. Books can be borrowed and returned, and the program prints out what's available and what isn't.

I made this after working through the Java OOP section on W3Schools, and I only used what that section covers. No `Scanner`, no loops, no collections. The books are hard-coded in `main` and the program runs once from top to bottom.

## What it does

- Creates three books with a title, author and publication year
- Lets a book be created without a year (it falls back to a default)
- Tracks whether each book is currently available
- Refuses to borrow a book that's already borrowed
- Refuses to return a book that was never borrowed
- Prints a summary of each book

`Main` borrows a book, tries to borrow the same one again (which fails), returns it, then prints the status of every book.

## How to run it

You need a JDK installed (any recent version is fine).

```bash
cd src
javac Main.java Books/*.java
java Main
```

Or just open the folder in IntelliJ and run `Main`.

## What I practiced

| Topic | Where it shows up |
|---|---|
| OOP | The whole project is a book modeled as an object instead of a pile of loose variables |
| Classes and objects | One `Book` class, three `Book` objects created in `Main` |
| Class attributes | Title, author, publication year and availability |
| Class methods | Borrowing, returning and printing a book's info |
| Constructors | Two overloaded constructors, one with a year and one without |
| `this` keyword | Used in the constructors and setters to tell parameters apart from attributes |
| Modifiers | Attributes are `private`, everything the outside needs is `public`, and getters and setters control access |

## Project structure

```
LibrarySystem/
└── src/
    ├── Main.java
    └── Books/
        └── Book.java
```

## Things I got wrong the first time

My first version had three separate classes (`Book1`, `Book2`, `Book3`) that were copies of each other. That defeats the point of a class, since you write it once and make as many objects as you want from it. I merged them into a single `Book` class.

I also set everything through setters at first and never used a constructor. Now the book gets its values when it's created.

## What's next

- Add a `Member` class that can borrow and give back books
- Make it interactive with `Scanner` so the user can type in what they want to do
- Look up a book by title instead of hard-coding each call
