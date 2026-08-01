package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15683e {
    public final int ad;
    public final CopyOnWriteArrayList metrica;
    public final C18208e vip;

    public C15683e(CopyOnWriteArrayList copyOnWriteArrayList, int i, C18208e c18208e) {
        this.metrica = copyOnWriteArrayList;
        this.ad = i;
        this.vip = c18208e;
    }

    public final void ad(C8455e c8455e) {
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            C4881e c4881e = (C4881e) it.next();
            AbstractC9413e.m2565strictfp(c4881e.ad, new RunnableC4904e(13, this, c4881e.vip, c8455e));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eٕۤٙ, java.lang.Object] */
    public final void appmetrica() {
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            C4881e c4881e = (C4881e) it.next();
            AbstractC9413e.m2565strictfp(c4881e.ad, new RunnableC9111e(this, c4881e.vip, 0));
        }
    }

    public final void license(Exception exc) {
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            C4881e c4881e = (C4881e) it.next();
            AbstractC9413e.m2565strictfp(c4881e.ad, new RunnableC4904e(12, this, c4881e.vip, exc));
        }
    }

    public final void metrica(int i) {
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            C4881e c4881e = (C4881e) it.next();
            AbstractC9413e.m2565strictfp(c4881e.ad, new RunnableC16764e(this, c4881e.vip, i, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eٕۤٙ, java.lang.Object] */
    public final void vip() {
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            C4881e c4881e = (C4881e) it.next();
            AbstractC9413e.m2565strictfp(c4881e.ad, new RunnableC9111e(this, c4881e.vip, 1));
        }
    }
}
