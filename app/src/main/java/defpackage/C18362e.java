package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18362e {
    public final C6614e ad;
    public final C13578e vip;

    public C18362e(C6614e c6614e, C13578e c13578e) {
        this.ad = c6614e;
        this.vip = c13578e;
    }

    public final void ad() {
        C13578e c13578e = this.vip;
        if (c13578e.applovin()) {
            c13578e.billing(EnumC12766e.f25540e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18362e.class != obj.getClass()) {
            return false;
        }
        C18362e c18362e = (C18362e) obj;
        return AbstractC7890e.billing(this.ad, c18362e.ad) && this.vip.equals(c18362e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }
}
