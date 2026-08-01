package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۧٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12908e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f25768e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25769e;

    public /* synthetic */ C12908e(AudioTrack audioTrack, int i) {
        this.f25769e = i;
        this.f25768e = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer num;
        switch (this.f25769e) {
            case 0:
                AudioTrack audioTrack = this.f25768e;
                return Boolean.valueOf(audioTrack.firebase ? true : C5107e.yandex(audioTrack));
            case 1:
                return AbstractC5304e.inmobi((CharSequence) AbstractC13480e.m3570break(AbstractC14385e.ad(this.f25768e.adcel).f13269e), ".mp3", false) ? "audio/mpeg" : "application/x-mpegURL";
            case 2:
                AudioTrack audioTrack2 = this.f25768e;
                return Boolean.valueOf(audioTrack2.firebase ? true : C5107e.yandex(audioTrack2));
            case 3:
                return AbstractC5304e.inmobi((CharSequence) AbstractC13480e.m3570break(AbstractC14385e.ad(this.f25768e.adcel).f13269e), ".mp3", false) ? "audio/mpeg" : "application/x-mpegURL";
            case 4:
                C8416e c8416e = C8416e.appmetrica;
                c8416e.getClass();
                c8416e.vip(new C1390e(this.f25768e));
                return Unit.INSTANCE;
            default:
                PodcastInfo podcastInfo = this.f25768e.isPro;
                return Float.valueOf(((podcastInfo == null || (num = podcastInfo.appmetrica) == null) ? 0 : num.intValue()) / r0.appmetrica);
        }
    }
}
