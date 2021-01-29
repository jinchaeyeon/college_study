package com.controller;

import java.util.ArrayList;

import com.persistence.BoardDAO;
import com.persistence.BoardDTO;
import com.view.BoardViewer;

public class BoardController {

	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		ArrayList<BoardDTO> dtos= new ArrayList<BoardDTO>();
		BoardViewer viewer = new BoardViewer();
		Byte reqService = 0x30;//select all		
		if(reqService == 0x30) {
			dtos = boardDAO.selectAll();			
			viewer.showBoard(dtos);
		}		
	}

}
