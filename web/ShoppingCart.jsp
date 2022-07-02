<%@page import="java.sql.ResultSet"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Epic Food || Order food Online Anytime & Anywhere</title>

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
  <!-- fevicon -->
  <link rel="icon" href="data:image/jpeg;base64,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">
    <!-- custom css file link  -->
    <link rel="stylesheet" href="css/style.css">
    <script src="store.js"></script>
    <style>.close {
  cursor: pointer;
  position: absolute;
  top: 50%;
  right: 0%;
  padding: 12px 16px;
  transform: translate(0%, -50%);
}
</style>
</head>
<body>
    
<!-- header section starts  -->

<header class="header">

    <a href="#" class="logo"> <i class="fas fa-utensils"></i>Epic Food </a>
    
    <nav class="navbar">
        <a href="#home">home</a>
        <a href="#about">about</a>
        <a href="#popular">popular</a>
        <a href="#menu">menu</a>
        <a href="#order">order</a>
        <a href="#blogs">blogs</a>
    </nav>

    <div class="icons">
        <div id="menu-btn" class="fas fa-bars"></div>
        <div id="search-btn" class="fas fa-search"></div>
        <div id="cart-btn" class="fas fa-shopping-cart"></div>
        <div id="login-btn" class="fas fa-user"></div>
    </div>
    
</header>

<!-- header section ends  -->

<!-- search-form  -->

<section class="search-form-container">

    <form action="">
        <input type="search" name="" placeholder="search here..." id="search-box">
        <label for="search-box" class="fas fa-search"></label>
    </form>

</section>

<!--== Connection ==-->
<%
    Statement st=null;
    Connection con=null;
    DBConnector db=new DBConnector();
    st=DBConnector.getStatement();
    ResultSet rs1=st.executeQuery("select * from cart");
   
        %>
<!-- shopping-cart section  -->


<div class="shopping-cart-container">

    <div class="products-container">

        <h3 class="title">your products</h3>
        
        <div class="box-container">
            <% while(rs1.next())
            {
         %>
            <div class="box">
                <i  class="close" >&times;</i>
                <!--<img src="image/menu-1.png" alt="">-->
                <div class="content">
                    <h3><%=rs1.getString(1)%></h3>
                    <span> quantity : </span>
                    <input type="number" name="1" value="<%=rs1.getString(2)%>" id="1">
                    <br>
                    <span> price : </span>
                    <span class="price"> <%=rs1.getString(3)%> </span>
                </div>
            </div>
        <%}%>
        <script>
var closebtns = document.getElementsByClassName("close");
var i;

for (i = 0; i < closebtns.length; i++) {
  closebtns[i].addEventListener("click", function() {
    this.parentElement.style.display = 'none';
  });
}
</script>

           
        </div>

    </div>

    <div class="cart-total">

        <h3 class="title"> cart total </h3>

        <div class="box">

            <h3 class="subtotal"> subtotal : <span>$300</span> </h3>
            <h3 class="total"> total : <span>$300</span> </h3>

            <a href="#" class="btn">proceed to checkout</a>

        </div>

    </div>

</div>




<!-- custom js file link  -->
<script src="js/app.js"></script>

</body>
</html>