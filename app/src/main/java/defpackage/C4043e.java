package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4043e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18478e f8992e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8993e;

    public /* synthetic */ C4043e(C18478e c18478e, int i) {
        this.f8993e = i;
        this.f8992e = c18478e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8993e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC6022e.vip(null, AbstractC16653e.license(359417967, new C4043e(this.f8992e, 1), c13770e), c13770e, 48, 1);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c13770e2.m3676strictfp(-485754360);
                    InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e2.adcel(AbstractC11473e.yandex);
                    boolean purchase = c13770e2.purchase(interfaceC14388e);
                    Object m3681throw = c13770e2.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (purchase || m3681throw == c5170e) {
                        m3681throw = new C16352e(interfaceC14388e, 1);
                        c13770e2.m3682throws(m3681throw);
                    }
                    Function1 function1 = (Function1) m3681throw;
                    c13770e2.Signature(false);
                    Object[] objArr = new Object[0];
                    C11883e c11883e = new C11883e(new C14151e((byte) 0, 10), new C2046e(13, function1), 15);
                    boolean license = c13770e2.license(2) | c13770e2.purchase(function1);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (license || m3681throw2 == c5170e) {
                        m3681throw2 = new C5565e(EnumC11762e.f23636e, function1, 23);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    C2628e c2628e = (C2628e) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw2, c13770e2, 0);
                    boolean yandex = c13770e2.yandex(c2628e);
                    C18478e c18478e = this.f8992e;
                    boolean yandex2 = yandex | c13770e2.yandex(c18478e);
                    Object m3681throw3 = c13770e2.m3681throw();
                    InterfaceC5083e interfaceC5083e = null;
                    if (yandex2 || m3681throw3 == c5170e) {
                        m3681throw3 = new C1695e(c2628e, c18478e, interfaceC5083e, 20);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    AbstractC17680e.license(c13770e2, c2628e, (Function2) m3681throw3);
                    Unit unit = Unit.INSTANCE;
                    boolean yandex3 = c13770e2.yandex(c2628e);
                    Object m3681throw4 = c13770e2.m3681throw();
                    if (yandex3 || m3681throw4 == c5170e) {
                        m3681throw4 = new C15238e(c2628e, null, 16);
                        c13770e2.m3682throws(m3681throw4);
                    }
                    AbstractC17680e.license(c13770e2, unit, (Function2) m3681throw4);
                    AbstractC0882e.ad(c2628e, null, false, false, false, null, AbstractC16653e.license(-1730933101, new C0074e(c18478e, 0), c13770e2), c13770e2, 12582968);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
