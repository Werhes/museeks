package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4305e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9410e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f9411e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f9412e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f9413e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9414e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f9415e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12561e f9416e;

    public /* synthetic */ C4305e(C9137e c9137e, C2892e c2892e, C2892e c2892e2, float f, int i, C2892e c2892e3) {
        this.f9413e = c9137e;
        this.f9410e = c2892e;
        this.f9416e = c2892e2;
        this.f9412e = f;
        this.f9411e = i;
        this.f9415e = c2892e3;
    }

    public /* synthetic */ C4305e(String str, String str2, float f, Function1 function1, InterfaceC12864e interfaceC12864e, int i) {
        this.f9413e = str;
        this.f9410e = str2;
        this.f9412e = f;
        this.f9416e = function1;
        this.f9415e = interfaceC12864e;
        this.f9411e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9414e;
        int i2 = this.f9411e;
        Object obj3 = this.f9415e;
        InterfaceC12561e interfaceC12561e = this.f9416e;
        Object obj4 = this.f9410e;
        Object obj5 = this.f9413e;
        switch (i) {
            case 0:
                C9137e c9137e = (C9137e) obj5;
                C2892e c2892e = (C2892e) obj4;
                C2892e c2892e2 = (C2892e) interfaceC12561e;
                C2892e c2892e3 = (C2892e) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (m3681throw == c5170e) {
                        m3681throw = AbstractC17680e.startapp(c13770e);
                        c13770e.m3682throws(m3681throw);
                    }
                    InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
                    boolean purchase = c13770e.purchase(c9137e) | c13770e.purchase(interfaceC18435e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (purchase || m3681throw2 == c5170e) {
                        m3681throw2 = new C17521e(c9137e, interfaceC18435e);
                        c13770e.m3682throws(m3681throw2);
                    }
                    C17521e c17521e = (C17521e) m3681throw2;
                    Object m3681throw3 = c13770e.m3681throw();
                    if (m3681throw3 == c5170e) {
                        m3681throw3 = new C16646e();
                        c13770e.m3682throws(m3681throw3);
                    }
                    C16646e c16646e = (C16646e) m3681throw3;
                    List startapp = AbstractC6874e.startapp(c2892e, c2892e2, AbstractC16653e.license(1300883543, new C1743e(c2892e3, c16646e, 9), c13770e));
                    float f = this.f9412e;
                    boolean metrica = c13770e.metrica(f) | c13770e.license(i2) | c13770e.yandex(c17521e);
                    Object m3681throw4 = c13770e.m3681throw();
                    if (metrica || m3681throw4 == c5170e) {
                        m3681throw4 = new C9822e(f, c16646e, i2, c17521e);
                        c13770e.m3682throws(m3681throw4);
                    }
                    InterfaceC0929e interfaceC0929e = (InterfaceC0929e) m3681throw4;
                    C2892e metrica2 = AbstractC16653e.metrica(startapp);
                    boolean purchase2 = c13770e.purchase(interfaceC0929e);
                    Object m3681throw5 = c13770e.m3681throw();
                    if (purchase2 || m3681throw5 == c5170e) {
                        m3681throw5 = new C3045e(interfaceC0929e);
                        c13770e.m3682throws(m3681throw5);
                    }
                    InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw5;
                    long j = c13770e.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, interfaceC2747e, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase3, C2721e.license);
                    metrica2.invoke(c13770e, 0);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC15077e.purchase((String) obj5, (String) obj4, this.f9412e, (Function1) interfaceC12561e, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(i2 | 1));
                return Unit.INSTANCE;
        }
    }
}
