package home5.h1;

public class BackupHelper {
    private AddressBookManager addressBookManager = new AddressBookManager();
    private SMSManager smsManager = new SMSManager();

    public void Copy()
    {
        this.addressBookManager.addressCopy();
        this.smsManager.smsBackup();
    }
}
