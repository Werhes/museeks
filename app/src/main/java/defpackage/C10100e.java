package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10100e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f19950e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19951e;

    public /* synthetic */ C10100e(InterfaceC16132e interfaceC16132e, int i) {
        this.f19951e = i;
        this.f19950e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        switch (this.f19951e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    if (((Boolean) this.f19950e.getValue()).booleanValue()) {
                        c13770e.m3676strictfp(-72133572);
                    } else {
                        c13770e.m3676strictfp(-59483588);
                        AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC12220e.smaato(C0115e.f1276e, 12, 0.0f, 2), 0L, c13770e, 432, 8);
                    }
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = ((C10876e) this.f19950e.getValue()).f21545e.ordinal();
                    if (ordinal == 0) {
                        i = R.string.settings_now_playing_background_theme_blur;
                    } else if (ordinal == 1) {
                        i = R.string.settings_now_playing_background_theme_no_bg;
                    } else if (ordinal == 2) {
                        i = R.string.settings_now_playing_background_theme_gradient;
                    } else if (ordinal == 3) {
                        i = R.string.settings_now_playing_background_theme_beyond;
                    } else {
                        if (ordinal != 4) {
                            throw new C14803e(10);
                        }
                        i = R.string.settings_now_playing_background_theme_layer;
                    }
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    InterfaceC2135e interfaceC2135e = (InterfaceC2135e) this.f19950e.getValue();
                    if (interfaceC2135e instanceof C3897e) {
                        i2 = 863474456;
                        i3 = R.string.settings_proxy_vk_enable_status_available;
                    } else if (AbstractC7890e.billing(interfaceC2135e, C17103e.ad)) {
                        i2 = 863478675;
                        i3 = R.string.settings_proxy_vk_enable_status_fail;
                    } else {
                        if (!AbstractC7890e.billing(interfaceC2135e, C3104e.ad)) {
                            throw AbstractC1786e.loadAd(863472045, c13770e3, false);
                        }
                        i2 = 863482582;
                        i3 = R.string.settings_proxy_vk_enable_status_loading;
                    }
                    AbstractC14489e.vip(AbstractC4653e.isVip(c13770e3, i2, i3, c13770e3, false), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (((Boolean) this.f19950e.getValue()).booleanValue()) {
                        c13770e4.m3676strictfp(-1109179435);
                    } else {
                        c13770e4.m3676strictfp(-1092968171);
                        AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC12220e.smaato(C0115e.f1276e, 12, 0.0f, 2), 0L, c13770e4, 432, 8);
                    }
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
