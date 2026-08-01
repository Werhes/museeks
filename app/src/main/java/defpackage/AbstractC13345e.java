package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13345e {
    public final Object ad(InterfaceC4895e interfaceC4895e) {
        return vip(new C7720e(interfaceC4895e));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِٖۢ, eِٜؒ, java.lang.Object] */
    public final String appmetrica(Object obj) {
        ?? obj2 = new Object();
        try {
            purchase(new C12867e(obj2), obj);
            return obj2.m4132protected();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final C11248e license() {
        return this instanceof C11248e ? (C11248e) this : new C11248e(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؗٔۙ, eِٖۢ, java.lang.Object] */
    public final Object metrica(String str) {
        ?? obj = new Object();
        obj.m4126e(str);
        C7720e c7720e = new C7720e((InterfaceC4895e) obj);
        Object vip = vip(c7720e);
        if (c7720e.crashlytics() == 10) {
            return vip;
        }
        throw new C14803e("JSON document was not fully consumed.", 8, (byte) 0);
    }

    public abstract void purchase(AbstractC3442e abstractC3442e, Object obj);

    public abstract Object vip(AbstractC17080e abstractC17080e);
}
