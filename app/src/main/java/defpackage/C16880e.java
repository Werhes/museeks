package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16880e implements InterfaceC4402e {
    public static final C16880e ad = new Object();

    @Override // defpackage.InterfaceC4402e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(1379304963);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(interfaceC12864e, 16));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, interfaceC12864e, i, 23);
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16880e);
    }

    public final int hashCode() {
        return 1181971710;
    }

    public final String toString() {
        return "Separator";
    }
}
