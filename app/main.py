from fastapi import FastAPI

app = FastAPI()

@app.get("/users/")
async def get_users():
    return {"users": ["user1", "user2", "user3"]}

@app.post("/users/")
async def create_user(name: str):
    return {"message": f"User {name} created!"}
