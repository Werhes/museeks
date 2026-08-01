package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9260e implements InterfaceC8377e {
    public final InterfaceC17717e ad;
    public final AbstractC3424e appmetrica;
    public final AbstractC3424e billing;
    public final Object license;
    public final Object metrica;
    public final AbstractC3424e purchase;
    public AbstractC3424e startapp;
    public final C11139e vip;
    public long yandex;

    public C9260e(InterfaceC2869e interfaceC2869e, C11139e c11139e, Object obj, Object obj2, AbstractC3424e abstractC3424e) {
        this.ad = interfaceC2869e.ad(c11139e);
        this.vip = c11139e;
        this.metrica = obj2;
        this.license = obj;
        this.appmetrica = (AbstractC3424e) c11139e.ad.invoke(obj);
        Function1 function1 = c11139e.ad;
        this.purchase = (AbstractC3424e) function1.invoke(obj2);
        this.billing = abstractC3424e != null ? AbstractC12246e.metrica(abstractC3424e) : ((AbstractC3424e) function1.invoke(obj)).metrica();
        this.yandex = -1L;
    }

    @Override // defpackage.InterfaceC8377e
    public final boolean ad() {
        return this.ad.ad();
    }

    @Override // defpackage.InterfaceC8377e
    public final /* synthetic */ boolean appmetrica(long j) {
        return AbstractC8703e.appmetrica(this, j);
    }

    @Override // defpackage.InterfaceC8377e
    public final Object billing() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC8377e
    public final AbstractC3424e license(long j) {
        if (!AbstractC8703e.appmetrica(this, j)) {
            return this.ad.adcel(j, this.appmetrica, this.purchase, this.billing);
        }
        AbstractC3424e abstractC3424e = this.startapp;
        if (abstractC3424e != null) {
            return abstractC3424e;
        }
        AbstractC3424e tapsense = this.ad.tapsense(this.appmetrica, this.purchase, this.billing);
        this.startapp = tapsense;
        return tapsense;
    }

    @Override // defpackage.InterfaceC8377e
    public final C11139e metrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC8377e
    public final Object purchase(long j) {
        if (AbstractC8703e.appmetrica(this, j)) {
            return this.metrica;
        }
        AbstractC3424e pro = this.ad.pro(j, this.appmetrica, this.purchase, this.billing);
        int vip = pro.vip();
        for (int i = 0; i < vip; i++) {
            if (Float.isNaN(pro.ad(i))) {
                AbstractC2878e.vip("AnimationVector cannot contain a NaN. " + pro + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.vip.vip.invoke(pro);
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.license + " -> " + this.metrica + ",initial velocity: " + this.billing + ", duration: " + (vip() / 1000000) + " ms,animationSpec: " + this.ad;
    }

    @Override // defpackage.InterfaceC8377e
    public final long vip() {
        if (this.yandex < 0) {
            this.yandex = this.ad.inmobi(this.appmetrica, this.purchase, this.billing);
        }
        return this.yandex;
    }
}
