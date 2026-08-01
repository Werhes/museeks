package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۢۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14328e {
    public final Object ad = new Object();
    public final LinkedHashMap vip = new LinkedHashMap();

    public final void ad(String str, boolean z, int i) {
        C0216e c0216e;
        synchronized (this.ad) {
            c0216e = (C0216e) this.vip.get(new C5060e(str));
        }
        if (c0216e == null) {
            return;
        }
        c0216e.vip.ad(new C16815e(i, z));
    }
}
