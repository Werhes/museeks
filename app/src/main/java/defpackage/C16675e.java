package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16675e {
    public final int ad;
    public final C12742e metrica;
    public final C12742e vip;

    public C16675e(int i, List list, List list2) {
        this.ad = i;
        if (!(i >= 0)) {
            AbstractC8889e.ad("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            AbstractC8889e.ad("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        C12742e c12742e = new C12742e();
        c12742e.addAll(list);
        this.vip = c12742e;
        C12742e c12742e2 = new C12742e();
        c12742e2.addAll(list2);
        this.metrica = c12742e2;
    }
}
