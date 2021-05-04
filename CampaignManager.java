
package week4hmw2;

public class CampaignManager implements CampaignService{

    @Override
    public void add(Campaign campaign,Game game) {
        System.out.println("Yeni kampanya sisteme eklendi:"+ campaign.getName());
    }

    @Override
    public void update(Campaign campaign,Game game) {
        System.out.println("Kampanya içeriği güncellendi." + campaign.getName());
    }

    @Override
    public void remove(Campaign campaign,Game game) {
        System.out.println("Kampanya sona ermiştir. " + campaign.getName());
    }

    
      
   }


    
    

