package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15327e implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw AbstractC8647e.isVip(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw AbstractC8647e.isVip(message.obj);
    }
}
