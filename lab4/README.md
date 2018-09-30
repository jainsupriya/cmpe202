Strategy Pattern:
Reason: Strategy Pattern can be used here which enables LineManager to select customers from the particular line at runtime according to the free table capacity. and party size.
Objects Involved: LineManager, Party Sized(SmallSized, MediumSIzed , BigSized)
Responsibilities
LineManager defines variety of algorithms for Party Sized(SmallSized, MediumSIzed , BigSized)
He will decide at the runtime from which line customer should pick according to table size which is free. i.e. if table which is free has table size 4 then he will pick up the first customer from the Medium size line and notify them that table is ready for them

Observer Pattern:
Reason: LineManager and Receptionist are dependent on table and They want to be notified automatically whenever table gets free so that they LineManager can check from which line he should pick the next customers according to party size and Receptionist can notify customers as their table is ready
Objects Involved: Receptionist, Table, Line manager.
Responsibilities:
As soon as table gets free it will notify the receptionist and LineManager that table is ready and Line manager will in turn check for the next customer in the queue which can be notified. And receptionist will notify the customers.
