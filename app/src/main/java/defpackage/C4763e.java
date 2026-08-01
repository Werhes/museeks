package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4763e {
    public final int ad;
    public final InterfaceC12259e metrica;
    public final int vip;

    public C4763e(int i, int i2, InterfaceC12259e interfaceC12259e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = interfaceC12259e;
        if (i < 0) {
            AbstractC8889e.ad("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        AbstractC8889e.ad("size should be > 0");
    }
}
