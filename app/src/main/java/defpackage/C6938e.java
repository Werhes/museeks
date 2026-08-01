package defpackage;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6938e implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C6938e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.ad) {
            case 0:
                ((C8419e) this.vip).Signature(null);
                return;
            case 1:
                C15860e c15860e = (C15860e) this.vip;
                if (c15860e != null) {
                    C7911e c7911e = c15860e.license;
                    if (c7911e != null) {
                        c7911e.appmetrica(C12347e.vip);
                    }
                    C7911e c7911e2 = c15860e.license;
                    if (c7911e2 != null) {
                        c7911e2.purchase(C12347e.vip);
                        return;
                    }
                    return;
                }
                return;
            default:
                C11388e c11388e = (C11388e) this.vip;
                C12380e c12380e = c11388e.ad;
                InterfaceC12006e interfaceC12006e = c11388e.vip;
                c12380e.vip.ad().admob();
                C2573e c2573e = c12380e.vip;
                c2573e.f6431e = null;
                c11388e.advert(c2573e);
                C12380e.ad(c12380e, interfaceC12006e, true, 1);
                c12380e.license(true);
                return;
        }
    }
}
