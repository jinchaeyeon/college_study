package com.view;

import java.util.ArrayList;

import com.persistence.BoardDTO;

public class BoardViewer {
	public void showBoard(ArrayList<BoardDTO> dtos) {
		for(BoardDTO dto:dtos) {
			System.out.println(dto.toString());
		}
	}	
}
