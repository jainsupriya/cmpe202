To support different machine models, separate derived classes are used in lab1. Each class provides common functionality for different configuration. But changing the cost of the gumball for machine requires a change in code. So configuration is tightly coupled to code.
On the other hand, the configuration is handled separately in a config file in FeatureIDE AspectJ, i.e. device.config file,  and it provides a separation of concerns. To obtain the desired machine model this configuration can be changed  This way, configuration is easily manageable.

1) Gumball Machine SLOT model : accepts any quarter (cost of each gumball : 25cents)
![alt text](https://github.com/jainsupriya/cmpe202/blob/master/lab10/Screenshots/SLOTMODEL_25.png)

2)Gumball Machine SLOT model : accepts any quarter (cost of each gumball : 50cents)
![alt text](https://github.com/jainsupriya/cmpe202/blob/master/lab10/Screenshots/SLOTMODEL_50.png)

3)Gumball Machine CRANK model : accepts one quarter (cost of each gumball : 25cents)
![alt text](https://github.com/jainsupriya/cmpe202/blob/master/lab10/Screenshots/CRANKMODEL_ONEQTR.png)

3)Gumball Machine CRANK model : accepts two quarter (cost of each gumball : 50cents)
![alt text](https://github.com/jainsupriya/cmpe202/blob/master/lab10/Screenshots/CRANKMODEL_TWOQTR.png)

