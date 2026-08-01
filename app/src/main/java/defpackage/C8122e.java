package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8122e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16487e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f16488e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f16489e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f16490e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f16491e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f16492e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16493e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f16494e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f16495e;

    public /* synthetic */ C8122e(C2892e c2892e, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f16488e = c2892e;
        this.f16491e = obj;
        this.f16487e = obj2;
        this.f16495e = obj3;
        this.f16494e = obj4;
        this.f16490e = obj5;
        this.f16492e = obj6;
        this.f16489e = i;
    }

    public /* synthetic */ C8122e(InterfaceC11968e interfaceC11968e, Function2 function2, Function2 function22, Function2 function23, int i, Function2 function24, C17068e c17068e, Function2 function25) {
        this.f16488e = interfaceC11968e;
        this.f16491e = function2;
        this.f16487e = function22;
        this.f16495e = function23;
        this.f16489e = i;
        this.f16494e = function24;
        this.f16490e = c17068e;
        this.f16492e = function25;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AbstractC2832e abstractC2832e;
        int mo493e;
        int mo493e2;
        int i;
        final C12434e c12434e;
        Integer num;
        int intValue;
        int mo493e3;
        int metrica;
        switch (this.f16493e) {
            case 0:
                ((Integer) obj2).intValue();
                ((C2892e) this.f16488e).adcel(this.f16491e, this.f16487e, this.f16495e, this.f16494e, this.f16490e, this.f16492e, (C13770e) obj, AbstractC5190e.advert(this.f16489e) | 1);
                return Unit.INSTANCE;
            default:
                final InterfaceC11968e interfaceC11968e = (InterfaceC11968e) this.f16488e;
                Function2 function2 = (Function2) this.f16491e;
                Function2 function22 = (Function2) this.f16487e;
                Function2 function23 = (Function2) this.f16495e;
                Function2 function24 = (Function2) this.f16494e;
                C17068e c17068e = (C17068e) this.f16490e;
                Function2 function25 = (Function2) this.f16492e;
                final InterfaceC7183e interfaceC7183e = (InterfaceC7183e) obj;
                C5602e c5602e = (C5602e) obj2;
                float f = AbstractC13348e.ad;
                final int yandex = C5602e.yandex(c5602e.ad);
                final int billing = C5602e.billing(c5602e.ad);
                long ad = C5602e.ad(0, 0, 0, 0, 10, c5602e.ad);
                int license = interfaceC11968e.license(interfaceC7183e, interfaceC7183e.getLayoutDirection());
                int vip = interfaceC11968e.vip(interfaceC7183e, interfaceC7183e.getLayoutDirection());
                int metrica2 = interfaceC11968e.metrica(interfaceC7183e);
                final AbstractC2832e admob = ((InterfaceC16719e) AbstractC13480e.m3591interface(interfaceC7183e.subscription(EnumC17081e.f33426e, function2))).admob(ad);
                int i2 = (-license) - vip;
                int i3 = -metrica2;
                final AbstractC2832e admob2 = ((InterfaceC16719e) AbstractC13480e.m3591interface(interfaceC7183e.subscription(EnumC17081e.f33423e, function22))).admob(AbstractC2278e.startapp(i2, ad, i3));
                AbstractC2832e admob3 = ((InterfaceC16719e) AbstractC13480e.m3591interface(interfaceC7183e.subscription(EnumC17081e.f33425e, function23))).admob(AbstractC2278e.startapp(i2, ad, i3));
                int i4 = admob3.f6806e;
                int i5 = this.f16489e;
                if (i4 == 0 && admob3.f6804e == 0) {
                    abstractC2832e = admob3;
                    c12434e = null;
                } else {
                    int i6 = admob3.f6804e;
                    EnumC7792e enumC7792e = EnumC7792e.f15794e;
                    if (i5 == 0) {
                        abstractC2832e = admob3;
                        if (interfaceC7183e.getLayoutDirection() == enumC7792e) {
                            mo493e = interfaceC7183e.mo493e(f);
                            i = mo493e + license;
                        } else {
                            mo493e2 = interfaceC7183e.mo493e(f);
                            i = ((yandex - mo493e2) - i4) - vip;
                        }
                    } else {
                        abstractC2832e = admob3;
                        if (i5 != 2 && i5 != 3) {
                            i = (((yandex - i4) + license) - vip) / 2;
                        } else if (interfaceC7183e.getLayoutDirection() == enumC7792e) {
                            mo493e2 = interfaceC7183e.mo493e(f);
                            i = ((yandex - mo493e2) - i4) - vip;
                        } else {
                            mo493e = interfaceC7183e.mo493e(f);
                            i = mo493e + license;
                        }
                    }
                    c12434e = new C12434e(i, i6, 3);
                }
                final AbstractC2832e admob4 = ((InterfaceC16719e) AbstractC13480e.m3591interface(interfaceC7183e.subscription(EnumC17081e.f33422e, function24))).admob(ad);
                int i7 = 0;
                boolean z = admob4.f6806e == 0 && admob4.f6804e == 0;
                if (c12434e != null) {
                    int i8 = c12434e.f24873e;
                    if (z || i5 == 3) {
                        mo493e3 = interfaceC7183e.mo493e(f) + i8;
                        metrica = interfaceC11968e.metrica(interfaceC7183e);
                    } else {
                        mo493e3 = admob4.f6804e + i8;
                        metrica = interfaceC7183e.mo493e(f);
                    }
                    num = Integer.valueOf(metrica + mo493e3);
                } else {
                    num = null;
                }
                int i9 = admob2.f6804e;
                if (i9 != 0) {
                    if (num != null) {
                        intValue = num.intValue();
                    } else {
                        Integer valueOf = !z ? Integer.valueOf(admob4.f6804e) : null;
                        intValue = valueOf != null ? valueOf.intValue() : interfaceC11968e.metrica(interfaceC7183e);
                    }
                    i7 = intValue + i9;
                }
                final int i10 = i7;
                C10652e c10652e = new C10652e(interfaceC11968e, interfaceC7183e);
                c17068e.ad.setValue(new C16005e(AbstractC12220e.billing(c10652e, interfaceC7183e.getLayoutDirection()), (admob.f6806e == 0 && admob.f6804e == 0) ? c10652e.license() : interfaceC7183e.mo496final(admob.f6804e), AbstractC12220e.purchase(c10652e, interfaceC7183e.getLayoutDirection()), z ? c10652e.ad() : interfaceC7183e.mo496final(admob4.f6804e)));
                final AbstractC2832e admob5 = ((InterfaceC16719e) AbstractC13480e.m3591interface(interfaceC7183e.subscription(EnumC17081e.f33424e, function25))).admob(ad);
                final Integer num2 = num;
                final AbstractC2832e abstractC2832e2 = abstractC2832e;
                return interfaceC7183e.ads(yandex, billing, C9139e.f18290e, new Function1() { // from class: eؑۡۢ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        AbstractC3698e abstractC3698e = (AbstractC3698e) obj3;
                        abstractC3698e.billing(AbstractC2832e.this, 0, 0, 0.0f);
                        abstractC3698e.billing(admob, 0, 0, 0.0f);
                        AbstractC2832e abstractC2832e3 = admob2;
                        int i11 = yandex - abstractC2832e3.f6806e;
                        InterfaceC7183e interfaceC7183e2 = interfaceC7183e;
                        EnumC7792e layoutDirection = interfaceC7183e2.getLayoutDirection();
                        InterfaceC11968e interfaceC11968e2 = interfaceC11968e;
                        int license2 = ((interfaceC11968e2.license(interfaceC7183e2, layoutDirection) + i11) - interfaceC11968e2.vip(interfaceC7183e2, interfaceC7183e2.getLayoutDirection())) / 2;
                        int i12 = billing;
                        abstractC3698e.billing(abstractC2832e3, license2, i12 - i10, 0.0f);
                        AbstractC2832e abstractC2832e4 = admob4;
                        abstractC3698e.billing(abstractC2832e4, 0, i12 - abstractC2832e4.f6804e, 0.0f);
                        C12434e c12434e2 = c12434e;
                        if (c12434e2 != null) {
                            abstractC3698e.billing(abstractC2832e2, c12434e2.f24874e, i12 - num2.intValue(), 0.0f);
                        }
                        return Unit.INSTANCE;
                    }
                });
        }
    }
}
