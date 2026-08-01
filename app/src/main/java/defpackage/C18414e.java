package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18414e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16904e f36100e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36101e;

    public /* synthetic */ C18414e(AbstractC16904e abstractC16904e, int i) {
        this.f36101e = i;
        this.f36100e = abstractC16904e;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int advert;
        switch (this.f36101e) {
            case 0:
                advert = this.f36100e.advert();
                return Integer.valueOf(advert);
            case 1:
                advert = this.f36100e.advert();
                return Integer.valueOf(advert);
            case 2:
                advert = this.f36100e.loadAd();
                return Integer.valueOf(advert);
            case 3:
                AbstractC16904e abstractC16904e = this.f36100e;
                return Integer.valueOf(abstractC16904e.mopub.ad() ? abstractC16904e.subscription.purchase() : ((C16330e) abstractC16904e.license.f17056e).purchase());
            case 4:
                AbstractC16904e abstractC16904e2 = this.f36100e;
                C16330e c16330e = abstractC16904e2.admob;
                boolean ad = abstractC16904e2.mopub.ad();
                C8331e c8331e = abstractC16904e2.license;
                advert = abstractC16904e2.adcel(!ad ? ((C16330e) c8331e.f17056e).purchase() : c16330e.purchase() != -1 ? c16330e.purchase() : Math.abs(((C2616e) c8331e.f17053e).purchase()) >= Math.abs(Math.min(abstractC16904e2.amazon.mo497instanceof(AbstractC1742e.ad), ((float) abstractC16904e2.smaato()) / 2.0f) / ((float) abstractC16904e2.smaato())) ? ((Boolean) abstractC16904e2.firebase.getValue()).booleanValue() ? abstractC16904e2.appmetrica + 1 : abstractC16904e2.appmetrica : ((C16330e) c8331e.f17056e).purchase());
                return Integer.valueOf(advert);
            default:
                advert = this.f36100e.advert();
                return Integer.valueOf(advert);
        }
    }
}
