package sequoiaat.controllers;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/Login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest){
		
		
		UserResponse userResponse = userService.login(userRequest);
		if(userResponse != null)
		return ResponseEntity.ok(userResponse);
		
		return new ResponseEntity(userResponse, HttpStatus.NOT_FOUND);
		
			
	}
	
	
}
