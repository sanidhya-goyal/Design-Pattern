### Using Java’s built-in

Java has built-in support
in several of its APIs. The most general is the
Observer interface and the Observable class in
the java.util package. 

These are quite similar
to our Subject and Observer interface, but give
you a lot of functionality out of the box. 

You can also implement either a push or pull style of
update to your observers.

![Java Built In.png](../weather_o_rama/resources/Java%20Built%20In.png)

####  For an Object to become an observer
Implement the Observer interface (java.util.Observer interface) and call addObserver() on any Observable object. 
Likewise, to remove an observer just call deleteObserver().

#### For the Observable to send notifications
Extend the java.util.Observable superclass. From there it is a two step process:

- You first must call the setChanged() method to signify
that the state has changed in your object.
- Then, call one of two notifyObservers() methods:
either notifyObservers() or notifyObservers(Object arg)

Object arg -> This version takes an  arbitrary data object that gets passed to each Observer when it is notified.

#### For an Observer to receive notifications
It implements the update method, as before, but the signature of the
method is a bit different: `update(Observable o, Object arg)`

Observable o -> The Subject that sent the notification is passed
in as this argument

Object arg -> This will be the **data object** that was passed to notifyObservers(), or null
if data object wasn't specified.

- If you want to “push” data to the observers you can pass the data as a data object
to the notifyObserver(arg) method.\
- If not, then the Observer has to “pull” the data
it wants from the Observable object passed to it.\
- The setChanged() method is used to signify that the state has changed and that notifyObservers(),
when it is called, should update its observers.\
- If notifyObservers() is called without first calling
setChanged(), the observers will NOT be notified.

## Drawbacks

Observable is a class, not an interface, and worse,
it doesn’t even implement an interface. 
Unfortunately, the java.util.Observable
implementation has a number of problems that limit its usefulness and reuse.

#### Observable is a class
First, because Observable is a class, you have to subclass it. That means you can’t add
on the Observable behavior to an existing class that already extends another superclass.
This limits its reuse potential (and isn’t that why we are using patterns in the first place?).

Second, because there isn’t an Observable interface, you can’t even create your own
implementation that plays well with Java’s built-in Observer API. Nor do you have
the option of swapping out the java.util implementation for another (say, a new, multi-
threaded implementation).

#### Observable protects crucial methods
If you look at the Observable API, the setChanged() method is protected. So what? Well,
this means you can’t call setChanged() unless you’ve subclassed Observable. This means
you can’t even create an instance of the Observable class and compose it with your own
objects, you have to subclass. The design violates a second design principle here…favor
composition over inheritance.

> [!ALERT]
> Observer is deprecated in Java 9


- Not Serializable - Since, Observable doesn't implements Serializable. So, you can't Serialize Observable neither its subclass
- No Thread Safety - The methods can be overridden by its subclasses, and event notification can occur in different orders 
and possibly on different threads, which is enough to disrupt any "thread safety".

### Alternatives

Reactive Streams or Flow API:

Flow is a class introduced in Java 9 and has 4 interrelated interfaces : Processor, Publisher, Subscriber and Subscription.

- Flow.Processor : A component that acts as both a Subscriber and Publisher.
- Flow.Publisher : A producer of items received by Subscribers.
- Flow.Subscriber : A receiver of messages.
- Flow.Subscription: Message control linking a Flow.Publisher and Flow.Subscriber.