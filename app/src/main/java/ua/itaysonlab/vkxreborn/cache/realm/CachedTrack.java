package com.werhes.museeksreborn.cache.realm;

import defpackage.AbstractC0746e;
import defpackage.AbstractC10064e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC1414e;
import defpackage.AbstractC15792e;
import defpackage.AbstractC15871e;
import defpackage.AbstractC17861e;
import defpackage.AbstractC2863e;
import defpackage.AbstractC3422e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC4224e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC6026e;
import defpackage.AbstractC6762e;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7890e;
import defpackage.AbstractC8116e;
import defpackage.C0104e;
import defpackage.C0431e;
import defpackage.C0749e;
import defpackage.C10268e;
import defpackage.C10675e;
import defpackage.C1183e;
import defpackage.C11903e;
import defpackage.C11907e;
import defpackage.C11974e;
import defpackage.C12156e;
import defpackage.C12232e;
import defpackage.C1235e;
import defpackage.C12506e;
import defpackage.C12575e;
import defpackage.C13248e;
import defpackage.C13655e;
import defpackage.C13664e;
import defpackage.C14027e;
import defpackage.C14650e;
import defpackage.C1468e;
import defpackage.C14803e;
import defpackage.C15069e;
import defpackage.C15450e;
import defpackage.C15816e;
import defpackage.C16406e;
import defpackage.C16427e;
import defpackage.C16924e;
import defpackage.C17309e;
import defpackage.C17974e;
import defpackage.C18085e;
import defpackage.C18234e;
import defpackage.C1972e;
import defpackage.C2126e;
import defpackage.C2353e;
import defpackage.C2579e;
import defpackage.C2638e;
import defpackage.C3161e;
import defpackage.C3905e;
import defpackage.C3985e;
import defpackage.C5110e;
import defpackage.C5975e;
import defpackage.C6426e;
import defpackage.C6571e;
import defpackage.C7057e;
import defpackage.C7084e;
import defpackage.C7217e;
import defpackage.C7271e;
import defpackage.C7290e;
import defpackage.C7554e;
import defpackage.C7790e;
import defpackage.C8232e;
import defpackage.C9183e;
import defpackage.C9770e;
import defpackage.InterfaceC0662e;
import defpackage.InterfaceC10518e;
import defpackage.InterfaceC14287e;
import defpackage.InterfaceC15348e;
import defpackage.InterfaceC17101e;
import defpackage.InterfaceC17544e;
import defpackage.InterfaceC2334e;
import defpackage.InterfaceC3055e;
import defpackage.InterfaceC5045e;
import defpackage.InterfaceC7227e;
import defpackage.InterfaceC8614e;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrack;", "Le٘ؕۚ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedTrack implements InterfaceC17544e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public static final C15069e f36656e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public static final int f36657e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f36658e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public static final InterfaceC7227e f36659e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public static final Object f36660e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static final String f36661e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f36662e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f36663e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f36664e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f36665e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f36666e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public InterfaceC17101e f36667e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f36668e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public NewCachedPodcastInfo f36669e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final C9770e f36670e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public boolean f36671e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f36672e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public CachedAlbum f36673e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f36674e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f36675e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public boolean f36676e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f36677e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public String f36678e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public boolean f36679e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long f36680e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public String f36681e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public InterfaceC17101e f36682e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public CachedTrackLyrics f36683e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public C13655e f36684e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public boolean f36685e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public String f36686e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public final C9770e f36687e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f36688e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public String f36689e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f36690e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public String f36691e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f36692e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f36693e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f36694e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public String f36695e;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrack$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedTrack.f36661e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            C18234e c18234e = new C18234e("CachedTrack", "uid", 33L, 0L, AbstractC15871e.metrica(), 0);
            C16427e metrica = AbstractC6762e.metrica("artist", 3, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica2 = AbstractC6762e.metrica("title", 3, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica3 = AbstractC6762e.metrica("id", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica4 = AbstractC6762e.metrica("ownerId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica5 = AbstractC6762e.metrica("accessKey", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica6 = AbstractC6762e.metrica("isExplicit", 2, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica7 = AbstractC6762e.metrica("isFocusTrack", 2, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica8 = AbstractC6762e.metrica("isLicensed", 2, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica9 = AbstractC6762e.metrica("isHQ", 2, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica10 = AbstractC6762e.metrica("hasLyrics", 2, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica11 = AbstractC6762e.metrica("date", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica12 = AbstractC6762e.metrica("duration", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica13 = AbstractC6762e.metrica("genreId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica14 = AbstractC6762e.metrica("trackGenreId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica15 = AbstractC6762e.metrica("lyricsId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica16 = AbstractC6762e.metrica("contentRestriction", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C12232e c12232e = AbstractC3820e.ad;
            return new C11974e(c18234e, AbstractC6874e.startapp(metrica, metrica2, metrica3, metrica4, metrica5, metrica6, metrica7, metrica8, metrica9, metrica10, metrica11, metrica12, metrica13, metrica14, metrica15, metrica16, AbstractC6762e.metrica("album", 9, 1, c12232e.vip(CachedAlbum.class), BuildConfig.FLAVOR, true, false, false), AbstractC6762e.metrica("newPodcastInfo", 9, 1, c12232e.vip(NewCachedPodcastInfo.class), BuildConfig.FLAVOR, true, false, false), AbstractC6762e.metrica("trackCode", 3, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("subtitle", 3, 1, null, BuildConfig.FLAVOR, true, false, false), AbstractC6762e.metrica("mainArtists", 9, 2, c12232e.vip(CachedArtist.class), BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("featuredArtists", 9, 2, c12232e.vip(CachedArtist.class), BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("uid", 3, 1, null, BuildConfig.FLAVOR, true, true, false), AbstractC6762e.metrica("localizedSearchTitle", 3, 1, null, BuildConfig.FLAVOR, false, false, true), AbstractC6762e.metrica("localizedSearchArtist", 3, 1, null, BuildConfig.FLAVOR, false, false, true), AbstractC6762e.metrica("albumFullId", 3, 1, null, BuildConfig.FLAVOR, false, false, true), AbstractC6762e.metrica("isCachedAsMP3", 2, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("isAvailableOffline", 2, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("isLegacyCachedArtwork", 2, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("isArtworkSeparateFromAlbum", 2, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("lyrics", 9, 1, c12232e.vip(CachedTrackLyrics.class), BuildConfig.FLAVOR, true, false, false), AbstractC6762e.metrica("usedInPlaylists", 10, 2, c12232e.vip(CachedPlaylist.class), "audios", false, false, false), AbstractC6762e.metrica("usedInLibraries", 10, 2, c12232e.vip(CachedLibrary.class), "tracks", false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            return CachedTrack.f36656e;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedTrack.f36657e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedTrack.f36660e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedTrack();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedTrack.f36659e;
        }
    }

    static {
        C12156e c12156e = new C12156e(CachedTrack.class, "usedInPlaylists", "getUsedInPlaylists()Lio/realm/kotlin/query/RealmResults;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f36658e = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(CachedTrack.class, "usedInLibraries", "getUsedInLibraries()Lio/realm/kotlin/query/RealmResults;", 0, c12232e)};
        INSTANCE = new Companion(0);
        f36659e = c12232e.vip(CachedTrack.class);
        f36661e = "CachedTrack";
        C6571e c6571e = new C6571e("artist", new C6571e(c12232e.vip(String.class), C2126e.f5501e));
        C6571e c6571e2 = new C6571e("title", new C6571e(c12232e.vip(String.class), C14650e.f28889e));
        Class cls = Integer.TYPE;
        C6571e c6571e3 = new C6571e("id", new C6571e(c12232e.vip(cls), C9183e.f18359e));
        Class cls2 = Long.TYPE;
        C6571e c6571e4 = new C6571e("ownerId", new C6571e(c12232e.vip(cls2), C12506e.f25049e));
        C6571e c6571e5 = new C6571e("accessKey", new C6571e(c12232e.vip(String.class), C3161e.f7270e));
        Class cls3 = Boolean.TYPE;
        f36660e = AbstractC10064e.purchase(c6571e, c6571e2, c6571e3, c6571e4, c6571e5, new C6571e("isExplicit", new C6571e(c12232e.vip(cls3), C13248e.f26279e)), new C6571e("isFocusTrack", new C6571e(c12232e.vip(cls3), C7217e.f14739e)), new C6571e("isLicensed", new C6571e(c12232e.vip(cls3), C1972e.f5177e)), new C6571e("isHQ", new C6571e(c12232e.vip(cls3), C1183e.f3781e)), new C6571e("hasLyrics", new C6571e(c12232e.vip(cls3), C3985e.f8885e)), new C6571e("date", new C6571e(c12232e.vip(cls2), C7084e.f14541e)), new C6571e("duration", new C6571e(c12232e.vip(cls), C3905e.f8725e)), new C6571e("genreId", new C6571e(c12232e.vip(cls), C17309e.f33951e)), new C6571e("trackGenreId", new C6571e(c12232e.vip(cls), C6426e.f13313e)), new C6571e("lyricsId", new C6571e(c12232e.vip(cls), C5110e.f10977e)), new C6571e("contentRestriction", new C6571e(c12232e.vip(cls), C11903e.f23850e)), new C6571e("album", new C6571e(c12232e.vip(CachedAlbum.class), C7057e.f14487e)), new C6571e("newPodcastInfo", new C6571e(c12232e.vip(NewCachedPodcastInfo.class), C7790e.f15791e)), new C6571e("trackCode", new C6571e(c12232e.vip(String.class), C5975e.f12577e)), new C6571e("subtitle", new C6571e(c12232e.vip(String.class), C2579e.f6439e)), new C6571e("mainArtists", new C6571e(c12232e.vip(CachedArtist.class), C0104e.f1259e)), new C6571e("featuredArtists", new C6571e(c12232e.vip(CachedArtist.class), C7271e.f14870e)), new C6571e("uid", new C6571e(c12232e.vip(String.class), C10268e.f20289e)), new C6571e("localizedSearchTitle", new C6571e(c12232e.vip(String.class), C0749e.f3049e)), new C6571e("localizedSearchArtist", new C6571e(c12232e.vip(String.class), C8232e.f16713e)), new C6571e("albumFullId", new C6571e(c12232e.vip(String.class), C2638e.f6504e)), new C6571e("isCachedAsMP3", new C6571e(c12232e.vip(cls3), C1468e.f4308e)), new C6571e("isAvailableOffline", new C6571e(c12232e.vip(cls3), C7554e.f15382e)), new C6571e("isLegacyCachedArtwork", new C6571e(c12232e.vip(cls3), C11907e.f23851e)), new C6571e("isArtworkSeparateFromAlbum", new C6571e(c12232e.vip(cls3), C2353e.f5893e)), new C6571e("lyrics", new C6571e(c12232e.vip(CachedTrackLyrics.class), C16924e.f33151e)), new C6571e("usedInPlaylists", new C6571e(c12232e.vip(CachedPlaylist.class), C0431e.f2482e)), new C6571e("usedInLibraries", new C6571e(c12232e.vip(CachedLibrary.class), C15450e.f30536e)));
        f36656e = C15069e.f29833e;
        f36657e = 1;
    }

    public CachedTrack() {
        this.f36692e = BuildConfig.FLAVOR;
        this.f36672e = BuildConfig.FLAVOR;
        this.f36686e = BuildConfig.FLAVOR;
        this.f36667e = AbstractC8116e.license(new CachedArtist[0]);
        this.f36682e = AbstractC8116e.license(new CachedArtist[0]);
        this.f36689e = BuildConfig.FLAVOR;
        this.f36691e = BuildConfig.FLAVOR;
        this.f36681e = BuildConfig.FLAVOR;
        this.f36678e = BuildConfig.FLAVOR;
        C12232e c12232e = AbstractC3820e.ad;
        this.f36670e = new C9770e(3, c12232e.vip(CachedPlaylist.class));
        this.f36687e = new C9770e(3, c12232e.vip(CachedLibrary.class));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    public CachedTrack(AudioTrack audioTrack) {
        this();
        ArrayList arrayList;
        ArrayList arrayList2;
        NewCachedPodcastInfo newCachedPodcastInfo;
        MainArtist mainArtist;
        String str;
        List list = audioTrack.Signature;
        m4732private(audioTrack.vip);
        m4719else(audioTrack.metrica);
        StringBuilder sb = new StringBuilder();
        sb.append(pro());
        sb.append('_');
        sb.append(advert());
        m4745volatile(sb.toString());
        String str2 = audioTrack.ad;
        m4744try(str2);
        String str3 = audioTrack.license;
        m4742throws(str3);
        m4714case(audioTrack.appmetrica);
        m4720extends(audioTrack.purchase);
        m4715catch(audioTrack.billing);
        m4743transient(audioTrack.yandex);
        m4722finally(audioTrack.startapp);
        m4725implements(audioTrack.mopub);
        Integer num = audioTrack.advert;
        m4737super(num != null ? num.intValue() : 0);
        m4718default(audioTrack.smaato);
        Integer num2 = audioTrack.loadAd;
        m4739synchronized(num2 != null ? num2.intValue() : 0);
        m4738switch(audioTrack.subscription);
        Integer num3 = audioTrack.remoteconfig;
        m4717const(num3 != null ? num3.intValue() : 0);
        m4730new(audioTrack.signatures);
        m4736strictfp(audioTrack.isVip);
        m4721final(audioTrack.tapsense);
        AudioAlbum audioAlbum = audioTrack.amazon;
        if (audioAlbum != null) {
            Long l = audioAlbum.vip;
            Integer num4 = audioAlbum.ad;
            String str4 = audioAlbum.license;
            CachedAlbum cachedAlbum = new CachedAlbum();
            cachedAlbum.amazon(num4 != null ? num4.intValue() : 0L);
            cachedAlbum.remoteconfig(l != null ? l.longValue() : 0L);
            cachedAlbum.tapsense(audioAlbum.vip());
            cachedAlbum.mopub(audioAlbum.metrica);
            cachedAlbum.subscription(audioAlbum.purchase);
            cachedAlbum.signatures(str4);
            cachedAlbum.loadAd(str4.toLowerCase(Locale.ROOT));
            AlbumThumb albumThumb = audioAlbum.appmetrica;
            cachedAlbum.pro(albumThumb != null ? new CachedEmbeddedThumb(albumThumb) : null);
            m4741throw(cachedAlbum);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l);
            sb2.append('_');
            sb2.append(num4);
            m4746while(sb2.toString());
            CachedAlbum ad = ad();
            if (ad != null) {
                ad.advert((list == null || (mainArtist = (MainArtist) AbstractC13480e.m3604this(list)) == null || (str = mainArtist.metrica) == null) ? str2 : str);
            }
        }
        InterfaceC17101e subscription = subscription();
        if (list != null) {
            arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new CachedArtist((MainArtist) it.next()));
            }
        } else {
            arrayList = null;
        }
        ?? r2 = C13664e.f27089e;
        subscription.addAll(arrayList == null ? r2 : arrayList);
        InterfaceC17101e yandex = yandex();
        List list2 = audioTrack.admob;
        if (list2 != null) {
            arrayList2 = new ArrayList(AbstractC0746e.subscription(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new CachedArtist((MainArtist) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        yandex.addAll(arrayList2 != null ? arrayList2 : r2);
        PodcastInfo podcastInfo = audioTrack.isPro;
        if (podcastInfo != null) {
            newCachedPodcastInfo = new NewCachedPodcastInfo();
            newCachedPodcastInfo.yandex(podcastInfo.vip);
            Boolean bool = podcastInfo.metrica;
            newCachedPodcastInfo.billing(bool != null ? bool.booleanValue() : false);
            String str5 = podcastInfo.license;
            newCachedPodcastInfo.purchase(str5 == null ? BuildConfig.FLAVOR : str5);
            Integer num5 = podcastInfo.appmetrica;
            newCachedPodcastInfo.adcel(num5 != null ? num5.intValue() : 0);
        } else {
            newCachedPodcastInfo = null;
        }
        m4734return(newCachedPodcastInfo);
        Locale locale = Locale.ROOT;
        m4727instanceof(str3.toLowerCase(locale));
        m4726import(str2.toLowerCase(locale));
        m4713break(audioTrack.firebase);
        m4731package(audioTrack.f36493class);
        m4712abstract(audioTrack.f36496interface);
        m4733protected(audioTrack.f36495goto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: abstract, reason: not valid java name */
    public final void m4712abstract(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36679e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isCachedAsMP3").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    public final CachedAlbum ad() {
        InterfaceC10518e Signature;
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36673e;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("album").license;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            Signature = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.ad, realm_value_tVar2);
            Signature = AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar2), AbstractC3820e.ad.vip(CachedAlbum.class), c13655e.f27074e, c13655e.f27072e);
        }
        return (CachedAlbum) Signature;
    }

    public final int adcel() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36663e;
        }
        long j = c13655e.metrica("genreId").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        Long valueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null;
        return (valueOf != null ? Integer.valueOf((int) valueOf.longValue()) : null).intValue();
    }

    public final int advert() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36665e;
        }
        long j = c13655e.metrica("id").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        Long valueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null;
        return (valueOf != null ? Integer.valueOf((int) valueOf.longValue()) : null).intValue();
    }

    public final CachedTrackLyrics amazon() {
        InterfaceC10518e Signature;
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36683e;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("lyrics").license;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            Signature = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.ad, realm_value_tVar2);
            Signature = AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar2), AbstractC3820e.ad.vip(CachedTrackLyrics.class), c13655e.f27074e, c13655e.f27072e);
        }
        return (CachedTrackLyrics) Signature;
    }

    public final String applovin() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36689e;
        }
        long j = c13655e.metrica("uid").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
        return null;
    }

    public final int billing() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36664e;
        }
        long j = c13655e.metrica("duration").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        Long valueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null;
        return (valueOf != null ? Integer.valueOf((int) valueOf.longValue()) : null).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: break, reason: not valid java name */
    public final void m4713break(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36685e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isAvailableOffline").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: case, reason: not valid java name */
    public final void m4714case(int i) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36664e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("duration").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: catch, reason: not valid java name */
    public final void m4715catch(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36694e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isExplicit").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* renamed from: class, reason: not valid java name */
    public final boolean m4716class() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36694e;
        }
        long j = c13655e.metrica("isExplicit").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: const, reason: not valid java name */
    public final void m4717const(int i) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36668e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("trackGenreId").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    public final boolean crashlytics() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36685e;
        }
        long j = c13655e.metrica("isAvailableOffline").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: default, reason: not valid java name */
    public final void m4718default(int i) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36675e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("contentRestriction").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: else, reason: not valid java name */
    public final void m4719else(long j) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36688e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("ownerId").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j2, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
            if (C7290e.yandex(interfaceC14287e) && C7290e.startapp(this) == C7290e.startapp(interfaceC14287e)) {
                return AbstractC7890e.billing(AbstractC15792e.startapp(this), AbstractC15792e.startapp(interfaceC14287e));
            }
        }
        return false;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m4720extends(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36662e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("accessKey").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (str == null) {
            realm_value_t m4024try = yandex.m4024try();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, m4024try.ad, m4024try, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4015default = yandex.m4015default(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4015default.ad, m4015default, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: final, reason: not valid java name */
    public final void m4721final(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36693e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isFocusTrack").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* renamed from: finally, reason: not valid java name */
    public final void m4722finally(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36686e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("trackCode").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        realm_value_t m4015default = yandex.m4015default(str);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4015default.ad, m4015default, false);
        Unit unit = Unit.INSTANCE;
        yandex.m4020interface();
    }

    public final boolean firebase() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36679e;
        }
        long j = c13655e.metrica("isCachedAsMP3").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    /* renamed from: for, reason: not valid java name */
    public final String m4723for() {
        String applovin = applovin();
        return applovin == null ? BuildConfig.FLAVOR : applovin;
    }

    /* renamed from: goto, reason: not valid java name */
    public final boolean m4724goto() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36690e;
        }
        long j = c13655e.metrica("isHQ").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    public final int hashCode() {
        return C12575e.ads(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: implements, reason: not valid java name */
    public final void m4725implements(long j) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36680e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("date").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j2, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* renamed from: import, reason: not valid java name */
    public final void m4726import(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36681e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("localizedSearchArtist").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        realm_value_t m4015default = yandex.m4015default(str);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4015default.ad, m4015default, false);
        Unit unit = Unit.INSTANCE;
        yandex.m4020interface();
    }

    public final String inmobi() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36686e;
        }
        long j = c13655e.metrica("trackCode").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
        return null;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m4727instanceof(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36691e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("localizedSearchTitle").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        realm_value_t m4015default = yandex.m4015default(str);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4015default.ad, m4015default, false);
        Unit unit = Unit.INSTANCE;
        yandex.m4020interface();
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m4728interface() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36693e;
        }
        long j = c13655e.metrica("isFocusTrack").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    public final int isPro() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36668e;
        }
        long j = c13655e.metrica("trackGenreId").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        Long valueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null;
        return (valueOf != null ? Integer.valueOf((int) valueOf.longValue()) : null).intValue();
    }

    @Override // defpackage.InterfaceC10518e
    public final void isVip(C13655e c13655e) {
        this.f36684e = c13655e;
    }

    public final int license() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36675e;
        }
        long j = c13655e.metrica("contentRestriction").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        Long valueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null;
        return (valueOf != null ? Integer.valueOf((int) valueOf.longValue()) : null).intValue();
    }

    public final int loadAd() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36674e;
        }
        long j = c13655e.metrica("lyricsId").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        Long valueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null;
        return (valueOf != null ? Integer.valueOf((int) valueOf.longValue()) : null).intValue();
    }

    public final AudioTrack metrica() {
        long j;
        AudioAlbum audioAlbum;
        PodcastInfo podcastInfo;
        String str;
        C10675e startapp;
        int advert = advert();
        long pro = pro();
        String vip = vip();
        String tapsense = tapsense();
        int billing = billing();
        boolean m4716class = m4716class();
        boolean m4729native = m4729native();
        String inmobi = inmobi();
        long purchase = purchase();
        int adcel = adcel();
        int license = license();
        CachedAlbum ad = ad();
        if (ad != null) {
            j = purchase;
            Integer valueOf = Integer.valueOf((int) ad.metrica());
            Long valueOf2 = Long.valueOf(ad.purchase());
            String ad2 = ad.ad();
            String yandex = ad.yandex();
            CachedEmbeddedThumb billing2 = ad.billing();
            audioAlbum = new AudioAlbum(valueOf, valueOf2, ad2, yandex, billing2 != null ? billing2.ad() : null, ad.license(), true);
        } else {
            j = purchase;
            audioAlbum = null;
        }
        int loadAd = loadAd();
        InterfaceC17101e subscription = subscription();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(subscription, 10));
        Iterator<E> it = subscription.iterator();
        while (it.hasNext()) {
            arrayList.add(((CachedArtist) it.next()).ad());
        }
        InterfaceC17101e yandex2 = yandex();
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(yandex2, 10));
        Iterator<E> it2 = yandex2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CachedArtist) it2.next()).ad());
        }
        String signatures = signatures();
        int isPro = isPro();
        boolean m4724goto = m4724goto();
        NewCachedPodcastInfo remoteconfig = remoteconfig();
        if (remoteconfig != null) {
            adcel = adcel;
            vip = vip;
            podcastInfo = new PodcastInfo(new PodcastCover(C13664e.f27089e), remoteconfig.vip(), Boolean.valueOf(remoteconfig.license()), remoteconfig.ad(), Integer.valueOf(remoteconfig.metrica()));
        } else {
            podcastInfo = null;
        }
        long j2 = j;
        boolean mopub = mopub();
        boolean m4728interface = m4728interface();
        long pro2 = pro();
        C14027e.ad.getClass();
        int i = adcel;
        boolean z = pro2 == C14027e.metrica();
        boolean crashlytics = crashlytics();
        boolean m4740this = m4740this();
        boolean firebase = firebase();
        boolean subs = subs();
        if (firebase()) {
            String applovin = applovin();
            if (applovin == null) {
                applovin = BuildConfig.FLAVOR;
            }
            str = vip;
            startapp = AbstractC4224e.startapp(3, applovin);
        } else {
            str = vip;
            String applovin2 = applovin();
            if (applovin2 == null) {
                applovin2 = BuildConfig.FLAVOR;
            }
            startapp = AbstractC4224e.startapp(1, applovin2);
        }
        return new AudioTrack(str, advert, pro, tapsense, billing, null, m4716class, m4729native, inmobi, startapp.f21024e.remoteconfig(), j2, Integer.valueOf(i), license, audioAlbum, Integer.valueOf(loadAd), arrayList, arrayList2, signatures, Integer.valueOf(isPro), null, m4724goto, m4728interface, mopub, false, podcastInfo, null, 0, null, Boolean.valueOf(z), true, crashlytics, m4740this, firebase, subs, 243793920, 4);
    }

    public final boolean mopub() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36666e;
        }
        long j = c13655e.metrica("hasLyrics").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    /* renamed from: native, reason: not valid java name */
    public final boolean m4729native() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36677e;
        }
        long j = c13655e.metrica("isLicensed").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: new, reason: not valid java name */
    public final void m4730new(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36690e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isHQ").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: package, reason: not valid java name */
    public final void m4731package(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36676e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isLegacyCachedArtwork").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF36624e() {
        return this.f36684e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: private, reason: not valid java name */
    public final void m4732private(int i) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36665e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("id").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    public final long pro() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36688e;
        }
        long j = c13655e.metrica("ownerId").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: protected, reason: not valid java name */
    public final void m4733protected(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36671e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isArtworkSeparateFromAlbum").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    public final long purchase() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36680e;
        }
        long j = c13655e.metrica("date").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null).longValue();
    }

    public final NewCachedPodcastInfo remoteconfig() {
        InterfaceC10518e Signature;
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36669e;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("newPodcastInfo").license;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            Signature = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.ad, realm_value_tVar2);
            Signature = AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar2), AbstractC3820e.ad.vip(NewCachedPodcastInfo.class), c13655e.f27074e, c13655e.f27072e);
        }
        return (NewCachedPodcastInfo) Signature;
    }

    /* renamed from: return, reason: not valid java name */
    public final void m4734return(NewCachedPodcastInfo newCachedPodcastInfo) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36669e = newCachedPodcastInfo;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c13655e.ad();
        long j = c13655e.metrica("newPodcastInfo").license;
        if (newCachedPodcastInfo == null) {
            C15816e yandex = AbstractC1414e.yandex();
            C12575e.crashlytics(c13655e, j, yandex.m4024try());
            Unit unit = Unit.INSTANCE;
            yandex.m4020interface();
            return;
        }
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        C12575e.amazon(AbstractC15792e.subscription(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC3820e.ad.vip(newCachedPodcastInfo.getClass()), c13655e.f27074e, c13655e.f27072e), newCachedPodcastInfo, 2, linkedHashMap);
    }

    public final String signatures() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36695e;
        }
        long j = c13655e.metrica("subtitle").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
        return null;
    }

    /* renamed from: static, reason: not valid java name */
    public final void m4735static(CachedTrackLyrics cachedTrackLyrics) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36683e = cachedTrackLyrics;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c13655e.ad();
        long j = c13655e.metrica("lyrics").license;
        if (cachedTrackLyrics == null) {
            C15816e yandex = AbstractC1414e.yandex();
            C12575e.crashlytics(c13655e, j, yandex.m4024try());
            Unit unit = Unit.INSTANCE;
            yandex.m4020interface();
            return;
        }
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        C12575e.amazon(AbstractC15792e.subscription(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC3820e.ad.vip(cachedTrackLyrics.getClass()), c13655e.f27074e, c13655e.f27072e), cachedTrackLyrics, 2, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: strictfp, reason: not valid java name */
    public final void m4736strictfp(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36666e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("hasLyrics").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    public final boolean subs() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36671e;
        }
        long j = c13655e.metrica("isArtworkSeparateFromAlbum").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    public final InterfaceC17101e subscription() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36667e;
        }
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(CachedArtist.class);
        InterfaceC3055e ad = AbstractC2863e.ad(vip);
        int i = 2;
        if (ad != null) {
            i = ad.license() == 2 ? 4 : 3;
        } else if (!vip.equals(c12232e.vip(InterfaceC5045e.class))) {
            i = 1;
        }
        return C12575e.isVip(c13655e, c13655e.metrica("mainArtists"), vip, i, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: super, reason: not valid java name */
    public final void m4737super(int i) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36663e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("genreId").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m4738switch(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36695e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("subtitle").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (str == null) {
            realm_value_t m4024try = yandex.m4024try();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, m4024try.ad, m4024try, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4015default = yandex.m4015default(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4015default.ad, m4015default, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: synchronized, reason: not valid java name */
    public final void m4739synchronized(int i) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36674e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("lyricsId").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    public final String tapsense() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36672e;
        }
        long j = c13655e.metrica("title").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
        return null;
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m4740this() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36676e;
        }
        long j = c13655e.metrica("isLegacyCachedArtwork").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)) : null).booleanValue();
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m4741throw(CachedAlbum cachedAlbum) {
        InterfaceC2334e interfaceC2334e;
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36673e = cachedAlbum;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c13655e.ad();
        long j = c13655e.metrica("album").license;
        c13655e.ad();
        C17974e c17974e = c13655e.f27074e;
        InterfaceC15348e interfaceC15348e = c13655e.f27072e;
        if (cachedAlbum != null) {
            C13655e c13655e2 = cachedAlbum.f36570e;
            if (c13655e2 != null) {
                interfaceC2334e = cachedAlbum;
                if (!AbstractC7890e.billing(c13655e2.f27072e, interfaceC15348e)) {
                    throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                }
            } else {
                interfaceC2334e = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), cachedAlbum, 2, linkedHashMap);
            }
        } else {
            interfaceC2334e = null;
        }
        C13655e f36624e = interfaceC2334e != null ? ((InterfaceC10518e) interfaceC2334e).getF36624e() : null;
        C15816e c15816e = new C15816e(15);
        realm_value_t m4012break = c15816e.m4012break(f36624e);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4012break.ad, m4012break, false);
        Unit unit = Unit.INSTANCE;
        c15816e.m4020interface();
    }

    /* renamed from: throws, reason: not valid java name */
    public final void m4742throws(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36672e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("title").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        realm_value_t m4015default = yandex.m4015default(str);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4015default.ad, m4015default, false);
        Unit unit = Unit.INSTANCE;
        yandex.m4020interface();
    }

    public final String toString() {
        return C12575e.premium(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: transient, reason: not valid java name */
    public final void m4743transient(boolean z) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36677e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isLicensed").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t adcel = yandex.adcel(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, adcel.ad, adcel, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* renamed from: try, reason: not valid java name */
    public final void m4744try(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36692e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("artist").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        realm_value_t m4015default = yandex.m4015default(str);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4015default.ad, m4015default, false);
        Unit unit = Unit.INSTANCE;
        yandex.m4020interface();
    }

    public final String vip() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36692e;
        }
        long j = c13655e.metrica("artist").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
        return null;
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m4745volatile(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36689e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("uid").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (str == null) {
            realm_value_t m4024try = yandex.m4024try();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, m4024try.ad, m4024try, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4015default = yandex.m4015default(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4015default.ad, m4015default, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }

    /* renamed from: while, reason: not valid java name */
    public final void m4746while(String str) {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            this.f36678e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("albumFullId").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        realm_value_t m4015default = yandex.m4015default(str);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4015default.ad, m4015default, false);
        Unit unit = Unit.INSTANCE;
        yandex.m4020interface();
    }

    public final InterfaceC17101e yandex() {
        C13655e c13655e = this.f36684e;
        if (c13655e == null) {
            return this.f36682e;
        }
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(CachedArtist.class);
        InterfaceC3055e ad = AbstractC2863e.ad(vip);
        int i = 2;
        if (ad != null) {
            i = ad.license() == 2 ? 4 : 3;
        } else if (!vip.equals(c12232e.vip(InterfaceC5045e.class))) {
            i = 1;
        }
        return C12575e.isVip(c13655e, c13655e.metrica("featuredArtists"), vip, i, false, false);
    }
}
