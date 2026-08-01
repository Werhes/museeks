package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۠ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18054e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f35408e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5344e f35409e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35410e;

    public /* synthetic */ C18054e(C5344e c5344e, int i, int i2) {
        this.f35410e = i2;
        this.f35409e = c5344e;
        this.f35408e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35410e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C5344e c5344e = this.f35409e;
                    InterfaceC16132e ad = AbstractC16102e.ad(c5344e.m1891private() == ((EnumC12651e) c5344e.f11454e.getValue()) ? 96 : 0, AbstractC12696e.purchase(0.0f, 1000.0f, null, 5), null, c13770e, 48, 12);
                    boolean yandex = c13770e.yandex(c5344e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        C15101e c15101e = new C15101e(0, c5344e, C5344e.class, "commitChanges", "commitChanges()V", 0, 0, 24);
                        c13770e.m3682throws(c15101e);
                        m3681throw = c15101e;
                    }
                    Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
                    boolean purchase = c13770e.purchase(ad);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (purchase || m3681throw2 == c5170e) {
                        m3681throw2 = new C17652e(ad, 3);
                        c13770e.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e isPro = AbstractC6532e.isPro(C0115e.f1276e, (Function1) m3681throw2);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC0207e.ad(function0, isPro, null, ((C7019e) c13770e.adcel(c15492e)).ad.ad, ((C7019e) c13770e.adcel(c15492e)).ad.tapsense, null, AbstractC16653e.license(-418097066, new C18054e(c5344e, this.f35408e, 1), c13770e), c13770e, 12582912, 100);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) this.f35409e.f11456e.getValue();
                    bool.booleanValue();
                    int i = this.f35408e;
                    boolean license = c13770e2.license(i);
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (license || m3681throw3 == C2987e.ad) {
                        m3681throw3 = new C17028e(i, 13);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    AbstractC7572e.vip(bool, null, (Function1) m3681throw3, null, null, null, AbstractC15890e.metrica, c13770e2, 1572864, 58);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
