package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؐٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13681e {
    public String ad;
    public InterfaceC15313e vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13681e)) {
            return false;
        }
        C13681e c13681e = (C13681e) obj;
        return AbstractC7890e.billing(this.ad, c13681e.ad) && AbstractC7890e.billing(this.vip, c13681e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "RealmPropertyImpl(name=" + this.ad + ", type=" + this.vip + ")";
    }
}
