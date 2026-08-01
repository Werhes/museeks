package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16907e {
    public int ad;
    public final ArrayList appmetrica = new ArrayList(1);
    public final int license;
    public final int metrica;
    public final ArrayList purchase;
    public final String vip;

    public C16907e(int i, int i2, int i3, String str) {
        this.ad = i;
        this.vip = str;
        this.metrica = i2;
        this.license = i3;
        InterfaceC14256e.ad.getClass();
        List ad = C12381e.ad();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it.next())).getClass();
            arrayList.add(new C6894e());
        }
        this.purchase = arrayList;
    }
}
