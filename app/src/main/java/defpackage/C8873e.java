package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8873e extends AbstractC13238e {
    public final /* synthetic */ int billing;
    public final HashMap purchase;

    public C8873e(int i) {
        this.billing = i;
        HashMap hashMap = new HashMap();
        this.purchase = hashMap;
        hashMap.put("BANDWIDTH", new C3270e(4));
        hashMap.put("AVERAGE-BANDWIDTH", new C3270e(5));
        hashMap.put("CODECS", new C12953e(this, 0));
        hashMap.put("RESOLUTION", new C3270e(6));
        hashMap.put("FRAME-RATE", new C3270e(7));
        hashMap.put("VIDEO", new C12953e(this, 1));
        hashMap.put("PROGRAM-ID", new C3270e(8));
    }

    @Override // defpackage.AbstractC13238e
    public final void appmetrica(C15816e c15816e, C4541e c4541e) {
        switch (this.billing) {
            case 0:
                Iterator it = c4541e.vip.iterator();
                while (it.hasNext()) {
                    license(c15816e, (C7297e) it.next(), this.purchase);
                }
                return;
            default:
                for (C12070e c12070e : c4541e.ad) {
                    C14796e c14796e = c12070e.vip;
                    if (c14796e != null) {
                        license(c15816e, c14796e, this.purchase);
                        c15816e.m4014catch(c12070e.ad);
                    }
                }
                return;
        }
    }

    @Override // defpackage.AbstractC17001e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.AbstractC17001e
    public final String vip() {
        switch (this.billing) {
            case 0:
                return "EXT-X-I-FRAME-STREAM-INF";
            default:
                return "EXT-X-STREAM-INF";
        }
    }
}
