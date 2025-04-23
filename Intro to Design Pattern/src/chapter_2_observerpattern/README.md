## Observer Pattern

> [!NOTE]
> Publishers + Subscribers = Observer Pattern

**The Observer Pattern** defines a one-to-many
dependency between objects so that when one
object changes state, all of its dependents are
notified and updated automatically.

![ObserverPattern.png](../resources/chapter_2_observerpattern/ObserverPattern.png)

#### The power of Loose Coupling
- When two objects are loosely coupled, they can interact,
but have very little knowledge of each other.
- The Observer Pattern provides an object design where
subjects and observers are loosely coupled.
  
**Why?**
- The only thing the subject knows about an observer is that it
  implements a certain interface.
- We can add new observers at any time.
- We never need to modify the subject to add new types of observers.
- We can reuse subjects or observers independently of each other.
- Changes to either the subject or an observer will not affect the other.

> [!IMPORTANT]
**Design Principle**\
Strive for loosely coupled designs
between objects that interact.


- The Observer Pattern defines a one-to-many relationship between objects.
- Subjects, or as we also know them, Observables, update Observers using a common interface.
- Observers are loosely coupled in that the Observable knows nothing about them, 
other than that they implement the Observer Interface.
- You can push or pull the data from Observable when using the pattern(pull is  considered more correct).
- Don't depend on specific order of notification for your Observers.
- Swing makes heavy use of the Observer Pattern, as do many GUI frameworks.

![Design Principle challenge.png](../resources/chapter_2_observerpattern/Design%20Principle%20challenge.png)
