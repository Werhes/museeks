package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11120e {
    public final C13610e ad;
    public final C0576e license;
    public final Function0 metrica;
    public final C13119e vip;
    public final C0576e appmetrica = AbstractC14533e.startapp(AbstractC5797e.vip);
    public InterfaceC6512e purchase = AbstractC0197e.ad;
    public final C0576e billing = AbstractC14533e.startapp(null);

    public C11120e(C13610e c13610e, C13119e c13119e, C15037e c15037e, Function0 function0) {
        this.ad = c13610e;
        this.vip = c13119e;
        this.metrica = function0;
        this.license = AbstractC14533e.startapp(c15037e);
    }

    public final void ad(C0763e c0763e, C0763e c0763e2, C1581e c1581e) {
        C13540e purchase;
        if (this.ad.vip()) {
            C0576e c0576e = this.billing;
            if (((InterfaceC16132e) c0576e.getValue()) == null) {
                if (c1581e == null) {
                    c1581e = (C1581e) this.appmetrica.getValue();
                }
                switch (c1581e.ad) {
                    case 0:
                        purchase = AbstractC12696e.purchase(0.0f, 0.0f, AbstractC5392e.ad, 3);
                        break;
                    default:
                        purchase = AbstractC10576e.ad;
                        break;
                }
                this.purchase = purchase;
            }
            c0576e.setValue(((C15037e) this.license.getValue()).ad(new C17097e(8, this), new C7314e(2, this, c0763e2, c0763e)));
        }
    }

    public final C0763e metrica() {
        InterfaceC16132e interfaceC16132e;
        C0763e c0763e;
        if (!this.ad.vip() || (interfaceC16132e = (InterfaceC16132e) this.billing.getValue()) == null || (c0763e = (C0763e) interfaceC16132e.getValue()) == null) {
            return null;
        }
        long j = ((C2152e) this.metrica.invoke()).ad;
        return !C2152e.vip(j, 0L) ? c0763e.amazon(j) : c0763e;
    }

    public final boolean vip() {
        return ((Boolean) this.vip.license.getValue()).booleanValue();
    }
}
