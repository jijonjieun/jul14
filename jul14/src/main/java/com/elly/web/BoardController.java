package com.elly.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;

	@GetMapping("/board")
	public String board(Model model) {
		// 데이터 붙이기
		model.addAttribute("name", "1234");

		List<BoardDTO> list = service.boardList();

		if (list.size() > 1) {
			model.addAttribute("list", list);
			return "board";

		} else {
			return "redirect:/";
			// 컨트롤러지나가서 :뒤에있는거로 다시가! 슬러시로감 (index.jsp)
		}

	}

	// 1.board 리스트 보는 화면 = boaed.jsp
	// 2. detail 상세보기 화면 = detail.jsp

	@GetMapping("/detail")
	public String detail(HttpServletRequest request) {

		String bno = request.getParameter("bno");

		// int no = Integer.parseInt(bno);
		// 겟파마리터가 잡는놈 스트링타입임 보통 외부에서 가져오는거는
		// 스트링이나 객체

		try {
			int no = Integer.parseInt(bno);
			System.out.println("숫자");
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다");
		}

		return "detail";

	}

}
