package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7558e {
    public final C11139e ad;
    public AbstractC3424e adcel;
    public final C0576e appmetrica;
    public final C13540e billing;
    public final C0576e license;
    public final C16747e metrica;
    public AbstractC3424e mopub;
    public final C18298e purchase;
    public final AbstractC3424e startapp;
    public final Object vip;
    public final AbstractC3424e yandex;

    public C7558e(Object obj, C11139e c11139e, Object obj2) {
        this.ad = c11139e;
        this.vip = obj2;
        C16747e c16747e = new C16747e(c11139e, obj, null, 60);
        this.metrica = c16747e;
        this.license = AbstractC14533e.startapp(Boolean.FALSE);
        this.appmetrica = AbstractC14533e.startapp(obj);
        this.purchase = new C18298e();
        this.billing = new C13540e(obj2);
        AbstractC3424e abstractC3424e = c16747e.f32834e;
        boolean z = abstractC3424e instanceof C2493e;
        AbstractC3424e abstractC3424e2 = z ? AbstractC7111e.appmetrica : abstractC3424e instanceof C14443e ? AbstractC7111e.purchase : abstractC3424e instanceof C18062e ? AbstractC7111e.billing : AbstractC7111e.yandex;
        this.yandex = abstractC3424e2;
        AbstractC3424e abstractC3424e3 = z ? AbstractC7111e.ad : abstractC3424e instanceof C14443e ? AbstractC7111e.vip : abstractC3424e instanceof C18062e ? AbstractC7111e.metrica : AbstractC7111e.license;
        this.startapp = abstractC3424e3;
        this.adcel = abstractC3424e2;
        this.mopub = abstractC3424e3;
    }

    public /* synthetic */ C7558e(Object obj, C11139e c11139e, Object obj2, int i) {
        this(obj, c11139e, (i & 4) != 0 ? null : obj2);
    }

    public static final void ad(C7558e c7558e) {
        C16747e c16747e = c7558e.metrica;
        c16747e.f32834e.license();
        c16747e.f32836e = Long.MIN_VALUE;
        c7558e.license.setValue(Boolean.FALSE);
    }

    public static Object vip(C7558e c7558e, Object obj, InterfaceC2869e interfaceC2869e, Function1 function1, InterfaceC5083e interfaceC5083e, int i) {
        if ((i & 2) != 0) {
            interfaceC2869e = c7558e.billing;
        }
        InterfaceC2869e interfaceC2869e2 = interfaceC2869e;
        Object invoke = c7558e.ad.vip.invoke(c7558e.metrica.f32834e);
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        Object license = c7558e.license();
        C11139e c11139e = c7558e.ad;
        return C18298e.ad(c7558e.purchase, new C1297e(c7558e, invoke, new C9260e(interfaceC2869e2, c11139e, license, obj, (AbstractC3424e) c11139e.ad.invoke(invoke)), c7558e.metrica.f32836e, function12, null), interfaceC5083e);
    }

    public final boolean appmetrica() {
        return ((Boolean) this.license.getValue()).booleanValue();
    }

    public final Object billing(AbstractC7185e abstractC7185e) {
        Object ad = C18298e.ad(this.purchase, new C4738e(this, null, 0), abstractC7185e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }

    public final Object license() {
        return this.metrica.f32835e.getValue();
    }

    public final Object metrica(Object obj) {
        if (AbstractC7890e.billing(this.adcel, this.yandex) && AbstractC7890e.billing(this.mopub, this.startapp)) {
            return obj;
        }
        C11139e c11139e = this.ad;
        AbstractC3424e abstractC3424e = (AbstractC3424e) c11139e.ad.invoke(obj);
        int vip = abstractC3424e.vip();
        boolean z = false;
        for (int i = 0; i < vip; i++) {
            if (abstractC3424e.ad(i) < this.adcel.ad(i) || abstractC3424e.ad(i) > this.mopub.ad(i)) {
                abstractC3424e.appmetrica(i, AbstractC3062e.vip(abstractC3424e.ad(i), this.adcel.ad(i), this.mopub.ad(i)));
                z = true;
            }
        }
        return z ? c11139e.vip.invoke(abstractC3424e) : obj;
    }

    public final Object purchase(InterfaceC5083e interfaceC5083e, Object obj) {
        Object ad = C18298e.ad(this.purchase, new C9143e(this, obj, null, 0), interfaceC5083e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }
}
