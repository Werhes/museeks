package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۜۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18027e implements InterfaceC0867e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C18027e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC0867e
    public final void accept(Object obj) {
        switch (this.ad) {
            case 0:
                ((C0909e) this.vip).getClass();
                AbstractC13062e.metrica();
                return;
            case 1:
                C0167e c0167e = (C0167e) obj;
                for (Map.Entry entry : ((Map) this.vip).entrySet()) {
                    int i = c0167e.vip - ((C4170e) entry.getKey()).purchase;
                    if (((C4170e) entry.getKey()).billing) {
                        i = -i;
                    }
                    int adcel = AbstractC8261e.adcel(i);
                    C4753e c4753e = (C4753e) entry.getValue();
                    c4753e.getClass();
                    AbstractC13062e.billing(new RunnableC2490e(c4753e, adcel, -1));
                }
                return;
            case 2:
                C9509e c9509e = (C9509e) this.vip;
                AbstractC9464e.yandex("SurfaceViewImpl", "Safe to release surface.");
                if (c9509e != null) {
                    c9509e.billing();
                    return;
                }
                return;
            case 3:
                ((C7169e) this.vip).ad((C17756e) obj);
                return;
            default:
                C2245e c2245e = (C2245e) this.vip;
                AbstractC9464e.yandex("VideoEncoderSession", "Surface can be closed: " + ((C17756e) obj).vip);
                c2245e.billing = null;
                ((C7169e) c2245e.advert).ad((C18405e) c2245e.purchase);
                c2245e.ad();
                return;
        }
    }
}
