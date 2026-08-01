package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16746e {
    public static final C16746e license = new C16746e(C13664e.f27089e, C9139e.f18290e, null);
    public final Object ad;
    public final C16746e metrica;
    public final Object vip;

    public C16746e(List list, Map map, C16746e c16746e) {
        this.ad = list;
        this.vip = map;
        this.metrica = c16746e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final InterfaceC12635e ad(int i) {
        InterfaceC12635e interfaceC12635e = (InterfaceC12635e) this.vip.get(Integer.valueOf(i));
        if (interfaceC12635e != null) {
            return interfaceC12635e;
        }
        C16746e c16746e = this.metrica;
        if (c16746e != null) {
            return c16746e.ad(i);
        }
        return null;
    }
}
