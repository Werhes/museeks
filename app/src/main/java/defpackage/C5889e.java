package defpackage;

import java.util.TreeSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5889e {
    public final TreeSet ad = new TreeSet(new C6575e(20));
    public long vip;

    public final void ad(InterfaceC5482e interfaceC5482e, long j) {
        while (this.vip + j > 67108864 && !this.ad.isEmpty()) {
            AbstractC2416e abstractC2416e = (AbstractC2416e) this.ad.first();
            C8531e c8531e = (C8531e) interfaceC5482e;
            synchronized (c8531e) {
                c8531e.advert(abstractC2416e);
            }
        }
    }

    public final void vip(C8531e c8531e, C7747e c7747e) {
        this.ad.add(c7747e);
        this.vip += c7747e.f6199e;
        ad(c8531e, 0L);
    }
}
