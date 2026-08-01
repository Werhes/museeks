package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10022e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16887e f19795e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19796e;

    public /* synthetic */ RunnableC10022e(C16887e c16887e, int i) {
        this.f19796e = i;
        this.f19795e = c16887e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19796e) {
            case 0:
                this.f19795e.ad();
                return;
            case 1:
                this.f19795e.vip();
                return;
            default:
                C16887e c16887e = this.f19795e;
                C13705e c13705e = c16887e.admob;
                if (c13705e != null) {
                    c13705e.purchase();
                }
                if (c16887e.Signature == null) {
                    c16887e.loadAd.vip();
                }
                c16887e.Signature = null;
                return;
        }
    }
}
