package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0366e {
    public static final /* synthetic */ InterfaceC8614e[] advert;
    public int ad;
    public final ArrayList adcel;
    public final ArrayList appmetrica;
    public final ArrayList billing;
    public final ArrayList license;
    public final C18391e metrica;
    public final ArrayList mopub;
    public final ArrayList purchase;
    public final ArrayList startapp;
    public final C18391e vip;
    public final ArrayList yandex;

    static {
        C13506e c13506e = new C13506e(C0366e.class, "_hasSetter", "get_hasSetter()Z", 0);
        C12232e c12232e = AbstractC3820e.ad;
        advert = new InterfaceC8614e[]{c12232e.purchase(c13506e), AbstractC10257e.billing(C0366e.class, "_hasGetter", "get_hasGetter()Z", 0, c12232e)};
    }

    public C0366e(int i, int i2, int i3) {
        this.ad = i;
        Csuper advert2 = AbstractC6401e.advert(new C10861e(AbstractC1787e.ads, 1));
        Csuper advert3 = AbstractC6401e.advert(new C10861e(AbstractC1787e.applovin, 1));
        C18391e c18391e = new C18391e(i2);
        InterfaceC8614e[] interfaceC8614eArr = advert;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[1];
        C2526e.f6374e.remoteconfig(this, Integer.valueOf(advert3.f36470e | Integer.valueOf(this.ad).intValue()));
        this.vip = c18391e;
        InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[0];
        this.metrica = advert2.m4647interface(this) ? new C18391e(i3) : null;
        this.license = new ArrayList(0);
        this.appmetrica = new ArrayList(0);
        new ArrayList(0);
        this.purchase = new ArrayList();
        this.billing = new ArrayList(0);
        this.yandex = new ArrayList(0);
        this.startapp = new ArrayList(0);
        this.adcel = new ArrayList(0);
        InterfaceC14256e.ad.getClass();
        List ad = C12381e.ad();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it.next())).getClass();
            arrayList.add(new Object());
        }
        this.mopub = arrayList;
    }
}
