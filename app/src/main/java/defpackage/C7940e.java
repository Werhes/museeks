package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7940e implements InterfaceC8377e {
    public final C9142e ad;
    public final AbstractC3424e appmetrica;
    public final Object billing;
    public final AbstractC3424e license;
    public final Object metrica;
    public final AbstractC3424e purchase;
    public final C11139e vip;
    public final long yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌۧۦ, java.lang.Object] */
    public C7940e(C15217e c15217e, C11139e c11139e, Object obj, AbstractC3424e abstractC3424e) {
        InterfaceC4317e interfaceC4317e = c15217e.ad;
        ?? obj2 = new Object();
        obj2.vip = interfaceC4317e;
        obj2.ad = interfaceC4317e.metrica();
        InterfaceC4317e interfaceC4317e2 = (InterfaceC4317e) obj2.vip;
        this.ad = obj2;
        this.vip = c11139e;
        this.metrica = obj;
        AbstractC3424e abstractC3424e2 = (AbstractC3424e) c11139e.ad.invoke(obj);
        this.license = abstractC3424e2;
        this.appmetrica = AbstractC12246e.metrica(abstractC3424e);
        Function1 function1 = c11139e.vip;
        if (((AbstractC3424e) obj2.appmetrica) == null) {
            obj2.appmetrica = abstractC3424e2.metrica();
        }
        AbstractC3424e abstractC3424e3 = (AbstractC3424e) obj2.appmetrica;
        int vip = (abstractC3424e3 == null ? null : abstractC3424e3).vip();
        for (int i = 0; i < vip; i++) {
            AbstractC3424e abstractC3424e4 = (AbstractC3424e) obj2.appmetrica;
            if (abstractC3424e4 == null) {
                abstractC3424e4 = null;
            }
            abstractC3424e4.appmetrica(i, interfaceC4317e2.advert(abstractC3424e2.ad(i), abstractC3424e.ad(i)));
        }
        AbstractC3424e abstractC3424e5 = (AbstractC3424e) obj2.appmetrica;
        this.billing = function1.invoke(abstractC3424e5 == null ? null : abstractC3424e5);
        if (((AbstractC3424e) obj2.license) == null) {
            obj2.license = abstractC3424e2.metrica();
        }
        AbstractC3424e abstractC3424e6 = (AbstractC3424e) obj2.license;
        int vip2 = (abstractC3424e6 != null ? abstractC3424e6 : null).vip();
        long j = 0;
        for (int i2 = 0; i2 < vip2; i2++) {
            abstractC3424e2.getClass();
            j = Math.max(j, interfaceC4317e2.mopub(abstractC3424e.ad(i2)));
        }
        this.yandex = j;
        AbstractC3424e metrica = AbstractC12246e.metrica(this.ad.metrica(j, this.license, abstractC3424e));
        this.purchase = metrica;
        int vip3 = metrica.vip();
        for (int i3 = 0; i3 < vip3; i3++) {
            AbstractC3424e abstractC3424e7 = this.purchase;
            float ad = abstractC3424e7.ad(i3);
            float f = this.ad.ad;
            abstractC3424e7.appmetrica(i3, AbstractC3062e.vip(ad, -f, f));
        }
    }

    @Override // defpackage.InterfaceC8377e
    public final boolean ad() {
        return false;
    }

    @Override // defpackage.InterfaceC8377e
    public final /* synthetic */ boolean appmetrica(long j) {
        return AbstractC8703e.appmetrica(this, j);
    }

    @Override // defpackage.InterfaceC8377e
    public final Object billing() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC8377e
    public final AbstractC3424e license(long j) {
        if (AbstractC8703e.appmetrica(this, j)) {
            return this.purchase;
        }
        return this.ad.metrica(j, this.license, this.appmetrica);
    }

    @Override // defpackage.InterfaceC8377e
    public final C11139e metrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC8377e
    public final Object purchase(long j) {
        if (AbstractC8703e.appmetrica(this, j)) {
            return this.billing;
        }
        Function1 function1 = this.vip.vip;
        C9142e c9142e = this.ad;
        AbstractC3424e abstractC3424e = (AbstractC3424e) c9142e.metrica;
        AbstractC3424e abstractC3424e2 = this.license;
        if (abstractC3424e == null) {
            c9142e.metrica = abstractC3424e2.metrica();
        }
        AbstractC3424e abstractC3424e3 = (AbstractC3424e) c9142e.metrica;
        if (abstractC3424e3 == null) {
            abstractC3424e3 = null;
        }
        int vip = abstractC3424e3.vip();
        for (int i = 0; i < vip; i++) {
            AbstractC3424e abstractC3424e4 = (AbstractC3424e) c9142e.metrica;
            if (abstractC3424e4 == null) {
                abstractC3424e4 = null;
            }
            abstractC3424e4.appmetrica(i, ((InterfaceC4317e) c9142e.vip).billing(abstractC3424e2.ad(i), this.appmetrica.ad(i), j));
        }
        AbstractC3424e abstractC3424e5 = (AbstractC3424e) c9142e.metrica;
        return function1.invoke(abstractC3424e5 != null ? abstractC3424e5 : null);
    }

    @Override // defpackage.InterfaceC8377e
    public final long vip() {
        return this.yandex;
    }
}
