package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۧٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14400e {
    public static final C13710e startapp;
    public final long ad;
    public final C1169e appmetrica;
    public final C11498e billing;
    public final C8194e license;
    public final long metrica;
    public final C7744e purchase;
    public final long vip;
    public final CopyOnWriteArrayList yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٓؒؕ, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.ad = 0L;
        startapp = obj;
    }

    public C14400e(InterfaceC9610e interfaceC9610e, long j, long j2, Set set) {
        Object obj;
        this.ad = j;
        this.vip = j2;
        C13710e c13710e = startapp;
        c13710e.getClass();
        this.metrica = C13710e.vip.incrementAndGet(c13710e);
        this.license = new C8194e(this);
        C1169e license = AbstractC6874e.license();
        Iterator it = interfaceC9610e.subs().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i = ((C13269e) it.next()).ad;
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((C12550e) obj).ad == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C12550e c12550e = (C12550e) obj;
            if (c12550e != null) {
                ArrayList arrayList = c12550e.vip;
                C11498e license2 = AbstractC14430e.license(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    license.add(new C9050e(this, i, ((C7662e) arrayList.get(i2)).ad, license2));
                }
            }
        }
        C1169e metrica = AbstractC6874e.metrica(license);
        this.appmetrica = metrica;
        this.purchase = AbstractC14430e.appmetrica(EnumC16228e.f31894e);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(metrica, 10));
        ListIterator listIterator = metrica.listIterator(0);
        while (true) {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                this.billing = AbstractC14430e.license(AbstractC13480e.premium(arrayList2).size());
                this.yandex = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new C13269e(((C9050e) c11045e.next()).f18109e));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame-");
        sb.append((Object) ("FrameId(value=" + this.metrica + ')'));
        sb.append('(');
        sb.append(this.ad);
        sb.append('@');
        return AbstractC10257e.mopub(sb, this.vip, ')');
    }
}
