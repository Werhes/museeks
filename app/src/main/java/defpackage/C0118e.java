package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0118e extends InputConnectionC18152e {
    @Override // defpackage.InputConnectionC18152e
    public final void ad(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // defpackage.InputConnectionC18152e, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // defpackage.InputConnectionC18152e, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
