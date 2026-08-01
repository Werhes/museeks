package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6363e extends C9492e {
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6363e(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.purchase = i;
    }

    @Override // defpackage.C9492e
    public void ad(Iterator it, C16212e c16212e) {
        switch (this.purchase) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.ad;
                    if (!hasNext) {
                        c16212e.ad(next, str);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(next);
                    do {
                        sb.append(',');
                        sb.append(it.next());
                    } while (it.hasNext());
                    sb.append(']');
                    c16212e.ad(sb.toString(), str);
                    return;
                }
                return;
            default:
                super.ad(it, c16212e);
                return;
        }
    }

    @Override // defpackage.C9492e
    public void vip(Object obj, C16212e c16212e) {
        switch (this.purchase) {
            case 1:
                C14787e c14787e = (C14787e) obj;
                if (c14787e == null) {
                    return;
                }
                C12403e c12403e = c14787e.ad.f24464e;
                c12403e.getClass();
                int i = 0;
                while (true) {
                    if (!(i < c12403e.billing() - c12403e.appmetrica())) {
                        return;
                    }
                    if (i >= c12403e.billing() - c12403e.appmetrica()) {
                        throw new NoSuchElementException();
                    }
                    C12169e c12169e = c12403e.f24835e;
                    int appmetrica = c12403e.appmetrica() + i;
                    i++;
                    Map.Entry entry = (Map.Entry) c12169e.f24467e[appmetrica];
                    if (((Set) entry.getValue()).isEmpty()) {
                        c16212e.ad(null, (String) entry.getKey());
                    } else {
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            c16212e.ad(it.next(), (String) entry.getKey());
                        }
                    }
                }
            default:
                super.vip(obj, c16212e);
                return;
        }
    }
}
