package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؒٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17493e {
    public final int ad;
    public final /* synthetic */ C14742e appmetrica;
    public long license;
    public boolean metrica;
    public int vip;

    public C17493e(C14742e c14742e, int i) {
        this.appmetrica = c14742e;
        this.ad = i;
    }

    public final void ad() {
        C14742e c14742e = this.appmetrica;
        C2399e c2399e = (C2399e) c14742e.billing;
        C17148e c17148e = (C17148e) c14742e.vip;
        int mo2106e = c17148e.mo2106e();
        if (!c17148e.mo2129interface() || c17148e.billing() == 1 || c17148e.billing() == 4 || mo2106e == 0 || mo2106e == 1) {
            if (this.metrica) {
                c2399e.purchase(4);
            }
            this.metrica = false;
            return;
        }
        ((C17381e) c14742e.appmetrica).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.metrica;
        int i = this.ad;
        if (z && this.vip == mo2106e) {
            if (elapsedRealtime - this.license >= i) {
                ((SurfaceHolderCallbackC0960e) c14742e.license).ad.m4261e(new C5681e(2, new C3514e(4, i), 1003));
                return;
            }
            return;
        }
        this.metrica = true;
        this.license = elapsedRealtime;
        this.vip = mo2106e;
        c2399e.purchase(4);
        c2399e.yandex(4, i);
    }
}
