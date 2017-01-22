<script type='text/javascript' src='webjars/jquery/1.11.1/jquery.min.js'></script>
<link rel='stylesheet' href='webjars/bootstrap/3.3.6/css/bootstrap.min.css'>
<script type='text/javascript' src='webjars/bootstrap/3.3.6/js/bootstrap.min.js'></script>


<#-- @ftlvariable name="user" type="com.example.zhouwei.User" -->
${hello} ${name}

<table>

<#list users as user>
    <tr>
        <td>${(user.getId())!123}</td>
        <td>${user.name}</td>
        <#--<td>${user.birth}</td>-->
    </tr>
</#list>

</table>

<form role="form">
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
        <label for="exampleInputFile">File input</label>
        <input type="file" id="exampleInputFile">
        <p class="help-block">Example block-level help text here.</p>
    </div>
    <div class="checkbox">
        <label>
            <input type="checkbox"> Check me out
        </label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>

