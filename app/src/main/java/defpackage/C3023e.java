package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۨؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3023e extends AbstractC7796e {
    public final long ad;
    public final AbstractC11367e appmetrica;
    public final AbstractC1644e license;
    public final AbstractC0013e metrica;
    public final AbstractC5255e purchase;
    public final String vip;

    public C3023e(long j, String str, AbstractC0013e abstractC0013e, AbstractC1644e abstractC1644e, AbstractC11367e abstractC11367e, AbstractC5255e abstractC5255e) {
        this.ad = j;
        this.vip = str;
        this.metrica = abstractC0013e;
        this.license = abstractC1644e;
        this.appmetrica = abstractC11367e;
        this.purchase = abstractC5255e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؘُۛ] */
    public final C10841e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.billing = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        AbstractC11367e abstractC11367e;
        AbstractC5255e abstractC5255e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7796e) {
            C3023e c3023e = (C3023e) ((AbstractC7796e) obj);
            AbstractC5255e abstractC5255e2 = c3023e.purchase;
            AbstractC11367e abstractC11367e2 = c3023e.appmetrica;
            if (this.ad == c3023e.ad && this.vip.equals(c3023e.vip) && this.metrica.equals(c3023e.metrica) && this.license.equals(c3023e.license) && ((abstractC11367e = this.appmetrica) != null ? abstractC11367e.equals(abstractC11367e2) : abstractC11367e2 == null) && ((abstractC5255e = this.purchase) != null ? abstractC5255e.equals(abstractC5255e2) : abstractC5255e2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003;
        AbstractC11367e abstractC11367e = this.appmetrica;
        int hashCode2 = (hashCode ^ (abstractC11367e == null ? 0 : abstractC11367e.hashCode())) * 1000003;
        AbstractC5255e abstractC5255e = this.purchase;
        return hashCode2 ^ (abstractC5255e != null ? abstractC5255e.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.ad + ", type=" + this.vip + ", app=" + this.metrica + ", device=" + this.license + ", log=" + this.appmetrica + ", rollouts=" + this.purchase + "}";
    }
}
