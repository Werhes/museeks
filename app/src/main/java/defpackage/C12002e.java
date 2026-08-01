package defpackage;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12002e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23996e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C10985e f23997e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f23998e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23999e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C13622e f24000e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24001e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f24002e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f24003e;

    public /* synthetic */ C12002e(C13622e c13622e, InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, InterfaceC18435e interfaceC18435e, C10985e c10985e, InterfaceC3314e interfaceC3314e3, InterfaceC3314e interfaceC3314e4) {
        this.f24000e = c13622e;
        this.f23996e = interfaceC3314e;
        this.f24003e = interfaceC3314e2;
        this.f23998e = interfaceC18435e;
        this.f23997e = c10985e;
        this.f24002e = interfaceC3314e3;
        this.f23999e = interfaceC3314e4;
    }

    public /* synthetic */ C12002e(InterfaceC18435e interfaceC18435e, C10985e c10985e, C13622e c13622e, InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, InterfaceC3314e interfaceC3314e3, InterfaceC3314e interfaceC3314e4) {
        this.f23998e = interfaceC18435e;
        this.f23997e = c10985e;
        this.f24000e = c13622e;
        this.f23996e = interfaceC3314e;
        this.f24003e = interfaceC3314e2;
        this.f24002e = interfaceC3314e3;
        this.f23999e = interfaceC3314e4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        switch (this.f24001e) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    final C13622e c13622e = this.f24000e;
                    boolean yandex = c13770e.yandex(c13622e);
                    final InterfaceC3314e interfaceC3314e = this.f23996e;
                    boolean purchase = yandex | c13770e.purchase(interfaceC3314e);
                    final InterfaceC3314e interfaceC3314e2 = this.f24003e;
                    boolean purchase2 = purchase | c13770e.purchase(interfaceC3314e2);
                    final InterfaceC18435e interfaceC18435e = this.f23998e;
                    boolean yandex2 = purchase2 | c13770e.yandex(interfaceC18435e);
                    final C10985e c10985e = this.f23997e;
                    boolean purchase3 = yandex2 | c13770e.purchase(c10985e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase3 || m3681throw == C2987e.ad) {
                        final InterfaceC3314e interfaceC3314e3 = this.f24002e;
                        final InterfaceC3314e interfaceC3314e4 = this.f23999e;
                        Function0 function0 = new Function0() { // from class: eؔؗۦ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object c12763e;
                                InterfaceC3314e interfaceC3314e5 = interfaceC3314e;
                                boolean booleanValue = ((Boolean) interfaceC3314e3.getValue()).booleanValue();
                                InterfaceC3314e interfaceC3314e6 = interfaceC3314e2;
                                if (booleanValue) {
                                    try {
                                        C11883e c11883e = C15036e.appmetrica;
                                        c12763e = AbstractC1513e.purchase(AbstractC6532e.vip(Color.parseColor("#" + ((String) interfaceC3314e5.getValue()))));
                                    } catch (Throwable th) {
                                        c12763e = new C12763e(th);
                                    }
                                    if (!(c12763e instanceof C12763e)) {
                                        interfaceC3314e6.setValue((C15036e) c12763e);
                                    }
                                }
                                interfaceC3314e4.setValue(Boolean.FALSE);
                                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C2122e(c10985e, c13622e, interfaceC3314e6, null, 29), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        c13770e.m3682throws(function0);
                        m3681throw = function0;
                    }
                    AbstractC1513e.license((Function0) m3681throw, null, false, null, null, null, AbstractC7354e.purchase, c13770e, 805306368, 510);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11685e, c13770e, 6);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase4, C2721e.license);
                    InterfaceC18435e interfaceC18435e2 = this.f23998e;
                    boolean yandex3 = c13770e.yandex(interfaceC18435e2);
                    C10985e c10985e2 = this.f23997e;
                    boolean purchase5 = yandex3 | c13770e.purchase(c10985e2);
                    C13622e c13622e2 = this.f24000e;
                    boolean yandex4 = purchase5 | c13770e.yandex(c13622e2);
                    Object m3681throw2 = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex4 || m3681throw2 == c5170e) {
                        C9411e c9411e = new C9411e(interfaceC18435e2, this.f24002e, (Object) c10985e2, (Object) c13622e2, 7);
                        c13770e.m3682throws(c9411e);
                        m3681throw2 = c9411e;
                    }
                    AbstractC1513e.license((Function0) m3681throw2, null, false, null, null, null, AbstractC7354e.billing, c13770e, 805306368, 510);
                    InterfaceC3314e interfaceC3314e5 = this.f23996e;
                    boolean purchase6 = c13770e.purchase(interfaceC3314e5);
                    InterfaceC3314e interfaceC3314e6 = this.f24003e;
                    boolean purchase7 = purchase6 | c13770e.purchase(interfaceC3314e6);
                    Object m3681throw3 = c13770e.m3681throw();
                    InterfaceC3314e interfaceC3314e7 = this.f23999e;
                    if (purchase7 || m3681throw3 == c5170e) {
                        m3681throw3 = new Csynchronized(26, interfaceC3314e7, interfaceC3314e5, interfaceC3314e6);
                        c13770e.m3682throws(m3681throw3);
                    }
                    AbstractC1513e.license((Function0) m3681throw3, null, false, null, null, null, AbstractC16653e.license(891939664, new C3584e(interfaceC3314e7, 13), c13770e), c13770e, 805306368, 510);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
