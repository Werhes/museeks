package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11961e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f23936e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23937e;

    public /* synthetic */ C11961e(AudioTrack audioTrack, int i) {
        this.f23937e = i;
        this.f23936e = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23937e) {
            case 0:
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    AudioTrack audioTrack = this.f23936e;
                    AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(-1951534486, new C9422e(audioTrack, 1), c13770e), AbstractC16653e.license(-2087561783, new C9422e(audioTrack, 2), c13770e), c13770e, (intValue & 14) | 432);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    AudioTrack audioTrack2 = this.f23936e;
                    if (audioTrack2.billing) {
                        c13770e2.m3676strictfp(-187309066);
                        AbstractC1328e.vip(null, 0L, c13770e2, 0, 3);
                    } else {
                        c13770e2.m3676strictfp(-214639658);
                    }
                    c13770e2.Signature(false);
                    AbstractC1328e.ad(audioTrack2.appmetrica, false, 0L, c13770e2, 0, 6);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    PodcastInfo podcastInfo = this.f23936e.isPro;
                    String str = podcastInfo != null ? podcastInfo.license : null;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    AbstractC14489e.vip(str, AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), ((C7019e) c13770e3.adcel(AbstractC11785e.ad)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 48, 0, 262136);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
