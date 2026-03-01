### Basic Concurrency

Process vs Thread

### Process

     A process is a Running Program
     ex:When you open the chrome is a process
        Whenn you open the vscode is a process

        The Process has own Memory and its own resources

### Thread

      A tread is a smaller unit inside the process
      Thread share the same memory of process
      ex: open new tap inside the chrome

### Thread Creation in 2 ways

1) Extending Thread
2) Implementing Runnable


Runnable defines the job
Thread executes the job
start() creates a new thread

Creating Thread using runnable is best

thread
-> ex: The homework (what to do)
The student (who will do it)
But not good.Because that student cannot do any other role.

Runnable
-> ex: One paper has instructions (Runnable)
Many students can solve it (Thread)
One work → many helpers.

### Thread Life Cycle

    the different states a thread goes through from creation → execution → completion
    5 Main Stages
     
     NEW → RUNNABLE → RUNNING → WAITING/BLOCKED → TERMINATED

     NEW State (Thread Born)
     This happens when you only create the thread object
     Thread exists in memory
     But CPU has not started it
     ex: You filled a job application form — but haven’t joined the office yet.

     RUNNABLE State(Ready State)
     When you call .start();
     The thread is standing in a queue waiting for the CPU.
     It means ready to run.

     RUNNING State
     When CPU actually gives time to your thread, JVM calls:run();
     Now the code inside run() executes.
     This is the Running state.

     WAITING / BLOCKED State (Paused)
     Sometimes a thread cannot continue.
     It must wait.
     sleep() is used
     waiting for another thread
     ex:Employee went for tea break

     TERMINATED State
     After run() method completes
     Thread dies automatically.
     State = TERMINATED

sleep()

It pauses the currently running thread.

join()

It makes the current thread wait until another thread completes.

yield()

I’m ready, but let another thread run first if it wants.

interrupt()

Used to stop a sleeping or waiting thread.

isAlive()

check if thread still running

setPriority()

Threads have priority (1 to 10). CPU may give it more chances to run.