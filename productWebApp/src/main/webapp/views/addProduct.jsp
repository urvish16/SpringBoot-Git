<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <%@include file="./base.jsp"%>
</head>
<body style="background-color : #f8f9fa;">
    <div class="container mt-3">
        <div class="row">

            <div class="col-md-6 offset-md-3">
                <h1 class="text-center mb-3">Fill The Product Details</h1>

                <form action="handle-product" method="post">
                    <div class="form-group">
                        <label for="name">Product Name</label>
                        <input type="text"
                         class="form-control"
                         id="nameId" name="name"
                         placeholder="Enter the product name here"/>
                    </div>

                    <div class="form-group">
                        <label for="description">Product Description</label>
                        <textarea class="form-control" name="description"
                        id="descriptionId" rows="5" placeholder="Enter the product description"></textarea>
                    </div>

                    <div class="form-group">
                        <label for="price">Product Price</label>
                        <input type="text"
                         class="form-control"
                         id="priceId" name="price"
                         placeholder="Enter the product price here"/>
                    </div>

                    <div class="container text-center">
                        <a href="${pageContext.request.contextPath}/"
                        class="btn btn-outline-danger">Back</a>
                        &nbsp;
                        <button type="submit" class="btn btn-primary">Add</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>