package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8907e extends AbstractC9555e {
    public static final C8907e appmetrica;
    public static final C8907e billing;
    public static final C8907e purchase;
    public static final C8907e yandex;
    public final /* synthetic */ int license;

    static {
        int i = 1;
        appmetrica = new C8907e(i, 2, 0);
        int i2 = 1;
        purchase = new C8907e(i2, i2, 1);
        billing = new C8907e(i, 2, 2);
        int i3 = 1;
        yandex = new C8907e(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8907e(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.license = i3;
    }

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        switch (this.license) {
            case 0:
                Object invoke = ((Function0) c11226e.billing(0)).invoke();
                C3155e c3155e = (C3155e) c11226e.billing(1);
                int purchase2 = c11226e.purchase(0);
                c3155e.getClass();
                c14479e.m3811catch(c14479e.metrica(c3155e), invoke);
                interfaceC11305e.amazon(purchase2, invoke);
                interfaceC11305e.appmetrica(invoke);
                return;
            case 1:
                C3155e c3155e2 = (C3155e) c11226e.billing(0);
                int purchase3 = c11226e.purchase(0);
                interfaceC11305e.advert();
                c3155e2.getClass();
                interfaceC11305e.license(purchase3, c14479e.crashlytics(c14479e.metrica(c3155e2)));
                return;
            case 2:
                Object billing2 = c11226e.billing(0);
                C3155e c3155e3 = (C3155e) c11226e.billing(1);
                int purchase4 = c11226e.purchase(0);
                if (billing2 instanceof InterfaceC9374e) {
                    c14995e.advert((InterfaceC9374e) billing2);
                }
                Object m3814extends = c14479e.m3814extends(c14479e.metrica(c3155e3), purchase4, billing2);
                if (m3814extends instanceof InterfaceC9374e) {
                    c14995e.billing((InterfaceC9374e) m3814extends);
                    return;
                } else {
                    if (m3814extends instanceof C2846e) {
                        ((C2846e) m3814extends).license();
                        return;
                    }
                    return;
                }
            default:
                Object billing3 = c11226e.billing(0);
                int purchase5 = c11226e.purchase(0);
                if (billing3 instanceof InterfaceC9374e) {
                    c14995e.advert((InterfaceC9374e) billing3);
                }
                Object m3814extends2 = c14479e.m3814extends(c14479e.pro, purchase5, billing3);
                if (m3814extends2 instanceof InterfaceC9374e) {
                    c14995e.billing((InterfaceC9374e) m3814extends2);
                    return;
                } else {
                    if (m3814extends2 instanceof C2846e) {
                        ((C2846e) m3814extends2).license();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC9555e
    public C3155e purchase(C11226e c11226e) {
        switch (this.license) {
            case 0:
                return (C3155e) c11226e.billing(1);
            case 1:
                return (C3155e) c11226e.billing(0);
            default:
                return super.purchase(c11226e);
        }
    }
}
