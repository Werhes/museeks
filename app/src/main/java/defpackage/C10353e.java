package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10353e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f20431e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20432e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f20433e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f20434e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20435e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f20436e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f20437e;

    public /* synthetic */ C10353e(String str, boolean z, C15274e c15274e, Function2 function2, Function2 function22, C17085e c17085e, int i) {
        this.f20435e = i;
        this.f20433e = str;
        this.f20432e = z;
        this.f20434e = c15274e;
        this.f20431e = function2;
        this.f20437e = function22;
        this.f20436e = c17085e;
    }

    public /* synthetic */ C10353e(AudioTrack audioTrack, C16349e c16349e, AudioSnippetEntry audioSnippetEntry, C1718e c1718e, boolean z, InterfaceC3314e interfaceC3314e) {
        this.f20435e = 2;
        this.f20433e = audioTrack;
        this.f20434e = c16349e;
        this.f20431e = audioSnippetEntry;
        this.f20437e = c1718e;
        this.f20432e = z;
        this.f20436e = interfaceC3314e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        C2892e license;
        boolean z2;
        C2892e license2;
        boolean z3;
        int i = this.f20435e;
        Object obj4 = this.f20436e;
        Object obj5 = this.f20437e;
        Object obj6 = this.f20431e;
        Object obj7 = this.f20434e;
        Object obj8 = this.f20433e;
        switch (i) {
            case 0:
                String str = (String) obj8;
                C15274e c15274e = (C15274e) obj7;
                Function2 function2 = (Function2) obj6;
                Function2 function22 = (Function2) obj5;
                C17085e c17085e = (C17085e) obj4;
                Function2 function23 = (Function2) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.yandex(function23) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C8094e c8094e = C8094e.ad;
                    int i2 = intValue;
                    if (function22 == null) {
                        c13770e.m3676strictfp(-479264657);
                        z = false;
                        c13770e.Signature(false);
                        license = null;
                    } else {
                        z = false;
                        c13770e.m3676strictfp(-479264656);
                        license = AbstractC16653e.license(2049761291, new C2920e(function22, 2, 0 == true ? 1 : 0), c13770e);
                        c13770e.Signature(false);
                    }
                    c13770e.m3676strictfp(-479052214);
                    c13770e.Signature(z);
                    C1299e c1299e = C1299e.ad;
                    c8094e.ad(str, function23, this.f20432e, c15274e, function2, license, null, AbstractC8949e.ad(c13770e, AbstractC17572e.vip), c17085e, C8094e.metrica(c8094e), AbstractC17540e.metrica, c13770e, ((i2 << 3) & 112) | 27648);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj8;
                C15274e c15274e2 = (C15274e) obj7;
                Function2 function24 = (Function2) obj6;
                Function2 function25 = (Function2) obj5;
                C17085e c17085e2 = (C17085e) obj4;
                Function2 function26 = (Function2) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.yandex(function26) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    C8094e c8094e2 = C8094e.ad;
                    int i3 = intValue2;
                    if (function25 == null) {
                        c13770e2.m3676strictfp(1405051955);
                        z2 = false;
                        c13770e2.Signature(false);
                        license2 = null;
                    } else {
                        z2 = false;
                        c13770e2.m3676strictfp(1405051956);
                        license2 = AbstractC16653e.license(1802574279, new C2920e(function25, 14, 0 == true ? 1 : 0), c13770e2);
                        c13770e2.Signature(false);
                    }
                    c13770e2.m3676strictfp(1405264398);
                    c13770e2.Signature(z2);
                    C1299e c1299e2 = C1299e.ad;
                    c8094e2.ad(str2, function26, this.f20432e, c15274e2, function24, license2, null, AbstractC8949e.ad(c13770e2, AbstractC17572e.vip), c17085e2, C8094e.metrica(c8094e2), AbstractC0815e.f3207e, c13770e2, ((i3 << 3) & 112) | 27648);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                AudioTrack audioTrack = (AudioTrack) obj8;
                final C16349e c16349e = (C16349e) obj7;
                final AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj6;
                C1718e c1718e = (C1718e) obj5;
                final InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj4;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                boolean z4 = (intValue3 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e3.ad;
                if (c13770e3.m3673protected(intValue3 & 1, z4)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e3.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e3.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, c7913e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e3, license3, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e3, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i4);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e3, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e3, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e3, purchase, c14865e4);
                    C15492e c15492e = AbstractC2676e.vip;
                    C5944e c5944e = new C5944e((Context) c13770e3.adcel(c15492e));
                    c5944e.metrica = audioTrack;
                    AbstractC15659e.ad(c5944e, true);
                    AbstractC2182e.metrica(c5944e, new C5654e((Context) c13770e3.adcel(c15492e), 15.0f, 2.0f));
                    c5944e.subscription = 1;
                    c5944e.license(135);
                    AbstractC2182e.ad(c5944e, false);
                    AbstractC9180e.vip(c5944e.ad(), null, AbstractC12696e.yandex(750, 6, null), BuildConfig.FLAVOR, AbstractC8913e.appmetrica, c13770e3, 28032, 2);
                    C13770e c13770e4 = c13770e3;
                    AbstractC17074e.ad(AbstractC16136e.metrica(c7913e, C3618e.vip(0.35f, C3618e.vip), AbstractC10432e.ad), c13770e4, 6);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e4, 0);
                    long j2 = c13770e4.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e4.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e4, c7913e);
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad, c14865e);
                    AbstractC2270e.yandex(c13770e4, advert2, c14865e2);
                    AbstractC8703e.premium(i5, c13770e4, c14865e3, c13770e4, c5430e);
                    AbstractC2270e.yandex(c13770e4, purchase2, c14865e4);
                    C13964e billing = AbstractC16497e.billing(8);
                    C0115e c0115e = C0115e.f1276e;
                    float f = 16;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), f);
                    float f2 = f;
                    C8587e ad2 = AbstractC6451e.ad(billing, C5438e.f11685e, c13770e4, 6);
                    C1718e c1718e2 = c1718e;
                    long j3 = c13770e4.f27286case;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e4.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e4, mopub);
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e4, advert3, c14865e2);
                    AbstractC8703e.premium(i6, c13770e4, c14865e3, c13770e4, c5430e);
                    AbstractC2270e.yandex(c13770e4, purchase3, c14865e4);
                    c13770e4.m3676strictfp(1613859822);
                    int size = audioSnippetEntry.billing.size();
                    final int i7 = 0;
                    while (true) {
                        final boolean z5 = this.f20432e;
                        C5170e c5170e = C2987e.ad;
                        if (i7 < size) {
                            if (1.0f <= 0.0d) {
                                AbstractC9534e.ad("invalid weight; must be greater than zero");
                            }
                            InterfaceC12864e license4 = AbstractC18007e.license(new C5228e(1.0f, true), 1);
                            long j4 = C3618e.appmetrica;
                            long vip = C3618e.vip(0.25f, j4);
                            float f3 = 0;
                            final C1718e c1718e3 = c1718e2;
                            boolean billing2 = c13770e4.billing(z5) | c13770e4.license(i7) | c13770e4.yandex(c1718e3) | c13770e4.purchase(interfaceC16132e);
                            Object m3681throw = c13770e4.m3681throw();
                            if (billing2 || m3681throw == c5170e) {
                                m3681throw = new Function0() { // from class: eُٓۖ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        float f4;
                                        C16330e c16330e = c1718e3.f4672e;
                                        if (z5) {
                                            int purchase4 = c16330e.purchase();
                                            int i8 = i7;
                                            if (i8 < purchase4) {
                                                f4 = 1.0f;
                                            } else if (i8 == c16330e.purchase()) {
                                                f4 = ((Number) interfaceC16132e.getValue()).floatValue();
                                            }
                                            return Float.valueOf(f4);
                                        }
                                        f4 = 0.0f;
                                        return Float.valueOf(f4);
                                    }
                                };
                                c13770e4.m3682throws(m3681throw);
                            }
                            Function0 function0 = (Function0) m3681throw;
                            Object m3681throw2 = c13770e4.m3681throw();
                            if (m3681throw2 == c5170e) {
                                m3681throw2 = new C17014e(0);
                                c13770e4.m3682throws(m3681throw2);
                            }
                            C13770e c13770e5 = c13770e4;
                            AbstractC6574e.vip(function0, license4, j4, vip, 1, f3, (Function1) m3681throw2, c13770e5, 1772928, 0);
                            c13770e4 = c13770e5;
                            i7++;
                            f2 = f2;
                            c1718e2 = c1718e3;
                        } else {
                            float f4 = f2;
                            final C1718e c1718e4 = c1718e2;
                            c13770e4.Signature(false);
                            c13770e4.Signature(true);
                            C14544e c14544e = C5438e.f11668e;
                            float f5 = 32;
                            C16005e c16005e = new C16005e(f5, f4, f5, f4);
                            float f6 = 0;
                            InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                            if (1.0f <= 0.0d) {
                                AbstractC9534e.ad("invalid weight; must be greater than zero");
                            }
                            C13770e c13770e6 = c13770e4;
                            AbstractC16279e.vip(c16349e, metrica.premium(new C5228e(1.0f, true)), c16005e, null, f6, c14544e, null, false, null, null, null, AbstractC16653e.license(444722787, new Function4() { // from class: eؔ۠ؖ
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    int intValue4 = ((Integer) obj10).intValue();
                                    int intValue5 = ((Integer) obj12).intValue();
                                    AudioTrack audioTrack2 = (AudioTrack) AudioSnippetEntry.this.billing.get(intValue4);
                                    C7913e c7913e2 = AbstractC18007e.metrica;
                                    c1718e4.m682private(audioTrack2, c16349e, intValue4, z5, c7913e2, (C13770e) obj11, ((intValue5 << 3) & 896) | 24576);
                                    return Unit.INSTANCE;
                                }
                            }, c13770e4), c13770e6, 1769472, 24576, 16280);
                            C13770e c13770e7 = c13770e6;
                            if (AbstractC7890e.billing(audioSnippetEntry.ad, "_playlist_mix")) {
                                z3 = false;
                                c13770e7.m3676strictfp(1866169278);
                            } else {
                                c13770e7.m3676strictfp(1881945674);
                                InterfaceC12864e metrica2 = AbstractC18007e.metrica(AbstractC12447e.vip(c0115e, ((C7019e) c13770e7.adcel(AbstractC11785e.ad)).metrica.metrica), 1.0f);
                                boolean yandex = c13770e7.yandex(audioSnippetEntry) | c13770e7.yandex(c1718e4);
                                Object m3681throw3 = c13770e7.m3681throw();
                                if (yandex || m3681throw3 == c5170e) {
                                    m3681throw3 = new Celse(audioSnippetEntry, c1718e4, 13);
                                    c13770e7.m3682throws(m3681throw3);
                                }
                                final int i8 = 0;
                                InterfaceC12864e license5 = AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw3, 15);
                                float f7 = AbstractC11992e.ad;
                                final int i9 = 1;
                                final int i10 = 2;
                                AbstractC16429e.ad(AbstractC16653e.license(1125930411, new Function2() { // from class: eؔۤۗ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj9, Object obj10) {
                                        switch (i8) {
                                            case 0:
                                                C13770e c13770e8 = (C13770e) obj9;
                                                int intValue4 = ((Integer) obj10).intValue();
                                                if (c13770e8.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                    AbstractC14489e.vip(audioSnippetEntry.vip, null, C3618e.appmetrica, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e8, 384, 24960, 241658);
                                                } else {
                                                    c13770e8.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                C13770e c13770e9 = (C13770e) obj9;
                                                int intValue5 = ((Integer) obj10).intValue();
                                                if (c13770e9.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                    AbstractC14489e.vip(audioSnippetEntry.metrica, null, C3618e.vip(0.75f, C3618e.appmetrica), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e9, 384, 24960, 241658);
                                                } else {
                                                    c13770e9.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                C13770e c13770e10 = (C13770e) obj9;
                                                int intValue6 = ((Integer) obj10).intValue();
                                                if (c13770e10.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                    String str3 = audioSnippetEntry.appmetrica;
                                                    C15492e c15492e2 = AbstractC11785e.ad;
                                                    AbstractC8461e.vip(str3, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 38), ((C7019e) c13770e10.adcel(c15492e2)).metrica.metrica), new C6159e(((C7019e) c13770e10.adcel(c15492e2)).ad.Signature), new C6159e(((C7019e) c13770e10.adcel(c15492e2)).ad.Signature), null, c13770e10, 36912, 0, 32736);
                                                } else {
                                                    c13770e10.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }, c13770e7), license5, null, AbstractC16653e.license(1093334024, new Function2() { // from class: eؔۤۗ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj9, Object obj10) {
                                        switch (i9) {
                                            case 0:
                                                C13770e c13770e8 = (C13770e) obj9;
                                                int intValue4 = ((Integer) obj10).intValue();
                                                if (c13770e8.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                    AbstractC14489e.vip(audioSnippetEntry.vip, null, C3618e.appmetrica, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e8, 384, 24960, 241658);
                                                } else {
                                                    c13770e8.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                C13770e c13770e9 = (C13770e) obj9;
                                                int intValue5 = ((Integer) obj10).intValue();
                                                if (c13770e9.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                    AbstractC14489e.vip(audioSnippetEntry.metrica, null, C3618e.vip(0.75f, C3618e.appmetrica), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e9, 384, 24960, 241658);
                                                } else {
                                                    c13770e9.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                C13770e c13770e10 = (C13770e) obj9;
                                                int intValue6 = ((Integer) obj10).intValue();
                                                if (c13770e10.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                    String str3 = audioSnippetEntry.appmetrica;
                                                    C15492e c15492e2 = AbstractC11785e.ad;
                                                    AbstractC8461e.vip(str3, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 38), ((C7019e) c13770e10.adcel(c15492e2)).metrica.metrica), new C6159e(((C7019e) c13770e10.adcel(c15492e2)).ad.Signature), new C6159e(((C7019e) c13770e10.adcel(c15492e2)).ad.Signature), null, c13770e10, 36912, 0, 32736);
                                                } else {
                                                    c13770e10.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }, c13770e7), AbstractC16653e.license(-1780842969, new Function2() { // from class: eؔۤۗ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj9, Object obj10) {
                                        switch (i10) {
                                            case 0:
                                                C13770e c13770e8 = (C13770e) obj9;
                                                int intValue4 = ((Integer) obj10).intValue();
                                                if (c13770e8.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                    AbstractC14489e.vip(audioSnippetEntry.vip, null, C3618e.appmetrica, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e8, 384, 24960, 241658);
                                                } else {
                                                    c13770e8.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                C13770e c13770e9 = (C13770e) obj9;
                                                int intValue5 = ((Integer) obj10).intValue();
                                                if (c13770e9.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                    AbstractC14489e.vip(audioSnippetEntry.metrica, null, C3618e.vip(0.75f, C3618e.appmetrica), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e9, 384, 24960, 241658);
                                                } else {
                                                    c13770e9.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                C13770e c13770e10 = (C13770e) obj9;
                                                int intValue6 = ((Integer) obj10).intValue();
                                                if (c13770e10.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                    String str3 = audioSnippetEntry.appmetrica;
                                                    C15492e c15492e2 = AbstractC11785e.ad;
                                                    AbstractC8461e.vip(str3, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 38), ((C7019e) c13770e10.adcel(c15492e2)).metrica.metrica), new C6159e(((C7019e) c13770e10.adcel(c15492e2)).ad.Signature), new C6159e(((C7019e) c13770e10.adcel(c15492e2)).ad.Signature), null, c13770e10, 36912, 0, 32736);
                                                } else {
                                                    c13770e10.m3659default();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }, c13770e7), AbstractC8913e.purchase, AbstractC11992e.ad(C3618e.vip(0.25f, C3618e.appmetrica), 0L, 0L, 0L, c13770e7, 510), 0.0f, 0.0f, c13770e7, 224262, 388);
                                c13770e7 = c13770e7;
                                z3 = false;
                            }
                            c13770e7.Signature(z3);
                            c13770e7.Signature(true);
                            c13770e7.Signature(true);
                        }
                    }
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
