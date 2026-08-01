package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13275e {
    public final int ad;
    public final C12701e metrica;
    public final AbstractC5113e vip;

    public C13275e(int i, AbstractC5113e abstractC5113e, C12701e c12701e) {
        this.ad = i;
        this.vip = abstractC5113e;
        this.metrica = c12701e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13275e)) {
            return false;
        }
        C13275e c13275e = (C13275e) obj;
        return this.ad == c13275e.ad && AbstractC7890e.billing(this.vip, c13275e.vip) && AbstractC7890e.billing(this.metrica, c13275e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) C13269e.ad(this.ad)) + ", deferrableSurface=" + this.vip + ", graph=" + this.metrica + ')';
    }
}
