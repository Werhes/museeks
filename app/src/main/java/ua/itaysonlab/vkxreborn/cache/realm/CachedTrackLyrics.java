package com.werhes.museeksreborn.cache.realm;

import defpackage.AbstractC10064e;
import defpackage.AbstractC15792e;
import defpackage.AbstractC15871e;
import defpackage.AbstractC2863e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC6026e;
import defpackage.AbstractC6762e;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7890e;
import defpackage.AbstractC8116e;
import defpackage.C11038e;
import defpackage.C11974e;
import defpackage.C12232e;
import defpackage.C12575e;
import defpackage.C13655e;
import defpackage.C14069e;
import defpackage.C14803e;
import defpackage.C18234e;
import defpackage.C6571e;
import defpackage.C6811e;
import defpackage.C7290e;
import defpackage.InterfaceC0662e;
import defpackage.InterfaceC10518e;
import defpackage.InterfaceC14287e;
import defpackage.InterfaceC17101e;
import defpackage.InterfaceC3055e;
import defpackage.InterfaceC4706e;
import defpackage.InterfaceC5045e;
import defpackage.InterfaceC7227e;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyrics;", "Leؙٜؗ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedTrackLyrics implements InterfaceC4706e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final InterfaceC7227e f36696e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int f36697e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Object f36698e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final String f36699e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C13655e f36702e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f36703e = BuildConfig.FLAVOR;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f36701e = BuildConfig.FLAVOR;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC17101e f36700e = AbstractC8116e.license(new CachedTrackLyricsSynchronizedLine[0]);

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyrics$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedTrackLyrics.f36699e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            return new C11974e(new C18234e("CachedTrackLyrics", BuildConfig.FLAVOR, 3L, 0L, AbstractC15871e.metrica(), 1), AbstractC6874e.startapp(AbstractC6762e.metrica("credits", 3, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("plainLyrics", 3, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("synchronizedLyrics", 9, 2, AbstractC3820e.ad.vip(CachedTrackLyricsSynchronizedLine.class), BuildConfig.FLAVOR, false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            Companion companion = CachedTrackLyrics.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedTrackLyrics.f36697e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedTrackLyrics.f36698e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedTrackLyrics();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedTrackLyrics.f36696e;
        }
    }

    static {
        C12232e c12232e = AbstractC3820e.ad;
        f36696e = c12232e.vip(CachedTrackLyrics.class);
        f36699e = "CachedTrackLyrics";
        f36698e = AbstractC10064e.purchase(new C6571e("credits", new C6571e(c12232e.vip(String.class), C11038e.f21865e)), new C6571e("plainLyrics", new C6571e(c12232e.vip(String.class), C14069e.f27818e)), new C6571e("synchronizedLyrics", new C6571e(c12232e.vip(CachedTrackLyricsSynchronizedLine.class), C6811e.f14024e)));
        f36697e = 2;
    }

    public final String ad() {
        C13655e c13655e = this.f36702e;
        if (c13655e == null) {
            return this.f36703e;
        }
        long j = c13655e.metrica("credits").license;
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
        this.f36702e = c13655e;
    }

    public final InterfaceC17101e metrica() {
        C13655e c13655e = this.f36702e;
        if (c13655e == null) {
            return this.f36700e;
        }
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(CachedTrackLyricsSynchronizedLine.class);
        InterfaceC3055e ad = AbstractC2863e.ad(vip);
        int i = 2;
        if (ad != null) {
            i = ad.license() == 2 ? 4 : 3;
        } else if (!vip.equals(c12232e.vip(InterfaceC5045e.class))) {
            i = 1;
        }
        return C12575e.isVip(c13655e, c13655e.metrica("synchronizedLyrics"), vip, i, false, false);
    }

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF36684e() {
        return this.f36702e;
    }

    public final String toString() {
        return C12575e.premium(this);
    }

    public final String vip() {
        C13655e c13655e = this.f36702e;
        if (c13655e == null) {
            return this.f36701e;
        }
        long j = c13655e.metrica("plainLyrics").license;
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
