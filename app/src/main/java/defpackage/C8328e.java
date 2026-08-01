package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۤۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8328e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C10797e f17025e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f17026e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17027e;

    public /* synthetic */ C8328e(C10797e c10797e, InterfaceC16132e interfaceC16132e, int i) {
        this.f17027e = i;
        this.f17025e = c10797e;
        this.f17026e = interfaceC16132e;
    }

    public /* synthetic */ C8328e(InterfaceC16132e interfaceC16132e, C10797e c10797e) {
        this.f17027e = 1;
        this.f17026e = interfaceC16132e;
        this.f17025e = c10797e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C10797e c10797e;
        int i = this.f17027e;
        C10797e c10797e2 = this.f17025e;
        Object obj3 = C2987e.ad;
        InterfaceC16132e interfaceC16132e = this.f17026e;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C10797e c10797e3 = this.f17025e;
                    if (c10797e3.f21406e.length() > 0) {
                        c13770e.m3676strictfp(1736646572);
                        AbstractC10560e.license(AbstractC16653e.license(-1085734120, new C8328e(interfaceC16132e, c10797e3), c13770e), null, AbstractC16653e.license(-1958144682, new C3471e(c10797e3, i3), c13770e), null, 0.0f, null, null, null, null, c13770e, 390, 506);
                        c13770e.Signature(false);
                    } else {
                        c13770e.m3676strictfp(1737541015);
                        String str = (String) interfaceC16132e.getValue();
                        boolean yandex = c13770e.yandex(c10797e3);
                        Object m3681throw = c13770e.m3681throw();
                        if (yandex || m3681throw == obj3) {
                            Object c10981e = new C10981e(1, c10797e3, C10797e.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 7);
                            c10797e = c10797e3;
                            c13770e.m3682throws(c10981e);
                            m3681throw = c10981e;
                        } else {
                            c10797e = c10797e3;
                        }
                        InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw;
                        boolean yandex2 = c13770e.yandex(c10797e);
                        Object m3681throw2 = c13770e.m3681throw();
                        if (yandex2 || m3681throw2 == obj3) {
                            Object c10981e2 = new C10981e(1, c10797e, C10797e.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 8);
                            c13770e.m3682throws(c10981e2);
                            m3681throw2 = c10981e2;
                        }
                        InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 0.0f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).metrica(c13770e), 0.0f, 0.0f, 13);
                        C8094e c8094e = C8094e.ad;
                        c10797e.m2931else(str, (Function1) interfaceC5261e, (Function1) ((InterfaceC5261e) m3681throw2), loadAd, false, AbstractC0815e.f3206e, AbstractC16653e.license(-1674405905, new C3471e(c10797e, i2), c13770e), C8094e.vip(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c13770e, 2147483646, 4095), null, c13770e, 1769472);
                        c13770e.Signature(false);
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean purchase = c13770e2.purchase((String) interfaceC16132e.getValue());
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (purchase || m3681throw3 == obj3) {
                        m3681throw3 = ((String) interfaceC16132e.getValue()) + ' ' + c10797e2.f27451e.getString(R.string.in_cache);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    AbstractC14489e.vip((String) m3681throw3, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e2, 0, 24960, 241662);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c13770e3.m3659default();
                } else if (((C2765e) interfaceC16132e.getValue()).license) {
                    c13770e3.m3676strictfp(-1154512450);
                    c10797e2.m2936transient(c13770e3, 0);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3676strictfp(-1154376949);
                    C16005e metrica = AbstractC12220e.metrica(0.0f, 12, 1);
                    boolean purchase2 = c13770e3.purchase(interfaceC16132e) | c13770e3.yandex(c10797e2);
                    Object m3681throw4 = c13770e3.m3681throw();
                    if (purchase2 || m3681throw4 == obj3) {
                        m3681throw4 = new C6538e(interfaceC16132e, c10797e2, 14);
                        c13770e3.m3682throws(m3681throw4);
                    }
                    AbstractC7023e.ad(C0115e.f1276e, null, metrica, null, null, null, false, null, (Function1) m3681throw4, c13770e3, 390, 506);
                    c13770e3.Signature(false);
                }
                return Unit.INSTANCE;
        }
    }
}
