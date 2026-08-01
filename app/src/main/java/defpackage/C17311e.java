package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17311e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4126e f33954e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33955e;

    public /* synthetic */ C17311e(C4126e c4126e, int i) {
        this.f33955e = 2;
        this.f33954e = c4126e;
    }

    public /* synthetic */ C17311e(C4126e c4126e, int i, byte b) {
        this.f33955e = i;
        this.f33954e = c4126e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33955e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC10560e.ad(AbstractC16243e.ad, null, AbstractC16653e.license(784829745, new C17311e(this.f33954e, 3, (byte) 0), c13770e), null, 0.0f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).appmetrica(c13770e), null, null, c13770e, 390, 474);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c13770e2.m3659default();
                } else if (((Boolean) this.f33954e.f9091e.getValue()).booleanValue()) {
                    c13770e2.m3676strictfp(940152430);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.view_outline_28, 0, c13770e2), AbstractC5297e.appmetrica(c13770e2, R.string.hide_password), null, 0L, c13770e2, 8, 12);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3676strictfp(940160942);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.hide_outline_28, 0, c13770e2), AbstractC5297e.appmetrica(c13770e2, R.string.show_password), null, 0L, c13770e2, 8, 12);
                    c13770e2.Signature(false);
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                this.f33954e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C4126e c4126e = this.f33954e;
                    boolean yandex = c13770e3.yandex(c4126e);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C17011e c17011e = new C17011e(0, c4126e, C4126e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 26);
                        c13770e3.m3682throws(c17011e);
                        m3681throw = c17011e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC16243e.vip, c13770e3, 1572864, 62);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AbstractC14489e.vip((String) this.f33954e.f9089e.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    C4126e c4126e2 = this.f33954e;
                    boolean yandex2 = c13770e5.yandex(c4126e2);
                    Object m3681throw2 = c13770e5.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C10479e(26, c4126e2);
                        c13770e5.m3682throws(m3681throw2);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw2, null, false, null, null, null, AbstractC16653e.license(291480774, new C17311e(c4126e2, 1, (byte) 0), c13770e5), c13770e5, 1572864, 62);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
