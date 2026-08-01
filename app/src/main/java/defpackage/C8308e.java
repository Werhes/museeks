package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8308e implements InterfaceC1365e {
    public final AbstractC10727e ad;
    public final C16455e vip;

    public C8308e(AbstractC10727e abstractC10727e, C16455e c16455e) {
        this.ad = abstractC10727e;
        this.vip = c16455e;
    }

    @Override // defpackage.InterfaceC1365e
    public final AbstractC10727e ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8308e)) {
            return false;
        }
        C8308e c8308e = (C8308e) obj;
        return AbstractC7890e.billing(this.ad, c8308e.ad) && AbstractC7890e.billing(this.vip, c8308e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.ad + ", result=" + this.vip + ")";
    }
}
