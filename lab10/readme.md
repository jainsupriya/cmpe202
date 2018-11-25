To support different machine models, separate derived classes are used in lab1. Each class provides common functionality for different configuration. But changing the cost of the gumball for machine requires a change in code. So configuration is tightly coupled to code.

On the other hand, the configuration is handled separately in a config file in FeatureIDE AspectJ, i.e. device.config file,  and it provides a separation of concerns. To obtain the desired machine model this configuration can be changed  This way, configuration is easily manageable.
