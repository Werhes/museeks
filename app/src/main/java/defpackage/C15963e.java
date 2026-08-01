package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15963e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13182e f31476e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31477e;

    public /* synthetic */ C15963e(C13182e c13182e, int i) {
        this.f31477e = i;
        this.f31476e = c13182e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C5442e c5442e;
        switch (this.f31477e) {
            case 0:
                C13182e c13182e = this.f31476e;
                InterfaceC8346e<AudioTrack> applovin = c13182e.applovin();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(applovin, 10));
                for (AudioTrack audioTrack : applovin) {
                    audioTrack.getClass();
                    String billing = AbstractC6914e.billing(audioTrack);
                    int i = audioTrack.vip;
                    long j = audioTrack.metrica;
                    String str = audioTrack.license;
                    String str2 = audioTrack.ad;
                    AudioAlbum audioAlbum = audioTrack.amazon;
                    if (audioAlbum != null) {
                        Integer num = audioAlbum.ad;
                        int intValue = num != null ? num.intValue() : 0;
                        Long l = audioAlbum.vip;
                        long longValue = l != null ? l.longValue() : 0L;
                        String str3 = audioAlbum.metrica;
                        if (str3 == null) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        String str4 = str3;
                        String str5 = audioAlbum.license;
                        AlbumThumb albumThumb = audioAlbum.appmetrica;
                        c5442e = new C5442e(intValue, str5, longValue, str4, new C18236e(albumThumb != null ? albumThumb.ad : null, albumThumb != null ? albumThumb.vip : null, albumThumb != null ? albumThumb.metrica : null, albumThumb != null ? albumThumb.license : null, albumThumb != null ? albumThumb.appmetrica : null));
                    } else {
                        c5442e = null;
                    }
                    arrayList.add(new C11973e(billing, new C18422e(str2, i, j, str, c5442e)));
                }
                new C12979e(arrayList, new C11770e(c13182e, 2)).signatures(c13182e.f10582e);
                return Unit.INSTANCE;
            case 1:
                C13182e c13182e2 = this.f31476e;
                AbstractC16519e.vip((AppActivity) c13182e2.f10582e, new C1261e(c13182e2, null));
                return Unit.INSTANCE;
            case 2:
                C13182e c13182e3 = this.f31476e;
                c13182e3.f26172e.setValue(Boolean.FALSE);
                c13182e3.purchase();
                return Unit.INSTANCE;
            case 3:
                this.f31476e.f26172e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                this.f31476e.purchase();
                return Unit.INSTANCE;
            case 5:
                C13182e c13182e4 = this.f31476e;
                c13182e4.f26182e.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                c13182e4.isPro();
                return Unit.INSTANCE;
            default:
                this.f31476e.f26172e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
