package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12414e {
    public Message ad;

    public final void ad() {
        this.ad = null;
        ArrayList arrayList = C2399e.vip;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip() {
        Message message = this.ad;
        message.getClass();
        message.sendToTarget();
        ad();
    }
}
