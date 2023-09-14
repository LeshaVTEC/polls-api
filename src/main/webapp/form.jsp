<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
        <body>
        <h1>Hello, bro! Leave your vote!</h1>
            <br/>
                <form method="post" action="${pageContext.request.contextPath}/polls">
                    <label for="singers"><h4>Choose a best singer:</h4></label>

                    <select name="singer" id="singer">
                      <option value="TRUBECKOY">TRUBECKOY</option>
                      <option value="SHEVCHUK">SHEVCHUK</option>
                      <option value="MAKAREVICH">MAKAREVICH</option>
                      <option value="KIPELOV">KIPELOV</option>
                    </select>

            <br/>
            <h4> Choose a favorite genre.</h4>

                    <input type="checkbox" id="genre1" name="genre" value="POP">
                    <label for="genre1"> POP </label><br>
                    <input type="checkbox" id="genre2" name="genre" value="ROCK">
                    <label for="genre2"> ROCK </label><br>
                    <input type="checkbox" id="genre3" name="genre" value="HIP_HOP">
                    <label for="genre3"> HIP_HOP </label><br>
                    <input type="checkbox" id="genre4" name="genre" value="PUNK">
                    <label for="genre4"> PUNK </label><br>
                    <input type="checkbox" id="genre5" name="genre" value="HEAVY_METAL">
                    <label for="genre5"> HEAVY_METAL </label><br>
                    <input type="checkbox" id="genre6" name="genre" value="SKA">
                    <label for="genre6"> SKA </label><br>
                    <input type="checkbox" id="genre7" name="genre" value="CLASSIC">
                    <label for="genre7"> CLASSIC </label><br>
                    <input type="checkbox" id="genre8" name="genre" value="RAP">
                    <label for="genre8"> RAP </label><br>
                    <input type="checkbox" id="genre9" name="genre" value="LOUNGE">
                    <label for="genre9"> LOUNGE </label><br>
                    <input type="checkbox" id="genre10" name="genre" value="MIX">
                    <label for="genre10"> MIX </label><br>

                    <input type="text" name="author-text">
            <button>Send</button>
            </form>
        </body>
</html>

