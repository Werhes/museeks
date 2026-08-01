package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۥۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9894e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f19513e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9669e f19514e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f19515e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19516e;

    public /* synthetic */ C9894e(C9669e c9669e, InterfaceC18435e interfaceC18435e, InterfaceC16132e interfaceC16132e, int i) {
        this.f19516e = i;
        this.f19514e = c9669e;
        this.f19513e = interfaceC18435e;
        this.f19515e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19516e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.settings_now_playing_background_theme);
                    AbstractC4455e abstractC4455e = AbstractC11785e.ad;
                    long j = ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob;
                    C1839e c1839e = ((C7019e) c13770e.adcel(abstractC4455e)).vip.appmetrica;
                    C0115e c0115e = C0115e.f1276e;
                    AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), j, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, c1839e, c13770e, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 16));
                    C9669e c9669e = this.f19514e;
                    boolean yandex = c13770e.yandex(c9669e);
                    InterfaceC18435e interfaceC18435e = this.f19513e;
                    boolean yandex2 = yandex | c13770e.yandex(interfaceC18435e);
                    InterfaceC16132e interfaceC16132e = this.f19515e;
                    boolean purchase = yandex2 | c13770e.purchase(interfaceC16132e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        m3681throw = new C13026e(c9669e, interfaceC18435e, interfaceC16132e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 511);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C18055e c18055e = (C18055e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(c18055e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean z = ((C10876e) this.f19515e.getValue()).f21543e;
                    InterfaceC18435e interfaceC18435e2 = this.f19513e;
                    boolean yandex3 = c13770e2.yandex(interfaceC18435e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex3 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C17744e(interfaceC18435e2, 2);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_lyrics_hide_controls, z, (Function1) m3681throw2, AbstractC8703e.mopub(c18055e, C0115e.f1276e), null, false, c13770e2, 0, 48);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C18055e c18055e2 = (C18055e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(c18055e2) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean z2 = ((C10876e) this.f19515e.getValue()).f21532e;
                    InterfaceC12864e mopub = AbstractC8703e.mopub(c18055e2, C0115e.f1276e);
                    InterfaceC18435e interfaceC18435e3 = this.f19513e;
                    boolean yandex4 = c13770e3.yandex(interfaceC18435e3);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (yandex4 || m3681throw3 == C2987e.ad) {
                        m3681throw3 = new C17744e(interfaceC18435e3, 7);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    this.f19514e.m2628transient(R.string.np_swipe, z2, (Function1) m3681throw3, mopub, Integer.valueOf(R.string.np_swipe_desc), false, c13770e3, 0, 32);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C18055e c18055e3 = (C18055e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e4.purchase(c18055e3) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean z3 = ((C10876e) this.f19515e.getValue()).f21540e;
                    InterfaceC18435e interfaceC18435e4 = this.f19513e;
                    boolean yandex5 = c13770e4.yandex(interfaceC18435e4);
                    Object m3681throw4 = c13770e4.m3681throw();
                    if (yandex5 || m3681throw4 == C2987e.ad) {
                        m3681throw4 = new C17744e(interfaceC18435e4, 9);
                        c13770e4.m3682throws(m3681throw4);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_disable_vibration, z3, (Function1) m3681throw4, AbstractC8703e.mopub(c18055e3, C0115e.f1276e), null, false, c13770e4, 0, 48);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C18055e c18055e4 = (C18055e) obj;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= c13770e5.purchase(c18055e4) ? 4 : 2;
                }
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean z4 = ((C10876e) this.f19515e.getValue()).f21536e;
                    InterfaceC12864e mopub2 = AbstractC8703e.mopub(c18055e4, C0115e.f1276e);
                    InterfaceC18435e interfaceC18435e5 = this.f19513e;
                    boolean yandex6 = c13770e5.yandex(interfaceC18435e5);
                    Object m3681throw5 = c13770e5.m3681throw();
                    if (yandex6 || m3681throw5 == C2987e.ad) {
                        m3681throw5 = new C17744e(interfaceC18435e5, 12);
                        c13770e5.m3682throws(m3681throw5);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_screen_lock, z4, (Function1) m3681throw5, mopub2, Integer.valueOf(R.string.settings_now_playing_systembars_desc), false, c13770e5, 0, 32);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C18055e c18055e5 = (C18055e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c13770e6.purchase(c18055e5) ? 4 : 2;
                }
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean z5 = ((C10876e) this.f19515e.getValue()).f21533e;
                    InterfaceC12864e mopub3 = AbstractC8703e.mopub(c18055e5, C0115e.f1276e);
                    InterfaceC18435e interfaceC18435e6 = this.f19513e;
                    boolean yandex7 = c13770e6.yandex(interfaceC18435e6);
                    Object m3681throw6 = c13770e6.m3681throw();
                    if (yandex7 || m3681throw6 == C2987e.ad) {
                        m3681throw6 = new C17744e(interfaceC18435e6, 4);
                        c13770e6.m3682throws(m3681throw6);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_systembars, z5, (Function1) m3681throw6, mopub3, Integer.valueOf(R.string.settings_now_playing_systembars_desc), false, c13770e6, 0, 32);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C18055e c18055e6 = (C18055e) obj;
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= c13770e7.purchase(c18055e6) ? 4 : 2;
                }
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 19) != 18)) {
                    boolean z6 = ((C10876e) this.f19515e.getValue()).f21541e;
                    InterfaceC12864e mopub4 = AbstractC8703e.mopub(c18055e6, C0115e.f1276e);
                    InterfaceC18435e interfaceC18435e7 = this.f19513e;
                    boolean yandex8 = c13770e7.yandex(interfaceC18435e7);
                    Object m3681throw7 = c13770e7.m3681throw();
                    if (yandex8 || m3681throw7 == C2987e.ad) {
                        m3681throw7 = new C17744e(interfaceC18435e7, 6);
                        c13770e7.m3682throws(m3681throw7);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_hearts, z6, (Function1) m3681throw7, mopub4, Integer.valueOf(R.string.settings_now_playing_hearts_desc), false, c13770e7, 0, 32);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C18055e c18055e7 = (C18055e) obj;
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= c13770e8.purchase(c18055e7) ? 4 : 2;
                }
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean z7 = ((C10876e) this.f19515e.getValue()).f21547e;
                    InterfaceC18435e interfaceC18435e8 = this.f19513e;
                    boolean yandex9 = c13770e8.yandex(interfaceC18435e8);
                    Object m3681throw8 = c13770e8.m3681throw();
                    if (yandex9 || m3681throw8 == C2987e.ad) {
                        m3681throw8 = new C17744e(interfaceC18435e8, 13);
                        c13770e8.m3682throws(m3681throw8);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_color_tining, z7, (Function1) m3681throw8, AbstractC8703e.mopub(c18055e7, C0115e.f1276e), null, false, c13770e8, 0, 48);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C18055e c18055e8 = (C18055e) obj;
                C13770e c13770e9 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= c13770e9.purchase(c18055e8) ? 4 : 2;
                }
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 19) != 18)) {
                    boolean z8 = ((C10876e) this.f19515e.getValue()).f21544e;
                    InterfaceC18435e interfaceC18435e9 = this.f19513e;
                    boolean yandex10 = c13770e9.yandex(interfaceC18435e9);
                    Object m3681throw9 = c13770e9.m3681throw();
                    if (yandex10 || m3681throw9 == C2987e.ad) {
                        m3681throw9 = new C17744e(interfaceC18435e9, 8);
                        c13770e9.m3682throws(m3681throw9);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_full_screen_artwork, z8, (Function1) m3681throw9, AbstractC8703e.mopub(c18055e8, C0115e.f1276e), null, false, c13770e9, 0, 48);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C18055e c18055e9 = (C18055e) obj;
                C13770e c13770e10 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= c13770e10.purchase(c18055e9) ? 4 : 2;
                }
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 19) != 18)) {
                    InterfaceC16132e interfaceC16132e2 = this.f19515e;
                    boolean z9 = ((C10876e) interfaceC16132e2.getValue()).f21534e;
                    boolean z10 = !((C10876e) interfaceC16132e2.getValue()).f21544e;
                    InterfaceC12864e mopub5 = AbstractC8703e.mopub(c18055e9, C0115e.f1276e);
                    InterfaceC18435e interfaceC18435e10 = this.f19513e;
                    boolean yandex11 = c13770e10.yandex(interfaceC18435e10);
                    Object m3681throw10 = c13770e10.m3681throw();
                    if (yandex11 || m3681throw10 == C2987e.ad) {
                        m3681throw10 = new C17744e(interfaceC18435e10, 10);
                        c13770e10.m3682throws(m3681throw10);
                    }
                    this.f19514e.m2628transient(R.string.st_np_round, z9, (Function1) m3681throw10, mopub5, null, z10, c13770e10, 0, 16);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C18055e c18055e10 = (C18055e) obj;
                C13770e c13770e11 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= c13770e11.purchase(c18055e10) ? 4 : 2;
                }
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 19) != 18)) {
                    InterfaceC16132e interfaceC16132e3 = this.f19515e;
                    boolean z11 = ((C10876e) interfaceC16132e3.getValue()).f21548e;
                    boolean z12 = !((C10876e) interfaceC16132e3.getValue()).f21544e;
                    InterfaceC12864e mopub6 = AbstractC8703e.mopub(c18055e10, C0115e.f1276e);
                    InterfaceC18435e interfaceC18435e11 = this.f19513e;
                    boolean yandex12 = c13770e11.yandex(interfaceC18435e11);
                    Object m3681throw11 = c13770e11.m3681throw();
                    if (yandex12 || m3681throw11 == C2987e.ad) {
                        m3681throw11 = new C17744e(interfaceC18435e11, 3);
                        c13770e11.m3682throws(m3681throw11);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_artwork_hide_border, z11, (Function1) m3681throw11, mopub6, null, z12, c13770e11, 0, 16);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C18055e c18055e11 = (C18055e) obj;
                C13770e c13770e12 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= c13770e12.purchase(c18055e11) ? 4 : 2;
                }
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 19) != 18)) {
                    boolean z13 = ((C10876e) this.f19515e.getValue()).f21539e;
                    InterfaceC18435e interfaceC18435e12 = this.f19513e;
                    boolean yandex13 = c13770e12.yandex(interfaceC18435e12);
                    Object m3681throw12 = c13770e12.m3681throw();
                    if (yandex13 || m3681throw12 == C2987e.ad) {
                        m3681throw12 = new C17744e(interfaceC18435e12, 5);
                        c13770e12.m3682throws(m3681throw12);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_hide_dislikes, z13, (Function1) m3681throw12, AbstractC8703e.mopub(c18055e11, C0115e.f1276e), null, false, c13770e12, 0, 48);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e12 = (C18055e) obj;
                C13770e c13770e13 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= c13770e13.purchase(c18055e12) ? 4 : 2;
                }
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 19) != 18)) {
                    boolean z14 = ((C10876e) this.f19515e.getValue()).f21538e;
                    InterfaceC18435e interfaceC18435e13 = this.f19513e;
                    boolean yandex14 = c13770e13.yandex(interfaceC18435e13);
                    Object m3681throw13 = c13770e13.m3681throw();
                    if (yandex14 || m3681throw13 == C2987e.ad) {
                        m3681throw13 = new C17744e(interfaceC18435e13, 11);
                        c13770e13.m3682throws(m3681throw13);
                    }
                    this.f19514e.m2628transient(R.string.settings_now_playing_volume_bar, z14, (Function1) m3681throw13, AbstractC8703e.mopub(c18055e12, C0115e.f1276e), null, false, c13770e13, 0, 48);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
