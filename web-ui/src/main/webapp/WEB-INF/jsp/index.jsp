<html>
<head>
    <title>Welcome to the axon trader</title>
</head>
<body>
<content tag="title">Welcome</content>
<content tag="tagline">Have fun playing with the trader</content>
<content tag="herounit">
    <div class="hero-unit">
        <h1>The trader</h1>

        <p>Welcome to the proof of concept of Axon Trader. This sample is created to showcase axon capabilities. Next to
            that we wanted to create a cool app with a nice front-end that we can really use as a showcase.</p>

        <p>If you are logged in, you can go to your dashboard.</p>

        <p><a class="btn primary large" href="${ctx}/dashboard">Dashboard &raquo;</a></p>
    </div>
</content>

<p>There are a few things implemented. You can choose the company to trade stock items for. Before you can
    use them you need to login.</p>

<div class="row">
    <div class="span5">
        <h2>Available Credentials</h2>
        <table class="zebra-striped">
            <thead>
            <tr>
                <th>User</th>
                <th>Password</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>buyer1</td>
                <td>buyer1</td>
            </tr>
            <tr>
                <td>buyer2</td>
                <td>buyer2</td>
            </tr>
            <tr>
                <td>buyer3</td>
                <td>buyer3</td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="span4">
        <h2>Check the stocks</h2>

        <p>If you have logged in, you can go to the companies</p>

        <p><a class="btn primary" href="${ctx}/company">To the items &raquo;</a></p>
    </div>
    <div class="span5">
        <h2>Executed trades</h2>

        <p>Trace all executed trades using the sockjs connection. Beware, vertx needs to be running as well.</p>

        <p><a class="btn primary" href="${ctx}/orderbook/socket">Executed trades &raquo;</a></p>
    </div>
</div>

</body>
</html>
