## .md File:

### Paths

> .md File
>> /
>
> Healthendpoint
>> /health
>
> Get IDs of all Coins
>> /v1/getcoinids
>
> Get {coin} Information
>> /v1/getcoin/{coin}

### Usage

> /v1/getcoinids endpoint to get the {coin} ID

> Insert {coin} into /v1/getcoin/{coin} to receive current price

### Infos and Example

> localsite for deployment
> http://0.0.0.0:8080/v1/getcoinids
>
>Heroku Site
> https://martinktor-cryptobackend.herokuapp.com/v1/getcoinids
> https://martinktor-cryptobackend.herokuapp.com/v1/getcoin/btc-bitcoin
>
> Paprika API
> https://api.coinpaprika.com/v1/coins/btc-bitcoin

### To check heroku logs of this app

> heroku logs --tail -a martinktor-cryptobackend

### To build and test locally the heroku step

> ./gradlew stage

#### To change shell

> chsh -s /bin/zsh
>
>chsh -s /bin/bash