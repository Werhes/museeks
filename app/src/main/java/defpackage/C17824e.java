package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17824e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34926e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f34927e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34928e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f34929e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34930e = 1;

    public /* synthetic */ C17824e(int i, C14873e c14873e, AudioTrack audioTrack, boolean z) {
        this.f34928e = z;
        this.f34929e = c14873e;
        this.f34926e = audioTrack;
        this.f34927e = i;
    }

    public /* synthetic */ C17824e(C6943e c6943e, C11210e c11210e, boolean z, int i) {
        this.f34929e = c6943e;
        this.f34926e = c11210e;
        this.f34928e = z;
        this.f34927e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f34930e;
        int i2 = this.f34927e;
        Object obj4 = this.f34926e;
        Object obj5 = this.f34929e;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                C6943e c6943e = (C6943e) obj5;
                C11210e c11210e = (C11210e) obj4;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    float f = 16;
                    InterfaceC12864e smaato = AbstractC12220e.smaato(C0115e.f1276e, f, 0.0f, 2);
                    float f2 = 8;
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11668e, c13770e, 54);
                    long j = c13770e.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C16005e c16005e = new C16005e(f, f2, f, f2);
                    C16005e c16005e2 = AbstractC10244e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    C3134e ad2 = AbstractC10244e.ad(((C7019e) c13770e.adcel(c15492e)).ad.admob, ((C7019e) c13770e.adcel(c15492e)).ad.tapsense, 0L, 0L, c13770e, 12);
                    C3924e ad3 = AbstractC6549e.ad(f2);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean yandex = c13770e.yandex(c6943e) | c13770e.yandex(c11210e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C0709e(c6943e, c11210e);
                        c13770e.m3682throws(m3681throw);
                    }
                    float f3 = 1.0f;
                    AbstractC1513e.ad((Function0) m3681throw, c5228e, this.f34928e, ad3, ad2, null, null, c16005e, AbstractC9460e.appmetrica, c13770e, 817889280, 352);
                    C16005e c16005e3 = new C16005e(f, f2, f, f2);
                    C3134e ad4 = AbstractC10244e.ad(((C7019e) c13770e.adcel(c15492e)).ad.admob, ((C7019e) c13770e.adcel(c15492e)).ad.tapsense, 0L, 0L, c13770e, 12);
                    C3924e ad5 = AbstractC6549e.ad(f2);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f3 = Float.MAX_VALUE;
                    }
                    C5228e c5228e2 = new C5228e(f3, true);
                    boolean yandex2 = c13770e.yandex(c11210e) | c13770e.yandex(c6943e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C0709e(c11210e, c6943e, r7 ? 1 : 0);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC1513e.ad((Function0) m3681throw2, c5228e2, false, ad5, ad4, null, null, c16005e3, AbstractC16653e.license(-246159382, new C3174e(c11210e, i2, 3), c13770e), c13770e, 817889280, 356);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C14873e c14873e = (C14873e) obj5;
                AudioTrack audioTrack = (AudioTrack) obj4;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean z = this.f34928e;
                    EnumC11342e enumC11342e = EnumC11342e.f22808e;
                    if (z) {
                        c13770e2.m3676strictfp(522544223);
                        boolean z2 = c14873e.m4167private() == enumC11342e;
                        AbstractC16049e m4166package = c14873e.m4166package();
                        AbstractC8230e.vip(i2, 0, c13770e2, z2, AbstractC7890e.billing(m4166package != null ? m4166package.Signature() : null, AbstractC6914e.billing(audioTrack)));
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(522864825);
                        r7 = c14873e.m4167private() == enumC11342e;
                        AbstractC16049e m4166package2 = c14873e.m4166package();
                        AbstractC8230e.ad(r7, AbstractC7890e.billing(m4166package2 != null ? m4166package2.Signature() : null, AbstractC6914e.billing(audioTrack)), AbstractC16653e.license(-541952423, new C9422e(audioTrack, objArr == true ? 1 : 0), c13770e2), c13770e2, 384);
                        c13770e2.Signature(false);
                    }
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
