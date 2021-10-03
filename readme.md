##Useful cmds:

To change shell
>chsh -s /bin/zsh
>chsh -s /bin/bash

To check heroku logs of this app
>heroku logs --tail -a martinktor-cryptobackend

To build and test locally the heroku step
>./gradlew stage 


localsite for deployment
> http://0.0.0.0:8080/v1/getcoins
Heroku Site
> https://martinktor-cryptobackend.herokuapp.com/v1/getcoins
> https://api.coinpaprika.com/v1/coins/btc-bitcoin