package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9745e extends AbstractC16997e {
    public C9745e() {
        super(false, 3);
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(910969549);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                AbstractC11110e abstractC11110e = C5422e.f11613e;
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(abstractC11110e, 10));
                Iterator<E> it = abstractC11110e.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14218e) it.next()).ad));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((Number) next).intValue() != R.drawable.vknext_logo) {
                        arrayList2.add(next);
                    }
                }
                List m3583e = AbstractC13480e.m3583e(arrayList2);
                Collections.shuffle(m3583e);
                m3681throw = AbstractC13480e.m3584final(AbstractC13480e.m3572catch(Integer.valueOf(R.drawable.ic_add_square_outline_28), AbstractC13480e.m3602switch(m3583e, 2)), AbstractC13480e.m3606throws(2, m3583e));
                c13770e.m3682throws(m3681throw);
            }
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(1921980264, new C2173e((List) m3681throw, this, 0), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 11);
        }
    }
}
