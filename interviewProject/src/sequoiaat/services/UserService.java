package sequoiaat.services;

import java.util.Optional;

import sequoiaat.entity.User;
import sequoiaat.entity.dto.UserResponse;

@Service
public class UserService {

	UserDAO userDAO;
	
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
	public UserResponse login(UserRequest userRequest) {
		
		Optional<User> user = userDAO.findByEmailId(userRequest.getEmailId);
		if(user.isPresent()){
			UserResponse userResponse = mapToUserResponse(user.get());
			return userResponse;
		}else {
			return null;
		}
	}


	private userResponse mapToUserResponse(User user) {
		
		UserResponse userResponse = new UserResponse();
		userResponse.setEmailId(user.getEmailId());
		userResponse.setStatus(user.getStatus());
		userResponse.setUserId(user.getUserId());
		
		
		
	}
}
