
package week4hmw2;

public class Week4hmw2 {

    public static void main(String[] args) {
       
        Customer customer=new Customer();
        customer.setFirstName("Bora");
        customer.setLastName("Kol");
        customer.setId(1);
        customer.setNationalIdentity("2222222");
        customer.setYearOfBirth("2001");
        
        CustomerManager customerManager=new CustomerManager();
        GameSaleManager gameSaleManager=new GameSaleManager();
        CampaignManager campaignManager=new CampaignManager();
        GameManager gameManager=new GameManager();
        CustomerCheckManager customerCheckManager=new CustomerCheckManager();
        
        
        Game game=new Game();
        game.setId(101);
        game.setName("Pes2021");
        game.setPrice(200);
        
        
        Campaign campaign=new Campaign();
        campaign.setId(201);
        campaign.setName("Pes2021");
        campaign.setDiscountPercentage(20);
        
        customerManager.checkIfRealPerson(customer);
        customerManager.login(customer);
        customerManager.update(customer);
        gameManager.add(game);
        campaignManager.add(campaign, game);
        campaignManager.update(campaign, game);
        gameSaleManager.sell(game, customer, campaign);
       
       BaseSaleManager baseSaleManager=new BaseSaleManager();
       baseSaleManager.calculateDiscountedPrice(campaign, game, customer);
       
        
        
       
        
        
        
        
        
        
        
        
    }
    
}
