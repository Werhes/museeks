package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1715e implements InterfaceC6823e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f4662e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4663e;

    public /* synthetic */ C1715e(int i, Object obj) {
        this.f4663e = i;
        this.f4662e = obj;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        int i = this.f4663e;
        Object obj = this.f4662e;
        switch (i) {
            case 0:
                Object obj2 = C13150e.adcel;
                return new C6843e((ArrayList) obj);
            default:
                C10040e c10040e = (C10040e) obj;
                InterfaceScheduledExecutorServiceC1678e interfaceScheduledExecutorServiceC1678e = (InterfaceScheduledExecutorServiceC1678e) c10040e.metrica.get();
                interfaceScheduledExecutorServiceC1678e.getClass();
                C0582e c0582e = (C0582e) c10040e.vip.get();
                c0582e.getClass();
                C3355e c3355e = c0582e.ad;
                C9321e ad = C0381e.ad();
                ad.ad = new C8167e(5, c3355e);
                ad.license = new C1032e[]{AbstractC17540e.purchase};
                ad.metrica = true;
                ad.vip = false;
                C5441e vip = C0582e.vip(c3355e.appmetrica(0, ad.ad()));
                C7170e c7170e = C7170e.f14657e;
                int i2 = AbstractRunnableC15090e.f29871e;
                AbstractRunnableC15090e abstractRunnableC15090e = new AbstractRunnableC15090e(vip, C4914e.class, c7170e);
                vip.ad(abstractRunnableC15090e, AbstractC3697e.billing(interfaceScheduledExecutorServiceC1678e, abstractRunnableC15090e));
                C9590e purchase = AbstractC2017e.purchase(abstractRunnableC15090e, new C2713e(3, c10040e), interfaceScheduledExecutorServiceC1678e);
                purchase.ad(new RunnableC16721e(24, purchase), interfaceScheduledExecutorServiceC1678e);
                return purchase;
        }
    }
}
