
## Clone this Repo

To deploy this project run

```bash
   git https://github.com/Mohammad-Mubarak/rock-paper
```



# Rock-Paper-Scissors API

The Rock-Paper-Scissors API is a web service that allows users to play the classic game of rock-paper-scissors against the computer. The API endpoint receives the user's move as a request parameter, which can be "rock", "paper", or "scissors". Once the user's move is received, the API generates a random move for the computer.

After both moves are determined, the API evaluates the game and returns the result as a JSON response. If the user wins, the response will indicate that they have won, and if the user loses, the response will indicate that they have lost. If both the user and the computer make the same move, the game is considered a tie, and the response will indicate a tie.


## API Reference

#### Play game after opening Swagger UI

```http
  GET http://localhost:8080/swagger-ui/index.html
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |


## To Start this Repo
- Clone this Repo 

- Open in Code Editor for example - intellij

- Run this Project

- git this URL In your Browser https://github.com/Mohammad-Mubarak/rock-paper


![image](https://user-images.githubusercontent.com/115584175/234593447-8e399043-4ced-49cf-ba68-b04ff03a0d01.png)

