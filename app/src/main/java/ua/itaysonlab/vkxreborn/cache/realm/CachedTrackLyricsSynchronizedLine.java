package com.werhes.museeksreborn.cache.realm;

import defpackage.AbstractC10064e;
import defpackage.AbstractC15792e;
import defpackage.AbstractC15871e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC6026e;
import defpackage.AbstractC6762e;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7890e;
import defpackage.C11974e;
import defpackage.C12232e;
import defpackage.C12310e;
import defpackage.C12575e;
import defpackage.C13655e;
import defpackage.C14803e;
import defpackage.C16782e;
import defpackage.C18234e;
import defpackage.C5123e;
import defpackage.C5700e;
import defpackage.C6571e;
import defpackage.C7290e;
import defpackage.InterfaceC0662e;
import defpackage.InterfaceC10518e;
import defpackage.InterfaceC14287e;
import defpackage.InterfaceC3055e;
import defpackage.InterfaceC4706e;
import defpackage.InterfaceC7227e;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyricsSynchronizedLine;", "Leؙٜؗ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedTrackLyricsSynchronizedLine implements InterfaceC4706e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Object f36704e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int f36705e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final String f36706e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final InterfaceC7227e f36707e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C13655e f36708e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f36709e = BuildConfig.FLAVOR;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f36710e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f36711e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f36712e;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyricsSynchronizedLine$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedTrackLyricsSynchronizedLine.f36706e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            return new C11974e(new C18234e("CachedTrackLyricsSynchronizedLine", BuildConfig.FLAVOR, 4L, 0L, AbstractC15871e.metrica(), 1), AbstractC6874e.startapp(AbstractC6762e.metrica("beginMs", 1, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("endMs", 1, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("line", 3, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("interlude", 2, 1, null, BuildConfig.FLAVOR, false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            Companion companion = CachedTrackLyricsSynchronizedLine.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedTrackLyricsSynchronizedLine.f36705e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedTrackLyricsSynchronizedLine.f36704e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedTrackLyricsSynchronizedLine();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedTrackLyricsSynchronizedLine.f36707e;
        }
    }

    static {
        C12232e c12232e = AbstractC3820e.ad;
        f36707e = c12232e.vip(CachedTrackLyricsSynchronizedLine.class);
        f36706e = "CachedTrackLyricsSynchronizedLine";
        Class cls = Long.TYPE;
        f36704e = AbstractC10064e.purchase(new C6571e("beginMs", new C6571e(c12232e.vip(cls), C16782e.f32882e)), new C6571e("endMs", new C6571e(c12232e.vip(cls), C12310e.f24697e)), new C6571e("line", new C6571e(c12232e.vip(String.class), C5123e.f10985e)), new C6571e("interlude", new C6571e(c12232e.vip(Boolean.TYPE), C5700e.f12108e)));
        f36705e = 2;
    }

    public final long ad() {
        C13655e c13655e = this.f36708e;
        if (c13655e == null) {
            return this.f36712e;
        }
        long j = c13655e.metrica("beginMs").license;
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
        this.f36708e = c13655e;
    }

    public final String license() {
        C13655e c13655e = this.f36708e;
        if (c13655e == null) {
            return this.f36709e;
        }
        long j = c13655e.metrica("line").license;
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

    public final boolean metrica() {
        C13655e c13655e = this.f36708e;
        if (c13655e == null) {
            return this.f36711e;
        }
        long j = c13655e.metrica("interlude").license;
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

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF36606e() {
        return this.f36708e;
    }

    public final String toString() {
        return C12575e.premium(this);
    }

    public final long vip() {
        C13655e c13655e = this.f36708e;
        if (c13655e == null) {
            return this.f36710e;
        }
        long j = c13655e.metrica("endMs").license;
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
}
