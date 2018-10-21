

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite("Order");
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickle"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( c ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;  
        // premium cheese
        PremiumCheese pc = new PremiumCheese( "PremiumCheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( p) ;       
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise" , "Thai Peanut Sauce"} ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        //base price of the bun included
        Bun bn = new Bun("Bun Options");
        String[] bns = { "Ciabatta (Vegan)"} ;
        bn.setOptions( bns ) ;
        bn.wrapDecorator( s ) ;

        //sides
        Side side = new Side("Side Options");
        String[] s_side =  { "Shoesstring Fries"} ;
        side.setOptions( s_side ) ;
        side.wrapDecorator( bn ) ;

        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( side ) ;
        customBurger1.addChild( b ) ;//burger
        customBurger1.addChild( c ) ;//cheese
        customBurger1.addChild( t ) ;//topping
        customBurger1.addChild( pc ) ;//preminum cheese
        customBurger1.addChild( s ) ;//sause
        customBurger1.addChild( bn ) ;//bun
        customBurger1.addChild( p ) ;//pc
        customBurger1.addChild( side ) ;//side
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );



        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Harmone and Antibiotic free beef", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        // 4 toppings free, extra +.75
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanut"} ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( c2 ) ;
        // premium topping +1.50
        Premium p2 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Marinated Tomatoes", "Sunny Side up Egg" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        // premium cheese
        PremiumCheese pc2 = new PremiumCheese( "PremiumCheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella" } ;
        pc2.setOptions( pco ) ;
        pc2.wrapDecorator( p2) ;     
        // 1 sauce free, extra +.75
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" , } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;

        //base price of the bun included
        Bun bn2 = new Bun("Bun Options");
        String[] bns2 = { "Gluten-Free Bun"} ;
        bn2.setOptions( bns2 ) ;
        bn2.wrapDecorator( s2 ) ;

        //sides
        Side side2 = new Side("Side Options");
        String[] side_s = { "Shoesstring Fries"} ;
        side2.setOptions( side_s ) ;
        side2.wrapDecorator( bn2) ;
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( side2 ) ;

        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( bn2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( side2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger2 );

        return order ;
    }

}