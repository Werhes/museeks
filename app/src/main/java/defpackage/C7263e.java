package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7263e {
    public int ad;
    public C7988e appmetrica;
    public int license;
    public C7870e metrica;
    public ArrayList vip;

    public final C7988e ad() {
        C8560e loadAd;
        C8560e c8560e;
        C7870e c7870e = this.metrica;
        ArrayList arrayList = this.vip;
        if (arrayList.size() > 0) {
            c8560e = (C8560e) arrayList.remove(0);
        } else {
            while (true) {
                loadAd = c7870e.loadAd(c7870e.advert());
                if (loadAd == null || loadAd.metrica == this.ad) {
                    break;
                }
                c7870e.ad(loadAd);
            }
            c8560e = loadAd;
        }
        if (c8560e == null) {
            return null;
        }
        ByteBuffer byteBuffer = c8560e.ad;
        this.license++;
        C7988e c7988e = new C7988e(18, false);
        c7988e.f16176e = byteBuffer;
        return c7988e;
    }
}
