package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC3105e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15807e f7184e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7185e;

    public /* synthetic */ RunnableC3105e(AbstractC15807e abstractC15807e, int i) {
        this.f7185e = i;
        this.f7184e = abstractC15807e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7185e) {
            case 0:
                AbstractC15807e abstractC15807e = this.f7184e;
                if (abstractC15807e.f31166e > 0) {
                    SystemClock.uptimeMillis();
                }
                abstractC15807e.setVisibility(0);
                return;
            default:
                AbstractC15807e abstractC15807e2 = this.f7184e;
                ((AbstractC5682e) abstractC15807e2.getCurrentDrawable()).metrica(false, false, true);
                if ((abstractC15807e2.getProgressDrawable() == null || !abstractC15807e2.getProgressDrawable().isVisible()) && (abstractC15807e2.getIndeterminateDrawable() == null || !abstractC15807e2.getIndeterminateDrawable().isVisible())) {
                    abstractC15807e2.setVisibility(4);
                }
                abstractC15807e2.getClass();
                return;
        }
    }
}
