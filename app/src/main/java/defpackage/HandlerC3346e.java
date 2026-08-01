package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC3346e extends HandlerC9134e {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", AbstractC8647e.isPro(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).billing(Status.f729e);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((C12075e) pair.first).ad((InterfaceC18082e) pair.second);
        } catch (RuntimeException e) {
            int i2 = BasePendingResult.subscription;
            throw e;
        }
    }
}
