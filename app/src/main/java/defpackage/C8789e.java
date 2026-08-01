package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8789e {
    public final int ad;
    public long appmetrica;
    public boolean billing;
    public int license;
    public int metrica;
    public long purchase;
    public final /* synthetic */ C14742e startapp;
    public Object vip;
    public long yandex;

    public C8789e(C14742e c14742e, int i) {
        this.startapp = c14742e;
        this.ad = i;
    }

    public final void ad() {
        Object obj;
        C14742e c14742e = this.startapp;
        C2399e c2399e = (C2399e) c14742e.billing;
        C17148e c17148e = (C17148e) c14742e.vip;
        if (c17148e.billing() != 2 || !c17148e.mo2129interface() || c17148e.mo2106e() != 0) {
            if (this.billing) {
                c2399e.purchase(1);
            }
            this.billing = false;
            return;
        }
        AbstractC6690e mo2105e = c17148e.mo2105e();
        Object advert = mo2105e.Signature() ? null : mo2105e.advert(c17148e.mo2067default());
        int mo2090e = c17148e.mo2090e();
        int mo2128import = c17148e.mo2128import();
        long mo2097e = c17148e.mo2097e();
        long max = Math.max(0L, c17148e.premium() - Math.max(0L, mo2097e - c17148e.mo2071e()));
        if (advert != null && mo2090e == -1) {
            mo2097e -= AbstractC9413e.m2567switch(mo2105e.billing(advert, (C6158e) c14742e.purchase).appmetrica);
        }
        ((C17381e) c14742e.appmetrica).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.billing;
        int i = this.ad;
        if (z && Objects.equals(advert, this.vip) && mo2090e == this.metrica && mo2128import == this.license) {
            obj = advert;
            if (mo2097e == this.appmetrica && max == this.purchase) {
                if (elapsedRealtime - this.yandex >= i) {
                    ((SurfaceHolderCallbackC0960e) c14742e.license).ad.m4261e(new C5681e(2, new C3514e(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = advert;
        }
        this.billing = true;
        this.yandex = elapsedRealtime;
        this.vip = obj;
        this.metrica = mo2090e;
        this.license = mo2128import;
        this.appmetrica = mo2097e;
        this.purchase = max;
        c2399e.purchase(1);
        c2399e.yandex(1, i);
    }
}
