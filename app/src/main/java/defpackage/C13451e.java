package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13451e implements InterfaceC11259e {
    public final boolean ad;

    public C13451e() {
        this.ad = Build.VERSION.SDK_INT < 34;
    }

    @Override // defpackage.InterfaceC11259e
    public final InterfaceC5355e ad(C16569e c16569e, C6302e c6302e) {
        InterfaceC4895e mo2321e = c16569e.ad.mo2321e();
        if (!mo2321e.mo1682e(0L, AbstractC1207e.vip) && !mo2321e.mo1682e(0L, AbstractC1207e.ad) && (!mo2321e.mo1682e(0L, AbstractC1207e.metrica) || !mo2321e.mo1682e(8L, AbstractC1207e.license) || !mo2321e.mo1682e(12L, AbstractC1207e.appmetrica) || !mo2321e.request(21L) || ((byte) (mo2321e.metrica().Signature(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !mo2321e.mo1682e(4L, AbstractC1207e.purchase)) {
                return null;
            }
            if (!mo2321e.mo1682e(8L, AbstractC1207e.billing) && !mo2321e.mo1682e(8L, AbstractC1207e.yandex) && !mo2321e.mo1682e(8L, AbstractC1207e.startapp)) {
                return null;
            }
        }
        return new C10472e(c16569e.ad, c6302e, this.ad);
    }
}
