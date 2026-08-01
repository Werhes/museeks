package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16423e {
    public final C0576e ad;
    public final C0576e adcel;
    public final C0576e advert;
    public final C0576e appmetrica;
    public final C0576e billing;
    public final C0576e license;
    public final C0576e metrica;
    public final C0576e mopub;
    public final C0576e purchase;
    public final C0576e smaato;
    public final C0576e startapp;
    public final C0576e vip;
    public final C0576e yandex;

    public C16423e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        C3618e c3618e = new C3618e(j);
        C12575e c12575e = C12575e.f25232e;
        this.ad = new C0576e(c3618e, c12575e);
        this.vip = new C0576e(new C3618e(j2), c12575e);
        this.metrica = new C0576e(new C3618e(j3), c12575e);
        this.license = new C0576e(new C3618e(j4), c12575e);
        this.appmetrica = new C0576e(new C3618e(j5), c12575e);
        this.purchase = new C0576e(new C3618e(j6), c12575e);
        this.billing = new C0576e(new C3618e(j7), c12575e);
        this.yandex = new C0576e(new C3618e(j8), c12575e);
        this.startapp = new C0576e(new C3618e(j9), c12575e);
        this.adcel = new C0576e(new C3618e(j10), c12575e);
        this.mopub = new C0576e(new C3618e(j11), c12575e);
        this.advert = new C0576e(new C3618e(j12), c12575e);
        this.smaato = new C0576e(Boolean.TRUE, c12575e);
    }

    public final boolean ad() {
        return ((Boolean) this.smaato.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        AbstractC5087e.m1754try(((C3618e) this.ad.getValue()).ad, ", primaryVariant=", sb);
        AbstractC5087e.m1754try(((C3618e) this.vip.getValue()).ad, ", secondary=", sb);
        AbstractC5087e.m1754try(((C3618e) this.metrica.getValue()).ad, ", secondaryVariant=", sb);
        AbstractC5087e.m1754try(((C3618e) this.license.getValue()).ad, ", background=", sb);
        AbstractC5087e.m1754try(((C3618e) this.appmetrica.getValue()).ad, ", surface=", sb);
        AbstractC5087e.m1754try(((C3618e) this.purchase.getValue()).ad, ", error=", sb);
        AbstractC5087e.m1754try(((C3618e) this.billing.getValue()).ad, ", onPrimary=", sb);
        AbstractC5087e.m1754try(((C3618e) this.yandex.getValue()).ad, ", onSecondary=", sb);
        AbstractC5087e.m1754try(((C3618e) this.startapp.getValue()).ad, ", onBackground=", sb);
        AbstractC5087e.m1754try(((C3618e) this.adcel.getValue()).ad, ", onSurface=", sb);
        AbstractC5087e.m1754try(((C3618e) this.mopub.getValue()).ad, ", onError=", sb);
        sb.append((Object) C3618e.startapp(((C3618e) this.advert.getValue()).ad));
        sb.append(", isLight=");
        sb.append(ad());
        sb.append(')');
        return sb.toString();
    }
}
