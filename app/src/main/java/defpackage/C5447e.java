package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5447e {
    public final float ad;
    public final C12916e metrica;
    public final C15670e vip;

    public C5447e() {
        InterfaceC5714e.f12118e.getClass();
        C12916e c12916e = C17573e.vip;
        this.ad = 0.25f;
        this.vip = C15670e.ad;
        this.metrica = c12916e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5447e.class != obj.getClass()) {
            return false;
        }
        C5447e c5447e = (C5447e) obj;
        return this.ad == c5447e.ad && AbstractC7890e.billing(this.vip, c5447e.vip) && AbstractC7890e.billing(this.metrica, c5447e.metrica);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.ad) * 31;
        this.vip.getClass();
        return this.metrica.hashCode() + ((floatToIntBits - 1858767230) * 31);
    }
}
