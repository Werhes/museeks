package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3630e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12621e f8173e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8174e;

    public /* synthetic */ RunnableC3630e(C12621e c12621e, int i) {
        this.f8174e = i;
        this.f8173e = c12621e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8174e) {
            case 0:
                C12621e c12621e = this.f8173e;
                if (c12621e.mopub || ((C8603e) c12621e.startapp.f12440e).appmetrica.ad() != null) {
                    return;
                }
                c12621e.advert();
                return;
            default:
                C12621e c12621e2 = this.f8173e;
                C17974e c17974e = new C17974e(c12621e2.ad, c12621e2.metrica.ad.premium(), new C12894e(c12621e2), c12621e2.vip.f24700e.mo1550e());
                c12621e2.adcel = c17974e;
                AbstractC2803e.license("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                ((C13265e) c17974e.f35233e).vip.connect();
                return;
        }
    }
}
