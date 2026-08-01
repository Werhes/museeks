package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16837e {
    public final int ad;
    public final InterfaceC6334e vip;

    public C16837e(int i, C8823e c8823e) {
        this.ad = i;
        this.vip = c8823e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16837e)) {
            return false;
        }
        C16837e c16837e = (C16837e) obj;
        return this.ad == c16837e.ad && AbstractC7890e.billing(this.vip, c16837e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.ad + ", signal=" + this.vip + ')';
    }
}
