package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6364e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f13212e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13213e;

    public /* synthetic */ RunnableC6364e(C4275e c4275e, int i) {
        this.f13213e = i;
        this.f13212e = c4275e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13213e) {
            case 0:
                C4275e c4275e = this.f13212e;
                C2411e c2411e = c4275e.f9369goto;
                if (c2411e != null) {
                    c4275e.m1602return(c2411e, C1120e.metrica);
                    return;
                }
                return;
            default:
                C4275e c4275e2 = this.f13212e;
                ServiceConnectionC15561e serviceConnectionC15561e = c4275e2.loadAd;
                if (serviceConnectionC15561e != null) {
                    c4275e2.license.unbindService(serviceConnectionC15561e);
                    c4275e2.loadAd = null;
                }
                c4275e2.metrica.metrica.clear();
                return;
        }
    }
}
