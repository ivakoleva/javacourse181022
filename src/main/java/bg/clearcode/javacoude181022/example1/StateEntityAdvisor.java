package bg.clearcode.javacoude181022.example1;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class StateEntityAdvisor<T extends StateEntity> {
    private T stateEntity;

    public StateEntityAdvisor(T stateEntity) {
        this.stateEntity = stateEntity;
    }

    // maybe validator if we need to validate somewhere/something else at least once
    public void validateIdentificationCode() throws NonValidIdentificationCodeException {
        final String identificationCode = stateEntity.getIdentificationCode();
        // TODO predicate by string instead of specific stateEntity implementation
        if (identificationCode == null || identificationCode.isEmpty()) {
            throw new NonValidIdentificationCodeException();
        }
    }
}