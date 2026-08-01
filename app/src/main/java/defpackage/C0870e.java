package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0870e extends AbstractC6552e {
    public final /* synthetic */ InterfaceC1753e appmetrica;
    public final /* synthetic */ C15898e purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0870e(String str, InterfaceC1753e interfaceC1753e, C15898e c15898e) {
        super(str, true);
        this.appmetrica = interfaceC1753e;
        this.purchase = c15898e;
    }

    @Override // defpackage.AbstractC6552e
    public final long ad() {
        C10972e c10972e;
        InterfaceC1753e interfaceC1753e = this.appmetrica;
        try {
            c10972e = interfaceC1753e.billing();
        } catch (Throwable th) {
            c10972e = new C10972e(interfaceC1753e, null, th, 2);
        }
        C15898e c15898e = this.purchase;
        if (!((CopyOnWriteArrayList) c15898e.f31335e).contains(interfaceC1753e)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c15898e.f31340e).put(c10972e);
        return -1L;
    }
}
