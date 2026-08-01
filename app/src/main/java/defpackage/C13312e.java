package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13312e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f26558e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15435e f26559e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26560e;

    public /* synthetic */ C13312e(C15435e c15435e, InterfaceC16132e interfaceC16132e, int i) {
        this.f26560e = i;
        this.f26559e = c15435e;
        this.f26558e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f26560e;
        C5170e c5170e = C2987e.ad;
        InterfaceC16132e interfaceC16132e = this.f26558e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    String str = (String) interfaceC16132e.getValue();
                    C15435e c15435e = this.f26559e;
                    boolean yandex = c13770e.yandex(c15435e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        C0638e c0638e = new C0638e(1, c15435e, C15435e.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 20);
                        c13770e.m3682throws(c0638e);
                        m3681throw = c0638e;
                    }
                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw;
                    boolean yandex2 = c13770e.yandex(c15435e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        C0638e c0638e2 = new C0638e(1, c15435e, C15435e.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 21);
                        c13770e.m3682throws(c0638e2);
                        m3681throw2 = c0638e2;
                    }
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 0.0f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).metrica(c13770e), 0.0f, 0.0f, 13);
                    C8094e c8094e = C8094e.ad;
                    c15435e.m3992else(str, (Function1) interfaceC5261e, (Function1) ((InterfaceC5261e) m3681throw2), loadAd, false, AbstractC17540e.ad, AbstractC16653e.license(1372346255, new C18304e(c15435e), c13770e), C8094e.vip(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c13770e, 2147483646, 4095), null, c13770e, 1769472);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z = ((C2765e) interfaceC16132e.getValue()).license;
                    C15435e c15435e2 = this.f26559e;
                    if (z) {
                        c13770e2.m3676strictfp(1183672186);
                        c15435e2.m3997transient(c13770e2, 0);
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(1183807687);
                        C16005e metrica = AbstractC12220e.metrica(0.0f, 12, 1);
                        boolean purchase = c13770e2.purchase(interfaceC16132e) | c13770e2.yandex(c15435e2);
                        Object m3681throw3 = c13770e2.m3681throw();
                        if (purchase || m3681throw3 == c5170e) {
                            m3681throw3 = new C12439e(interfaceC16132e, c15435e2, 24);
                            c13770e2.m3682throws(m3681throw3);
                        }
                        AbstractC7023e.ad(C0115e.f1276e, null, metrica, null, null, null, false, null, (Function1) m3681throw3, c13770e2, 390, 506);
                        c13770e2.Signature(false);
                    }
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
