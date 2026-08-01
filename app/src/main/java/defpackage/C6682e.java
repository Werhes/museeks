package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۟ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6682e {
    public InterfaceC16719e ad;
    public C18059e appmetrica;
    public AbstractC2832e license;
    public InterfaceC16719e metrica;
    public C18059e purchase;
    public AbstractC2832e vip;

    public final C18059e ad(int i, int i2, boolean z) {
        int m2467class = AbstractC8703e.m2467class(2);
        if (m2467class == 0 || m2467class == 1) {
            return null;
        }
        if (m2467class == 2) {
            if (z) {
                return this.appmetrica;
            }
            return null;
        }
        if (m2467class != 3) {
            throw new C14803e(10);
        }
        if (z) {
            return this.appmetrica;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.purchase;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6682e);
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(2) * 961;
    }

    public final String toString() {
        return AbstractC5087e.m1746extends("FlowLayoutOverflowState(type=", "Clip", ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)");
    }

    public final void vip(InterfaceC16719e interfaceC16719e, InterfaceC16719e interfaceC16719e2, long j) {
        long vip = AbstractC2127e.vip(1, j);
        if (interfaceC16719e != null) {
            int smaato = interfaceC16719e.smaato(C5602e.billing(vip));
            this.appmetrica = new C18059e(C18059e.ad(smaato, interfaceC16719e.mo2529while(smaato)));
            this.ad = interfaceC16719e instanceof InterfaceC16719e ? interfaceC16719e : null;
            this.vip = null;
        }
        if (interfaceC16719e2 != null) {
            int smaato2 = interfaceC16719e2.smaato(C5602e.billing(vip));
            this.purchase = new C18059e(C18059e.ad(smaato2, interfaceC16719e2.mo2529while(smaato2)));
            this.metrica = interfaceC16719e2 instanceof InterfaceC16719e ? interfaceC16719e2 : null;
            this.license = null;
        }
    }
}
