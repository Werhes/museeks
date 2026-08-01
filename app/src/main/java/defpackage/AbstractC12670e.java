package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12670e extends AbstractC13584e {
    public Object[] ad;
    public boolean metrica;
    public int vip;

    public AbstractC12670e(int i) {
        AbstractC17595e.metrica(i, "initialCapacity");
        this.ad = new Object[i];
        this.vip = 0;
    }

    public final void appmetrica(int i) {
        Object[] objArr = this.ad;
        int vip = AbstractC13584e.vip(objArr.length, this.vip + i);
        if (vip > objArr.length || this.metrica) {
            this.ad = Arrays.copyOf(this.ad, vip);
            this.metrica = false;
        }
    }

    public final void license(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            appmetrica(collection.size());
            if (collection instanceof AbstractC0281e) {
                this.vip = ((AbstractC0281e) collection).billing(this.vip, this.ad);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ad(it.next());
        }
    }

    public final void metrica(Object obj) {
        obj.getClass();
        appmetrica(1);
        Object[] objArr = this.ad;
        int i = this.vip;
        this.vip = i + 1;
        objArr[i] = obj;
    }
}
