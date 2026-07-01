# Farm Route Simulator

## Overview

The Farm Route Simulator is a Java application that models the daily workflow of an agricultural service operation. The project simulates farms, fields, routes, and equipment to recreate the logistics involved in planning and completing daily work assignments.

Rather than relying on hardcoded scenarios, the simulator generates realistic conditions through object-oriented design and randomized values where appropriate. This allows each simulation to produce a different set of routes, field assignments, and operational conditions.

This project is primarily a learning exercise focused on applying object-oriented programming principles while modeling a real-world system.

---

## Features

* Object-oriented design using multiple interacting classes
* Randomized simulation data
* Farm and field generation
* Route creation between locations
* Equipment (rig) assignment
* Console-based simulation output
* Expandable architecture for future features

---

## Technologies

* Java
* Object-Oriented Programming (OOP)
* Random number generation
* Collections and arrays
* Git & GitHub

---

## Project Structure

```text
src/
├── Main.java
├── classes/
│   ├── farm/
│   ├── field/
│   ├── rig/
│   └── route/
```

Each class models a component of the simulation:

* **Farm** – Represents an individual farm and its properties.
* **Field** – Represents fields associated with farms.
* **Rig** – Represents the equipment assigned to complete work.
* **Route** – Represents travel between locations.

---

## Goals

The primary goals of this project are to:

* Practice object-oriented software design
* Model a real-world workflow through classes and relationships
* Improve Java programming skills
* Strengthen understanding of constructors, encapsulation, arrays, and object interactions
* Build a realistic simulation that can continue growing over time

---

## Future Improvements

Planned enhancements include:

* Dynamic route optimization
* Worker scheduling
* Equipment availability tracking
* Fuel usage simulation
* Travel time calculations
* Weather effects
* Job priority system
* Reporting and simulation statistics
* Persistent data storage

---

## Running the Project

Compile the project:

```bash
javac Main.java classes/**/*.java
```

Run the application:

```bash
java Main
```

---

## Why I Built This

This simulator is based on the workflow of my own job. I wanted to recreate the daily planning process in software while improving my Java skills and gaining experience designing larger object-oriented applications. Building a simulation around a real-world process has been an effective way to practice software architecture, problem-solving, and object modeling beyond small classroom exercises.
