package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6032e {
    public final C0576e Signature;
    public final C0576e ad;
    public final C0576e adcel;
    public final C0576e admob;
    public final C0576e ads;
    public final C0576e advert;
    public final C0576e amazon;
    public final C0576e applovin;
    public final C0576e appmetrica;
    public final C0576e billing;
    public final C0576e inmobi;
    public final C0576e isPro;
    public final C0576e isVip;
    public final C0576e license;
    public final C0576e loadAd;
    public final C0576e metrica;
    public final C0576e mopub;
    public final C0576e premium;
    public final C0576e pro;
    public final C0576e purchase;
    public final C0576e remoteconfig;
    public final C0576e signatures;
    public final C0576e smaato;
    public final C0576e startapp;
    public final C0576e subs;
    public final C0576e subscription;
    public final C0576e tapsense;
    public final C0576e vip;
    public final C0576e yandex;

    public C6032e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
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
        this.smaato = new C0576e(new C3618e(j13), c12575e);
        this.amazon = new C0576e(new C3618e(j14), c12575e);
        this.loadAd = new C0576e(new C3618e(j15), c12575e);
        this.Signature = new C0576e(new C3618e(j16), c12575e);
        this.admob = new C0576e(new C3618e(j17), c12575e);
        this.subscription = new C0576e(new C3618e(j18), c12575e);
        this.remoteconfig = new C0576e(new C3618e(j19), c12575e);
        this.pro = new C0576e(new C3618e(j20), c12575e);
        this.signatures = new C0576e(new C3618e(j21), c12575e);
        this.tapsense = new C0576e(new C3618e(j22), c12575e);
        this.isVip = new C0576e(new C3618e(j23), c12575e);
        this.inmobi = new C0576e(new C3618e(j24), c12575e);
        this.isPro = new C0576e(new C3618e(j25), c12575e);
        this.applovin = new C0576e(new C3618e(j26), c12575e);
        this.ads = new C0576e(new C3618e(j27), c12575e);
        this.premium = new C0576e(new C3618e(j28), c12575e);
        this.subs = new C0576e(new C3618e(j29), c12575e);
    }

    public final long ad() {
        return ((C3618e) this.ads.getValue()).ad;
    }

    public final long adcel() {
        return ((C3618e) this.subscription.getValue()).ad;
    }

    public final long appmetrica() {
        return ((C3618e) this.admob.getValue()).ad;
    }

    public final long billing() {
        return ((C3618e) this.ad.getValue()).ad;
    }

    public final long license() {
        return ((C3618e) this.signatures.getValue()).ad;
    }

    public final long metrica() {
        return ((C3618e) this.tapsense.getValue()).ad;
    }

    public final long purchase() {
        return ((C3618e) this.remoteconfig.getValue()).ad;
    }

    public final long startapp() {
        return ((C3618e) this.Signature.getValue()).ad;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        sb.append((Object) C3618e.startapp(billing()));
        sb.append("onPrimary=");
        AbstractC5087e.m1754try(((C3618e) this.vip.getValue()).ad, "primaryContainer=", sb);
        AbstractC5087e.m1754try(((C3618e) this.metrica.getValue()).ad, "onPrimaryContainer=", sb);
        AbstractC5087e.m1754try(((C3618e) this.license.getValue()).ad, "inversePrimary=", sb);
        AbstractC5087e.m1754try(((C3618e) this.appmetrica.getValue()).ad, "secondary=", sb);
        AbstractC5087e.m1754try(((C3618e) this.purchase.getValue()).ad, "onSecondary=", sb);
        sb.append((Object) C3618e.startapp(((C3618e) this.billing.getValue()).ad));
        sb.append("secondaryContainer=");
        sb.append((Object) C3618e.startapp(yandex()));
        sb.append("onSecondaryContainer=");
        AbstractC5087e.m1754try(((C3618e) this.startapp.getValue()).ad, "tertiary=", sb);
        AbstractC5087e.m1754try(((C3618e) this.adcel.getValue()).ad, "onTertiary=", sb);
        AbstractC5087e.m1754try(((C3618e) this.mopub.getValue()).ad, "tertiaryContainer=", sb);
        AbstractC5087e.m1754try(((C3618e) this.advert.getValue()).ad, "onTertiaryContainer=", sb);
        AbstractC5087e.m1754try(((C3618e) this.smaato.getValue()).ad, "background=", sb);
        AbstractC5087e.m1754try(((C3618e) this.amazon.getValue()).ad, "onBackground=", sb);
        sb.append((Object) C3618e.startapp(((C3618e) this.loadAd.getValue()).ad));
        sb.append("surface=");
        sb.append((Object) C3618e.startapp(startapp()));
        sb.append("onSurface=");
        sb.append((Object) C3618e.startapp(appmetrica()));
        sb.append("surfaceVariant=");
        sb.append((Object) C3618e.startapp(adcel()));
        sb.append("onSurfaceVariant=");
        sb.append((Object) C3618e.startapp(purchase()));
        sb.append("surfaceTint=");
        sb.append((Object) C3618e.startapp(((C3618e) this.pro.getValue()).ad));
        sb.append("inverseSurface=");
        sb.append((Object) C3618e.startapp(license()));
        sb.append("inverseOnSurface=");
        sb.append((Object) C3618e.startapp(metrica()));
        sb.append("error=");
        AbstractC5087e.m1754try(((C3618e) this.isVip.getValue()).ad, "onError=", sb);
        AbstractC5087e.m1754try(((C3618e) this.inmobi.getValue()).ad, "errorContainer=", sb);
        AbstractC5087e.m1754try(((C3618e) this.isPro.getValue()).ad, "onErrorContainer=", sb);
        sb.append((Object) C3618e.startapp(((C3618e) this.applovin.getValue()).ad));
        sb.append("border=");
        sb.append((Object) C3618e.startapp(ad()));
        sb.append("borderVariant=");
        sb.append((Object) C3618e.startapp(vip()));
        sb.append("scrim=");
        sb.append((Object) C3618e.startapp(((C3618e) this.subs.getValue()).ad));
        sb.append(')');
        return sb.toString();
    }

    public final long vip() {
        return ((C3618e) this.premium.getValue()).ad;
    }

    public final long yandex() {
        return ((C3618e) this.yandex.getValue()).ad;
    }
}
