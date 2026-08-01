package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1395e {
    public int ad;
    public final ArrayList appmetrica;
    public final ArrayList billing;
    public final ArrayList license;
    public final ArrayList purchase;
    public final ArrayList yandex;
    public final ArrayList vip = new ArrayList(0);
    public final ArrayList metrica = new ArrayList(0);

    public C1395e(int i) {
        this.ad = i;
        new ArrayList(0);
        this.license = new ArrayList();
        this.appmetrica = new ArrayList();
        this.purchase = new ArrayList(0);
        this.billing = new ArrayList(0);
        InterfaceC14256e.ad.getClass();
        List ad = C12381e.ad();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it.next())).getClass();
            arrayList.add(new Object());
        }
        this.yandex = arrayList;
    }
}
