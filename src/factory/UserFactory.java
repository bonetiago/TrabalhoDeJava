package factory;

import model.User;
import view.vo.UserVO;

public class UserFactory {

	public static UserVO beanToVO(User u) {
		UserVO vo = new UserVO();

		vo.setId(u.getId());
		vo.setNome(u.getNome());

		return vo;
	}

	public static User getUserByVO(UserVO vo) {
		User u = new User();

		u.setId(vo.getId());
		u.setNome(vo.getNome());

		return u;
	}

}