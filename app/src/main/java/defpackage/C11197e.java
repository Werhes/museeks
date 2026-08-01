package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11197e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16049e f22459e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f22460e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22461e;

    public /* synthetic */ C11197e(String str, AbstractC16049e abstractC16049e, int i) {
        this.f22461e = i;
        this.f22460e = str;
        this.f22459e = abstractC16049e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String metrica;
        UmaArtist umaArtist;
        MainArtist mainArtist;
        int i = this.f22461e;
        AbstractC16049e abstractC16049e = this.f22459e;
        String str = this.f22460e;
        switch (i) {
            case 0:
                C11787e c11787e = (C11787e) obj;
                c11787e.adcel.mo859e("app_id", "web-desktop-app-v1.0");
                c11787e.adcel.mo859e("format", "json");
                c11787e.adcel.mo859e("namespace", "lyrics_richsynched");
                c11787e.adcel.mo859e("subtitle_format", "mxm");
                c11787e.adcel.mo859e("usertoken", str);
                c11787e.adcel.mo859e("q_track", abstractC16049e.getVip());
                c11787e.adcel.mo859e("q_duration", String.valueOf(abstractC16049e.amazon() / 1000));
                C16722e c16722e = c11787e.adcel;
                if (abstractC16049e instanceof AudioTrack) {
                    AudioTrack audioTrack = (AudioTrack) abstractC16049e;
                    List list = audioTrack.Signature;
                    if (list == null || (mainArtist = (MainArtist) AbstractC13480e.m3604this(list)) == null || (metrica = mainArtist.metrica) == null) {
                        metrica = audioTrack.ad;
                    }
                } else if (abstractC16049e instanceof UmaTrack) {
                    UmaTrack umaTrack = (UmaTrack) abstractC16049e;
                    UmaArtist umaArtist2 = umaTrack.billing;
                    if (umaArtist2 == null || (metrica = umaArtist2.vip) == null) {
                        List list2 = umaTrack.yandex;
                        metrica = (list2 == null || (umaArtist = (UmaArtist) AbstractC13480e.m3604this(list2)) == null) ? umaTrack.metrica : umaArtist.vip;
                    }
                } else {
                    metrica = abstractC16049e.getMetrica();
                }
                c16722e.mo859e("q_artist", metrica);
                String mopub = abstractC16049e.mopub();
                if (mopub != null) {
                    c11787e.adcel.mo859e("q_album", mopub);
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    boolean purchase = c13770e.purchase(str);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        DecimalFormat decimalFormat = C5575e.ad;
                        m3681throw = AbstractC15920e.subs(abstractC16049e.amazon(), true);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC14489e.vip((String) m3681throw, null, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
