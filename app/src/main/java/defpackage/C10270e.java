package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10270e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16049e f20290e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20291e;

    public /* synthetic */ C10270e(AbstractC16049e abstractC16049e, int i) {
        this.f20291e = i;
        this.f20290e = abstractC16049e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ?? r15;
        C13770e c13770e;
        switch (this.f20291e) {
            case 0:
                C13770e c13770e2 = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(this.f20290e.getVip(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e2, 0, 24960, 241662);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e3 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(this.f20290e.getMetrica(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e3, 0, 24960, 241662);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e4 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e4, 48);
                    long j = c13770e4.f27286case;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e4.advert();
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e4, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e4, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase, C2721e.license);
                    AbstractC16049e abstractC16049e = this.f20290e;
                    AbstractC14489e.vip(abstractC16049e.getVip(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e4, 0, 24960, 241662);
                    C13770e c13770e5 = c13770e4;
                    if (abstractC16049e instanceof InterfaceC14424e) {
                        AudioTrack audioTrack = (AudioTrack) ((InterfaceC14424e) abstractC16049e);
                        if (audioTrack.tapsense().length() > 0) {
                            c13770e5.m3676strictfp(1060523749);
                            AbstractC12534e.ad(c13770e5, AbstractC18007e.smaato(c0115e, 4));
                            i = 1058114398;
                            AbstractC14489e.vip(audioTrack.tapsense(), null, ((C7019e) c13770e5.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e5, 0, 24960, 241658);
                            c13770e = c13770e5;
                            r15 = 0;
                            c13770e.Signature(r15);
                            if ((abstractC16049e instanceof InterfaceC4269e) || !((InterfaceC4269e) abstractC16049e).getLoadAd()) {
                                c13770e.m3676strictfp(i);
                            } else {
                                c13770e.m3676strictfp(1060930190);
                                AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_explicit_outline_20, r15, c13770e), null, null, 0L, c13770e, 56, 12);
                            }
                            c13770e.Signature(r15);
                            c13770e.Signature(true);
                        }
                    }
                    i = 1058114398;
                    r15 = 0;
                    c13770e5.m3676strictfp(1058114398);
                    c13770e = c13770e5;
                    c13770e.Signature(r15);
                    if (abstractC16049e instanceof InterfaceC4269e) {
                    }
                    c13770e.m3676strictfp(i);
                    c13770e.Signature(r15);
                    c13770e.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e6 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AbstractC14489e.vip(this.f20290e.getMetrica(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e6, 0, 0, 262142);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
