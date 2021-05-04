
package week4hmw2;


public class CustomerManager implements CustomerService,CustomerCheckService {

    Customer customer;
            

    @Override
    public void login(Customer customer) {
        System.out.println("Başarıyla sisteme kaydoldunuz:"+ customer.getFirstName());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Bilgilerinizi güncellediniz."+ customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Sistemden kaydınız silinmiştir."+customer.getFirstName());
    }

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
    
}
