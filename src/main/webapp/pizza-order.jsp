<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Pizza Order</h1>
    <form action="/pizza-order.jsp" method="POST">
        <select name="crust-type">
            <option value="stuffed">Stuffed Crust</option>
            <option value="thin">Thin Crust</option>
            <option value="flat">Flat Bread Crust</option>
        </select>
        <select name="sauce-type">
            <option value="pesto">Pesto</option>
            <option value="marinara">Marinara Sauce</option>
            <option value="buffalo">Buffalo Sauce</option>
        </select>
        <select name="size-type">
            <option value="small">Small</option>
            <option value="med">Medium</option>
            <option value="large">Large</option>
        </select>
        <br><br>
        <input name="toppings" value="true" type="checkbox">
        Peperoni
        <input name="toppings" value="true" type="checkbox">
        Meat
        <input name="toppings" value="true" type="checkbox">
        Veggies
        <br><br>
        <label for="address">Address</label>
            <input id="address" name="address" type="text">

        <input type="submit" value="Checkout" >
    </form>
</body>
</html>
