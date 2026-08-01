package com.werhes.museeksreborn.cache.realm;

import defpackage.AbstractC0746e;
import defpackage.AbstractC10064e;
import defpackage.AbstractC1414e;
import defpackage.AbstractC15792e;
import defpackage.AbstractC15871e;
import defpackage.AbstractC17861e;
import defpackage.AbstractC2863e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC6026e;
import defpackage.AbstractC6762e;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7890e;
import defpackage.AbstractC8116e;
import defpackage.C10599e;
import defpackage.C11746e;
import defpackage.C11974e;
import defpackage.C12232e;
import defpackage.C1235e;
import defpackage.C12436e;
import defpackage.C12537e;
import defpackage.C12575e;
import defpackage.C13469e;
import defpackage.C13655e;
import defpackage.C13878e;
import defpackage.C14368e;
import defpackage.C14401e;
import defpackage.C1476e;
import defpackage.C14803e;
import defpackage.C1483e;
import defpackage.C15085e;
import defpackage.C15174e;
import defpackage.C15816e;
import defpackage.C16203e;
import defpackage.C16386e;
import defpackage.C16406e;
import defpackage.C16427e;
import defpackage.C17423e;
import defpackage.C17782e;
import defpackage.C17987e;
import defpackage.C18085e;
import defpackage.C18234e;
import defpackage.C2269e;
import defpackage.C2685e;
import defpackage.C2967e;
import defpackage.C5062e;
import defpackage.C5643e;
import defpackage.C6052e;
import defpackage.C6264e;
import defpackage.C6296e;
import defpackage.C6571e;
import defpackage.C6754e;
import defpackage.C6793e;
import defpackage.C7290e;
import defpackage.C7879e;
import defpackage.C8361e;
import defpackage.C9242e;
import defpackage.C9493e;
import defpackage.C9694e;
import defpackage.InterfaceC0662e;
import defpackage.InterfaceC10518e;
import defpackage.InterfaceC14287e;
import defpackage.InterfaceC17101e;
import defpackage.InterfaceC17544e;
import defpackage.InterfaceC3055e;
import defpackage.InterfaceC5045e;
import defpackage.InterfaceC7227e;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylist;", "Le٘ؕۚ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedPlaylist implements InterfaceC17544e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static final Object f36611e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public static final String f36612e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public static final InterfaceC7227e f36613e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public static final C11746e f36614e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static final int f36615e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f36616e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public String f36617e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f36618e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f36619e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f36620e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public long f36621e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public String f36622e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public String f36623e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public C13655e f36624e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public boolean f36625e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f36626e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public String f36627e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public boolean f36630e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f36631e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f36634e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public long f36636e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public boolean f36637e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public boolean f36638e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f36640e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public CachedEmbeddedThumb f36641e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f36642e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f36645e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f36646e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public String f36647e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f36644e = BuildConfig.FLAVOR;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public String f36628e = BuildConfig.FLAVOR;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public String f36629e = BuildConfig.FLAVOR;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public String f36639e = "playlist";

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public InterfaceC17101e f36643e = AbstractC8116e.license(new CachedEmbeddedThumb[0]);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public InterfaceC17101e f36635e = AbstractC8116e.license(new CachedVkGenre[0]);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public InterfaceC17101e f36632e = AbstractC8116e.license(new CachedTrack[0]);

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public InterfaceC17101e f36633e = AbstractC8116e.license(new CachedArtist[0]);

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylist$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedPlaylist.f36612e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            C18234e c18234e = new C18234e("CachedPlaylist", "uid", 31L, 0L, AbstractC15871e.metrica(), 0);
            C16427e metrica = AbstractC6762e.metrica("uid", 3, 1, null, BuildConfig.FLAVOR, false, true, false);
            C16427e metrica2 = AbstractC6762e.metrica("id", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica3 = AbstractC6762e.metrica("ownerId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica4 = AbstractC6762e.metrica("origOwnerId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica5 = AbstractC6762e.metrica("origPlaylistId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica6 = AbstractC6762e.metrica("folPlaylistId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica7 = AbstractC6762e.metrica("folOwnerId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica8 = AbstractC6762e.metrica("type", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica9 = AbstractC6762e.metrica("count", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica10 = AbstractC6762e.metrica("followers", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica11 = AbstractC6762e.metrica("plays", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica12 = AbstractC6762e.metrica("year", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica13 = AbstractC6762e.metrica("accessKey", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica14 = AbstractC6762e.metrica("origAccessKey", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica15 = AbstractC6762e.metrica("title", 3, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica16 = AbstractC6762e.metrica("localizedSearchTitle", 3, 1, null, BuildConfig.FLAVOR, false, false, true);
            C16427e metrica17 = AbstractC6762e.metrica("ownerTitle", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica18 = AbstractC6762e.metrica("subtitle", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica19 = AbstractC6762e.metrica("albumType", 3, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica20 = AbstractC6762e.metrica("description", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica21 = AbstractC6762e.metrica("createTime", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica22 = AbstractC6762e.metrica("updateTime", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C12232e c12232e = AbstractC3820e.ad;
            return new C11974e(c18234e, AbstractC6874e.startapp(metrica, metrica2, metrica3, metrica4, metrica5, metrica6, metrica7, metrica8, metrica9, metrica10, metrica11, metrica12, metrica13, metrica14, metrica15, metrica16, metrica17, metrica18, metrica19, metrica20, metrica21, metrica22, AbstractC6762e.metrica("photo", 9, 1, c12232e.vip(CachedEmbeddedThumb.class), BuildConfig.FLAVOR, true, false, false), AbstractC6762e.metrica("thumbs", 9, 2, c12232e.vip(CachedEmbeddedThumb.class), BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("genres", 9, 2, c12232e.vip(CachedVkGenre.class), BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("audios", 9, 2, c12232e.vip(CachedTrack.class), BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("mainArtists", 9, 2, c12232e.vip(CachedArtist.class), BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("isExplicit", 2, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("isFollowing", 2, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("isAvailableOffline", 2, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("isLegacyCachedArtwork", 2, 1, null, BuildConfig.FLAVOR, false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            return CachedPlaylist.f36614e;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedPlaylist.f36615e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedPlaylist.f36611e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedPlaylist();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedPlaylist.f36613e;
        }
    }

    static {
        C12232e c12232e = AbstractC3820e.ad;
        f36613e = c12232e.vip(CachedPlaylist.class);
        f36612e = "CachedPlaylist";
        C6571e c6571e = new C6571e("uid", new C6571e(c12232e.vip(String.class), C6296e.f13120e));
        Class cls = Long.TYPE;
        C6571e c6571e2 = new C6571e("id", new C6571e(c12232e.vip(cls), C16203e.f31824e));
        C6571e c6571e3 = new C6571e("ownerId", new C6571e(c12232e.vip(cls), C6264e.f13077e));
        C6571e c6571e4 = new C6571e("origOwnerId", new C6571e(c12232e.vip(cls), C1476e.f4334e));
        C6571e c6571e5 = new C6571e("origPlaylistId", new C6571e(c12232e.vip(cls), C15085e.f29866e));
        C6571e c6571e6 = new C6571e("folPlaylistId", new C6571e(c12232e.vip(cls), C13878e.f27491e));
        C6571e c6571e7 = new C6571e("folOwnerId", new C6571e(c12232e.vip(cls), C6754e.f13955e));
        Class cls2 = Integer.TYPE;
        C6571e c6571e8 = new C6571e("type", new C6571e(c12232e.vip(cls2), C14368e.f28420e));
        C6571e c6571e9 = new C6571e("count", new C6571e(c12232e.vip(cls2), C9493e.f18843e));
        C6571e c6571e10 = new C6571e("followers", new C6571e(c12232e.vip(cls2), C14401e.f28485e));
        C6571e c6571e11 = new C6571e("plays", new C6571e(c12232e.vip(cls2), C12537e.f25096e));
        C6571e c6571e12 = new C6571e("year", new C6571e(c12232e.vip(cls2), C8361e.f17111e));
        C6571e c6571e13 = new C6571e("accessKey", new C6571e(c12232e.vip(String.class), C5643e.f12033e));
        C6571e c6571e14 = new C6571e("origAccessKey", new C6571e(c12232e.vip(String.class), C2685e.f6556e));
        C6571e c6571e15 = new C6571e("title", new C6571e(c12232e.vip(String.class), C9694e.f19189e));
        C6571e c6571e16 = new C6571e("localizedSearchTitle", new C6571e(c12232e.vip(String.class), C1483e.f4355e));
        C6571e c6571e17 = new C6571e("ownerTitle", new C6571e(c12232e.vip(String.class), C13469e.f26732e));
        C6571e c6571e18 = new C6571e("subtitle", new C6571e(c12232e.vip(String.class), C15174e.f30025e));
        C6571e c6571e19 = new C6571e("albumType", new C6571e(c12232e.vip(String.class), C7879e.f15953e));
        C6571e c6571e20 = new C6571e("description", new C6571e(c12232e.vip(String.class), C2269e.f5761e));
        C6571e c6571e21 = new C6571e("createTime", new C6571e(c12232e.vip(cls), C17987e.f35280e));
        C6571e c6571e22 = new C6571e("updateTime", new C6571e(c12232e.vip(cls), C9242e.f18444e));
        C6571e c6571e23 = new C6571e("photo", new C6571e(c12232e.vip(CachedEmbeddedThumb.class), C12436e.f24879e));
        C6571e c6571e24 = new C6571e("thumbs", new C6571e(c12232e.vip(CachedEmbeddedThumb.class), C5062e.f10884e));
        C6571e c6571e25 = new C6571e("genres", new C6571e(c12232e.vip(CachedVkGenre.class), C2967e.f7011e));
        C6571e c6571e26 = new C6571e("audios", new C6571e(c12232e.vip(CachedTrack.class), C6052e.f12720e));
        C6571e c6571e27 = new C6571e("mainArtists", new C6571e(c12232e.vip(CachedArtist.class), C17423e.f34138e));
        Class cls3 = Boolean.TYPE;
        f36611e = AbstractC10064e.purchase(c6571e, c6571e2, c6571e3, c6571e4, c6571e5, c6571e6, c6571e7, c6571e8, c6571e9, c6571e10, c6571e11, c6571e12, c6571e13, c6571e14, c6571e15, c6571e16, c6571e17, c6571e18, c6571e19, c6571e20, c6571e21, c6571e22, c6571e23, c6571e24, c6571e25, c6571e26, c6571e27, new C6571e("isExplicit", new C6571e(c12232e.vip(cls3), C17782e.f34863e)), new C6571e("isFollowing", new C6571e(c12232e.vip(cls3), C6793e.f14001e)), new C6571e("isAvailableOffline", new C6571e(c12232e.vip(cls3), C10599e.f20906e)), new C6571e("isLegacyCachedArtwork", new C6571e(c12232e.vip(cls3), C16386e.f32190e)));
        f36614e = C11746e.f23622e;
        f36615e = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: abstract, reason: not valid java name */
    public final void m4679abstract(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36621e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("createTime").license;
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

    public final String ad() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36617e;
        }
        long j = c13655e.metrica("accessKey").license;
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

    public final long adcel() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36645e;
        }
        long j = c13655e.metrica("folOwnerId").license;
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

    public final int advert() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36620e;
        }
        long j = c13655e.metrica("followers").license;
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

    public final InterfaceC17101e amazon() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36635e;
        }
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(CachedVkGenre.class);
        InterfaceC3055e ad = AbstractC2863e.ad(vip);
        int i = 2;
        if (ad != null) {
            i = ad.license() == 2 ? 4 : 3;
        } else if (!vip.equals(c12232e.vip(InterfaceC5045e.class))) {
            i = 1;
        }
        return C12575e.isVip(c13655e, c13655e.metrica("genres"), vip, i, false, false);
    }

    public final int applovin() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36634e;
        }
        long j = c13655e.metrica("plays").license;
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

    public final long billing() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36621e;
        }
        long j = c13655e.metrica("createTime").license;
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
    /* renamed from: break, reason: not valid java name */
    public final void m4680break(int i) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36642e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("count").license;
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
    /* renamed from: case, reason: not valid java name */
    public final void m4681case(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36645e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("folOwnerId").license;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: catch, reason: not valid java name */
    public final void m4682catch(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36646e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("folPlaylistId").license;
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

    /* renamed from: class, reason: not valid java name */
    public final String m4683class() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36644e;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: const, reason: not valid java name */
    public final void m4684const(int i) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36618e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("year").license;
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

    public final InterfaceC17101e crashlytics() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36643e;
        }
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(CachedEmbeddedThumb.class);
        InterfaceC3055e ad = AbstractC2863e.ad(vip);
        int i = 2;
        if (ad != null) {
            i = ad.license() == 2 ? 4 : 3;
        } else if (!vip.equals(c12232e.vip(InterfaceC5045e.class))) {
            i = 1;
        }
        return C12575e.isVip(c13655e, c13655e.metrica("thumbs"), vip, i, false, false);
    }

    /* renamed from: default, reason: not valid java name */
    public final void m4685default(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36647e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("description").license;
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

    /* renamed from: else, reason: not valid java name */
    public final void m4686else(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36623e = str;
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
    public final boolean m4687extends() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36630e;
        }
        long j = c13655e.metrica("isFollowing").license;
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
    /* renamed from: final, reason: not valid java name */
    public final void m4688final(int i) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36620e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("followers").license;
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
    /* renamed from: finally, reason: not valid java name */
    public final void m4689finally(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36636e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("updateTime").license;
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

    public final String firebase() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36628e;
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

    /* renamed from: goto, reason: not valid java name */
    public final int m4690goto() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36618e;
        }
        long j = c13655e.metrica("year").license;
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

    public final int hashCode() {
        return C12575e.ads(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: implements, reason: not valid java name */
    public final void m4691implements(boolean z) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36638e = z;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: import, reason: not valid java name */
    public final void m4692import(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36616e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("origPlaylistId").license;
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

    public final String inmobi() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36627e;
        }
        long j = c13655e.metrica("ownerTitle").license;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: instanceof, reason: not valid java name */
    public final void m4693instanceof(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36619e = j;
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

    /* renamed from: interface, reason: not valid java name */
    public final long m4694interface() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36636e;
        }
        long j = c13655e.metrica("updateTime").license;
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

    public final CachedEmbeddedThumb isPro() {
        InterfaceC10518e Signature;
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36641e;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("photo").license;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            Signature = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.ad, realm_value_tVar2);
            Signature = AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar2), AbstractC3820e.ad.vip(CachedEmbeddedThumb.class), c13655e.f27074e, c13655e.f27072e);
        }
        return (CachedEmbeddedThumb) Signature;
    }

    @Override // defpackage.InterfaceC10518e
    public final void isVip(C13655e c13655e) {
        this.f36624e = c13655e;
    }

    public final InterfaceC17101e license() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36632e;
        }
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(CachedTrack.class);
        InterfaceC3055e ad = AbstractC2863e.ad(vip);
        int i = 2;
        if (ad != null) {
            i = ad.license() == 2 ? 4 : 3;
        } else if (!vip.equals(c12232e.vip(InterfaceC5045e.class))) {
            i = 1;
        }
        return C12575e.isVip(c13655e, c13655e.metrica("audios"), vip, i, false, false);
    }

    public final long loadAd() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36626e;
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
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null).longValue();
    }

    public final AudioPlaylist metrica() {
        long j;
        boolean z;
        int i;
        FollowedMetadata followedMetadata;
        FollowedMetadata followedMetadata2;
        long j2;
        OriginalPlaylist originalPlaylist;
        int loadAd = (int) loadAd();
        long tapsense = tapsense();
        String ad = ad();
        String str = AbstractC7890e.billing(vip(), "playlist") ? "ugc" : "album";
        AudioPlaylist.AlbumMeta albumMeta = new AudioPlaylist.AlbumMeta("album", vip());
        String firebase = firebase();
        String yandex = yandex();
        int purchase = purchase();
        int advert = advert();
        int applovin = applovin();
        long billing = billing();
        long m4694interface = m4694interface();
        boolean m4687extends = m4687extends();
        int m4690goto = m4690goto();
        boolean m4695native = m4695native();
        String subs = subs();
        String inmobi = inmobi();
        if (mopub() == 0 || adcel() == 0) {
            j = m4694interface;
            z = m4687extends;
            i = loadAd;
            followedMetadata = null;
        } else {
            j = m4694interface;
            z = m4687extends;
            i = loadAd;
            followedMetadata = new FollowedMetadata((int) mopub(), adcel());
        }
        if (signatures() == 0 || pro() == 0) {
            followedMetadata2 = followedMetadata;
            j2 = tapsense;
            originalPlaylist = null;
        } else {
            followedMetadata2 = followedMetadata;
            j2 = tapsense;
            originalPlaylist = new OriginalPlaylist(pro(), (int) signatures(), remoteconfig());
        }
        CachedEmbeddedThumb isPro = isPro();
        AlbumThumb ad2 = isPro != null ? isPro.ad() : null;
        InterfaceC17101e<CachedVkGenre> amazon = amazon();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(amazon, 10));
        for (CachedVkGenre cachedVkGenre : amazon) {
            arrayList.add(new Genre(cachedVkGenre.ad(), cachedVkGenre.vip()));
        }
        InterfaceC17101e license = license();
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(license, 10));
        Iterator<E> it = license.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CachedTrack) it.next()).metrica());
        }
        InterfaceC17101e crashlytics = crashlytics();
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(crashlytics, 10));
        Iterator<E> it2 = crashlytics.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((CachedEmbeddedThumb) it2.next()).ad());
        }
        InterfaceC17101e subscription = subscription();
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(subscription, 10));
        Iterator<E> it3 = subscription.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((CachedArtist) it3.next()).ad());
        }
        return new AudioPlaylist(i, j2, str, albumMeta, firebase, yandex, purchase, advert, applovin, billing, Long.valueOf(j), arrayList, Boolean.valueOf(z), null, arrayList2, m4690goto, followedMetadata2, originalPlaylist, ad2, arrayList3, ad, Boolean.valueOf(m4695native), subs, arrayList4, false, false, null, null, null, null, null, true, inmobi, m4706this(), m4707throw(), 2130714624, 0);
    }

    public final long mopub() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36646e;
        }
        long j = c13655e.metrica("folPlaylistId").license;
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

    /* renamed from: native, reason: not valid java name */
    public final boolean m4695native() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36638e;
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
    /* renamed from: new, reason: not valid java name */
    public final void m4696new(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36626e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("id").license;
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

    /* renamed from: package, reason: not valid java name */
    public final void m4697package(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36622e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("origAccessKey").license;
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

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF27457e() {
        return this.f36624e;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m4698private(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36629e = str;
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

    public final long pro() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36640e;
        }
        long j = c13655e.metrica("origOwnerId").license;
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
    public final void m4699protected(boolean z) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36625e = z;
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

    public final int purchase() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36642e;
        }
        long j = c13655e.metrica("count").license;
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

    public final String remoteconfig() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36622e;
        }
        long j = c13655e.metrica("origAccessKey").license;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: return, reason: not valid java name */
    public final void m4700return(int i) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36634e = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(i);
        c13655e.ad();
        long j = c13655e.metrica("plays").license;
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

    public final long signatures() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36616e;
        }
        long j = c13655e.metrica("origPlaylistId").license;
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

    /* renamed from: static, reason: not valid java name */
    public final void m4701static(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36627e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("ownerTitle").license;
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
    /* renamed from: strictfp, reason: not valid java name */
    public final void m4702strictfp(boolean z) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36637e = z;
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

    public final String subs() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36623e;
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

    public final InterfaceC17101e subscription() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36633e;
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
    public final void m4703super(boolean z) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36630e = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Boolean valueOf = Boolean.valueOf(z);
        c13655e.ad();
        long j = c13655e.metrica("isFollowing").license;
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

    /* renamed from: switch, reason: not valid java name */
    public final void m4704switch(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36628e = str;
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

    /* renamed from: synchronized, reason: not valid java name */
    public final void m4705synchronized(CachedEmbeddedThumb cachedEmbeddedThumb) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36641e = cachedEmbeddedThumb;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c13655e.ad();
        long j = c13655e.metrica("photo").license;
        if (cachedEmbeddedThumb == null) {
            C15816e yandex = AbstractC1414e.yandex();
            C12575e.crashlytics(c13655e, j, yandex.m4024try());
            Unit unit = Unit.INSTANCE;
            yandex.m4020interface();
            return;
        }
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        C12575e.amazon(AbstractC15792e.subscription(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC3820e.ad.vip(cachedEmbeddedThumb.getClass()), c13655e.f27074e, c13655e.f27072e), cachedEmbeddedThumb, 2, linkedHashMap);
    }

    public final long tapsense() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36619e;
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

    /* renamed from: this, reason: not valid java name */
    public final boolean m4706this() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36625e;
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

    /* renamed from: throw, reason: not valid java name */
    public final boolean m4707throw() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36637e;
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

    /* renamed from: throws, reason: not valid java name */
    public final void m4708throws(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36644e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("uid").license;
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
    public final void m4709transient(long j) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36640e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("origOwnerId").license;
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

    /* renamed from: try, reason: not valid java name */
    public final void m4710try(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36639e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("albumType").license;
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
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36639e;
        }
        long j = c13655e.metrica("albumType").license;
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

    /* renamed from: while, reason: not valid java name */
    public final void m4711while(String str) {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            this.f36617e = str;
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

    public final String yandex() {
        C13655e c13655e = this.f36624e;
        if (c13655e == null) {
            return this.f36647e;
        }
        long j = c13655e.metrica("description").license;
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
}
