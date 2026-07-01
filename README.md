# Farm Route Simulator

## Overview

The Farm Route Simulator is a Java application that models the daily workflow of an agricultural service operation. The project simulates farms, fields, routes, and equipment to recreate the logistics involved in planning and completing daily work assignments.

This project started as a way to improve my Java skills, but it quickly turned into something I could actually use at work. Instead of building another generic practice application, I wanted to model the workflow I deal with every day and create a tool that could help answer real planning questions before a job even begins.

By entering real job information, the simulator can help estimate things like:

* How long a job is likely to take.
* How far our crew should be able to get during the day.
* The total gallons required for each field and the entire job.
* How truck capacity and the number of trucks affect productivity.
* The impact of travel routes and driving distance between farms.
* Estimated loading, travel, and working time throughout the day.
* How changes in equipment or logistics influence the overall schedule.

Building a simulator around a real-world process has made the project much more meaningful than a typical practice program. Every new feature I add not only expands my understanding of Java and object-oriented programming, but also moves the simulator closer to becoming a practical planning tool that I can use on the job.


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
* Git & GitHub
* Pending.... 
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
javac Main.java
```

Run the application:

```bash
java Main
```

---

