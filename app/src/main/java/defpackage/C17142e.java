package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17142e {
    public final C11139e ad;
    public final C0576e appmetrica;
    public long billing;
    public final Function0 license;
    public final long metrica;
    public AbstractC3424e purchase;
    public final Object vip;
    public long yandex = Long.MIN_VALUE;
    public final C0576e startapp = AbstractC14533e.startapp(Boolean.TRUE);

    public C17142e(Object obj, C11139e c11139e, AbstractC3424e abstractC3424e, long j, Object obj2, long j2, Function0 function0) {
        this.ad = c11139e;
        this.vip = obj2;
        this.metrica = j2;
        this.license = function0;
        this.appmetrica = AbstractC14533e.startapp(obj);
        this.purchase = AbstractC12246e.metrica(abstractC3424e);
        this.billing = j;
    }

    public final void ad() {
        this.startapp.setValue(Boolean.FALSE);
        this.license.invoke();
    }

    public final Object vip() {
        return this.ad.vip.invoke(this.purchase);
    }
}
