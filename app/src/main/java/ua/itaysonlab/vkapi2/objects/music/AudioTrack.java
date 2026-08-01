package ua.itaysonlab.vkapi2.objects.music;

import android.net.Uri;
import defpackage.AbstractC16049e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC18039e;
import defpackage.AbstractC1815e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC6914e;
import defpackage.AbstractC7890e;
import defpackage.C11794e;
import defpackage.C11956e;
import defpackage.C12908e;
import defpackage.C1349e;
import defpackage.C13575e;
import defpackage.C14027e;
import defpackage.C17058e;
import defpackage.C2193e;
import defpackage.C4721e;
import defpackage.C5363e;
import defpackage.InterfaceC10136e;
import defpackage.InterfaceC11810e;
import defpackage.InterfaceC14424e;
import defpackage.InterfaceC14744e;
import defpackage.InterfaceC14776e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC16260e;
import defpackage.InterfaceC3477e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC4269e;
import defpackage.InterfaceC5083e;
import defpackage.InterfaceC5413e;
import defpackage.InterfaceC7685e;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;
import com.werhes.museeks.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00042\u00020\t2\u00020\n:\u0003\u0019\u001a\u001bR*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010¨\u0006\u001c"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioTrack;", "Leؙٖۛ;", "Leِٙؕ;", "Leُٕؓ;", BuildConfig.FLAVOR, "Leُٟؖ;", "Leًَ;", "Leٖٗؑ;", "Leّٔ٘;", "Leؘٔؐ;", "Leٖٔؔ;", BuildConfig.FLAVOR, "value", "adcel", "()Z", "metrica", "(Z)V", "getLiked$annotations", "()V", "liked", "billing", "startapp", "getDisliked$annotations", "disliked", "Companion", "eِؚۙ", "eؙْٙ", "eٗٗۗ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioTrack extends AbstractC16049e implements InterfaceC11810e, InterfaceC15377e, InterfaceC4269e, InterfaceC10136e, InterfaceC16260e, InterfaceC14776e, InterfaceC14424e, InterfaceC14744e {
    public static final C17058e Companion = new Object();

    /* renamed from: while, reason: not valid java name */
    public static final InterfaceC3477e[] f36492while = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C1349e(15)), AbstractC18039e.appmetrica(2, new C1349e(16)), null, null, null, null, null, null, null, null, null, null, null, null};
    public final List Signature;
    public final String ad;
    public final String adcel;
    public final List admob;
    public final int ads;
    public final Integer advert;
    public final AudioAlbum amazon;
    public final AudioChartInfo applovin;
    public final int appmetrica;
    public final boolean billing;

    /* renamed from: class, reason: not valid java name */
    public final transient boolean f36493class;
    public transient boolean crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public final C5363e f36494extends;
    public final transient boolean firebase;

    /* renamed from: goto, reason: not valid java name */
    public final transient boolean f36495goto;
    public boolean inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final transient boolean f36496interface;
    public final PodcastInfo isPro;
    public final boolean isVip;
    public final String license;
    public final Integer loadAd;
    public final long metrica;
    public final long mopub;

    /* renamed from: native, reason: not valid java name */
    public final transient C11956e f36497native;
    public final String premium;
    public final Integer pro;
    public final String purchase;
    public final Integer remoteconfig;
    public final boolean signatures;
    public final int smaato;
    public final String startapp;
    public Boolean subs;
    public final String subscription;
    public final boolean tapsense;

    /* renamed from: this, reason: not valid java name */
    public final transient boolean f36498this;

    /* renamed from: throw, reason: not valid java name */
    public final C5363e f36499throw;
    public final int vip;
    public final boolean yandex;

    public AudioTrack(int i, String str, int i2, long j, String str2, int i3, String str3, boolean z, boolean z2, String str4, String str5, long j2, Integer num, int i4, AudioAlbum audioAlbum, Integer num2, List list, List list2, String str6, Integer num3, Integer num4, boolean z3, boolean z4, boolean z5, boolean z6, PodcastInfo podcastInfo, AudioChartInfo audioChartInfo, int i5, String str7, Boolean bool) {
        if ((i & 1) == 0) {
            this.ad = BuildConfig.FLAVOR;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = 0;
        } else {
            this.vip = i2;
        }
        if ((i & 4) == 0) {
            this.metrica = 0L;
        } else {
            this.metrica = j;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = 0;
        } else {
            this.appmetrica = i3;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str3;
        }
        if ((i & 64) == 0) {
            this.billing = false;
        } else {
            this.billing = z;
        }
        if ((i & 128) == 0) {
            this.yandex = false;
        } else {
            this.yandex = z2;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = BuildConfig.FLAVOR;
        } else {
            this.startapp = str4;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = BuildConfig.FLAVOR;
        } else {
            this.adcel = str5;
        }
        if ((i & 1024) == 0) {
            this.mopub = 0L;
        } else {
            this.mopub = j2;
        }
        if ((i & 2048) == 0) {
            this.advert = null;
        } else {
            this.advert = num;
        }
        if ((i & 4096) == 0) {
            this.smaato = 0;
        } else {
            this.smaato = i4;
        }
        if ((i & 8192) == 0) {
            this.amazon = null;
        } else {
            this.amazon = audioAlbum;
        }
        if ((i & 16384) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = num2;
        }
        if ((32768 & i) == 0) {
            this.Signature = null;
        } else {
            this.Signature = list;
        }
        if ((65536 & i) == 0) {
            this.admob = null;
        } else {
            this.admob = list2;
        }
        if ((131072 & i) == 0) {
            this.subscription = null;
        } else {
            this.subscription = str6;
        }
        if ((262144 & i) == 0) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = num3;
        }
        if ((524288 & i) == 0) {
            this.pro = null;
        } else {
            this.pro = num4;
        }
        if ((1048576 & i) == 0) {
            this.signatures = false;
        } else {
            this.signatures = z3;
        }
        if ((2097152 & i) == 0) {
            this.tapsense = false;
        } else {
            this.tapsense = z4;
        }
        if ((4194304 & i) == 0) {
            this.isVip = false;
        } else {
            this.isVip = z5;
        }
        if ((8388608 & i) == 0) {
            this.inmobi = false;
        } else {
            this.inmobi = z6;
        }
        if ((16777216 & i) == 0) {
            this.isPro = null;
        } else {
            this.isPro = podcastInfo;
        }
        if ((33554432 & i) == 0) {
            this.applovin = null;
        } else {
            this.applovin = audioChartInfo;
        }
        if ((67108864 & i) == 0) {
            this.ads = 0;
        } else {
            this.ads = i5;
        }
        if ((134217728 & i) == 0) {
            this.premium = null;
        } else {
            this.premium = str7;
        }
        if ((i & 268435456) == 0) {
            this.subs = null;
        } else {
            this.subs = bool;
        }
        this.crashlytics = false;
        this.firebase = false;
        this.f36493class = false;
        this.f36496interface = false;
        this.f36495goto = false;
        this.f36498this = false;
        int i6 = this.vip;
        long j3 = this.metrica;
        C14027e.ad.getClass();
        this.f36497native = new C11956e(i6, j3, j3 == C14027e.metrica());
        this.f36494extends = new C5363e(new C12908e(this, 2));
        this.f36499throw = new C5363e(new C12908e(this, 3));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AudioTrack(java.lang.String r37, int r38, long r39, java.lang.String r41, int r42, java.lang.String r43, boolean r44, boolean r45, java.lang.String r46, java.lang.String r47, long r48, java.lang.Integer r50, int r51, ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum r52, java.lang.Integer r53, java.util.List r54, java.util.List r55, java.lang.String r56, java.lang.Integer r57, java.lang.Integer r58, boolean r59, boolean r60, boolean r61, boolean r62, ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo r63, ua.itaysonlab.vkapi2.objects.music.AudioChartInfo r64, int r65, java.lang.String r66, java.lang.Boolean r67, boolean r68, boolean r69, boolean r70, boolean r71, boolean r72, int r73, int r74) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkapi2.objects.music.AudioTrack.<init>(java.lang.String, int, long, java.lang.String, int, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, long, java.lang.Integer, int, ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum, java.lang.Integer, java.util.List, java.util.List, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, boolean, boolean, boolean, ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo, ua.itaysonlab.vkapi2.objects.music.AudioChartInfo, int, java.lang.String, java.lang.Boolean, boolean, boolean, boolean, boolean, boolean, int, int):void");
    }

    public AudioTrack(String str, int i, long j, String str2, int i2, String str3, boolean z, boolean z2, String str4, String str5, long j2, Integer num, int i3, AudioAlbum audioAlbum, Integer num2, List list, List list2, String str6, Integer num3, Integer num4, boolean z3, boolean z4, boolean z5, boolean z6, PodcastInfo podcastInfo, AudioChartInfo audioChartInfo, int i4, String str7, Boolean bool, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.ad = str;
        this.vip = i;
        this.metrica = j;
        this.license = str2;
        this.appmetrica = i2;
        this.purchase = str3;
        this.billing = z;
        this.yandex = z2;
        this.startapp = str4;
        this.adcel = str5;
        this.mopub = j2;
        this.advert = num;
        this.smaato = i3;
        this.amazon = audioAlbum;
        this.loadAd = num2;
        this.Signature = list;
        this.admob = list2;
        this.subscription = str6;
        this.remoteconfig = num3;
        this.pro = num4;
        this.signatures = z3;
        this.tapsense = z4;
        this.isVip = z5;
        this.inmobi = z6;
        this.isPro = podcastInfo;
        this.applovin = audioChartInfo;
        this.ads = i4;
        this.premium = str7;
        this.subs = bool;
        this.crashlytics = z7;
        this.firebase = z8;
        this.f36493class = z9;
        this.f36496interface = z10;
        this.f36495goto = z11;
        this.f36498this = z12;
        C14027e.ad.getClass();
        this.f36497native = new C11956e(i, j, j == C14027e.metrica());
        this.f36494extends = new C5363e(new C12908e(this, 0));
        this.f36499throw = new C5363e(new C12908e(this, 1));
    }

    @InterfaceC7685e(ignore = true)
    public static /* synthetic */ void getDisliked$annotations() {
    }

    @InterfaceC7685e(ignore = true)
    public static /* synthetic */ void getLiked$annotations() {
    }

    public static AudioTrack signatures(AudioTrack audioTrack, String str, AudioAlbum audioAlbum, List list, List list2, int i, int i2, int i3) {
        Integer num;
        List list3;
        AudioChartInfo audioChartInfo;
        int i4;
        boolean z;
        boolean z2;
        String str2 = audioTrack.ad;
        int i5 = audioTrack.vip;
        long j = audioTrack.metrica;
        String str3 = audioTrack.license;
        int i6 = audioTrack.appmetrica;
        String str4 = audioTrack.purchase;
        boolean z3 = audioTrack.billing;
        boolean z4 = audioTrack.yandex;
        String str5 = audioTrack.startapp;
        String str6 = (i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? audioTrack.adcel : str;
        long j2 = audioTrack.mopub;
        String str7 = str6;
        Integer num2 = audioTrack.advert;
        int i7 = audioTrack.smaato;
        AudioAlbum audioAlbum2 = (i2 & 8192) != 0 ? audioTrack.amazon : audioAlbum;
        Integer num3 = audioTrack.loadAd;
        if ((i2 & 32768) != 0) {
            num = num3;
            list3 = audioTrack.Signature;
        } else {
            num = num3;
            list3 = list;
        }
        List list4 = list3;
        List list5 = (i2 & 65536) != 0 ? audioTrack.admob : list2;
        String str8 = audioTrack.subscription;
        Integer num4 = audioTrack.remoteconfig;
        Integer num5 = audioTrack.pro;
        boolean z5 = audioTrack.signatures;
        boolean z6 = audioTrack.tapsense;
        boolean z7 = audioTrack.isVip;
        boolean z8 = audioTrack.inmobi;
        PodcastInfo podcastInfo = audioTrack.isPro;
        AudioChartInfo audioChartInfo2 = audioTrack.applovin;
        if ((i2 & 67108864) != 0) {
            audioChartInfo = audioChartInfo2;
            i4 = audioTrack.ads;
        } else {
            audioChartInfo = audioChartInfo2;
            i4 = i;
        }
        String str9 = audioTrack.premium;
        Boolean bool = audioTrack.subs;
        boolean z9 = audioTrack.crashlytics;
        boolean z10 = audioTrack.firebase;
        boolean z11 = audioTrack.f36493class;
        boolean z12 = audioTrack.f36496interface;
        boolean z13 = audioTrack.f36495goto;
        if ((i3 & 4) != 0) {
            z = z13;
            z2 = audioTrack.f36498this;
        } else {
            z = z13;
            z2 = true;
        }
        boolean z14 = z2;
        audioTrack.getClass();
        return new AudioTrack(str2, i5, j, str3, i6, str4, z3, z4, str5, str7, j2, num2, i7, audioAlbum2, num, list4, list5, str8, num4, num5, z5, z6, z7, z8, podcastInfo, audioChartInfo, i4, str9, bool, z9, z10, z11, z12, z, z14);
    }

    @Override // defpackage.AbstractC16049e
    public final String Signature() {
        return AbstractC6914e.billing(this);
    }

    @Override // defpackage.InterfaceC14776e
    public final boolean ad() {
        return AbstractC6914e.appmetrica(this);
    }

    @Override // defpackage.InterfaceC10136e
    /* renamed from: adcel */
    public final boolean getAdvert() {
        if (AbstractC7890e.billing(this.subs, Boolean.TRUE)) {
            return true;
        }
        long j = this.f36497native.vip;
        C14027e.ad.getClass();
        return j == C14027e.metrica();
    }

    @Override // defpackage.AbstractC16049e
    public final C4721e admob() {
        return new C4721e("vk", AbstractC6914e.purchase(this), !this.f36498this ? this.adcel : null);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: advert, reason: from getter */
    public final String getMetrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC16049e
    public final int amazon() {
        return this.appmetrica * 1000;
    }

    @Override // defpackage.InterfaceC11810e
    public final int appmetrica() {
        return this.isPro != null ? 2 : 1;
    }

    @Override // defpackage.InterfaceC16260e
    /* renamed from: billing, reason: from getter */
    public final boolean getSmaato() {
        return this.inmobi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AudioTrack.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AudioTrack audioTrack = (AudioTrack) obj;
        return this.vip == audioTrack.vip && this.metrica == audioTrack.metrica;
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getVip() {
        return AbstractC6914e.billing(this);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.vip), Long.valueOf(this.metrica));
    }

    public final boolean isVip() {
        return ((Boolean) this.f36494extends.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC14744e
    public final boolean license() {
        return isVip();
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: loadAd */
    public final String getAd() {
        return AbstractC6914e.purchase(this);
    }

    @Override // defpackage.InterfaceC10136e
    public final void metrica(boolean z) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        InterfaceC5083e interfaceC5083e = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC5336e.purchase(vKXApplication, null, 0, new C13575e(this, z, interfaceC5083e, 1), 3);
    }

    @Override // defpackage.AbstractC16049e
    public final String mopub() {
        AudioAlbum audioAlbum = this.amazon;
        if (audioAlbum != null) {
            return audioAlbum.license;
        }
        return null;
    }

    @Override // defpackage.AbstractC16049e
    public final String pro() {
        return (String) this.f36499throw.getValue();
    }

    @Override // defpackage.InterfaceC11810e
    public final boolean purchase() {
        return appmetrica() == 3;
    }

    @Override // defpackage.AbstractC16049e
    public final String remoteconfig() {
        return "vk";
    }

    @Override // defpackage.AbstractC16049e
    public final String smaato() {
        Uri parse;
        C11794e.f23667e.getClass();
        if (isVip()) {
            parse = C11794e.yandex(this);
        } else {
            String ad = AbstractC6914e.ad(this);
            parse = ad == null ? null : Uri.parse(ad);
        }
        String uri = parse != null ? parse.toString() : null;
        if (uri == null || uri.length() == 0 || uri.equals("null")) {
            return null;
        }
        return uri;
    }

    @Override // defpackage.InterfaceC16260e
    public final void startapp(boolean z) {
        this.inmobi = z;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC5336e.purchase(vKXApplication, null, 0, new C2193e(z, this, (InterfaceC5083e) null), 3);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: subscription, reason: from getter */
    public final String getVip() {
        return this.license;
    }

    public final String tapsense() {
        String str = this.subscription;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String toString() {
        return "VKAudioTrack(title=" + this.license + ", artist=" + this.ad + ", id=" + AbstractC6914e.purchase(this) + ')';
    }

    @Override // defpackage.InterfaceC11810e
    public final boolean vip() {
        return AbstractC1786e.appmetrica(this);
    }

    @Override // defpackage.InterfaceC4269e
    /* renamed from: yandex, reason: from getter */
    public final boolean getLoadAd() {
        return this.billing;
    }
}
