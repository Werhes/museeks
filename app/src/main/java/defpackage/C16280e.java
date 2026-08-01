package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16280e implements InterfaceC1365e {
    public final AbstractC10727e ad;
    public final C10574e vip;

    public C16280e(AbstractC10727e abstractC10727e, C10574e c10574e) {
        this.ad = abstractC10727e;
        this.vip = c10574e;
    }

    @Override // defpackage.InterfaceC1365e
    public final AbstractC10727e ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16280e)) {
            return false;
        }
        C16280e c16280e = (C16280e) obj;
        return AbstractC7890e.billing(this.ad, c16280e.ad) && AbstractC7890e.billing(this.vip, c16280e.vip);
    }

    public final int hashCode() {
        AbstractC10727e abstractC10727e = this.ad;
        return this.vip.hashCode() + ((abstractC10727e == null ? 0 : abstractC10727e.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.ad + ", result=" + this.vip + ")";
    }
}
