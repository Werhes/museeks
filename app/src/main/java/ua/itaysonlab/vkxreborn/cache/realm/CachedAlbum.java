package com.werhes.museeksreborn.cache.realm;

import defpackage.AbstractC10064e;
import defpackage.AbstractC1414e;
import defpackage.AbstractC15792e;
import defpackage.AbstractC15871e;
import defpackage.AbstractC17861e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC6026e;
import defpackage.AbstractC6762e;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7890e;
import defpackage.C0999e;
import defpackage.C11553e;
import defpackage.C11974e;
import defpackage.C12004e;
import defpackage.C12156e;
import defpackage.C12232e;
import defpackage.C1235e;
import defpackage.C12575e;
import defpackage.C13655e;
import defpackage.C14803e;
import defpackage.C15816e;
import defpackage.C15907e;
import defpackage.C16406e;
import defpackage.C16427e;
import defpackage.C17434e;
import defpackage.C18085e;
import defpackage.C18234e;
import defpackage.C3437e;
import defpackage.C3510e;
import defpackage.C3539e;
import defpackage.C4769e;
import defpackage.C4848e;
import defpackage.C6571e;
import defpackage.C7121e;
import defpackage.C7290e;
import defpackage.C9770e;
import defpackage.InterfaceC0662e;
import defpackage.InterfaceC10518e;
import defpackage.InterfaceC14287e;
import defpackage.InterfaceC17544e;
import defpackage.InterfaceC3055e;
import defpackage.InterfaceC7227e;
import defpackage.InterfaceC8614e;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedAlbum;", "Le٘ؕۚ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedAlbum implements InterfaceC17544e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final InterfaceC7227e f36559e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f36560e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final String f36561e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final int f36562e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final Object f36563e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C17434e f36564e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f36565e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f36566e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f36568e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C13655e f36570e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f36571e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public CachedEmbeddedThumb f36574e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f36573e = BuildConfig.FLAVOR;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String f36575e = BuildConfig.FLAVOR;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f36569e = BuildConfig.FLAVOR;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public String f36572e = BuildConfig.FLAVOR;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C9770e f36567e = new C9770e(3, AbstractC3820e.ad.vip(CachedTrack.class));

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedAlbum$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedAlbum.f36561e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            C18234e c18234e = new C18234e("CachedAlbum", "uid", 10L, 0L, AbstractC15871e.metrica(), 0);
            C16427e metrica = AbstractC6762e.metrica("uid", 3, 1, null, BuildConfig.FLAVOR, true, true, false);
            C16427e metrica2 = AbstractC6762e.metrica("id", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica3 = AbstractC6762e.metrica("ownerId", 1, 1, null, BuildConfig.FLAVOR, false, false, false);
            C16427e metrica4 = AbstractC6762e.metrica("accessKey", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica5 = AbstractC6762e.metrica("mainColor", 3, 1, null, BuildConfig.FLAVOR, true, false, false);
            C16427e metrica6 = AbstractC6762e.metrica("title", 3, 1, null, BuildConfig.FLAVOR, false, false, false);
            C12232e c12232e = AbstractC3820e.ad;
            return new C11974e(c18234e, AbstractC6874e.startapp(metrica, metrica2, metrica3, metrica4, metrica5, metrica6, AbstractC6762e.metrica("thumb", 9, 1, c12232e.vip(CachedEmbeddedThumb.class), BuildConfig.FLAVOR, true, false, false), AbstractC6762e.metrica("localizedSearchTitle", 3, 1, null, BuildConfig.FLAVOR, false, false, true), AbstractC6762e.metrica("artist", 3, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("usedInTracks", 10, 2, c12232e.vip(CachedTrack.class), "album", false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            return CachedAlbum.f36564e;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedAlbum.f36562e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedAlbum.f36563e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedAlbum();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedAlbum.f36559e;
        }
    }

    static {
        C12156e c12156e = new C12156e(CachedAlbum.class, "usedInTracks", "getUsedInTracks()Lio/realm/kotlin/query/RealmResults;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f36560e = new InterfaceC8614e[]{c12232e.yandex(c12156e)};
        INSTANCE = new Companion(0);
        f36559e = c12232e.vip(CachedAlbum.class);
        f36561e = "CachedAlbum";
        C6571e c6571e = new C6571e("uid", new C6571e(c12232e.vip(String.class), C4769e.f10201e));
        Class cls = Long.TYPE;
        f36563e = AbstractC10064e.purchase(c6571e, new C6571e("id", new C6571e(c12232e.vip(cls), C3437e.f7691e)), new C6571e("ownerId", new C6571e(c12232e.vip(cls), C4848e.f10312e)), new C6571e("accessKey", new C6571e(c12232e.vip(String.class), C0999e.f3445e)), new C6571e("mainColor", new C6571e(c12232e.vip(String.class), C7121e.f14582e)), new C6571e("title", new C6571e(c12232e.vip(String.class), C3510e.f7932e)), new C6571e("thumb", new C6571e(c12232e.vip(CachedEmbeddedThumb.class), C11553e.f23200e)), new C6571e("localizedSearchTitle", new C6571e(c12232e.vip(String.class), C3539e.f7984e)), new C6571e("artist", new C6571e(c12232e.vip(String.class), C15907e.f31343e)), new C6571e("usedInTracks", new C6571e(c12232e.vip(CachedTrack.class), C12004e.f24006e)));
        f36564e = C17434e.f34150e;
        f36562e = 1;
    }

    public final String ad() {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36571e;
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

    public final String adcel() {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36573e;
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

    public final void advert(String str) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36572e = str;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void amazon(long j) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36568e = j;
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

    public final CachedEmbeddedThumb billing() {
        InterfaceC10518e Signature;
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36574e;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("thumb").license;
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

    public final int hashCode() {
        return C12575e.ads(this);
    }

    @Override // defpackage.InterfaceC10518e
    public final void isVip(C13655e c13655e) {
        this.f36570e = c13655e;
    }

    public final String license() {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36565e;
        }
        long j = c13655e.metrica("mainColor").license;
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

    public final void loadAd(String str) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36569e = str;
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

    public final long metrica() {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36568e;
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

    public final void mopub(String str) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36571e = str;
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

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF36570e() {
        return this.f36570e;
    }

    public final void pro(CachedEmbeddedThumb cachedEmbeddedThumb) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36574e = cachedEmbeddedThumb;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c13655e.ad();
        long j = c13655e.metrica("thumb").license;
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

    public final long purchase() {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36566e;
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
    public final void remoteconfig(long j) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36566e = j;
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

    public final void signatures(String str) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36575e = str;
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

    public final void subscription(String str) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36565e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("mainColor").license;
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

    public final void tapsense(String str) {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            this.f36573e = str;
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

    public final String toString() {
        return C12575e.premium(this);
    }

    public final String vip() {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36572e;
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

    public final String yandex() {
        C13655e c13655e = this.f36570e;
        if (c13655e == null) {
            return this.f36575e;
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
}
