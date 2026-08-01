package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؐ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3056e extends AbstractC1303e {
    public final List ad;

    public C3056e(List list) {
        this.ad = list;
    }

    @Override // defpackage.AbstractC1303e
    public final InterfaceC10597e vip(AbstractC15603e abstractC15603e) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            InterfaceC10597e vip = ((AbstractC1303e) it.next()).vip(abstractC15603e);
            if (vip != null) {
                return vip;
            }
        }
        return null;
    }
}
