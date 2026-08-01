package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8741e {
    public static final float ad = 10;
    public static final float vip = 24;
    public static final float metrica = 1;
    public static final float license = 6;
    public static final float appmetrica = 4;
    public static final InterfaceC12864e purchase = AbstractC18007e.purchase(AbstractC18007e.amazon(C0115e.f1276e, 144, 0.0f, 2), 0.0f, 48, 1);
    public static final C12870e billing = new C12870e(100, (InterfaceC17838e) null, 6);

    public static final void ad(final Function1 function1, final C3721e c3721e, final C3721e c3721e2, final InterfaceC3314e interfaceC3314e, float f, C13770e c13770e, final int i) {
        final float f2;
        final InterfaceC3314e interfaceC3314e2;
        final C3721e c3721e3;
        final C3721e c3721e4;
        final Function1 function12;
        c13770e.m3671package(-743965752);
        int i2 = (c13770e.yandex(function1) ? 4 : 2) | i | (c13770e.purchase(c3721e) ? 32 : 16) | (c13770e.purchase(c3721e2) ? 256 : 128) | (c13770e.metrica(f) ? 16384 : 8192);
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                f2 = f;
                Function0 function0 = new Function0() { // from class: eؖؗۙ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C3721e c3721e5 = C3721e.this;
                        float f3 = (c3721e5.vip - c3721e5.ad) / 1000;
                        float floatValue = ((Number) function1.invoke(Float.valueOf(f2))).floatValue();
                        InterfaceC3314e interfaceC3314e3 = interfaceC3314e;
                        if (Math.abs(floatValue - ((Number) interfaceC3314e3.getValue()).floatValue()) > f3) {
                            float floatValue2 = ((Number) ((Comparable) interfaceC3314e3.getValue())).floatValue();
                            C3721e c3721e6 = c3721e2;
                            if (floatValue2 >= c3721e6.ad && floatValue2 <= c3721e6.vip) {
                                interfaceC3314e3.setValue(Float.valueOf(floatValue));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                c3721e4 = c3721e;
                function12 = function1;
                interfaceC3314e2 = interfaceC3314e;
                c3721e3 = c3721e2;
                c13770e.m3682throws(function0);
                m3681throw = function0;
            } else {
                f2 = f;
                interfaceC3314e2 = interfaceC3314e;
                c3721e3 = c3721e2;
                c3721e4 = c3721e;
                function12 = function1;
            }
            AbstractC17680e.purchase((Function0) m3681throw, c13770e);
        } else {
            f2 = f;
            interfaceC3314e2 = interfaceC3314e;
            c3721e3 = c3721e2;
            c3721e4 = c3721e;
            function12 = function1;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final float f3 = f2;
            subscription.license = new Function2(c3721e4, c3721e3, interfaceC3314e2, f3, i) { // from class: eٕٖٗ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ float f30620e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ C3721e f30621e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C3721e f30622e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC3314e f30623e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(3073);
                    AbstractC8741e.ad(Function1.this, this.f30622e, this.f30621e, this.f30623e, this.f30620e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void appmetrica(final InterfaceC12864e interfaceC12864e, final C14607e c14607e, final boolean z, final float f, final List list, final float f2, final float f3, C13770e c13770e, final int i) {
        int i2;
        float f4;
        c13770e.m3671package(1833126050);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(c14607e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.metrica(0.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.metrica(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            f4 = f2;
            i2 |= c13770e.metrica(f4) ? 1048576 : 524288;
        } else {
            f4 = f2;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.metrica(f3) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (4793491 & i3) != 4793490)) {
            InterfaceC3314e vip2 = c14607e.vip(z, false, c13770e);
            InterfaceC3314e vip3 = c14607e.vip(z, true, c13770e);
            InterfaceC3314e ad2 = c14607e.ad(z, false, c13770e);
            InterfaceC3314e ad3 = c14607e.ad(z, true, c13770e);
            boolean purchase2 = ((i3 & 3670016) == 1048576) | c13770e.purchase(vip2) | ((29360128 & i3) == 8388608) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | c13770e.purchase(vip3) | c13770e.yandex(list) | c13770e.purchase(ad2) | c13770e.purchase(ad3);
            Object m3681throw = c13770e.m3681throw();
            if (purchase2 || m3681throw == C2987e.ad) {
                C4666e c4666e = new C4666e(f4, vip2, f3, f, vip3, list, ad2, ad3);
                c13770e.m3682throws(c4666e);
                m3681throw = c4666e;
            }
            AbstractC18366e.ad(interfaceC12864e, (Function1) m3681throw, c13770e, i3 & 14);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: e٘ؓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC8741e.appmetrica(InterfaceC12864e.this, c14607e, z, f, list, f2, f3, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void license(final float f, final C15274e c15274e, final C14607e c14607e, final boolean z, final float f2, C13770e c13770e, final int i) {
        int i2;
        c13770e.m3671package(428907178);
        int i3 = i & 6;
        C14486e c14486e = C14486e.ad;
        if (i3 == 0) {
            i2 = (c13770e.purchase(c14486e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        C0115e c0115e = C0115e.f1276e;
        if (i4 == 0) {
            i2 |= c13770e.purchase(c0115e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.metrica(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(c15274e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(c14607e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.billing(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.metrica(f2) ? 1048576 : 524288;
        }
        if (c13770e.m3673protected(i2 & 1, (599187 & i2) != 599186)) {
            InterfaceC12864e ad2 = c14486e.ad(AbstractC12220e.loadAd(c0115e, f, 0.0f, 0.0f, 0.0f, 14), C5438e.f11666e);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            int appmetrica2 = AbstractC5546e.appmetrica(c13770e);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, ad2);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            Function2 function2 = C2721e.adcel;
            if (c13770e.f27292implements || !AbstractC7890e.billing(c13770e.m3681throw(), Integer.valueOf(appmetrica2))) {
                c13770e.m3682throws(Integer.valueOf(appmetrica2));
                c13770e.vip(Integer.valueOf(appmetrica2), function2);
            }
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = new C12742e();
                c13770e.m3682throws(m3681throw);
            }
            C12742e c12742e = (C12742e) m3681throw;
            boolean z2 = (i2 & 7168) == 2048;
            Object m3681throw2 = c13770e.m3681throw();
            if (z2 || m3681throw2 == obj) {
                m3681throw2 = new C7602e(c15274e, c12742e, null, 15);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, c15274e, (Function2) m3681throw2);
            float f3 = !c12742e.isEmpty() ? license : metrica;
            InterfaceC12864e yandex = AbstractC9764e.yandex(AbstractC10746e.ad(AbstractC18007e.adcel(c0115e, f2, f2), c15274e, AbstractC17394e.ad(4, vip)), c15274e);
            if (!z) {
                f3 = 0;
            }
            C3924e c3924e = AbstractC6549e.ad;
            InterfaceC12864e license3 = AbstractC16398e.license(yandex, f3, c3924e, false, 24);
            c13770e.m3676strictfp(-1733795637);
            InterfaceC3314e mopub = AbstractC14533e.mopub(new C3618e(z ? c14607e.ad : c14607e.vip), c13770e);
            c13770e.Signature(false);
            AbstractC12534e.ad(c13770e, AbstractC16136e.metrica(license3, ((C3618e) mopub.getValue()).ad, c3924e));
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eَؔؗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC8741e.license(f, c15274e, c14607e, z, f2, (C13770e) obj2, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void metrica(final boolean z, final float f, final List list, final C14607e c14607e, final float f2, final C15274e c15274e, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1679682785);
        int i2 = i | (c13770e2.billing(z) ? 4 : 2) | (c13770e2.metrica(f) ? 32 : 16) | (c13770e2.yandex(list) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e2.purchase(c14607e) ? 2048 : 1024) | (c13770e2.metrica(f2) ? 16384 : 8192) | (c13770e2.purchase(c15274e) ? 131072 : 65536) | (c13770e2.purchase(interfaceC12864e) ? 1048576 : 524288);
        if (c13770e2.m3673protected(i2 & 1, (599187 & i2) != 599186)) {
            InterfaceC12864e premium = interfaceC12864e.premium(purchase);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            int appmetrica2 = AbstractC5546e.appmetrica(c13770e2);
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, premium);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            C14865e c14865e = C2721e.adcel;
            if (c13770e2.f27292implements || !AbstractC7890e.billing(c13770e2.m3681throw(), Integer.valueOf(appmetrica2))) {
                c13770e2.m3682throws(Integer.valueOf(appmetrica2));
                c13770e2.vip(Integer.valueOf(appmetrica2), c14865e);
            }
            AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
            InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e2.adcel(AbstractC11473e.yandex);
            float mo497instanceof = interfaceC14388e.mo497instanceof(appmetrica);
            float f3 = ad;
            float mo497instanceof2 = interfaceC14388e.mo497instanceof(f3);
            float f4 = f3 * 2;
            float mo498new = interfaceC14388e.mo498new(f2) * f;
            int i3 = i2 >> 6;
            int i4 = i2 << 9;
            appmetrica(AbstractC18007e.metrica, c14607e, z, f, list, mo497instanceof2, mo497instanceof, c13770e2, (i4 & 458752) | (i3 & 112) | 3078 | ((i2 << 6) & 896) | (i4 & 57344));
            license(mo498new, c15274e, c14607e, z, f4, c13770e, (i3 & 7168) | 1572918 | ((i2 << 3) & 57344) | ((i2 << 15) & 458752));
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2(z, f, list, c14607e, f2, c15274e, interfaceC12864e, i) { // from class: eؘؙؑ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ float f13023e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ List f13024e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ float f13025e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ C14607e f13026e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ boolean f13027e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f13028e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ C15274e f13029e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert2 = AbstractC5190e.advert(1);
                    AbstractC8741e.metrica(this.f13027e, this.f13025e, this.f13024e, this.f13026e, this.f13023e, this.f13029e, this.f13028e, (C13770e) obj, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final float r27, final kotlin.jvm.functions.Function1 r28, final defpackage.InterfaceC12864e r29, boolean r30, final defpackage.C3721e r31, int r32, final kotlin.jvm.functions.Function0 r33, defpackage.C15274e r34, final defpackage.C14607e r35, defpackage.C13770e r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8741e.vip(float, kotlin.jvm.functions.Function1, eّۤۧ, boolean, eؙؕۤ, int, kotlin.jvm.functions.Function0, eؘٕؕ, eٌٔۜ, eٓؕۥ, int, int):void");
    }
}
