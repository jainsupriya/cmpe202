
Chain of Responsibility:
* Reason : Chain of Responsibility Pattern can be used here  to decouple sender(Receptionist) and Receiver(Tables). There are multiple objects of tables, determined at runtime are candidate to serve. Receptionist will decide a runtime which table to choose depending on party size , number of seats table has and table availability. I don’t want to specify which table will handle the request In the code rather Receptionist decide that runtime. Thats why chain of responsibility pattern goes well here. 
* Objects Involve : Client (Receptionist ), Handler (Table)  and Concrete Handler (TableForTwo,  TableForFour, TableForSix, TableForEight)
* Role:
    * Client (Receptionist ) receives the requests.
    * Receptionist wants to check which table can handles the the request. hence it will send the requests  to the client (Table)
    * Each of the table handlers( TableForTwo,  TableForFour, TableForSix, TableForEight) in the chain takes  the request. 
    * If TableForTwo is free and can accomodate the party size, it will take the requests and notify Receptionist about the same else it will send the request to next handler that is TableForFour.
    * If TableForFour is free and can accomodate the party size, it will take the requests and notify Receptionist about the same else it will send the request to next handler that is TableForSix.
    * If TableForSix is free and can accomodate the party size, it will take the requests and notify Receptionist about the same else it will send the request to next handler that is TableForEight.
    * If TableForEight is not free then request goes to back again to Sender(Receptionist) that saying that none of table is free.  


State Pattern:
* Reason:  Customers behavior get changed at runtime depending on which state they are in. If we have to change behavior of an Customer (Waiting for the service, Receive Notification as Table gets Ready, Confirm/Cancel the reservation ) based on its state, we can have a state variable in the Object and use if-else condition block to perform different actions based on the state. State pattern is used here to provide a systematic and lose-coupled way to achieve this through Context and State implementations.
* Objects Involved : Customer, State, IsWaiting, IsNotified
* Role : 
* 
    * Customer can be in different state. IsWaiting and justArrived, isNotified , Confirming, isLeaving. Based on these state, behavior of the Customer changes depending on which state he is in.
    * If Customer is in justArrived state it can only get himself added to waitlist, It just can’t go , checked in and table is available for us. Once customer is added to waitlist justArrived class changes customer status to isWaiting.
    * If customer is in isWaiting state it can only wait for the receptionist notification whenever the Table is Ready. IsWaiting state change the state of the customer to isNotified whenever customer receives notification about the Table is Ready Notification from the Receptionist.Receptionist can not allocate table to customer until they are notified about Table is Ready message.
    * On receiving the Table is Ready notification customer can send confirm or Leave message whenever customer is in IsNotified state. 
    * Customer can send confirm message to confirm the reservation and isNotified class will change the state of the customer to isConfirm once he confirm the reservation
    * Customer can send cancel message to cancel the reservation and isNotified class will change the state of the customer to isCancel once he cancels the reservation
