package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1847e {
    public static final ExecutorC6131e yandex = new ExecutorC6131e();
    public final C9770e ad;
    public List appmetrica;
    public int billing;
    public final C18540e vip;
    public final CopyOnWriteArrayList license = new CopyOnWriteArrayList();
    public List purchase = Collections.EMPTY_LIST;
    public final ExecutorC6131e metrica = yandex;

    public C1847e(C9770e c9770e, C18540e c18540e) {
        this.ad = c9770e;
        this.vip = c18540e;
    }

    public final void ad() {
        Iterator it = this.license.iterator();
        while (it.hasNext()) {
            AbstractC5604e abstractC5604e = ((C15714e) it.next()).ad;
        }
    }
}
