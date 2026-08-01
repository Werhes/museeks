package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7003e implements InterfaceC11640e {
    public final String ad;
    public final AbstractC3677e vip;

    public C7003e(String str, AbstractC3677e abstractC3677e) {
        this.ad = str;
        this.vip = abstractC3677e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7003e)) {
            return false;
        }
        C7003e c7003e = (C7003e) obj;
        return AbstractC7890e.billing(this.ad, c7003e.ad) && AbstractC7890e.billing(this.vip, c7003e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.ad + ", featureRequiring=" + this.vip + ')';
    }
}
