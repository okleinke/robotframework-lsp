package robocorp.robot.intellij;

import com.intellij.psi.stubs.PsiFileStub;
import com.intellij.psi.tree.ILightStubFileElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class RobotFileElementType extends ILightStubFileElementType<PsiFileStub<RobotPsiFile>> {

    public static final RobotFileElementType INSTANCE = new RobotFileElementType();

    @NonNls
    public static final String STUB_EXTERNAL_ID_PREFIX = " Robot.";

    public static final int STUB_VERSION = 1;

    @NonNls
    private static final String EXTERNAL_ID = STUB_EXTERNAL_ID_PREFIX + "FILE";

    private RobotFileElementType() {
        super(EXTERNAL_ID, RobotFrameworkLanguage.INSTANCE);
    }

    @Override
    public int getStubVersion() {
        return STUB_VERSION;
    }

    @Override
    public @NotNull String getExternalId() {
        return EXTERNAL_ID;
    }
}
