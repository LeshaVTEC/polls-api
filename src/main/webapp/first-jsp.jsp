<%@ page import="org.alexey.voteform.dto.SingerResponsePair" %>
<%@ page import="org.alexey.voteform.dto.GenreResponsePair" %>
<%@ page import="org.alexey.voteform.dto.TextResponsePair" %>
<%@ page import="java.util.List" %>

<!doctype html>
    <html>
        <head>
            <title>First JSP</title>
        </head>

        <body>
            <h1>Hello! This is rating!</h1>
            <a href="http://localhost:8080/vote-form/form.jsp">Go to poll form</a>
             <h2>The best of Singers!</h2>
                <%
                List<SingerResponsePair> singerPairs = (List) request.getAttribute("singersKey");
                %>
                    <table>
                    <tr>
                        <th>Singer Name</th>
                        <th>Singer Votes</th>
                    </tr>
                    <% for (SingerResponsePair singerPair : singerPairs) { %>
                      <tr>
                        <td><%= singerPair.getSinger() %></td>
                        <td><%= singerPair.getVotesAmount() %></td>
                      </tr>
                    <% } %>
                    </table>
            <br/>
            <h2>The best of Genres!</h2>
                <%
                List<GenreResponsePair> genrePairs = (List) request.getAttribute("genresKey");
                %>
                    <table>
                    <tr>
                        <th>Genre Name</th>
                        <th>Genre Votes</th>
                    </tr>
                    <% for (GenreResponsePair genrePair : genrePairs) { %>
                        <tr>
                          <td><%= genrePair.getGenre() %></td>
                          <td><%= genrePair.getVotesAmount() %></td>
                        </tr>
                    <% } %>
                    </table>
            <br/>
            <h2>Text sorted by date!</h2>
                <%
                List<TextResponsePair> shortTexts = (List) request.getAttribute("shortTextsKey");
                %>
                    <table>
                    <tr>
                        <th>Text</th>
                        <th>DataTime</th>
                    </tr>
                    <% for (TextResponsePair shortText : shortTexts) { %>
                        <tr>
                          <td><%= shortText.getShortText() %></td>
                          <td><%= shortText.getDataTime() %></td>
                        </tr>
                    <% } %>
                    </table>
        </body>
    </html>