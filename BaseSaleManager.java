
package week4hmw2;

public class BaseSaleManager implements BaseSaleService {

    @Override
    public void calculateDiscountedPrice(Campaign campaign, Game game, Customer customer) {
        System.out.println(customer.getFirstName()+ " kullanıcısına " + (game.getPrice()- game.getPrice()*campaign.getDiscountPercentage()/100) +  
                 "  TL 'lik indirimli fiyatıyla " + game.getName()+ "  satışı gerçekleşti.");
        
    }
    
    
    
    
}
