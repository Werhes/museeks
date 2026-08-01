package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8393e implements InterfaceC13702e {
    public final C6674e ad;

    public C8393e(C6674e c6674e) {
        this.ad = c6674e;
        AbstractC12029e.ad("XYZ");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8393e) {
            return AbstractC7890e.billing(this.ad, ((C8393e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC13702e
    public final C6674e license() {
        throw null;
    }

    public final String toString() {
        return "XYZColorSpace(" + this.ad + ')';
    }
}
