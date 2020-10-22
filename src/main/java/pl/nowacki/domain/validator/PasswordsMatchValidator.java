package pl.nowacki.domain.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import pl.nowacki.domain.User;

public class PasswordsMatchValidator implements ConstraintValidator<PasswordsMatch, User>{

	 	@Override
	    public void initialize(PasswordsMatch passwordsMatch){
	    }
	 	 
	 	@Override
	    public boolean isValid(User user, ConstraintValidatorContext context) {
	        return user.getPassword().equals(user.getConfirmPassword());
	    }


}
