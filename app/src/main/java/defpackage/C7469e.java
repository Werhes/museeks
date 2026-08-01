package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7469e {
    public final String ad;
    public List vip = C13664e.f27089e;
    public final ArrayList metrica = new ArrayList();
    public final HashSet license = new HashSet();
    public final ArrayList appmetrica = new ArrayList();
    public final ArrayList purchase = new ArrayList();
    public final ArrayList billing = new ArrayList();

    public C7469e(String str) {
        this.ad = str;
    }

    public final void ad(InterfaceC9998e interfaceC9998e, String str) {
        if (!this.license.add(str)) {
            StringBuilder applovin = AbstractC8703e.applovin("Element with name '", str, "' is already registered in ");
            applovin.append(this.ad);
            throw new IllegalArgumentException(applovin.toString().toString());
        }
        this.metrica.add(str);
        this.appmetrica.add(interfaceC9998e);
        this.purchase.add(C13664e.f27089e);
        this.billing.add(Boolean.FALSE);
    }
}
