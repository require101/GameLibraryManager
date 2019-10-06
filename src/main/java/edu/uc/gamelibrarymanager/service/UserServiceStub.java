package edu.uc.gamelibrarymanager.service;

import com.google.api.core.ApiFuture;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserRecord;
import edu.uc.gamelibrarymanager.dao.IUserDAO;
import edu.uc.gamelibrarymanager.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
public class UserServiceStub implements IUserService {

    private final IUserDAO userDAO;

    @Autowired
    public UserServiceStub(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * Gets the User by ID
     *
     * @param id the id of the user to retrieve
     * @return returns UserDTO, if found, otherwise Optional.Empty
     * @throws Exception any problem in the underlying query
     */
    @Override
    public Optional<UserDTO> getById(String id) throws Exception {
        Assert.notNull(userDAO, "UserDAO is null -- check DI Container");
        return userDAO.fetchById("1234");
    }

    /**
     * Creates the User with the given UserDTO data
     *
     * @param user the User object to create the database document with
     * @return returns the created UserDTO
     * @throws Exception any problem in the underlying persistence
     */
    @Override
    public UserDTO create(UserDTO user) throws Exception {
        Assert.notNull(FirebaseAuth.getInstance(), "Firebase instance is null -- check configuration");
        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail(user.getUsername())
                .setEmailVerified(false)
                .setPassword(user.getPassword())
                .setDisplayName(user.getUsername())
                .setDisabled(false);
        ApiFuture<UserRecord> userRecord = FirebaseAuth.getInstance().createUserAsync(request);
        UserRecord savedUser = userRecord.get();
        //clone request UserDTO to add FirebaseUID to -- keeps method pure
        UserDTO copiedRequestUser = (UserDTO) user.clone();
        copiedRequestUser.setFirebaseUserId(savedUser.getUid());

        return userDAO.create(copiedRequestUser);
    }

}
