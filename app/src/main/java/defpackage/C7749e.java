package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7749e implements InterfaceC0040e {
    public final EnumC9702e ad;
    public final boolean vip;

    public C7749e(EnumC9702e enumC9702e, boolean z) {
        this.ad = enumC9702e;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7749e)) {
            return false;
        }
        C7749e c7749e = (C7749e) obj;
        return this.ad == c7749e.ad && this.vip == c7749e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPreferencesChanged(engine=");
        sb.append(this.ad);
        sb.append(", enabled=");
        return AbstractC1786e.isVip(sb, this.vip, ')');
    }
}
