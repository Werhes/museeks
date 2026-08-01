package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9533e implements InterfaceC5372e {
    public static final C9533e ad = new Object();
    public static final C12585e vip = C12585e.vip;

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C7960e c7960e = (C7960e) obj;
        AbstractC5542e.ad(interfaceC5757e);
        C18456e c18456e = C18456e.ad;
        C7130e c7130e = new C7130e(c18456e.appmetrica(), 1);
        int size = c7960e.size();
        InterfaceC11845e pro = interfaceC5757e.pro(c7130e, size);
        Iterator<AbstractC1948e> it = c7960e.iterator();
        for (int i = 0; i < size; i++) {
            ((AbstractC15920e) pro).applovin(c7130e, i, c18456e, it.next());
        }
        pro.vip(c7130e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        AbstractC5542e.vip(interfaceC11754e);
        return new C7960e((List) new C13758e(C18456e.ad, 0).adcel(interfaceC11754e));
    }
}
