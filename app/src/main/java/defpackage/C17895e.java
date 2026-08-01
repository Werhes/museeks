package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٝۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17895e {
    public static final C17895e vip = new C17895e();
    public final AtomicReference ad = new AtomicReference(new C17919e(new C11883e(9)));

    public final synchronized void ad(C9938e c9938e) {
        C11883e c11883e = new C11883e((C17919e) this.ad.get());
        c11883e.subscription(c9938e);
        this.ad.set(new C17919e(c11883e));
    }

    public final synchronized void vip(InterfaceC17259e interfaceC17259e) {
        C11883e c11883e = new C11883e((C17919e) this.ad.get());
        HashMap hashMap = (HashMap) c11883e.f23814e;
        Class vip2 = interfaceC17259e.vip();
        if (hashMap.containsKey(vip2)) {
            InterfaceC17259e interfaceC17259e2 = (InterfaceC17259e) hashMap.get(vip2);
            if (!interfaceC17259e2.equals(interfaceC17259e) || !interfaceC17259e.equals(interfaceC17259e2)) {
                throw new GeneralSecurityException(AbstractC0054e.subs(vip2, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
            }
        } else {
            hashMap.put(vip2, interfaceC17259e);
        }
        this.ad.set(new C17919e(c11883e));
    }
}
