package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18034e implements InterfaceC9659e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object license;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C18034e(int i, Object obj, Object obj2, Object obj3) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
        this.license = obj3;
    }

    @Override // defpackage.InterfaceC9659e
    public final void ad() {
        switch (this.ad) {
            case 0:
                C12742e c12742e = (C12742e) this.vip;
                Object obj = this.metrica;
                c12742e.remove(obj);
                ((C15921e) this.license).license.advert(obj);
                return;
            case 1:
                ((InterfaceC16400e) this.vip).vip().vip((C12844e) this.metrica);
                C10628e c10628e = (C10628e) ((C4246e) this.license).f9318e;
                if (c10628e != null) {
                    c10628e.ad();
                    return;
                }
                return;
            default:
                C10304e c10304e = (C10304e) this.vip;
                C0583e c0583e = c10304e.f20354e;
                Object obj2 = this.metrica;
                Object advert = c0583e.advert(obj2);
                C15298e c15298e = (C15298e) this.license;
                if (advert == c15298e) {
                    Map map = c10304e.f20356e;
                    Map license = c15298e.license();
                    if (license.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, license);
                        return;
                    }
                }
                return;
        }
    }
}
