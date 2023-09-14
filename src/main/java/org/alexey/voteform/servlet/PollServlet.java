package org.alexey.voteform.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.alexey.voteform.dto.PollRequest;
import org.alexey.voteform.entity.Genre;
import org.alexey.voteform.entity.Singer;
import org.alexey.voteform.service.PollService;

import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "pollServlet", urlPatterns = "/polls")
public class PollServlet extends HttpServlet {

    private PollService pollService = new PollService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var servletContext = req.getServletContext();
        servletContext.log("get request: " + req.getParameter("singer"));
        servletContext.log("get request: " + Arrays.toString(req.getParameterValues("genre")));
        servletContext.log("get request: " + req.getParameter("author-text"));

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=UTF-8");
        PollRequest pollRequest = new PollRequest(
                Singer.valueOf(req.getParameter("singer")),
                Arrays.stream(req.getParameterValues("genre")).map(Genre::valueOf).toList(),
                req.getParameter("author-text")
                );
        pollService.savePoll(pollRequest);
        resp.sendRedirect("/vote-form/polls");
        resp.setStatus(201);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setAttribute("singersKey", pollService.findSingers());
        req.setAttribute("genresKey", pollService.findGenres());
        req.setAttribute("shortTextsKey", pollService.findShortText());
        getServletContext().getRequestDispatcher("/first-jsp.jsp").forward(req, resp);
    }
}
