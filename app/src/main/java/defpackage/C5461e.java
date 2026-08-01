package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5461e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12688e f11729e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11730e;

    public /* synthetic */ C5461e(C12688e c12688e, int i) {
        this.f11730e = i;
        this.f11729e = c12688e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f11730e) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    C12688e c12688e = this.f11729e;
                    String ad = C15113e.ad(c12688e.f27451e);
                    if (ad != null) {
                        z = false;
                        if (AbstractC6507e.pro(ad, "Permission", false)) {
                            c12688e.f25432e.setValue(Boolean.TRUE);
                        } else {
                            AbstractC15615e.ad(new C1478e(0, c12688e.pro(), "Устройство не поддерживает данную функцию."));
                        }
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            default:
                C17213e c17213e = (C17213e) obj;
                final int i = 0;
                final C12688e c12688e2 = this.f11729e;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-2072280959, true, new Function3() { // from class: eْٗٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e3 = c12688e2;
                                    boolean yandex = c13770e.yandex(c12688e3);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                        c13770e.m3682throws(c7755e);
                                        m3681throw = c7755e;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e4 = c12688e2;
                                    boolean yandex2 = c13770e2.yandex(c12688e4);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C3547e(c12688e4, 3);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                C13770e c13770e3 = (C13770e) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e5 = c12688e2;
                                    boolean yandex3 = c13770e3.yandex(c12688e5);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        m3681throw3 = new C3547e(c12688e5, 2);
                                        c13770e3.m3682throws(m3681throw3);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                C13770e c13770e4 = (C13770e) obj3;
                                int intValue4 = ((Integer) obj4).intValue();
                                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e6 = c12688e2;
                                    boolean yandex4 = c13770e4.yandex(c12688e6);
                                    Object m3681throw4 = c13770e4.m3681throw();
                                    if (yandex4 || m3681throw4 == C2987e.ad) {
                                        C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                        c13770e4.m3682throws(c7755e2);
                                        m3681throw4 = c7755e2;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                } else {
                                    c13770e4.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 4:
                                C13770e c13770e5 = (C13770e) obj3;
                                int intValue5 = ((Integer) obj4).intValue();
                                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.startapp;
                                    C12688e c12688e7 = c12688e2;
                                    boolean yandex5 = c13770e5.yandex(c12688e7);
                                    Object m3681throw5 = c13770e5.m3681throw();
                                    if (yandex5 || m3681throw5 == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                        c13770e5.m3682throws(c11476e);
                                        m3681throw5 = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                } else {
                                    c13770e5.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 5:
                                C13770e c13770e6 = (C13770e) obj3;
                                int intValue6 = ((Integer) obj4).intValue();
                                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.Signature;
                                    C12688e c12688e8 = c12688e2;
                                    boolean yandex6 = c13770e6.yandex(c12688e8);
                                    Object m3681throw6 = c13770e6.m3681throw();
                                    if (yandex6 || m3681throw6 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                        c13770e6.m3682throws(c11476e2);
                                        m3681throw6 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                } else {
                                    c13770e6.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 6:
                                C13770e c13770e7 = (C13770e) obj3;
                                int intValue7 = ((Integer) obj4).intValue();
                                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.adcel;
                                    C12688e c12688e9 = c12688e2;
                                    boolean yandex7 = c13770e7.yandex(c12688e9);
                                    Object m3681throw7 = c13770e7.m3681throw();
                                    if (yandex7 || m3681throw7 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                        c13770e7.m3682throws(c11476e3);
                                        m3681throw7 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                } else {
                                    c13770e7.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e8 = (C13770e) obj3;
                                int intValue8 = ((Integer) obj4).intValue();
                                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    C1733e c1733e4 = AbstractC16524e.appmetrica;
                                    boolean vip = AbstractC12681e.vip(3);
                                    C12688e c12688e10 = c12688e2;
                                    boolean yandex8 = c13770e8.yandex(c12688e10);
                                    Object m3681throw8 = c13770e8.m3681throw();
                                    C5170e c5170e = C2987e.ad;
                                    if (yandex8 || m3681throw8 == c5170e) {
                                        C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c13770e8.m3682throws(c11476e4);
                                        m3681throw8 = c11476e4;
                                    }
                                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                    boolean yandex9 = c13770e8.yandex(c12688e10);
                                    Object m3681throw9 = c13770e8.m3681throw();
                                    if (yandex9 || m3681throw9 == c5170e) {
                                        m3681throw9 = new C5461e(c12688e10, 0);
                                        c13770e8.m3682throws(m3681throw9);
                                    }
                                    AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                } else {
                                    c13770e8.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                final int i2 = 1;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(1358432618, true, new Function3() { // from class: eْٗٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i2) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e3 = c12688e2;
                                    boolean yandex = c13770e.yandex(c12688e3);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                        c13770e.m3682throws(c7755e);
                                        m3681throw = c7755e;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e4 = c12688e2;
                                    boolean yandex2 = c13770e2.yandex(c12688e4);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C3547e(c12688e4, 3);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                C13770e c13770e3 = (C13770e) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e5 = c12688e2;
                                    boolean yandex3 = c13770e3.yandex(c12688e5);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        m3681throw3 = new C3547e(c12688e5, 2);
                                        c13770e3.m3682throws(m3681throw3);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                C13770e c13770e4 = (C13770e) obj3;
                                int intValue4 = ((Integer) obj4).intValue();
                                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e6 = c12688e2;
                                    boolean yandex4 = c13770e4.yandex(c12688e6);
                                    Object m3681throw4 = c13770e4.m3681throw();
                                    if (yandex4 || m3681throw4 == C2987e.ad) {
                                        C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                        c13770e4.m3682throws(c7755e2);
                                        m3681throw4 = c7755e2;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                } else {
                                    c13770e4.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 4:
                                C13770e c13770e5 = (C13770e) obj3;
                                int intValue5 = ((Integer) obj4).intValue();
                                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.startapp;
                                    C12688e c12688e7 = c12688e2;
                                    boolean yandex5 = c13770e5.yandex(c12688e7);
                                    Object m3681throw5 = c13770e5.m3681throw();
                                    if (yandex5 || m3681throw5 == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                        c13770e5.m3682throws(c11476e);
                                        m3681throw5 = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                } else {
                                    c13770e5.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 5:
                                C13770e c13770e6 = (C13770e) obj3;
                                int intValue6 = ((Integer) obj4).intValue();
                                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.Signature;
                                    C12688e c12688e8 = c12688e2;
                                    boolean yandex6 = c13770e6.yandex(c12688e8);
                                    Object m3681throw6 = c13770e6.m3681throw();
                                    if (yandex6 || m3681throw6 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                        c13770e6.m3682throws(c11476e2);
                                        m3681throw6 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                } else {
                                    c13770e6.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 6:
                                C13770e c13770e7 = (C13770e) obj3;
                                int intValue7 = ((Integer) obj4).intValue();
                                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.adcel;
                                    C12688e c12688e9 = c12688e2;
                                    boolean yandex7 = c13770e7.yandex(c12688e9);
                                    Object m3681throw7 = c13770e7.m3681throw();
                                    if (yandex7 || m3681throw7 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                        c13770e7.m3682throws(c11476e3);
                                        m3681throw7 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                } else {
                                    c13770e7.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e8 = (C13770e) obj3;
                                int intValue8 = ((Integer) obj4).intValue();
                                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    C1733e c1733e4 = AbstractC16524e.appmetrica;
                                    boolean vip = AbstractC12681e.vip(3);
                                    C12688e c12688e10 = c12688e2;
                                    boolean yandex8 = c13770e8.yandex(c12688e10);
                                    Object m3681throw8 = c13770e8.m3681throw();
                                    C5170e c5170e = C2987e.ad;
                                    if (yandex8 || m3681throw8 == c5170e) {
                                        C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c13770e8.m3682throws(c11476e4);
                                        m3681throw8 = c11476e4;
                                    }
                                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                    boolean yandex9 = c13770e8.yandex(c12688e10);
                                    Object m3681throw9 = c13770e8.m3681throw();
                                    if (yandex9 || m3681throw9 == c5170e) {
                                        m3681throw9 = new C5461e(c12688e10, 0);
                                        c13770e8.m3682throws(m3681throw9);
                                    }
                                    AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                } else {
                                    c13770e8.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                final int i3 = 2;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-1057008055, true, new Function3() { // from class: eْٗٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i3) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e3 = c12688e2;
                                    boolean yandex = c13770e.yandex(c12688e3);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                        c13770e.m3682throws(c7755e);
                                        m3681throw = c7755e;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e4 = c12688e2;
                                    boolean yandex2 = c13770e2.yandex(c12688e4);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C3547e(c12688e4, 3);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                C13770e c13770e3 = (C13770e) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e5 = c12688e2;
                                    boolean yandex3 = c13770e3.yandex(c12688e5);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        m3681throw3 = new C3547e(c12688e5, 2);
                                        c13770e3.m3682throws(m3681throw3);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                C13770e c13770e4 = (C13770e) obj3;
                                int intValue4 = ((Integer) obj4).intValue();
                                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e6 = c12688e2;
                                    boolean yandex4 = c13770e4.yandex(c12688e6);
                                    Object m3681throw4 = c13770e4.m3681throw();
                                    if (yandex4 || m3681throw4 == C2987e.ad) {
                                        C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                        c13770e4.m3682throws(c7755e2);
                                        m3681throw4 = c7755e2;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                } else {
                                    c13770e4.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 4:
                                C13770e c13770e5 = (C13770e) obj3;
                                int intValue5 = ((Integer) obj4).intValue();
                                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.startapp;
                                    C12688e c12688e7 = c12688e2;
                                    boolean yandex5 = c13770e5.yandex(c12688e7);
                                    Object m3681throw5 = c13770e5.m3681throw();
                                    if (yandex5 || m3681throw5 == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                        c13770e5.m3682throws(c11476e);
                                        m3681throw5 = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                } else {
                                    c13770e5.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 5:
                                C13770e c13770e6 = (C13770e) obj3;
                                int intValue6 = ((Integer) obj4).intValue();
                                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.Signature;
                                    C12688e c12688e8 = c12688e2;
                                    boolean yandex6 = c13770e6.yandex(c12688e8);
                                    Object m3681throw6 = c13770e6.m3681throw();
                                    if (yandex6 || m3681throw6 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                        c13770e6.m3682throws(c11476e2);
                                        m3681throw6 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                } else {
                                    c13770e6.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 6:
                                C13770e c13770e7 = (C13770e) obj3;
                                int intValue7 = ((Integer) obj4).intValue();
                                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.adcel;
                                    C12688e c12688e9 = c12688e2;
                                    boolean yandex7 = c13770e7.yandex(c12688e9);
                                    Object m3681throw7 = c13770e7.m3681throw();
                                    if (yandex7 || m3681throw7 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                        c13770e7.m3682throws(c11476e3);
                                        m3681throw7 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                } else {
                                    c13770e7.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e8 = (C13770e) obj3;
                                int intValue8 = ((Integer) obj4).intValue();
                                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    C1733e c1733e4 = AbstractC16524e.appmetrica;
                                    boolean vip = AbstractC12681e.vip(3);
                                    C12688e c12688e10 = c12688e2;
                                    boolean yandex8 = c13770e8.yandex(c12688e10);
                                    Object m3681throw8 = c13770e8.m3681throw();
                                    C5170e c5170e = C2987e.ad;
                                    if (yandex8 || m3681throw8 == c5170e) {
                                        C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c13770e8.m3682throws(c11476e4);
                                        m3681throw8 = c11476e4;
                                    }
                                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                    boolean yandex9 = c13770e8.yandex(c12688e10);
                                    Object m3681throw9 = c13770e8.m3681throw();
                                    if (yandex9 || m3681throw9 == c5170e) {
                                        m3681throw9 = new C5461e(c12688e10, 0);
                                        c13770e8.m3682throws(m3681throw9);
                                    }
                                    AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                } else {
                                    c13770e8.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                C14027e.ad.getClass();
                if (C14027e.ad()) {
                    AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.yandex, 3);
                    final int i4 = 3;
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(131836015, true, new Function3() { // from class: eْٗٔ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            switch (i4) {
                                case 0:
                                    C13770e c13770e = (C13770e) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        C12688e c12688e3 = c12688e2;
                                        boolean yandex = c13770e.yandex(c12688e3);
                                        Object m3681throw = c13770e.m3681throw();
                                        if (yandex || m3681throw == C2987e.ad) {
                                            C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                            c13770e.m3682throws(c7755e);
                                            m3681throw = c7755e;
                                        }
                                        AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    C13770e c13770e2 = (C13770e) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        C12688e c12688e4 = c12688e2;
                                        boolean yandex2 = c13770e2.yandex(c12688e4);
                                        Object m3681throw2 = c13770e2.m3681throw();
                                        if (yandex2 || m3681throw2 == C2987e.ad) {
                                            m3681throw2 = new C3547e(c12688e4, 3);
                                            c13770e2.m3682throws(m3681throw2);
                                        }
                                        AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                    } else {
                                        c13770e2.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 2:
                                    C13770e c13770e3 = (C13770e) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        C12688e c12688e5 = c12688e2;
                                        boolean yandex3 = c13770e3.yandex(c12688e5);
                                        Object m3681throw3 = c13770e3.m3681throw();
                                        if (yandex3 || m3681throw3 == C2987e.ad) {
                                            m3681throw3 = new C3547e(c12688e5, 2);
                                            c13770e3.m3682throws(m3681throw3);
                                        }
                                        AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                    } else {
                                        c13770e3.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 3:
                                    C13770e c13770e4 = (C13770e) obj3;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        C12688e c12688e6 = c12688e2;
                                        boolean yandex4 = c13770e4.yandex(c12688e6);
                                        Object m3681throw4 = c13770e4.m3681throw();
                                        if (yandex4 || m3681throw4 == C2987e.ad) {
                                            C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                            c13770e4.m3682throws(c7755e2);
                                            m3681throw4 = c7755e2;
                                        }
                                        AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                    } else {
                                        c13770e4.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 4:
                                    C13770e c13770e5 = (C13770e) obj3;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        C1733e c1733e = AbstractC16524e.startapp;
                                        C12688e c12688e7 = c12688e2;
                                        boolean yandex5 = c13770e5.yandex(c12688e7);
                                        Object m3681throw5 = c13770e5.m3681throw();
                                        if (yandex5 || m3681throw5 == C2987e.ad) {
                                            C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                            c13770e5.m3682throws(c11476e);
                                            m3681throw5 = c11476e;
                                        }
                                        AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                    } else {
                                        c13770e5.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 5:
                                    C13770e c13770e6 = (C13770e) obj3;
                                    int intValue6 = ((Integer) obj4).intValue();
                                    if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        C1733e c1733e2 = AbstractC16524e.Signature;
                                        C12688e c12688e8 = c12688e2;
                                        boolean yandex6 = c13770e6.yandex(c12688e8);
                                        Object m3681throw6 = c13770e6.m3681throw();
                                        if (yandex6 || m3681throw6 == C2987e.ad) {
                                            C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                            c13770e6.m3682throws(c11476e2);
                                            m3681throw6 = c11476e2;
                                        }
                                        AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                    } else {
                                        c13770e6.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 6:
                                    C13770e c13770e7 = (C13770e) obj3;
                                    int intValue7 = ((Integer) obj4).intValue();
                                    if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                        C1733e c1733e3 = AbstractC16524e.adcel;
                                        C12688e c12688e9 = c12688e2;
                                        boolean yandex7 = c13770e7.yandex(c12688e9);
                                        Object m3681throw7 = c13770e7.m3681throw();
                                        if (yandex7 || m3681throw7 == C2987e.ad) {
                                            C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                            c13770e7.m3682throws(c11476e3);
                                            m3681throw7 = c11476e3;
                                        }
                                        AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                    } else {
                                        c13770e7.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e8 = (C13770e) obj3;
                                    int intValue8 = ((Integer) obj4).intValue();
                                    if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                        C1733e c1733e4 = AbstractC16524e.appmetrica;
                                        boolean vip = AbstractC12681e.vip(3);
                                        C12688e c12688e10 = c12688e2;
                                        boolean yandex8 = c13770e8.yandex(c12688e10);
                                        Object m3681throw8 = c13770e8.m3681throw();
                                        C5170e c5170e = C2987e.ad;
                                        if (yandex8 || m3681throw8 == c5170e) {
                                            C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                            c13770e8.m3682throws(c11476e4);
                                            m3681throw8 = c11476e4;
                                        }
                                        InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                        boolean yandex9 = c13770e8.yandex(c12688e10);
                                        Object m3681throw9 = c13770e8.m3681throw();
                                        if (yandex9 || m3681throw9 == c5170e) {
                                            m3681throw9 = new C5461e(c12688e10, 0);
                                            c13770e8.m3682throws(m3681throw9);
                                        }
                                        AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                    } else {
                                        c13770e8.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                }
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.mopub, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.advert, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.smaato, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.amazon, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.loadAd, 3);
                final int i5 = 4;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(1630217091, true, new Function3() { // from class: eْٗٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i5) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e3 = c12688e2;
                                    boolean yandex = c13770e.yandex(c12688e3);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                        c13770e.m3682throws(c7755e);
                                        m3681throw = c7755e;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e4 = c12688e2;
                                    boolean yandex2 = c13770e2.yandex(c12688e4);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C3547e(c12688e4, 3);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                C13770e c13770e3 = (C13770e) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e5 = c12688e2;
                                    boolean yandex3 = c13770e3.yandex(c12688e5);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        m3681throw3 = new C3547e(c12688e5, 2);
                                        c13770e3.m3682throws(m3681throw3);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                C13770e c13770e4 = (C13770e) obj3;
                                int intValue4 = ((Integer) obj4).intValue();
                                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e6 = c12688e2;
                                    boolean yandex4 = c13770e4.yandex(c12688e6);
                                    Object m3681throw4 = c13770e4.m3681throw();
                                    if (yandex4 || m3681throw4 == C2987e.ad) {
                                        C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                        c13770e4.m3682throws(c7755e2);
                                        m3681throw4 = c7755e2;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                } else {
                                    c13770e4.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 4:
                                C13770e c13770e5 = (C13770e) obj3;
                                int intValue5 = ((Integer) obj4).intValue();
                                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.startapp;
                                    C12688e c12688e7 = c12688e2;
                                    boolean yandex5 = c13770e5.yandex(c12688e7);
                                    Object m3681throw5 = c13770e5.m3681throw();
                                    if (yandex5 || m3681throw5 == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                        c13770e5.m3682throws(c11476e);
                                        m3681throw5 = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                } else {
                                    c13770e5.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 5:
                                C13770e c13770e6 = (C13770e) obj3;
                                int intValue6 = ((Integer) obj4).intValue();
                                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.Signature;
                                    C12688e c12688e8 = c12688e2;
                                    boolean yandex6 = c13770e6.yandex(c12688e8);
                                    Object m3681throw6 = c13770e6.m3681throw();
                                    if (yandex6 || m3681throw6 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                        c13770e6.m3682throws(c11476e2);
                                        m3681throw6 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                } else {
                                    c13770e6.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 6:
                                C13770e c13770e7 = (C13770e) obj3;
                                int intValue7 = ((Integer) obj4).intValue();
                                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.adcel;
                                    C12688e c12688e9 = c12688e2;
                                    boolean yandex7 = c13770e7.yandex(c12688e9);
                                    Object m3681throw7 = c13770e7.m3681throw();
                                    if (yandex7 || m3681throw7 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                        c13770e7.m3682throws(c11476e3);
                                        m3681throw7 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                } else {
                                    c13770e7.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e8 = (C13770e) obj3;
                                int intValue8 = ((Integer) obj4).intValue();
                                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    C1733e c1733e4 = AbstractC16524e.appmetrica;
                                    boolean vip = AbstractC12681e.vip(3);
                                    C12688e c12688e10 = c12688e2;
                                    boolean yandex8 = c13770e8.yandex(c12688e10);
                                    Object m3681throw8 = c13770e8.m3681throw();
                                    C5170e c5170e = C2987e.ad;
                                    if (yandex8 || m3681throw8 == c5170e) {
                                        C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c13770e8.m3682throws(c11476e4);
                                        m3681throw8 = c11476e4;
                                    }
                                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                    boolean yandex9 = c13770e8.yandex(c12688e10);
                                    Object m3681throw9 = c13770e8.m3681throw();
                                    if (yandex9 || m3681throw9 == c5170e) {
                                        m3681throw9 = new C5461e(c12688e10, 0);
                                        c13770e8.m3682throws(m3681throw9);
                                    }
                                    AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                } else {
                                    c13770e8.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                final int i6 = 5;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-785223582, true, new Function3() { // from class: eْٗٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i6) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e3 = c12688e2;
                                    boolean yandex = c13770e.yandex(c12688e3);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                        c13770e.m3682throws(c7755e);
                                        m3681throw = c7755e;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e4 = c12688e2;
                                    boolean yandex2 = c13770e2.yandex(c12688e4);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C3547e(c12688e4, 3);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                C13770e c13770e3 = (C13770e) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e5 = c12688e2;
                                    boolean yandex3 = c13770e3.yandex(c12688e5);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        m3681throw3 = new C3547e(c12688e5, 2);
                                        c13770e3.m3682throws(m3681throw3);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                C13770e c13770e4 = (C13770e) obj3;
                                int intValue4 = ((Integer) obj4).intValue();
                                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e6 = c12688e2;
                                    boolean yandex4 = c13770e4.yandex(c12688e6);
                                    Object m3681throw4 = c13770e4.m3681throw();
                                    if (yandex4 || m3681throw4 == C2987e.ad) {
                                        C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                        c13770e4.m3682throws(c7755e2);
                                        m3681throw4 = c7755e2;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                } else {
                                    c13770e4.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 4:
                                C13770e c13770e5 = (C13770e) obj3;
                                int intValue5 = ((Integer) obj4).intValue();
                                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.startapp;
                                    C12688e c12688e7 = c12688e2;
                                    boolean yandex5 = c13770e5.yandex(c12688e7);
                                    Object m3681throw5 = c13770e5.m3681throw();
                                    if (yandex5 || m3681throw5 == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                        c13770e5.m3682throws(c11476e);
                                        m3681throw5 = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                } else {
                                    c13770e5.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 5:
                                C13770e c13770e6 = (C13770e) obj3;
                                int intValue6 = ((Integer) obj4).intValue();
                                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.Signature;
                                    C12688e c12688e8 = c12688e2;
                                    boolean yandex6 = c13770e6.yandex(c12688e8);
                                    Object m3681throw6 = c13770e6.m3681throw();
                                    if (yandex6 || m3681throw6 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                        c13770e6.m3682throws(c11476e2);
                                        m3681throw6 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                } else {
                                    c13770e6.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 6:
                                C13770e c13770e7 = (C13770e) obj3;
                                int intValue7 = ((Integer) obj4).intValue();
                                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.adcel;
                                    C12688e c12688e9 = c12688e2;
                                    boolean yandex7 = c13770e7.yandex(c12688e9);
                                    Object m3681throw7 = c13770e7.m3681throw();
                                    if (yandex7 || m3681throw7 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                        c13770e7.m3682throws(c11476e3);
                                        m3681throw7 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                } else {
                                    c13770e7.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e8 = (C13770e) obj3;
                                int intValue8 = ((Integer) obj4).intValue();
                                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    C1733e c1733e4 = AbstractC16524e.appmetrica;
                                    boolean vip = AbstractC12681e.vip(3);
                                    C12688e c12688e10 = c12688e2;
                                    boolean yandex8 = c13770e8.yandex(c12688e10);
                                    Object m3681throw8 = c13770e8.m3681throw();
                                    C5170e c5170e = C2987e.ad;
                                    if (yandex8 || m3681throw8 == c5170e) {
                                        C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c13770e8.m3682throws(c11476e4);
                                        m3681throw8 = c11476e4;
                                    }
                                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                    boolean yandex9 = c13770e8.yandex(c12688e10);
                                    Object m3681throw9 = c13770e8.m3681throw();
                                    if (yandex9 || m3681throw9 == c5170e) {
                                        m3681throw9 = new C5461e(c12688e10, 0);
                                        c13770e8.m3682throws(m3681throw9);
                                    }
                                    AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                } else {
                                    c13770e8.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                final int i7 = 6;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-584251928, true, new Function3() { // from class: eْٗٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i7) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e3 = c12688e2;
                                    boolean yandex = c13770e.yandex(c12688e3);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                        c13770e.m3682throws(c7755e);
                                        m3681throw = c7755e;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e4 = c12688e2;
                                    boolean yandex2 = c13770e2.yandex(c12688e4);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C3547e(c12688e4, 3);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                C13770e c13770e3 = (C13770e) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e5 = c12688e2;
                                    boolean yandex3 = c13770e3.yandex(c12688e5);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        m3681throw3 = new C3547e(c12688e5, 2);
                                        c13770e3.m3682throws(m3681throw3);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                C13770e c13770e4 = (C13770e) obj3;
                                int intValue4 = ((Integer) obj4).intValue();
                                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e6 = c12688e2;
                                    boolean yandex4 = c13770e4.yandex(c12688e6);
                                    Object m3681throw4 = c13770e4.m3681throw();
                                    if (yandex4 || m3681throw4 == C2987e.ad) {
                                        C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                        c13770e4.m3682throws(c7755e2);
                                        m3681throw4 = c7755e2;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                } else {
                                    c13770e4.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 4:
                                C13770e c13770e5 = (C13770e) obj3;
                                int intValue5 = ((Integer) obj4).intValue();
                                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.startapp;
                                    C12688e c12688e7 = c12688e2;
                                    boolean yandex5 = c13770e5.yandex(c12688e7);
                                    Object m3681throw5 = c13770e5.m3681throw();
                                    if (yandex5 || m3681throw5 == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                        c13770e5.m3682throws(c11476e);
                                        m3681throw5 = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                } else {
                                    c13770e5.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 5:
                                C13770e c13770e6 = (C13770e) obj3;
                                int intValue6 = ((Integer) obj4).intValue();
                                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.Signature;
                                    C12688e c12688e8 = c12688e2;
                                    boolean yandex6 = c13770e6.yandex(c12688e8);
                                    Object m3681throw6 = c13770e6.m3681throw();
                                    if (yandex6 || m3681throw6 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                        c13770e6.m3682throws(c11476e2);
                                        m3681throw6 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                } else {
                                    c13770e6.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 6:
                                C13770e c13770e7 = (C13770e) obj3;
                                int intValue7 = ((Integer) obj4).intValue();
                                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.adcel;
                                    C12688e c12688e9 = c12688e2;
                                    boolean yandex7 = c13770e7.yandex(c12688e9);
                                    Object m3681throw7 = c13770e7.m3681throw();
                                    if (yandex7 || m3681throw7 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                        c13770e7.m3682throws(c11476e3);
                                        m3681throw7 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                } else {
                                    c13770e7.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e8 = (C13770e) obj3;
                                int intValue8 = ((Integer) obj4).intValue();
                                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    C1733e c1733e4 = AbstractC16524e.appmetrica;
                                    boolean vip = AbstractC12681e.vip(3);
                                    C12688e c12688e10 = c12688e2;
                                    boolean yandex8 = c13770e8.yandex(c12688e10);
                                    Object m3681throw8 = c13770e8.m3681throw();
                                    C5170e c5170e = C2987e.ad;
                                    if (yandex8 || m3681throw8 == c5170e) {
                                        C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c13770e8.m3682throws(c11476e4);
                                        m3681throw8 = c11476e4;
                                    }
                                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                    boolean yandex9 = c13770e8.yandex(c12688e10);
                                    Object m3681throw9 = c13770e8.m3681throw();
                                    if (yandex9 || m3681throw9 == c5170e) {
                                        m3681throw9 = new C5461e(c12688e10, 0);
                                        c13770e8.m3682throws(m3681throw9);
                                    }
                                    AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                } else {
                                    c13770e8.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.Signature, 3);
                final int i8 = 7;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-1120165978, true, new Function3() { // from class: eْٗٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i8) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e3 = c12688e2;
                                    boolean yandex = c13770e.yandex(c12688e3);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C7755e c7755e = new C7755e(0, c12688e3, C12688e.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 7);
                                        c13770e.m3682throws(c7755e);
                                        m3681throw = c7755e;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e4 = c12688e2;
                                    boolean yandex2 = c13770e2.yandex(c12688e4);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C3547e(c12688e4, 3);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e2, 6, 508);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                C13770e c13770e3 = (C13770e) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e5 = c12688e2;
                                    boolean yandex3 = c13770e3.yandex(c12688e5);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        m3681throw3 = new C3547e(c12688e5, 2);
                                        c13770e3.m3682throws(m3681throw3);
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.purchase, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, AbstractC13461e.billing, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                C13770e c13770e4 = (C13770e) obj3;
                                int intValue4 = ((Integer) obj4).intValue();
                                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C12688e c12688e6 = c12688e2;
                                    boolean yandex4 = c13770e4.yandex(c12688e6);
                                    Object m3681throw4 = c13770e4.m3681throw();
                                    if (yandex4 || m3681throw4 == C2987e.ad) {
                                        C7755e c7755e2 = new C7755e(0, c12688e6, C12688e.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 8);
                                        c13770e4.m3682throws(c7755e2);
                                        m3681throw4 = c7755e2;
                                    }
                                    AbstractC16429e.ad(AbstractC13461e.startapp, AbstractC9546e.license(metrica4, false, null, (Function0) ((InterfaceC5261e) m3681throw4), 15), null, AbstractC13461e.adcel, null, null, null, 0.0f, 0.0f, c13770e4, 3078, 500);
                                } else {
                                    c13770e4.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 4:
                                C13770e c13770e5 = (C13770e) obj3;
                                int intValue5 = ((Integer) obj4).intValue();
                                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.startapp;
                                    C12688e c12688e7 = c12688e2;
                                    boolean yandex5 = c13770e5.yandex(c12688e7);
                                    Object m3681throw5 = c13770e5.m3681throw();
                                    if (yandex5 || m3681throw5 == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c12688e7, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 21);
                                        c13770e5.m3682throws(c11476e);
                                        m3681throw5 = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw5), c13770e5, 0, 6);
                                } else {
                                    c13770e5.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 5:
                                C13770e c13770e6 = (C13770e) obj3;
                                int intValue6 = ((Integer) obj4).intValue();
                                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.Signature;
                                    C12688e c12688e8 = c12688e2;
                                    boolean yandex6 = c13770e6.yandex(c12688e8);
                                    Object m3681throw6 = c13770e6.m3681throw();
                                    if (yandex6 || m3681throw6 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c12688e8, C12688e.class, "requestRestart", "requestRestart(Z)V", 0, 0, 22);
                                        c13770e6.m3682throws(c11476e2);
                                        m3681throw6 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw6), c13770e6, 0, 6);
                                } else {
                                    c13770e6.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 6:
                                C13770e c13770e7 = (C13770e) obj3;
                                int intValue7 = ((Integer) obj4).intValue();
                                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.adcel;
                                    C12688e c12688e9 = c12688e2;
                                    boolean yandex7 = c13770e7.yandex(c12688e9);
                                    Object m3681throw7 = c13770e7.m3681throw();
                                    if (yandex7 || m3681throw7 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c12688e9, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 23);
                                        c13770e7.m3682throws(c11476e3);
                                        m3681throw7 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw7), c13770e7, 0, 6);
                                } else {
                                    c13770e7.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e8 = (C13770e) obj3;
                                int intValue8 = ((Integer) obj4).intValue();
                                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                                    C1733e c1733e4 = AbstractC16524e.appmetrica;
                                    boolean vip = AbstractC12681e.vip(3);
                                    C12688e c12688e10 = c12688e2;
                                    boolean yandex8 = c13770e8.yandex(c12688e10);
                                    Object m3681throw8 = c13770e8.m3681throw();
                                    C5170e c5170e = C2987e.ad;
                                    if (yandex8 || m3681throw8 == c5170e) {
                                        C11476e c11476e4 = new C11476e(1, c12688e10, C12688e.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c13770e8.m3682throws(c11476e4);
                                        m3681throw8 = c11476e4;
                                    }
                                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw8;
                                    boolean yandex9 = c13770e8.yandex(c12688e10);
                                    Object m3681throw9 = c13770e8.m3681throw();
                                    if (yandex9 || m3681throw9 == c5170e) {
                                        m3681throw9 = new C5461e(c12688e10, 0);
                                        c13770e8.m3682throws(m3681throw9);
                                    }
                                    AbstractC17181e.yandex(c1733e4, vip, (Function1) m3681throw9, (Function1) interfaceC5261e, c13770e8, 0, 0);
                                } else {
                                    c13770e8.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.admob, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC13461e.subscription, 3);
                return Unit.INSTANCE;
        }
    }
}
