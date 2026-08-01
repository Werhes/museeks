package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13338e implements InterfaceC13435e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AbstractC10347e license;
    public final /* synthetic */ InterfaceC3965e metrica;
    public final /* synthetic */ C12380e vip;

    public /* synthetic */ C13338e(C12380e c12380e, InterfaceC3965e interfaceC3965e, AbstractC10347e abstractC10347e, int i) {
        this.ad = i;
        this.vip = c12380e;
        this.metrica = interfaceC3965e;
        this.license = abstractC10347e;
    }

    @Override // defpackage.InterfaceC13435e
    public final void ad(C10474e c10474e) {
        switch (this.ad) {
            case 0:
                C12284e c12284e = (C12284e) this.license;
                c10474e.invoke();
                C12380e c12380e = this.vip;
                if (c12380e.vip().f33322e.length() > 0) {
                    InterfaceC3965e interfaceC3965e = this.metrica;
                    if (interfaceC3965e != null) {
                        ((C3112e) interfaceC3965e).ad();
                    }
                    String obj = c12380e.vip().f33322e.toString();
                    c12284e.m3335transient(true);
                    c12284e.m3333package(BuildConfig.FLAVOR);
                    AbstractC5336e.purchase(AbstractC4608e.metrica(c12284e.vip()), null, 0, new C6626e(c12284e, obj, null, 7), 3);
                    return;
                }
                return;
            case 1:
                C16070e c16070e = (C16070e) this.license;
                c10474e.invoke();
                C12380e c12380e2 = this.vip;
                if (c12380e2.vip().f33322e.length() > 0) {
                    InterfaceC3965e interfaceC3965e2 = this.metrica;
                    if (interfaceC3965e2 != null) {
                        ((C3112e) interfaceC3965e2).ad();
                    }
                    String obj2 = c12380e2.vip().f33322e.toString();
                    c16070e.f31640e.setValue(Boolean.TRUE);
                    c16070e.f31645e.setValue(BuildConfig.FLAVOR);
                    AbstractC5336e.purchase(AbstractC4608e.metrica(c16070e.vip()), null, 0, new C6626e(c16070e, obj2, null, 8), 3);
                    return;
                }
                return;
            default:
                C4126e c4126e = (C4126e) this.license;
                c10474e.invoke();
                C12380e c12380e3 = this.vip;
                if (c12380e3.vip().f33322e.length() > 0) {
                    InterfaceC3965e interfaceC3965e3 = this.metrica;
                    if (interfaceC3965e3 != null) {
                        ((C3112e) interfaceC3965e3).ad();
                    }
                    String obj3 = c12380e3.vip().f33322e.toString();
                    c4126e.f9086e.setValue(Boolean.TRUE);
                    c4126e.f9089e.setValue(BuildConfig.FLAVOR);
                    AbstractC5336e.purchase(AbstractC4608e.metrica(c4126e.vip()), null, 0, new C6626e(c4126e, obj3, null, 9), 3);
                    return;
                }
                return;
        }
    }
}
