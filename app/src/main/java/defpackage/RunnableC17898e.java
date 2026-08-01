package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٝۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC17898e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C8158e f35142e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35143e;

    public /* synthetic */ RunnableC17898e(LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e, int i) {
        this.f35143e = i;
        this.f35142e = layoutInflaterFactory2C8158e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f35143e) {
            case 0:
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = this.f35142e;
                if ((layoutInflaterFactory2C8158e.f16602e & 1) != 0) {
                    layoutInflaterFactory2C8158e.inmobi(0);
                }
                if ((layoutInflaterFactory2C8158e.f16602e & 4096) != 0) {
                    layoutInflaterFactory2C8158e.inmobi(108);
                }
                layoutInflaterFactory2C8158e.f16610e = false;
                layoutInflaterFactory2C8158e.f16602e = 0;
                return;
            default:
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e2 = this.f35142e;
                layoutInflaterFactory2C8158e2.f16599e.showAtLocation(layoutInflaterFactory2C8158e2.f16589e, 55, 0, 0);
                C14712e c14712e = layoutInflaterFactory2C8158e2.f16588e;
                if (c14712e != null) {
                    c14712e.vip();
                }
                if (!layoutInflaterFactory2C8158e2.f16584e || (viewGroup = layoutInflaterFactory2C8158e2.f16585e) == null || !viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C8158e2.f16589e.setAlpha(1.0f);
                    layoutInflaterFactory2C8158e2.f16589e.setVisibility(0);
                    return;
                }
                layoutInflaterFactory2C8158e2.f16589e.setAlpha(0.0f);
                C14712e vip = AbstractC2016e.vip(layoutInflaterFactory2C8158e2.f16589e);
                vip.ad(1.0f);
                layoutInflaterFactory2C8158e2.f16588e = vip;
                vip.license(new C4575e(0, this));
                return;
        }
    }
}
