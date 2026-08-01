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
import defpackage.C11974e;
import defpackage.C11990e;
import defpackage.C12232e;
import defpackage.C1235e;
import defpackage.C12575e;
import defpackage.C13655e;
import defpackage.C14803e;
import defpackage.C15816e;
import defpackage.C16406e;
import defpackage.C16454e;
import defpackage.C18085e;
import defpackage.C18234e;
import defpackage.C6571e;
import defpackage.C7290e;
import defpackage.C7446e;
import defpackage.InterfaceC0662e;
import defpackage.InterfaceC10518e;
import defpackage.InterfaceC14287e;
import defpackage.InterfaceC17544e;
import defpackage.InterfaceC3055e;
import defpackage.InterfaceC7227e;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedArtist;", "Le٘ؕۚ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedArtist implements InterfaceC17544e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final String f36576e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int f36577e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final InterfaceC7227e f36578e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C11990e f36579e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Object f36580e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13655e f36581e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f36582e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f36583e;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedArtist$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedArtist.f36576e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            return new C11974e(new C18234e("CachedArtist", "id", 2L, 0L, AbstractC15871e.metrica(), 0), AbstractC6874e.startapp(AbstractC6762e.metrica("id", 3, 1, null, BuildConfig.FLAVOR, true, true, false), AbstractC6762e.metrica("name", 3, 1, null, BuildConfig.FLAVOR, false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            return CachedArtist.f36579e;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedArtist.f36577e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedArtist.f36580e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedArtist();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedArtist.f36578e;
        }
    }

    static {
        C12232e c12232e = AbstractC3820e.ad;
        f36578e = c12232e.vip(CachedArtist.class);
        f36576e = "CachedArtist";
        f36580e = AbstractC10064e.purchase(new C6571e("id", new C6571e(c12232e.vip(String.class), C16454e.f32287e)), new C6571e("name", new C6571e(c12232e.vip(String.class), C7446e.f15221e)));
        f36579e = C11990e.f23960e;
        f36577e = 1;
    }

    public CachedArtist() {
        this.f36583e = BuildConfig.FLAVOR;
        this.f36582e = BuildConfig.FLAVOR;
    }

    public CachedArtist(MainArtist mainArtist) {
        this();
        String str = mainArtist.ad;
        license(str == null ? BuildConfig.FLAVOR : str);
        purchase(mainArtist.metrica);
    }

    public final MainArtist ad() {
        return new MainArtist(vip(), vip(), metrica(), null, true);
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
        this.f36581e = c13655e;
    }

    public final void license(String str) {
        C13655e c13655e = this.f36581e;
        if (c13655e == null) {
            this.f36583e = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        c13655e.ad();
        long j = c13655e.metrica("id").license;
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

    public final String metrica() {
        C13655e c13655e = this.f36581e;
        if (c13655e == null) {
            return this.f36582e;
        }
        long j = c13655e.metrica("name").license;
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

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF36581e() {
        return this.f36581e;
    }

    public final void purchase(String str) {
        C13655e c13655e = this.f36581e;
        if (c13655e == null) {
            this.f36582e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("name").license;
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

    public final String vip() {
        C13655e c13655e = this.f36581e;
        if (c13655e == null) {
            return this.f36583e;
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
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
        return null;
    }
}
