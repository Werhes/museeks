package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4712e {
    public final C11709e ad;
    public final C5912e vip;

    public C4712e(C11709e c11709e, C5912e c5912e) {
        this.ad = c11709e;
        this.vip = c5912e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4712e) {
            return AbstractC7890e.billing(this.ad, ((C4712e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
