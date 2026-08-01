package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9490e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f18839e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10876e f18840e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C9669e f18841e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18842e;

    public /* synthetic */ C9490e(C10876e c10876e, InterfaceC18435e interfaceC18435e, C9669e c9669e, int i) {
        this.f18842e = i;
        this.f18840e = c10876e;
        this.f18839e = interfaceC18435e;
        this.f18841e = c9669e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f18842e;
        C0115e c0115e = C0115e.f1276e;
        C5170e c5170e = C2987e.ad;
        int i2 = 2;
        final C9669e c9669e = this.f18841e;
        final InterfaceC18435e interfaceC18435e = this.f18839e;
        C10876e c10876e = this.f18840e;
        final int i3 = 1;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.settings_now_playing_blur_material);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 16));
                    boolean yandex = c13770e.yandex(c10876e) | c13770e.yandex(interfaceC18435e) | c13770e.yandex(c9669e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new Cthrows(25, c10876e, interfaceC18435e, c9669e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 511);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    AbstractC7260e.metrica(AbstractC12220e.advert(AbstractC18007e.metrica(c0115e, 1.0f), 16, 8), 0.0f, AbstractC16653e.license(2058178363, new C9490e(c10876e, interfaceC18435e, c9669e, i2), c13770e2), c13770e2, 390);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C8836e c8836e = (C8836e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(c8836e) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    EnumC11700e enumC11700e = c10876e.f21535e;
                    EnumC11700e enumC11700e2 = EnumC11700e.LIGHT;
                    boolean z = enumC11700e == enumC11700e2;
                    boolean yandex2 = c13770e3.yandex(interfaceC18435e) | c13770e3.yandex(c9669e);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new Function0() { // from class: eُؓؕ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C9741e(c9669e, null), 3);
                                        return Unit.INSTANCE;
                                    default:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C11970e(c9669e, null), 3);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw2);
                    }
                    C10102e c10102e = C10102e.ad;
                    int i4 = intValue3 & 14;
                    AbstractC7260e.ad(c8836e, z, (Function0) m3681throw2, C10102e.metrica(0, 2, c13770e3), null, false, null, null, null, null, AbstractC12110e.vip, c13770e3, i4, 1016);
                    boolean z2 = c10876e.f21535e != enumC11700e2;
                    boolean yandex3 = c13770e3.yandex(interfaceC18435e) | c13770e3.yandex(c9669e);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        final int i5 = r11 ? 1 : 0;
                        m3681throw3 = new Function0() { // from class: eُؓؕ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C9741e(c9669e, null), 3);
                                        return Unit.INSTANCE;
                                    default:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C11970e(c9669e, null), 3);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC7260e.ad(c8836e, z2, (Function0) m3681throw3, C10102e.metrica(1, 2, c13770e3), null, false, null, null, null, null, AbstractC12110e.metrica, c13770e3, i4, 1016);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
