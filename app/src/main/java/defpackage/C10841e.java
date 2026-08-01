package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10841e {
    public long ad;
    public AbstractC11367e appmetrica;
    public byte billing;
    public AbstractC1644e license;
    public AbstractC0013e metrica;
    public AbstractC5255e purchase;
    public String vip;

    public final C3023e ad() {
        String str;
        AbstractC0013e abstractC0013e;
        AbstractC1644e abstractC1644e;
        if (this.billing == 1 && (str = this.vip) != null && (abstractC0013e = this.metrica) != null && (abstractC1644e = this.license) != null) {
            return new C3023e(this.ad, str, abstractC0013e, abstractC1644e, this.appmetrica, this.purchase);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.billing) == 0) {
            sb.append(" timestamp");
        }
        if (this.vip == null) {
            sb.append(" type");
        }
        if (this.metrica == null) {
            sb.append(" app");
        }
        if (this.license == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
