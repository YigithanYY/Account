The assessment consists of an API to be used for opening a new "current account" of already existing customers.
Requirements
• The API will expose an endpoint which accepts the user information (customerID, initialCredit).
• Once the endpoint is called, a new account will be opened connected to the user whose ID is customerID.
Also, if initialCredit is not 0, a transaction will be sent to the new account.
• Another Endpoint will output the user information showing Name, Surname, balance, and transactions of the accounts.
Bonuses
• Accounts and Transactions are different services.

Constraints
Feel free to use any open source tool or framework

************************************************************************************************************************************
Hesap oluşumları application üzerinden yapılıyor ve sonrasında da postman üzerinden de bakabileğiniz gibi değeler post edildiğinde
Account - Transactions sınıflarına ait veriler oluşuyor.
************************************************************************************************************************************
Değerlendirme, mevcut müşterilere yeni bir "cari hesap" açmak için kullanılacak bir API'den oluşur.
Gereksinimler
• API, kullanıcı bilgilerini (müşteri kimliği, başlangıç kredisi) kabul eden bir uç noktayı açığa çıkaracaktır.
• Uç nokta çağrıldığında müşteri kimliği olan kullanıcıya bağlı yeni bir hesap açılacaktır.
Ayrıca, eğer başlangıç Kredisi 0 değilse, yeni hesaba bir işlem gönderilecektir.
• Başka bir Uç Nokta, hesapların Adı, Soyadı, bakiyesi ve işlemlerini gösteren kullanıcı bilgilerinin çıktısını alacaktır.
Bonuslar
• Hesaplar ve İşlemler farklı hizmetlerdir.

Kısıtlamalar
Herhangi bir açık kaynak aracı veya çerçeveyi kullanmaktan çekinmeyin
