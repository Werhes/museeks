package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9241e {
    public final int ad;
    public boolean appmetrica;
    public final /* synthetic */ C14742e billing;
    public int license;
    public int metrica;
    public long purchase;
    public Object vip;

    public C9241e(C14742e c14742e, int i) {
        this.billing = c14742e;
        this.ad = i;
    }

    public final void ad() {
        long duration;
        C14742e c14742e = this.billing;
        C6158e c6158e = (C6158e) c14742e.purchase;
        C2399e c2399e = (C2399e) c14742e.billing;
        C17148e c17148e = (C17148e) c14742e.vip;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        Object advert = mo2105e.Signature() ? null : mo2105e.advert(c17148e.mo2067default());
        int mo2090e = c17148e.mo2090e();
        int mo2128import = c17148e.mo2128import();
        long mo2071e = c17148e.mo2071e();
        if (advert == null || mo2090e != -1) {
            duration = mo2090e != -1 ? c17148e.getDuration() : -9223372036854775807L;
        } else {
            mo2105e.billing(advert, c6158e);
            mo2071e -= AbstractC9413e.m2567switch(c6158e.appmetrica);
            duration = AbstractC9413e.m2567switch(c6158e.license);
        }
        boolean mo2108e = c17148e.mo2108e();
        if (!mo2108e || duration == -9223372036854775807L || mo2071e < duration) {
            c2399e.purchase(3);
            if (mo2108e && duration != -9223372036854775807L) {
                c2399e.yandex(3, (int) Math.ceil(((float) (duration - mo2071e)) / c17148e.isVip().ad));
            }
            this.appmetrica = false;
            return;
        }
        ((C17381e) c14742e.appmetrica).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.appmetrica;
        int i = this.ad;
        if (z && Objects.equals(advert, this.vip) && mo2090e == this.metrica && mo2128import == this.license) {
            if (elapsedRealtime - this.purchase >= i) {
                ((SurfaceHolderCallbackC0960e) c14742e.license).ad.m4261e(new C5681e(2, new C3514e(3, i), 1003));
                return;
            }
            return;
        }
        this.appmetrica = true;
        this.purchase = elapsedRealtime;
        this.vip = advert;
        this.metrica = mo2090e;
        this.license = mo2128import;
        c2399e.purchase(3);
        c2399e.yandex(3, i);
    }
}
