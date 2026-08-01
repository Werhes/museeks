package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2613e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7366e f6471e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6472e;

    public /* synthetic */ RunnableC2613e(C7366e c7366e, int i) {
        this.f6472e = i;
        this.f6471e = c7366e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6472e;
        C7366e c7366e = this.f6471e;
        switch (i) {
            case 0:
                c7366e.ad.unregisterReceiver(c7366e.license);
                return;
            case 1:
                C7366e.ad(c7366e);
                return;
            default:
                Uri uri = C7366e.billing;
                c7366e.vip();
                return;
        }
    }
}
