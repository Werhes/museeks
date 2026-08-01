package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12661e implements Cloneable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC18270e f25385e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC18270e f25386e;

    public AbstractC12661e(AbstractC18270e abstractC18270e) {
        this.f25386e = abstractC18270e;
        if (abstractC18270e.purchase()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f25385e = abstractC18270e.startapp();
    }

    public static void license(int i, List list) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public final AbstractC18270e ad() {
        AbstractC18270e vip = vip();
        vip.getClass();
        if (AbstractC18270e.appmetrica(vip, true)) {
            return vip;
        }
        throw new C4142e();
    }

    public final Object clone() {
        AbstractC12661e abstractC12661e = (AbstractC12661e) this.f25386e.vip(5);
        abstractC12661e.f25385e = vip();
        return abstractC12661e;
    }

    public final void metrica() {
        if (this.f25385e.purchase()) {
            return;
        }
        AbstractC18270e startapp = this.f25386e.startapp();
        AbstractC18270e abstractC18270e = this.f25385e;
        C13571e c13571e = C13571e.metrica;
        c13571e.getClass();
        c13571e.ad(startapp.getClass()).ad(startapp, abstractC18270e);
        this.f25385e = startapp;
    }

    public final AbstractC18270e vip() {
        if (!this.f25385e.purchase()) {
            return this.f25385e;
        }
        this.f25385e.billing();
        return this.f25385e;
    }
}
