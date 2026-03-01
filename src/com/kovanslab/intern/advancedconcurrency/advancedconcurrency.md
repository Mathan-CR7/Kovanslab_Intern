### Advanced Concurrency

MyThread t1 = new MyThread();
t1.start();
MyThread t2 = new MyThread();
t2.start();
Every thread = memory
Every thread = CPU scheduling
Too many threads = system lag / crash
Why are we creating a new worker every time.
Why not keep a fixed group of workers and give them tasks.


RealTime Example
Pizza Shop
Every time a customer comes → you hire a new chef
Customer 1 → hire chef
Customer 2 → hire chef
Customer 50 → hire chef

### Executer

Executor is an interface in Java that manages
Instead of creating threads manually, you create a thread pool and submit work.
Creates threads
Reuses threads
Schedules tasks
Controls CPU usage
Prevents system
-> You give the job.
Java gives the worker

newSingleThreadExecutor() -> Create a Thread pool with only one worker thread
It does NOT create a new thread every time 1 thread → reused forever

### Thread Pool

a ready-made team of worker threads that already exist
Runnable → just works (no answer)
Callable → works AND gives result

Runnable = delivery boy (just delivers)

Callable = teacher who checks paper and gives marks

puts the task in the executor queue
worker thread picks it
executes run() or call()
stores result inside a Future