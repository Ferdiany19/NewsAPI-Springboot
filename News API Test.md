# Project: News API Test
Ini adalah API yang dibuat untuk portal berita.  
Fitur API ini dapat membuat berita berdasarkan rolenya masing-masing.
# 📁 Collection: Roles 


## End-point: Add Role
Endpoint ini bertujuan untuk menambahkan role yang hanya bisa dilakukan oleh Admin.
### Method: POST
>```
>localhost:8080/api/v1/admin/roles/create
>```
### Body (**raw**)

```json
{
    "roleName": "Sponsor"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDEzNCwiZXhwIjoxNjk0MTEzNzM0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.n6bNzLGUabXG9hFmrN7L7zmWeTAAegjuoaNhNMj9PyU|string|


### Response: 201
```json
{
    "success": true,
    "message": "Success Add Role",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get All Roles
Endpoint ini untuk mendapatkan seluruh role yang telah terdaftar.
### Method: GET
>```
>localhost:8080/api/v1/admin/roles
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDEzNCwiZXhwIjoxNjk0MTEzNzM0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.n6bNzLGUabXG9hFmrN7L7zmWeTAAegjuoaNhNMj9PyU|string|


### Response: 200
```json
[
    {
        "roleId": 3,
        "role": "ROLE_ADMIN"
    },
    {
        "roleId": 1,
        "role": "ROLE_CREATOR"
    },
    {
        "roleId": 2,
        "role": "ROLE_USER"
    },
    {
        "roleId": 4,
        "role": "Sponsor"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Users 


## End-point: Create User
Endpoint ini bertujuan untuk membuat user dan rolenya berdasarkan yang di input.
### Method: POST
>```
>localhost:8080/api/v1/user/register
>```
### Body (**raw**)

```json
{
    "username": "user3",
    "fullname": "user3",
    "email": "user3@gmail.com",
    "password": "12345678"
}
```

### Query Params

|Param|value|
|---|---|
|role|ROLE_CREATOR|
|role|ROLE_ADMIN|


### Response: 201
```json
{
    "userId": "f8e6862c-321e-4490-b261-6a9cb7e6aff0",
    "username": "admin1",
    "fullname": "admin1",
    "email": "admin1@gmail.com",
    "roles": [
        {
            "roleId": 3,
            "role": "ROLE_ADMIN"
        }
    ],
    "createdAt": "2023-09-07T23:29:02.267638",
    "updatedAt": "2023-09-07T23:29:02.267662",
    "isDeleted": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Login User
Endpoint ini bertujuan untuk login menggunakan Email dan Password. Dan mendapatkan Token untuk login.
### Method: POST
>```
>localhost:8080/api/v1/user/login
>```
### Body (**raw**)

```json
{
    "email": "admin1@gmail.com",
    "password": "12345678"
}
```

### Response: 200
```json
{
    "email": "admin1@gmail.com",
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDU0MiwiZXhwIjoxNjk0MTE0MTQyLCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.MeBqbEa7mmkzb4y22Kdgs3WNEO17WhYvF0ZcjhV-cM8"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Reset Password
Endpoint ini bertujuan untuk mereset password.
### Method: POST
>```
>localhost:8080/api/v1/user/reset
>```
### Body (**raw**)

```json
{
    "email": "user1@gmail.com",
    "newPassword": "123456789"
}
```

### Response: 200
```json
{
    "success": true,
    "message": "Password Updated Successfully",
    "status": 200
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get All Users
Endpoint ini bertujuan untuk mendapatkan semua list user.
### Method: GET
>```
>localhost:8080/api/v1/user
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDc3OCwiZXhwIjoxNjk0MTE0Mzc4LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.SWGcCu0XnAP8eLcZnMeA3h0QpsTteKBTTPvGxr-pEbs|string|


### Response: 200
```json
[
    {
        "userId": "14b381d7-54b7-4f62-9454-3e346cf960c2",
        "username": "user1",
        "fullname": "user1",
        "email": "user1@gmail.com",
        "roles": [
            {
                "roleId": 2,
                "role": "ROLE_USER"
            }
        ],
        "createdAt": "2023-09-07T23:28:41.770434",
        "updatedAt": "2023-09-08T01:18:23.247929",
        "isDeleted": false
    },
    {
        "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
        "username": "creator1",
        "fullname": "creator1",
        "email": "creator1@gmail.com",
        "roles": [
            {
                "roleId": 1,
                "role": "ROLE_CREATOR"
            }
        ],
        "createdAt": "2023-09-07T23:28:21.420506",
        "updatedAt": "2023-09-07T23:28:21.420575",
        "isDeleted": false
    },
    {
        "userId": "f8e6862c-321e-4490-b261-6a9cb7e6aff0",
        "username": "admin1",
        "fullname": "admin1",
        "email": "admin1@gmail.com",
        "roles": [
            {
                "roleId": 3,
                "role": "ROLE_ADMIN"
            }
        ],
        "createdAt": "2023-09-07T23:29:02.267638",
        "updatedAt": "2023-09-07T23:29:02.267662",
        "isDeleted": false
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Articles 


## End-point: Create Article
Endpoint ini bertujuan untuk membuat artikel memasukkan kategori. Hanya role CREATOR dan ADMIN yang dapat membuat article.
### Method: POST
>```
>localhost:8080/api/v1/articles/create
>```
### Body (**raw**)

```json
{
    "title": "Anies dan Ganjar dan Prabowo",
    "content": "isi dari berita Anies dan Ganjar dan Prabowo",
    "category": "Politik",
    "author": "admin1"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMjE0NCwiZXhwIjoxNjk0MTE1NzQ0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.Q-rQbqguh_RQX1uMZvu0c3dDtQH1lItH-6ZmK38dIuU|string|


### Response: 201
```json
{
    "success": true,
    "message": "Successfully Created Article",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Article
Endpoint ini bertujuan untuk mendapatkan semua list article.
### Method: GET
>```
>localhost:8080/api/v1/articles
>```
### Response: 200
```json
[
    {
        "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
        "title": "Anies dan Ganjar",
        "content": "isi dari berita Anies dan Ganjar",
        "viewCounts": 0,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    },
    {
        "articleId": "ef501d6f-8b47-4bbb-b195-841f53de5216",
        "title": "berita Politik",
        "content": "isi dari berita politik",
        "viewCounts": 2,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Latest Article
Endpoint ini bertujuan untuk mendapatkan article yang terbaru.
### Method: GET
>```
>localhost:8080/api/v1/articles/latest
>```
### Response: 200
```json
[
    {
        "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
        "title": "Anies dan Ganjar",
        "content": "isi dari berita Anies dan Ganjar",
        "viewCounts": 0,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    },
    {
        "articleId": "ef501d6f-8b47-4bbb-b195-841f53de5216",
        "title": "berita Politik",
        "content": "isi dari berita politik",
        "viewCounts": 2,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Add Published
Endpoint ini bertujuan untuk mempublish artikel yang masih di draft. Endpoint ini hanya bisa dijalankan dengan role ADMIN.
### Method: PUT
>```
>localhost:8080/api/v1/admin/articles/publish?id=e2cc2c5c-d162-4b3e-a978-faec73ee2b1f
>```
### Query Params

|Param|value|
|---|---|
|id|e2cc2c5c-d162-4b3e-a978-faec73ee2b1f|


### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMTQzMywiZXhwIjoxNjk0MTE1MDMzLCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.gLegxamMMYaeWUovqJ0aqGEPPPF3p4_HqaTjbAISrH0|string|


### Response: 201
```json
{
    "success": true,
    "message": "Success Publish Article",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Article By Id
Endpoint ini bertujuan untuk mendapatkan Detail dari article. Endpoint ini juga mendambah jumlah views.
### Method: GET
>```
>localhost:8080/api/v1/articles/e2cc2c5c-d162-4b3e-a978-faec73ee2b1f
>```
### Response: 200
```json
{
    "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
    "title": "Anies dan Ganjar",
    "content": "isi dari berita Anies dan Ganjar",
    "viewCounts": 1,
    "isDeleted": false,
    "isPublished": true,
    "category": {
        "id": 1,
        "category": "Politik"
    },
    "author": {
        "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
        "username": "creator1",
        "fullname": "creator1",
        "email": "creator1@gmail.com",
        "roles": [
            {
                "roleId": 1,
                "role": "ROLE_CREATOR"
            }
        ],
        "createdAt": "2023-09-07T23:28:21.420506",
        "updatedAt": "2023-09-07T23:28:21.420575",
        "isDeleted": false
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Categories 


## End-point: Create Categories
Endpoint ini bertujuan untuk menambahkan category untuk article/berita.
### Method: POST
>```
>localhost:8080/api/v1/categories/create
>```
### Body (**raw**)

```json
{
    "category": "Politik"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwNzY5OSwiZXhwIjoxNjk0MTExMjk5LCJlbWFpbCI6ImNyZWF0b3IxQGdtYWlsLmNvbSJ9.GbbtGGQrCf5bb_b8_SjvFuXfNGg3b7osDqYxSXNXugk|string|


### Response: 201
```json
{
    "id": 1,
    "category": "Politik"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Categories
Endpoint ini bertujuan untuk mendapatkan semua list Categories.
### Method: GET
>```
>localhost:8080/api/v1/categories
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwNzY5OSwiZXhwIjoxNjk0MTExMjk5LCJlbWFpbCI6ImNyZWF0b3IxQGdtYWlsLmNvbSJ9.GbbtGGQrCf5bb_b8_SjvFuXfNGg3b7osDqYxSXNXugk|string|


### Response: 200
```json
[
    {
        "id": 1,
        "category": "Politik"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Comments 


## End-point: Add Comment
Endpoint ini bertujuan untuk user dapat menambahkan komen di article.
### Method: POST
>```
>localhost:8080/api/v1/comments
>```
### Body (**raw**)

```json
{
    "comment": "ini komen pertama",
    "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
    "commentUser": "user1"
}
```

### Response: 201
```json
{
    "success": true,
    "message": "Success Add Comment",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get All Comments
Endpoint ini bertujuan untuk mendapatkan semua komen.
### Method: GET
>```
>localhost:8080/api/v1/comments
>```
### Response: 200
```json
[
    {
        "id": 1,
        "comment": "ini komen pertama",
        "article": {
            "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
            "title": "Anies dan Ganjar",
            "content": "isi dari berita Anies dan Ganjar",
            "viewCounts": 1,
            "isDeleted": false,
            "isPublished": true,
            "category": {
                "id": 1,
                "category": "Politik"
            },
            "author": {
                "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
                "username": "creator1",
                "fullname": "creator1",
                "email": "creator1@gmail.com",
                "roles": [
                    {
                        "roleId": 1,
                        "role": "ROLE_CREATOR"
                    }
                ],
                "createdAt": "2023-09-07T23:28:21.420506",
                "updatedAt": "2023-09-07T23:28:21.420575",
                "isDeleted": false
            }
        },
        "commentUser": {
            "userId": "14b381d7-54b7-4f62-9454-3e346cf960c2",
            "username": "user1",
            "fullname": "user1",
            "email": "user1@gmail.com",
            "roles": [
                {
                    "roleId": 2,
                    "role": "ROLE_USER"
                }
            ],
            "createdAt": "2023-09-07T23:28:41.770434",
            "updatedAt": "2023-09-08T01:18:23.247929",
            "isDeleted": false
        },
        "createdAt": "2023-09-08T01:33:00.733818",
        "updatedAt": "2023-09-08T01:33:00.733839",
        "isDeleted": false
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Upload FIle 


## End-point: Add File
Endpoint ini bertujuan untuk mengupload file/gambar untuk sebuah artikel.
### Method: POST
>```
>localhost:8080/api/v1/admin/files/article?articleId=ef501d6f-8b47-4bbb-b195-841f53de5216
>```
### Body formdata

|Param|value|Type|
|---|---|---|
|file|/Users/septyanwidianto/Pictures/Picture1.png|file|


### Query Params

|Param|value|
|---|---|
|articleId|ef501d6f-8b47-4bbb-b195-841f53de5216|


### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwOTU5NCwiZXhwIjoxNjk0MTEzMTk0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.8GFwP_pstsfKBH24zuReVsbsBkHJ48UUtCynSMvoxM4|string|


### Response: 201
```json
{
    "id": "a6bfb78e-ee70-42ba-b389-cb4faa418c32",
    "sharedUrl": "http://localhost:8080/files/book/a6bfb78e-ee70-42ba-b389-cb4faa418c32",
    "imageName": "Picture1.png",
    "article": {
        "articleId": "ef501d6f-8b47-4bbb-b195-841f53de5216",
        "title": "berita Politik",
        "content": "isi dari berita politik",
        "viewCounts": 2,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    },
    "isDeleted": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Load Image
Endpoint ini bertujuan untuk mendapatkan image by id.
### Method: GET
>```
>localhost:8080/api/v1/admin/files/image/a6bfb78e-ee70-42ba-b389-cb4faa418c32
>```
### Query Params

|Param|value|
|---|---|
|imageId|a6bfb78e-ee70-42ba-b389-cb4faa418c32|


### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwOTk5MSwiZXhwIjoxNjk0MTEzNTkxLCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.83mA73b2em_KnI54lwbQwrcb28V7ii8gRnUP5HOZ2fA|string|


### Response: 200
```json
�PNG

   
w��}~�4�ݯ^��U�^�z%���K`Ŋ����3�q�b��~�g/:�4����������%�q	|\���%PXk��B﷮GO��嚾S��?
�mB  �5-%�������4�
c�JCR�@]�D!�$���1z��$Čz�a����$b������p��3���4h��$����,��� V����ۄ�^}U� �>�_P�8jt��d2)��A���bi��o�"���c~��t:Q T@��v��Ȼ]n���G��<(@*fݠ��SI*�CvZJEx�`�Q�L��((��щd4pM(
ڎ0�Wp:�=���O���mt�)
��!=Dq"�D;O"��Npj��`yF��!�@�].YH����a�A;F3Q�B�w �F "� ��Q�@��3�
�È/��TnT�AA\(��Ң#��CC���L�tCH�)c�L&S�l�ْ(��(�D��ОH�Ĥ���i�MB�L	J<!�D�0�0Ȇ�~�����]��;$W�i�JN�WR.�s �6U�i.��QMjQ��_@��2#Ȩǁ�~��S&�z��*�K�
��W��(�N!��e%��)HN�`�t[Jp9\>��9-�$��H(G�,9Q�h�2�0e��7�/�(K���(�KPۨ/IH�ި���tTM8	c������T���z1��QT��DسkǮ+����:#L���Z=�C�!�ZVT���S�ط}�m%%�:�Y.��N�ext�*����$�D��ݣ���>76�P�^o���!�B1�ȱ�r�d�{G���/
��I��虊��O��ɟ]�a�3�pb�#T��&9�J��C���%������<^�Ҟ����\.WUY49<R�`�����[ZZ*���ΉF���x�%K��'F���x��(\|�ţ�#CZyY��j�?J��P�A zx����շ��Օ��ljjʖ�8v�1uj�mｷ��9s��`$"�I��zH
�D��i�q9^���u�߯zU�O#�����}Ԟ�G����
�#ﶶv��@��*dxK!�ڲe��s����7}�?�{zR�JП|�I��Ȉ�'�M�����>as�䲲�73�bOU����p_S�?G�78��s�ǃX��w׽���tq]]�xf�a�F�W���b4ʨ&����G�_�Y��71�`-�H� #p pM��0��������yhP <�*��6n|��w�[���;[���R��<x�����������362r�s�=w1���db����A96�p������G�����L�ƅ�J��h���_���D"c���6?���5s�g�Ï>��!�N������gF�	�RԼ�=��S�~2����)�DA�=f���ڎ�M3�M
\ 8�S��eG�M?�e6�( j`_���굵��4Ŕ�r����@&����q{�h	Ƀ��ΈV���׿ʉ�����aF�s�W�e��=�~l�P|q1�BxUE��6��%�ԧC�pUy=7;x�P��r.��}d$�+�?7��H���|��ʊIA�W�V���z
�f߼a�Pf���E36�O�[o?�������?TJ�]�F̃&,\�0�EG�k��8�h�N��5S���*�㡍�	722�5�R�v#<��㓦ڪr��Sn��kߵ��E�I'V��Fm��WKS9�oH�rR������$�d9�J��
՛�o�����U��"�K�I�f�����:K!m@NĢU�[u;���i1IEs/����
�l��
@�G6�j�et|K���!5c��><Q�ĦA�I��{L���"E�Yx^��b!���q���oh�`V6$z:��lG���N����S��Pl� ��?�u	���.��t5�hR�^Iņf�0�� t�@�5����j�;H���ed��\�0�x<�m}8�R��n��"�
����:P�U�G�Ԕ���xCEǈ�m��t��nCZ��T#b�Q��G@�F�#��jE��	=%�
�q�Q�����r[{��ʬY��.<��/�h�������{�6�wi4�-�<�`�k���>s�%]BU6�*�A�F鼽���щ�[:ֶ/�wWO��=KDx�Y�A/-/�ϙ��
�-U?�;��%;wf��յ��ݭ@���N�-
���b<���c�69��प�s�Y�-[v�^Z~��ec��d�Y8��	.%�\9e	��5s�ʦ�5l����hl4W�}��mwDՄ�fwy���Q�e�_������� �w��l�6��ڵ��MsBL��=[�޵k����뮿��^{��l�M^"��^��x�<�o���\p�Q�Ӛ���0�@G�@]4�xeA�_���~�-�1�}��
x�fy�5�ۋ�`0BUUU�i�v�L���5Yޛ��y"nʸ�I�<�?��O_��w���d:Q��<����	�-���t{z��U��s��	���������ܘ8�(���,�v����`J�0���L�/p��w+���w��Z���,<����~��{Yx�pt�h�tCCC
,��:�8U�;F�`��f�J_�s�?F����d�[�n���yeّ_�FL���N(���8Wܘ��e�I	�q���Z�/ǅp�nM�7�eɥB�����H,�c�mŊ�����}\4y'
V�sd�^��{@�GF:~4��42~���/����!����w���+�]?�$�^��.`����E�ѬF��S�=�ʷ^��ќE
`=����yE��Jd���KU��P���W4w,��C�J�GF޶��DH���=0U�m��<�ij<�(xTEy�C+�&��h�f����I���4{����?
>7��ڋѓ���	����5YI�]���_�[((
�ס����XR�ZB����ٵ���d<�$4���L�9�j<�'�x�dw G���Y��)����r;��*.��kN育J�� ��E&c���Π�L����	�5�(wT�䠐5�gٳ�������y��!�Na%oJLo�I�j��4wH�KaF����h����������o�epr�I�N����)�\1�k3x8�_4)J	�a�%���&^�O.����U8�c��&���|�s�qWo����xpP������+��?��т������,/G~�]GG����iӭ���ZH�J�%*Z����,�๯}�w�d�k����k����e����a���v̼PO=.&�A�2�� /<�� ��7~����w�.;�x
�q��'K�	���1�A�5��;:�
a�v�&�)fc��H�9}5��-����03����2ƙa�����`�<��±P�H0�iƙ�+`�?�H��{�n���3�����|����2����͞)0�/�����ra��,P������$3���{�r;f������fjT���H�o��
<�x�SN�'N&����U� 闉�P�Q��_���\?��
�G�=��w�m���M�Ǣ�j�����z��X�Ͽ�Z���X��b�-�g6�� �5��\�f�y�wn��i̙
R����=t�9�	hCC��K�n~����s�o��M<l�p���ә��>���1=rup�.;2����Ly��ɴi�N���z��ov����U,<�w���=�ܳ��{�I'U~����$���&�N`�-�?�T����\,�����oJ&�1Lm���gE^ V�E1f͎��ɗ�pCVrX����'M��@�
���M��@�9��,������5�@'�8!�UP�<,���`S��<	���ko���b��M}n0O�m4۰䈣,�I��}��&���-7�Y�B
$���h�Оb����$��;���B��T�K��~��%9*��V
�ήS��B���g�>�p*��*��E�M�R;�2� bO4,�B��I�L�ٝ����2��"���Cw�Fj��֝Z���ٰC�c�P_���s��	�4jT5��<��$�ذq��H"O�<<!��	㘯�C/���e��"G�@D�Pi��p��lt� �PwG�����)\�q^}4nt�|�܈��t�0�����e�$Q{w��8�i�H�3Z�"���T�Tf$�.���0�c��P�x���8 9I[�6�4X�WE�.C_!�l`Ȗ��>�Ĥ ����(�Dy��f>���G�ǻxuR+"CU��C�53C�!4U����v�:��4�P�I8�+"����F�7���%�vh��(b8��I��q�����z�udh� ո�d�d��A���A=
{�dl����]���~QBJ���b.ź"���%Q'UU�l�uT	*O��N��|N�o�j�ʇ"�ۡ%"���p�����A։H��4��C�P��A���F�঺�n�ߥ$�:�FQ��+DX�`������5u�&�2�`22MS�2��2�c��۴�e�1G���m�T�<�t�{��	t��2!�8a��k�77� Ӊ0�=���'��Q�������������H�D�
�<����k?���Y遈AA�,�?��ų����k�Չ����]6*;�BT��`��t�^����y$a{��h�/�J���p�=#�\�y�{֙�]�pΜ�a+��cj����m�C~�V�:{��Ś�Sj)mR����cJ�%���&�Ċ�Ï>zWG��ҥK�Y�n�ֲvjC�iV8�w��w_w뭷~i�Ľ��?������8M4�wA�x���,p�X��|�Q��������8�]��?p!~Y���K�y�����}O��_��1j0U�U]���?��EkD�K��x��l��K�����!���_}M%�c,�7�Yu%F��,<����+��|�E����i{rǎ-�Y�;w�be�������obG-�/��O%�����ѡ��^q�	t�C����oɤ�%������E�l#�Kq��}���,(����\,k\�k�[K�{�Ν�f�
=s�9�#Bm�k��
w�k��ɡ�NhAؼ��� �Ձ
iӕ���l�
�컺�Z�a��223
�0H���t��*����,Z	^�<�߾���1�	n�K�y��HS�}��g��f�mJ��|=�4���	1=���$=�i/�4�Au (SNt]б�%i�߳2М'E��!�� c�y������׾�"�%9䋼��W�K�)���n���smJ@,��y0�(:v�t0��֑i �6,���c`f���T�qJvA�X<������;�qS��x��l��ĭt$�Ey�kܱ-�e0�Ձ�^�v��@r�.+�]�P�2����m�g/��6/�����;�O�n���0��X�#��[*�L��n�%�\��
�0�&���$ �!Q�K�@�eJ����,+�A�֕M?��s�':1p"����;~��Ku�8�ΑRj
ج�ä=q�j2ٳ�:k
�!���\���#ʘ��,�;uO2��Є�!�����c��8;v8�fd!�r�Jڗ�tn�T=�j{���Z���}H[��s:i��3z��e��=�9�4S+౩�i���6aJ]�� �h K���kok[;Ѣ�L�bO잳���@(�Gð�GZ��Ʌ�=aӟ��[�ͰC�l|Pa`�{���Ҿ���LD @�!���c�����3�;\����I����%xKdArKm{�^� ���.���aN�K6J\0Sfd���.v#b�b��t�V?@_�t.����c%�j
�&��Dꌔӭ�VU��{���%���j�5��_�P��������Ѵ�ݺ�ohb@A7�{ʈ�C��;���80��ݿ��U��i�cH�^�
e(-�+���~����r��rJcg,[��,����y�~/��m���O�?s��6�
|=W�$A�����[.ՠ�'�ZN���K�v�?,�m���
-�[s��}.'��+�~q�k������닸���9�I������3ߟ9u���\W��C��4_��'ͤ�� f�C�#�'�20=
N��(:.�I|J?Sn^���3MƁ����������q��Fh7�Pa�Z�^U�1�Sl�btX�JR�Ϙ��;]h�b���^�P�~�E����^d��A=���y���'��K��`]-��(+y�,ň�����M�3gs�g�n��5�ܦƉ(!�<��Cx�d"��7���D���T�۟��V]V�iͮX{�H�y&>���)����^$�d�8/7�� !�<a�d0 �^i=�ND�y��@�x��{'I7�%c
0***�p�=N�R=�
8�<�F(D�By����{r�/�|�v�ۙe�`�k�m��\:�Q')y��X�8�4	�:eŗ��I�|{r�c�9�RD�y>��f����m����糟��^/�����f0��i��Aw����+�$���W�'_ON_Q���;-��c��e~��A��ҰP�[��'Uؤy�q*�k�lL|�.o����x�/���G�d�3��r{c>�z?�4�Ƌ�$����"t�w��Z��)n�A��V��j���|"��x��	)sP�A�Z�S�E�a�4R�o�H�+Fc���7����+l�3ͷ��%�BXo�3��K�I��+~��
��������Č̔��'i�[��6��+�[:�H��_w��`.�?�|m��8~㙺PQ>�,A'�9ۣi2k[����)�LO�vuu���U���:�8~��gO������≢��\�����B�	A8Z
�({ؗ|����*��ӡ��%;qw��x��R� "/^����<����ҁ2�i�5���x��ē�h�LFGzۏ>v޿��xN��B� �*5�W\�!��C{�t���5�0+�>&1 ��+<x<�{��\	޿߅�&3�q�Q�
c�.�O>)	�_^��O~�D�1�� �^���]˖�1
î53��^����X��x��Gf�144݁V<  h�8��}�/�����Ҵd���=�ȑ�l��Hs:s��فݯD�Y\A���/����]�8-C�B�##>�#C���]����� �aԅhQb��EC |���M��8��q,�|�b8h������WH$«�^��n�#�a�p�&;=1��b&�!�v�i?{fs�?Q9��ɐ2j�j��p���#��w���W�Ol��K�U�C+"��	="M���ո��q�E �G�y���Hu��Vzz�^�� ��"�� 3��a��áKq�﯂ݦ��m8�k	h�(�QX�����G��F#u
�̧s���:@��v�j�����) Hkd��P�]��s8�PV�}��d1��_8�P|��z2�\:0M�<�S��+��,�,�.����9KQ�].w�0�D̼o��N��D?Y�c9B�e��sn���!u oI�_r#)+)��F�R��>�o�N���l�O�p����V	�97O��X�p9�<=����r>��9�G���o{���%k�ITUU%,��[}\I�7�ԑ	W�ə]���9�c���btr�R���<s�ٯ�ԁ
��2rwｅp�o�0�@g�)h���5����a����`h'��Ï�3�aA�X�����FDFG&x;e�ѧ-����.r���b	��J?��>�������.���w���:z>[c�gZe���ax;��Τ4N��3�bm�n���Y�Lr�,��ё'�la�[�
�$Ue?9Ͱ+�*j+��G�٫�t�J���N?�wy�X�s@���4g�)�R�r��c��[�A��F�u+6�����3ǌMv��Ѻt�1KX�`^��q�:P��/b�O'�g��Ը��m<��<h���Y�Ua� �?^�"/�1V���yӘ(�	S��x�L(-�`�>x�3�Y�;���.F#�^�
�����X��xs��H��r_�R����~=��1l��W;NR{8����ά��Ҳ�(�e�&)g�8��c�/[��-�d�?����P����=!!4:�d�8?��D㐩�E#a�y����t�b�>V� <Ha/�o΅�E����(��[�\}�u�:��P���<�~0E�V����jw�2�C�C���`� Y�p4�,�3θ`�ֿ�@��4y����c&Y��AUE�j��<�Jc��C�y@��w�@'�D�� T�󆳮���˯|�W�� pƂ*wŬ)���������Z�sf
Ur�=au/����KK��x\Q��T����d,ٽ�K��_x�'�CB/��O�n�[}z��3�
���(p,2"��4�ǶO��nS�����#<"E����z�R/�FP�*R��x�>6Hu�#ۉGG���L�V�Wr����z\����4�cF�F@�'��������u�eJ�EY��%L%TUlpO��ڱ#g�X
tx��JJt�\:6�E���h��(�C;jLB�� 1]��38$E��g4AI
��ʽ�r�eg-_�w+�k�ֲr���Yx?���K/:W�1�9��J4H��q����%c[VW�]������W�������h�=��c�����ZZ��e˶#V�Z;��������-����g��~icݓO���я�/�9��sȲӽC#L��--[N�j`�@0f���ה��+�[n��d������`�?4V�����k,��ϿуJ������c��n"�����05���m����\�4�U���^}p`��s��-�sH,M��pJc,�|��E���W�],R�Gt��f߲��«*-a��\0���rw��c8����tc�*A���y*�fب&����ٱq�Y�ɰ�T8�+�Y�I��KO_LJ��ኼCe4Ʌ�#̡8P,E�� {]�q������V��	��9;��1M��xr�	i���8(Ϳ�7?d�����&�3}��0��L�)���,���|��	?��O�n�3{�0/x��)�i�4:g�8��MG�߷�r��&��Z=�ԡ�0ڲ\�������v�sGpҕ��9#����d��Y#fA�0c��iK���H�
��Qȍ�G�Kvy����x2��*�a�ĝ��Y��02��e_=pt#f,�Y���f��r�������9�f��sxѼcKa=��N��,4�s�f/>����7�E���9m)P�/���A�����%��8��f:�!�p��iz
��c	��o���ŗ�t��%��V�t�����f�\��w�[��Y{L�q�؛eN���RY�;�E���@��찭A������t��8��UR�8��l���f�d��Z�ŎN����v��(�t�݃�H��)�}>�!r���]Sq�y�\�����ڿ��0:�J��7զ�멛7�H%I��$�@��,���@������0��Z���zrJ&�i���2܀���kqE�J�koZ�	(g�2���yжT&� nF�*��q�v�Ul�n=���6m����mvW�е��@�F�_#���HhI�7�x��6=�F=2���A��@l��I�Jp��b'�q���4mh}]�lע`S8�
P3�PI��|\͊ufJ��m#O�6�6���p���
�߸���'��f���{��
����g4
'/;������
y�'k�O~�&-�1�w_��t{o2�`|�8� ���pϝ�H8w��(`�
��؅�-�e�F0I�*�,�y0}�q|vc�[0}������9��	ܛ	�+9:������D�cf�!}�W�e��9���%â��X:��~�,N��
��*f��Pٚ �xss���XR��<D � ��NX8�=�+��ty���(krX�3�{oWTȘ,�֯��5��AB�:f�a�!;0:F�|f>�Ӻ5qF#�rNg���F�*=,�����\�xvaW�ș�bC�[�@���Mc-s������SNY�V����x��6KKY�V�h�(N2���v-���y�+��v�T�&�������v�4rj^���t��m���2$������{�������իW'w���� �wl�a�6'����=��*V�l�ƞ={��*�X����lJ�
 �#d�{z��wf�(g�@�w[��!��L�8�.�%'Μf1_�[�_q�{��D�?��
�:q1�}�Y S���!��vȂ�UA�7�͉�:3��h�3�=�j\���L]�<eX���ӡtHࡎ���6�I�='�,m��A&?X�:�t�Hb�=f���P�_�LBA�0��!M���%�mw��h�4��q�Q]��2�)����l�'�Q����܉�	�x<� �l9N�ct�j��,�H�4tlQ�RS*�<a�Jqi�@�qJ
e�����SJ��y'�c>L�>�D��[�1��F�T�OX�c�O��IIk�1F � A$�h�X��2��	�H瑉���*AzQ���=ɱ�g���6O��<�j5����D,pa�ݡ��KC�R�%v�����sgބ�#�̤
]_&�I�x�������˗��p��q����]�[�~��I��	'��'�-��RjA �]ː��lyv#���/��#ޜ�c�2:�;���כx�|$�&�͍�L���%3 ��a-�����a��lL�q�!%��#��!;	��,�Ζ�	h
N۴6���jė�z����Sf(p�X����ց��J���R��̓�%�-	�.�uz��20E��9mZ���w�'��  [3v��Ƒ��Wx�"HSD�9�M_y���>hJ ��<�Q��.9�L_y��4
г�s/��֜e�ٹi�S��-�4}alh�!3��)��O�f��m��a�&J(�ys5���7�Xpx��9fPf�@�G�G���k�x�s�嵍6����iM��}��a��D�}�5h��>(��:�VHi&)�F�ˆ"?x�*��������I�s���#��������dJ�ap������Mqv&MN��?y�c�ُ�{��v�
��C�a<K*�ș(����{���|�[o���F	p��$�E��3n�]�H߈V��-|m�˗�}Pir�<����+F<��9�*�'J{��}��������d����n7�ͮڼ�V��i���7}�����,à��r6�U�"{<��"��B)�W�uaeu���u��Hlp蒯�����u�6E"��
}�=3֯^�ńw���#a�*d����D�`Վ)���h�s����2W�]��6_\O&ʒ)����
oo����^Z����i�C�X�=vс]�T��vd��}*ZW8��DCa3C�$uI�8.�у������Z;g;�/�a�SMi�d��>��-��zǎ��;�>�.�uܘ��Bۏ��xe���w�W��%���c���*8%m���%J�p�U�'.]C�ōڠ%G:+���]|14:�UWW�F�+C�םвQ�D*
04h���ܦ��xL�4z�'�@b�(�� EAvU���=�����Ϊ�_��v1�TI�>��E
�	�ڴI�y~I��_z����W�)�+Vdf@��c,n�������,yd�5��?��n���y�L�d�~ln��wIyGX�/�~�߿���G��6��~�v<Z�m�z|�(���5{�W1��qo9��.�}ǈb=�Z׌���q-;��K/��>o����!e�C~�MBn8�;s��ޓ)�W�3]�f�A[#.�Ao�aV_w��,�'L��d2�Y��dE�[�������^|�ߙ������������u׌��5�p��p'��#�CL�%£F�;��a8(�%��p�9�pP*�QZ����P�O�	����f�0=�߮&���S�\�����0*3�3/�t�Vp[!�:G��`��\�Dz+����q$�PSV~َM�,���3����ɏa��Ν����B����h�X��VL����CJ������=���@�s"y�yg}͟�܁Uhqǳ�ӭe9ĳk,�UQR{�y���g˒G��S�s�MXv��2��ī�Ϥ>�������J)�j��={���/��p��������_7Y�g}SCIBO�����o����V�VaV,���߁r6>***2�}vm�ܷ�g�!]+��Gh!��g�Xv �pHϲ����V֣��t˼yGZ���9fXZ�e	y�Q_���;0T�� �0 �F��}μD$�n#|{��!��QQ�)_��v��(&S����K�{����nm��nb�>;ȷ�I�0XN�p�ɮ�,�}���۷u�]H��r�#�QG��ަ$�
��~���SN9Œ��g.1E���@bsv9���͘SlQ�\�rek^2>���d�����/~����;V�����I@ O1�{�Z�Q�4�nN����#f�^cs?�$�
*=7���	Z���+�'b~$(�����xe��Sj��ڀe�q?0k���*O���-�tbY���?�����?���&�����b�p
���tV������c���eK��݅��E���l���<+M<��[
���9�74d�iAq��@c.~�R:�a�ڠ	μ#ٔ��.<��_�w������G�z�' ol*�!�d2»RէN�o��C+=<�9�H4�s�^��?Ù ��@A�X���������|�˂`u��9�͝;���-�}�Vᏹi�}W�W-�:H�x�Wny��N̥o��1��9RI&��0qC�����}�s���[�����=s����u���'J>q��%���o��zR]��Ks���� ��K��iш�\l�%���E�}0��]��D�������;N�F���jx��-��~t����Z���� 
����
���,�ӏ�}#�?�S�s�R��\��#6v�%Q�E6Q���Cc�h��]�qv�����21��]�:8�a�9
g&Y�����Bx`X�?o�nl�a�\�q����6ptW�z*H�|p=4���
�d7||b5=>��}(r�g�%�Ѐ�4��l�����4�U� 9�$��v�x�9�����.�vXH)���@4���\Q��4ࡅ -�F�ɧ���PK0�9iO ���SB�>�Ю�|"�' ��a��4@�3��֓�
��P�!�FZ�/1�M)�M�08~v
�b$�!}� �*��j Y�'cZ,�2B܀|���������dldo4�v���؈kk���g?{�-��3<<l�t4�@����8�o�u�i���:4yAy�����!��gh4�8݆
�n��9`Ș�A��GI$��?�W�p�f㳙�KɎ���;L͓�;��[xI�;(�l�,�hؙ�Q��;�*�Fy}�,B$<�\�D��7�Y�R<.��V�w²��9��\����Ƴ�&�Κ
|����%f�I<%����#V��-���)����g�V��e�e�fw(��򑭤̟�=1�
ef��I�����2/���͋;��#�@�ߛCc�e�)�G�$V��蘴`F	q��,U8��⮮�t�~�Y�z��W�yJD1㢘6NC.RL0�L��-Ae���m�b�:�T�N=9�������$���
=���P�zòΝ?;���h����78��f��h[$��6�V�����H������?9(�J"��ewW�ܥ��퐄[�$���
���cb��+�d���bQ�h�+JJ��N�$�R�_�E����/]v����C�e���k�OZ��Sn��W^a����Vh)�j4
�P4:v0y��2���#}9�	�� M"�x�fWejz|�t��'Hr2%�[���+m��f%f�:69Y����2�M
�w��R�VÕnɝ���ҠA-��Fɞ�W��ۤ��&��ŋٷ�ݻ�>�}��n��ՠ%��v��QU]]���{o���n�-��V����*j��j�mͨ6g4!{;Z�U�*��A�ҢH��;�J��� $*��f� ��@�?�g_C��]ɐ�.RGx*BG��P�X��S��7�X
� 2\F�ɝ��j�hH�%������;y�/�n��Ci����(�X2Y#�t�`H�`�o�����7����$$a�&U����ȝ���o(�C�/]��sm��]�~E���z3
�����h �h4i�;������g�N���6�[��d�
�I�ݠ8���x���F&�Gh�*(i?$T�w@�=�C�_(\۰ṋ�q�,^i�y锆o]��pv
����,�?�j)hk!��:��߿�p�
�j�H��Ï+��U��#�g��X�E~s�}��'�F�;�PD�G��ᘼ��/�m�KO� *����.�ĉ`�d���#1�v,�Dxx����2OM��$����fѹ	��f���
z��k���q�]
�P�xH�����ۿs�����C��F�q�é������LV�\�
sQX�b�y�?�7��9���c -I
j9��!�/�+Yq�|���p�tϱ<<�z��K�	T�ʕ��IZ��M6���ϫ/K+r�)����9p�N�bt��?�"��|�����;���Ŵ����x�j��{
�v
FBfQȵ�/a��lv;w��w��z������z��.��=W��,��"�<J���w� Ka;Z��$t�6?��s/E��n��ܼ���Q�'�����'��d��p�;T���]�������Gc�--3<%%���қ���2�[�ͶJ���f2O>���?_x���qҩ_��:�U� �0�3Hӂ
�]
j��|���j%����)�'+�y�oo���iv����]ZQ��ǒ1/�����C/�ٶ�"oe�qFu��mHq���S��0Vl���e��#� �
g?tC9��
��$$&i�&���Oƪ��.���682f�����Q�d�5���ƙ3Kڻ����)�R��\��ju�Γ�d�bFr�cQ��@}&#���R�kA�V>�`0�%��j
�k��aq8�v��f���c��;����
�$�]�^�R<��U���I(HE6�H�!�,�SW��ͽ<<H��k ��`^���y�4���������}������G��;�֭� \C.O�_x��"`fJ���KR,p]
\�&�+���7Q������:�#8o��iod�!d���\H��Vs��$��Ea�ī"�-p&B!��)r�<`��tw�:���62�"�I��I�#����e��>�n����N�����:I ��1(�A�)=�c4[���sC�#UT;*�m��ʦbw�T����a�<%>�!T��?���ջ��	ϸ�s��L���!&
*��۷����E?�q!5���A��#O R_Gx�䔃�'������e�֯�����t���=��5�H8�����Bx?�ӴL p;��b۽4�e0��/X��k���u���r0��l�6�'�CXھ��.�B�!p%%A�&ֶI6Q�ϙ���8��A��p�����$
N�M�c[�Z�N�q��~;�%�1)�pG��!�6��@��01�����|���
����~۟-f�&�qE%lH&�3^��P|.���E;��e;�eG����׽�[��[&0�p��TwG�p�ۍ���R���J撝(>!�f��~�΃l4aa�sѢ�(i�ȽBdB�,��N\����&�h4���+b�O��{�666�R�8�lJB�/4(������\*\����~AP���e+V8a����)K
SH���\g����-S�t񲈅JT��[Q^�HT!���pp��X�7��N��͏��kA�P��vڤ�x=އ����w���G3�a&!��q��'�D��>�O�]�ge�0DLA@ 6�9�@���� H=��-���U�U�f��%�,�N�2���B�����fQ}�Y;�����a����F��BjF��p�ڞ�<�,<���?~*����cVm�#������M`�@*++���ի�3j*\pJ���b�H
�9ր�xZ>!�����0��M�\e��ƭŨ@����Ӓ�wwT?��/Hcc#�P ���7�߲影��]�eˏ�L�l9��C	�Pch</�az�!JHg�`{{&5G�/�I. �L*"��rh���g|;�B@�FT
�q�����)���=�U�I�H�Q��̦�ɦYyH��)�~i1d�1z�%�2!Ϡၲ���!]��Y����?�BV匜�/�4��ܳ��Y+���8����`�h!�_��pS�ac�A��L*:՟ՙ@�U�S{��m��pd���;�TJ����Ԧ�aV𔂑	H%��
G�+I9�͖�~���)������d<�������z
�j�w�mm�Ο7o�z��>5�1��n�[�:�3/!�Bx�"��U�����h���X�d�l{2��6�6��7ߪ\���K�$��,������{ſ��s�'����i��y���:
�MM{�4���V8�;��'���u
�i���,y��[x�# ���J�93��L?@����C�+�56s-�$�|�X�Kv~qh�:�#�ZI��K���꼬b����o~q�ۯ��@^�)/m��u��z��#7q�	;�v��nx���;�8g�\72I�W ���3�ө�:%J�F;�L�5�J���3�g�n���3�}ojީ�kV��j�ڻ�g<a�f�:�%w��=8��)��Y5yQ����4���Kʒ���_���� �������'Z]���ײ�|l1����n���z�s��0���欓�%"��7mz���a�
$�G!����$�.�.���PjJ�V� �� ��I��K��|�ꆒ��X�Ӭ��k�#���|��2������OB{�������Rd�y(��hS$�::��9�:�z=
H��C\I�>I����%�4\�E?G_���~7Z7{nLXHr)� _�?���.YB���l¶�U_�*P����ZQ+�i2	IaHd���uWL�)D�na�`,ft�OG(�6�YM�/���K��wt���i|sR�s�3�9��+
�9
w�i޳�C��%.�
~���]�t�u+-�_�c�e'�u���MD�[����x�u���[����A�h\E �ڀ�|/��i�_B�Z8�욤���O#J MɔH�H0�7�ɘWN�N��z����� ���8�N'HŌ
96F�����.��?m�8)���A3���\cwN��<��+Ӹoӳ��gc��՟� �M��F���;[�5�΂�S�?66*�a=7��Ѭp��>
��b"͍\��1�6�l�(i��l���2L%0��Ҿ�n��T�2v�
�Z�5-;� -�JV�j0��y|}�[����1o4O��������=�� �L���\s�5A���y�?�tEY�Ź���BF�7�p�n�}�%�Zs^��\<���F�)�
ԵD�Q�SߢE7Cc�LJ�_d%��=��DR�љP� a*F�M�x_t�=ػ��RS�
0)��}�^>b�
R��!l������.�A��+1%F���<�����@��GS�|�c#�5�������K��>��a�C� �Eg2o�c8��Axxh�Њ���.����7�R(y=N	>��h;v��<P�� �����W]!��{'�|�_x8(����|������S�U(�s#�-4�¥K�D~��W�dJ�C^
5�2�Q�}��ਊ?W	��7����ǄVc}�&,Ζ
�,��e����U����x/
X�V=�u�[2
��$��������S��B}"
��Hw���5d�� sz�9�Nz }Y���S���n�O4��v�f��Lh�cBQ�i���q�#}��	��F�������������i�����V�E�U��d��|�
 ����}t�+���T�h��jkk�E19H�\�!���,cd&�������KЗ��d���q��0=�	L�DZ[8�v�G���64*bc��v.��,̴N �I5��v��>`[in���J3^N�qW]_��UT0���'?�h��|�iS볏?;�W_-��Mft���0�c!NTܫ'�J1L�v���p����=��]�?� ���x���vX�
�)bt��G����������=L��v8e�%i֓��K5�V�d�jj�r3�JRR���C�t0��68�1�(|<�
q<��á�}��|T6�A�YoRMqL�7�;n:�C�n�Th���~����r�̮�|����Sʤ�kmn�����1_I����5/|�b�cB~���0�S�Ot�x�D#���d[��M`���C@8]���VV�U����#3B�t����+AF�'�"��������``�]�U��Z�,�lJ��7	�_����f��J4a��F�I�: �X����e!#��gZ'��ƒ�!4l�I��n	��L|�~҅h��� �IÅ���Fa!Lu rT�/3J.�$�5&�#ј���]��&���F�о��$��1j&�X�NCK��9���gs<���JM?���iu@G�ٍ��<��C��4��i%#�&u�F_C<�����sӧ��mF�G� ABtf����	3�R�+�C �T�h�i / �.���B�d�����m�:�`U	y�#�1%�o֦<[�������PH�U Ղ(׈�F��?0���b����d*��@�:]��ٳg���ӱ��Φ����O<�����'w�Q��^880�Z]M��z�xY�����k��/�j NL�J������gͮ�]���h��b�
n�Ml�*��܇l�q��TUu�ko��h�ϼ
��U����3<�|iżP8�+�j�C  @ IDATWxGy#������c��yd+�0���Vin}����W���-�W����M�<���'ܥ �/:�ʃ��cܷ��5<J�d��j�'!wE�K�
vW>���3Op\t��\���vЩ��ߟy��ᝧؐ{�!:th䔘�r���.�@#�v]8��w�{1�aZ'U�P�4��b�$r	��C���9�x*S����ﭞ�E5\!�+i��5�Hiߞ����X�buC4�|zTUu9s�?0��i]��m�ӭ.K]Ғ�j+S����N��REl�y5n���!,��������Vm��?mջ�mgQ\��r�LG$w����{�s8��>�@��ʲ �CK_B�UZ�G��O�;<��U�
�[^:�M�|
C���R�g.^�u>��vD��
��$l�Y��x�]�zS:�=�KϘ49�T���O���?�sB�x��rc���hL��O�e���?�i�Cc��d���x���x<�2"|Ǵ�Q��,��T���bEp��B��b�А������8��Ն�K��,�&6a��5f�f��&
��6��wI	#���_,��9�۵/*�g�[Ey���$�S@F���ݘ)�O<q��y���8妛$�c7��b�	��<#�[�Y���[�ˎY�[Z=g̘��M*`$غ���T�������Ə}�c�ݻw�K�.5@��r�1Ǆ���,^���D26��!B���.Y�D���7^�x	�0��.��T�Gy��|Hk<�svk-t�_�}*-���uw*�!z��֡�'b��ś/����L��t�C��s�UW�zh�DL:���(;o"&�	���4����S��҉���vv~l�pɴ��������N��֧�'�iݯ?�y���#͙���T:z�����і���>V
�y�:N�FN�"aikC��U'�r&&"C��S�;�x�R����b	&j��QB���`�$��~�.\L\���
�ت����E�Q+O�(C��'�m��cr�<X#܉���gS�@ū�?(��h$*$����D�W�d���qh���^�K'�X8�l��0�ڠ�_A�BKR�!����LÐ
�,��Q�2�o�����M��b	Ɠ���ǘ��=j0�F:��_��Ol�uDJ��y�0R��j�%�����7T��ܓ�~Y/-ٷ����6�s�S~�Ǹt>�n�r�����{]w�m%�r�I2������m�΃����~��y0؆�M�L2���KϥA�gK��/������ms������5�LA�V0HK�)!��n^��.��)=�v���~�ݦ��Rڻ�I:�G^�+�\���'-�Ń�rip8*4X,�fZMe�������w��>��?ku �֯�������i��3m. K�.<vRC�t�	F�KJ��=]�<T�V�ܰh��!�V���̖,e�Ń�����)Yf��ϥ�c�*��ta7�g�6�X^��^7��L�\i�!��aҀ� �8+���Ã�o���Orp�~e�߆Sw@��۴y��!?��H8g/��K��(o�9��P�����Z��l^wr9�\�Ȁ��
�3����(>�z�{dX:}q�Yƣ�����&'�㖳>|g��;�;���c����O^uU��N'@��>���SAKF�Q�Y��;n��@��V"����\�~=ww���f���@��.mA�Ҽjb��O}�$�G��1w�C�Lҽ����$l�#)Fہt?���ɊK�~�%��]�\Q�֜}�_�;U��r$U�K�����Gx�%�e`(pWvȊ�g�Ƒ-���H���2���Y�OD�*y���|f^�dx�ڻ��W8� �hp����x^q�q�5�s;5v�,��X؈���E?�7M�N��eD`�ae�\7��V�u��^�W�D���[�r��_q$���1F�9�+p=��J(ܑk6�\��;0�%Z�r�Z:��@�J)]�~.8��>���pR�Z���*��V7	
�q���
8������ԴZ���+�A���C~�n��[�����ܷ`�a��v˰h�~�$��\!lLA~��x\N*��P�E�b��J�$��C٧h:O���Z�Uhh�׍
�����0Mp{ݾ�d[{�2��B�m�j�,��NPz:O���~��W��4�*ǒ��p�_�ǃ0n����+Uk>�	�?�e���4��qٞ�@V�^����l
p��Ks6i�/�`���'�4ӏ8��7�W�(�f׼�3�M���zr54~�hH�]@힫5��I�C~�hY�A���{���צ��
���h2���W��.���}����a2=}�%�0��W��U�&�^Rb��q���K�n�g�������!�������N�9DN,B���� w8<�D"����b�se�-_��%�T��nڷ�%��7��:h�Z[7,Z�`��+Ͽ�����ue.����e������A��dyy�l�PYZ�[NƯ4YS/�z/��'���K
�M��í?8����.�{�I�-��=cܐ&v�t��9p�9�W��	��|�X8�B �#d��1��I���'^R{zh�
>s�!C�2F���M��
UΎ����Ph�7�1���Jݼ�s��x��M��z���(ҽ��c&����¡��<�(�p`9�vͽ1�}�S��r-�Jˎ[FZ����o�7��a�!g���"ZA��{Om��|�~"��B�2��B�

%L��ܓL�(��7��2�]{�i�������yK��o\��3~!�t�q��&6r
f�����^����b�<�
0��q�B3w@
��.h��GZ���z�E57�W@�������vy�$�@�x�	��F����j��G�*q�ћ@�Q(��
�uXmm
��Y�d��/F�B��H	��`W�9T1,"dO3���f�)I%i�6wrhdش�M'�v(��O#�`6A�1��p�-@���9ꇪ
�l0���c��8O��`*`Val0&�kc��SP�D��ަ��+#�! ��1��S6��ex��Ƭ�|�R05�1���������*��IM@Y^IƔ�!���i9
�t�G����!��78�X4:4��i'g��0N��žGI'u��Gc�(�b�����
<�����$�E��p^D������[ `�. �e6�(
�CcUC�n�
Q���G"������_yU����N �*P=L����]����Q�@���G
<g�� �U^r6M��dB"�d9FI~u�;��Q��z�����G�Gn�;�\ $�2�5*쟊ʒ��90=x�w�m�i���p<��g(["���p��Q�@9�E�
��*�b�"���6Z.�`�@\�\8�`�n,]P[�m�pL:w�̙M�dsB+!76R&�{����^=���r�B�l��*Yo��ёYI��g�̩�eW�C��g�FSYy�a�*l��#��J
���ʂ4R~-�^}}}�!i���G>\z�2!�B�s_2	�u����*6��ʁ�ā˅��\��l��8�=�ˎ�����7����i�mPbu��B�hJ0� ��1�a�d�U0�ݔ�`��H*�ow�C�sl���uӦMv8��F�i_�����u�X,.���3���?�T��2��UjwX�f��QS�?�ˤ�'U�j��r�SC]��d��(�fwg���:Lk(8 ����;^�븕�ܔ��Q}���(Ц4���JC"I#�L#;�H����Fpg��(�0s�3�qD$4&G��dܟJ%�g0.5����1��-�u�{�CCs,4f��s�H3V��s��W^���F+I�ټ����*��ǈ�#�F�D*a�P��{�/�N��1�_-�����p[XU� �����y5d�OxX��>�<N��gx7k�D�i��⎱X�s������3Hc&!���U�6$�*dB�� ��f4����76�${e�HF��E:��a�(���A:}�m
��^�Q�˴"��	����J�r�t���c���r0-RT�x���3�	ȩҁp �7v00sf�e���FK �N!KL�Sb�l
�"�jJ��}�SN=��@��t��apEq'T��?<W�+j���=;��O>y���-[z�fΑ��}MM�`���ڇ-�Įb�Eđ\��dp�#�� ��15�T�h,�F�+no���Yd�qr����q���z���;>Ã��N.�����<xp���?_ʃI$B���A~��` ������}�Q�LF���Airr�y������n��utD׮�Y�	�"s��(+��?^߲��EM�`�CLM&�p4��@8��)−��?"�y�5�;���3��Q�>��崍/4y��/���N4�&���x�ں?G��1�>�U���tz���|����{�K����K-8�`����a���p=8�%P���.Z�g�pP����΃󔩋�aN�`��l��n�3�P�@ދ���X�z�Ѿ}T�֛���&�-��l�&,;#�����W_|�y��4 zCY�:��f3��?���p���Gf�<�[��Pk�P}K�pJ҇�j��np�&1�
�aS0~rd<�N���3��ʲ����N}�����q���w�gC�2F���#<ԱࡇL������(�CPOG��jGV����-5t�ƍ�$�Y���H��C�R���<�k�}[�ɫN����qǥ���A��DoooM[0r℔�t~2����o:��K9?�!U�k�����Y�,����K��SW�*yw�K<8����2K;p�]*)�j_��������ǖ���4W)q�r�G�K� t����D��H#�j3K�m-XO3y��6+w���%�y<�K�F������MP��'c�R;w�ڡt�+����ğ�Xh'1t��b��z���-�<��	p$��$��K�:��~���_,�%�G[��SӾf㼙uW�������A�����z�҄��\D�;'f	&
K	���;8��\}�Օ���[�X_ZVQ_YS����}w������
�sp��L2I��������O�m�z�f���p/n���lq���*�vf'���m�h[�E����)�U�'i ш��gE���>�x;i�]ұq,.�c �<T"���9./��*|��l���=kCI���9k���ݼ�?�4��:�ټ�c�ߚ���}n�x�r�k��|�����hD2��a�3!Z�N0t��!�6ʰ�1�죴��T�� �:�$%��ϱ:��f�F��KJDL��ܥEF�y�'�L��P��N=�L��p��k�20X��Y_��m�U��>L+0��X3��B`���yddt~eEY+vZ 0C�H�ٔ�I0{(�o$�ZL���2�h�0�)�hlL��ci�Z�*�
�d;V�����WL�̟P/N��!���T4	Vm�����;���Ua��,�7%& 1�dxg���I΃i�����~�g���PW[���6��D~���N�F��g��!I��m���`ޥ<���
M�K�
�i�@ �L,!2O7���ͳ:߽���w���:�XP�\��O����S�?���q�����30i<�o�0\Y�&��xgO��/��YP##�;ǖܳ�/`r�N=�8S��5�#���"@������)XPR��,�p������!8y%��Ʒs>�GO�2�i��w@�
���bN�5sf�q�0����Gv;N0a���ܾ��'��ص�0�ӹ�f���/I��n���������������,
�x�.MGGR�������MDА;�?���x* ��w���nJ4�*�jW��t�z��J$�2*���a�~%��)V	~w���u��Ql]���אR� ĝ=�	��<,��O�;pۓ��<$T�"��bLM��p0?�(�*�D�#�����&%��{�G{tb�!�"
e�58ŧ2	(��2��Tʉ��4E�|�nvV1G̔��߿7C����l��E""���p<�݁�����Q��W�O�O���@pp?����Ҩ��XAҍ��&D�����bڼhd� ����I�u4;�b �u�},�'�ܺ툿2�pi��v�d��c"�C�@����h�ꍿ��}\>\�q�<4E��Z�2�ܶ ��H������@\��ǅ~S�����u�2��p� ��h��Ŵ���[K\��N������#����H�K��{I+�`�`ͭ�z����.��Ê���y?� �o�{�6�ntB0��!(qE�*�z0V��V�*���@�&n��+��.�V0 ���=�Nj6�3�蜆�:h���즛nB��L�ƌ�
C�GxpD�}�D���oF:hg0�R��%��!�,V)��}��� ��#,�y�*�;�z�Ja�p�%��ð� ������׭����˪�BUU�zU��׾��7�����w��ً���{ӟ�l���.�͛��5;���f2yF��g��,Y�`0���
=i�+��+
����b?4ۥ+���A~�2��(���MZ�F�����.������<��SN�NBOx
_IE��3�jcD��*���TrA�2���]�;v�Gr�|DHx��߾cf��k;�4�XBi�*�a�
#�D�Fhdߏ�-��p�u�Y.����.��z8�"���o���=�f2�-F��T=�*	�`�f:��
���*=�>& ,&�kf4\i��z�*¥ʪ,���u;=�L�H������у�
���j4�*���+,���8���	�o�3a����B�$b|�ᱪ�^���|��^���lު���8D[�^�#lC��(K�"p��U [*��d�u��I	d\lqڤ=۷s;����*)XT��t��2��L�+$L����(��r�b!<�p��wb��B����'��fn[	'�ٿ��o��|c��\��Jj݂0��~����NV�}J�@�-?l�-V��?�?�_�
�%6*�w������Mĳ�5'^��}Wˬ��#��M�.�i��6�-�8�A1�p[[?���y���U�@9�����׏͘a�
��qW
��$�Uz��'#�h����+�j]�!���˟�>H���/��q�Tt�A�{nx,qẇ׋�3���B:$�~�3]�ʚ��E\��� ��&GG�5Y�NI��P/ǥ���w��SE�OZ}���n�����b ��U��O����t\��O.��x/���7{S|/́Ǥ�Z��Z
��
�aD7DC~�4J��`oO{��eQ�/�������<�.O]p�0:-9������3'���8
'z��o��������)ۼB n{�i��љF��t�2=X��?:TW�c� �P`&@]T����քB H2⒐��:�D�gne���"�\y��j����v��>SIKK��	�u�t��W@���N`��N�3P�O�R�D����ټt:�I��7�1�R9�3Q�߼<Pj3�2��U�p�+F�:�ֶ���N��Xv�UUV09c*��X����X:c\��S�W�b��~Ā���c��l�|�-�l(n�Ń/�Y|�����ߟ���9P0s6rA�cɌ�[�h����	�xgg77��Y���L��[���p9K-.�Gw1#�V�%�.�jm����	�>8�o��o��hv����i㋴L����N��K�����B�K��B,B$�����ć����޴��)�NȤ�e��I���޽��$ b��+L�9�` �/2����<P����Z�K׸SMGw�y�8�}l�� �Um�92��k3�\�345r�z�?���N�=�=I�='��d��
zKA�%S��;����܆��L9`���=��F05��H�X�����q��Es�0d�1թ>h7����lG1�OM u,4��:��ޅ�~fGC��p;$��&�{���w�F�ᗨX�%�M�5

��]���@(	��Qb#C�7��o߲��,�w��vK�νM�������ܨU�j8����il�y�xĔ��_z~���]�aJ��k{���,\���)�m7&ͩ��/*��ؽ{wCF���r�S���tw_cI����̮�J��y�y�\�*�!!!Q���46�-`��O�4���-��k||�~-�>}4��n�� dhӢ�D2�BL%��J���֭;O���}��}�����om��s���>���^{����/6�Q�#�Km�eYsM���P��$&������G�O}�S�}�Ὧ����|c�peݣc���c�t���1h2hV+д�閲D��C#c[��G���1mϮ}Z$��ٓ�I$��o��-���������X�,|��c������q:�,X�,YJ��3?��Yڂ?f���>}�'��F1>�4�/�a �^g@�%������/.��-3����s��?`�uM'ާ��šP�ㆁy�O����'��IY��7/��K�D�v�҆Gƴ	\�	E¸.App�,�t���,'�iq�`ŉf
M���t�@t�Ϊt�T�Ѷ�e4���]���~KS�%���C ��^y��L����,t79{����W�I3�  %�IDATu���U�Y�y�C	#b�U�	"��Q(7�~-�^eNߊ�ǀ�3{΁;�w�m�	u�
��A]T�ZE9���6��(��xӕ8�P��"�M�?����%�.�|�
@�6��h�"�����l��"1�%!>%� N�ֱĒ��NvVpp*:b��1�x��L�O[��u 6iX��BH#`����Ə��\��o/�I�y��3K*�)T6�by`ȕ*&ꫫ�����g�)~N���F�*\@��Yܴ�h���H-@�r�H��.�P�������u3\��"�
���/�4y��eIs�`f�&�\j"]�;�)D�aK�����@~2���0��"��C��GЉ	n/�a�<�GN	�3N7��a��;��7���(-�𬙌u3Z!�f��FJ�я�.�p��ŅC�5��#K5�p�&2��Ȱ�CР�[8�-X7�e\${�\��v0���H	P^�Y�j�z�Z܎��k>t?��H�P<������%���$0kQ(��*ʔ�B�h_J�|��l�ǳZ�@�F�r��2w�zKm�r��q���%4lС� Y\����-_��8�(
ӳ� �QO���3+/�������<z�2�4��P��;E,��[�Д��~rRj�0kUmV�j��V�nK�V
��bџ��JM���‛F����K�۪��mVN��,�X�M&({��?��c��űw��֩��(Σ}S{�G��G�
I������X��B\�C�M7Yk֭�����7��HLYԾr!h��oͥ9�\��0{ʜnW��W�T]]�^��!�@S�hBD=��.*&�`z�flD�%Kʄ)��)�.&��i���N9�q,p�/�n���������#����o�eW�y�(����3�@��	�Mr���vJ�� �~R!K9�9Խ<�,1�h�m�b�G}��eSXK\"J��B��˪��� a�y�t��S�ӧNI�Q{��`�E:`�rֹS���:n+�xT:���~?a3ځ�$IO�T|s}S35PW��,Y[���];Ǭ��>�X��盅��g��򏘅OLL!m)ό����9x���d%^j>����9]B�<��+�y@�sI
;㈸�;�8D�E����,NRM����tt(��ڳ�8/���]�v�9�������о�$b&X�2��2��6�� ��I�e,�]���74���2��7B���]'�pՑ1�9����҆��#�)z��i��?1WF����p
�8�X��?-g��<f��ƆV
��L
t.���F�d���8zmm����$��sX���9�{[�l��g��B�P�s
�-;w�@�
�ֵ��:���������
ٱAŻ5��l�b'��Qh�X���P�t
M����S�\b�G�Y͚L�T�jIU�������b�TfI���N��JA�M�b*�=C�~��a�x0�ܰy���9p;k�qN�Ӗ�n��߸Uፎ
yJ�Ȱ��Rϩoc[낻�������~Ы�X�x��jq��@7=.�����j�x$��׀eN��0�
n\���0;��+*�l`��$��htA*�fcn�/�C%��UR���ћHM�~��us�7�G&mM��#�Cg�G'�,v+���D�Ԑ�ϱ`g��'���z-��q��W�ʐ���C��Վe���o�Uə3��ں�cfᑉp2P]e��L�G㞪SFD4�鯩�ʜ��ߢ�=U�(��H�DV��3F����S��,�Hw��6'dO���2|�;ZZ���h�'?��xn1���xbٕW|�wm�gQ�.Ǳ�Ӧ��`2+�E�'Z��v��C���Xm�ZCB{�����������˟q�v�ܯ���7�~����y�)�+�CB�:�Vx7����F�?��,�B8ʏe����桘[*\gH�:~��рf��e����s�,��0��Lm��p
���O��|�+�Zt����|�׾2��&"1\_�]�	i#�A� \a�5"3m~3�Iqim�1ƌKf Ͱ8$�l��:G��$6��r���Ψ�W��\\��g�#`ځ ���U;�@��Z���J�t:��99u�Υ�Ɩ�6�Mª��+]ۘ���ײ2�aRh�+� "f
�0�����~��/(����Qq4� چI�E�h�F ��#Au�oB"��v%��K��BH����`pI��K�s��ž�,I����L�J镽��̑��,<��I��y	Ƣ�xΐ�P�YL�:�y!Ah�w��@��/>�"�x$,����P
�������ܯ�=	������M`d�8��w�	���Y���_hN�r�tϣk>��
K^��W�N��G�X����J�y��@�k���S�����\gg�to�L����������ׯ�.:��>��xxɃ�y�KH(�?оH�f�D���:�� iu��Fu�!���c��v�H�ﰙ�@YmL\1Dc��D�IT9��+��i��`0R�=5��r�.@cF����Y�)Z�K���ћ�-dN��[YxoO�W L�466�###��	;SHQEIܚ�V|R�|�#�ǟy�,N��T�Q$9���(��B��؛A|	�fa��~�~+��g��k�"�c��
D���@Lہ����DR����J��t�3I����`���<Z�*i���`���{�$��m�hq�Ì&�.��[�gĺ��Ou�a]��ٶh�ޡ r$�����f�$:��c����eF%�!̆qш�W�(�X:q%�)�[�Q-�?���zjhh��;H�Z5�����h�w�`r.��Ǐ�]w���k��ځ��MMM��&����=���o
�"=��c��
��՚Wq��｛.)�)"�����~���_����'��M�"���d�k�4._�P�	�5V>�ȭY�֘�%��\&i��)�R撱d<Z]�s#lE"J�?�4ր۾��$_���N����x̡�|V-��O<���D[s�R���ۍ���`�wL9}&y���Qr�rÕ+��G��w�32<��ln��A«o���#�^��
G���1mx,�=����~�㟛�ҟ��#�9�{����c������=��ܯ�V�M7�ȷf=�ܣx&���^��;�{�ܯ�=�[�^��֫����:tK�{�sV͍�����}H��ھ{�7��=C��0.ô�*�D"����&�{�8yb���wi�h\�4O�68<�
	��qǖ�f1ԴF�6ckⴾ��J�aE�_s72<z�,t�֭��G�J9h���6�����c��N�# Jeu˥�)ή��ޢ�f�kF��b����3fq~��{Zmn�<b]Ӓ
�8YҞ���bD����Iv\У�-���G�ѣ�������M>�SK��%��[��Z暶��L�3�A�y���1�S*i�����w�ڵ�@  ݣXl�ZW`��e���7>N�}�֭���>`*�5�z�?�3�g�g�)�S�݊=�q{o5�r���C�&��t��&7;d����/ �֮4������/����h��V�YͿ�P��
	{����$Dn�e��Ą�/�J�"
�o�O�xkD�R	0wUh܄�R�DT@*�@��^��`@�pAb��c�̞=
%��w��Nqٝ���h��=9��
#����s{9��{�j���j���/����`*��BG�R_]kݸ�A#Q-���V)��eԕ8GA�P��w@��xj����Q��$萣0���f=4�����."����,܃De�1/*C<�@�Q��<tn�ARQL�+uz��*Y ���+P��j8����6����UoT�D��Y4J�Ad�.QZ�v$�z:Aj���G#z�N����O4��y������GbA����N���M�<u���nb �ׅ�:L!�*	������J���D��X�N�:q�/u�ҹY�S1E�E>TD��::�����!�͔t6����*��D�PtB��;*Ό���xtx|�l�*_�� 0#�G��F�ЈhV�j!�E�8�p�FC��^X��W@�/�e�s����z 5é��D��hj��g�1�P!(��qxq�/D
F4J�kpD�z@$G�����Kg3��g�Q��Qմ��P�C���N�xd!�:��$�/fjI蘸�)�V�H
O��ϕ��B*�.�h^(;�*������w�ՏZ�b+87���=B�ʁ��j�{Ѹ�	��="�D�c�[�xhv08�"v^�˽qh���w�����z��#ߺ皿���_F�i�g?�ѷ�{�u�����Q�θ�L�>y��g���NOm$�u�;� KmF��b(��ѰW�IKk]�,^�Ć�>h������h�,�)5�־��`�3���ssɉ\�����FS6����0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #��A#�� �GH��c�    IEND�B`�
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)