package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15244e implements InterfaceC16282e {
    @Override // defpackage.InterfaceC16282e
    public final void ad(C15816e c15816e, C11154e c11154e) {
        C2697e c2697e = c11154e.vip;
        if (c2697e != null) {
            C1595e c1595e = new C1595e();
            C12691e c12691e = new C12691e();
            for (C6900e c6900e : c2697e.ad) {
                boolean z = c6900e.appmetrica;
                C14943e c14943e = c6900e.vip;
                if (z) {
                    c15816e.m4017final("EXT-X-DISCONTINUITY");
                }
                C4903e c4903e = c6900e.metrica;
                if (c4903e != null && !c4903e.equals(c1595e.advert)) {
                    c1595e.advert = c4903e;
                    if (c2697e != null) {
                        c1595e.appmetrica(c15816e, c2697e);
                    }
                }
                C4438e c4438e = c6900e.purchase;
                if (c4438e != null && !c4438e.equals(c12691e.advert)) {
                    c12691e.advert = c4438e;
                    if (c2697e != null) {
                        c12691e.appmetrica(c15816e, c2697e);
                    }
                }
                C5564e c5564e = c6900e.billing;
                if (c5564e != null) {
                    Long l = c5564e.vip;
                    long j = c5564e.ad;
                    c15816e.m4022super("EXT-X-BYTERANGE", l != null ? String.valueOf(j) + '@' + String.valueOf(c5564e.vip) : String.valueOf(j));
                }
                StringBuilder sb = new StringBuilder();
                if (c11154e.license < 3) {
                    sb.append(Integer.toString((int) c14943e.ad));
                } else {
                    sb.append(Float.toString(c14943e.ad));
                }
                sb.append(AbstractC16316e.ad);
                String str = c14943e.vip;
                if (str != null) {
                    sb.append(str);
                }
                c15816e.m4022super("EXTINF", sb.toString());
                c15816e.m4014catch(c6900e.ad);
            }
        }
    }
}
