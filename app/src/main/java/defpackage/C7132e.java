package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7132e {
    public final InterfaceC4082e ad;
    public final boolean vip;

    public C7132e(InterfaceC4082e interfaceC4082e, boolean z) {
        this.ad = interfaceC4082e;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7132e)) {
            return false;
        }
        C7132e c7132e = (C7132e) obj;
        return AbstractC7890e.billing(this.ad, c7132e.ad) && this.vip == c7132e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.ad + ", isSampled=" + this.vip + ")";
    }
}
