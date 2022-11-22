package Ch38.Controller;

import Ch38.Domain.DTO;
import Ch38.Domain.LendDTO;
import Ch38.Service.LendService;

public class LendController implements SubController {

	LendService service = LendService.getInstance();
	
	// 1대여 2반납 ..
	@Override
	public Object execute(int SN, DTO dto) {
		Object r=null;
		switch(SN)
		{
		case 1:		//대여
			LendDTO down = (LendDTO)dto;
			boolean result = service.Lendbook(down);
			if(result) {
				r="대여성공!";
			}else {
				r="대여실패!";
			}
			break;
		case 2:
			break;
		case 3:
			break;
		default:
		}
		
		return r;
	}

}
