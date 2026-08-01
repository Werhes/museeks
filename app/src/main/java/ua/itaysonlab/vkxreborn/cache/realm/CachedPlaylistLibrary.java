package com.werhes.museeksreborn.cache.realm;

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
import defpackage.C11974e;
import defpackage.C12232e;
import defpackage.C1235e;
import defpackage.C12575e;
import defpackage.C1350e;
import defpackage.C13655e;
import defpackage.C14803e;
import defpackage.C15816e;
import defpackage.C16403e;
import defpackage.C16406e;
import defpackage.C18085e;
import defpackage.C18234e;
import defpackage.C3502e;
import defpackage.C6571e;
import defpackage.C7290e;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylistLibrary;", "Le٘ؕۚ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedPlaylistLibrary implements InterfaceC17544e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final String f36648e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int f36649e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final InterfaceC7227e f36650e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C1350e f36651e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Object f36652e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13655e f36653e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC17101e f36654e = AbstractC8116e.license(new CachedPlaylist[0]);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f36655e;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylistLibrary$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedPlaylistLibrary.f36648e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            return new C11974e(new C18234e("CachedPlaylistLibrary", "uid", 2L, 0L, AbstractC15871e.metrica(), 0), AbstractC6874e.startapp(AbstractC6762e.metrica("uid", 1, 1, null, BuildConfig.FLAVOR, false, true, false), AbstractC6762e.metrica("playlists", 9, 2, AbstractC3820e.ad.vip(CachedPlaylist.class), BuildConfig.FLAVOR, false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            return CachedPlaylistLibrary.f36651e;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedPlaylistLibrary.f36649e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedPlaylistLibrary.f36652e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedPlaylistLibrary();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedPlaylistLibrary.f36650e;
        }
    }

    static {
        C12232e c12232e = AbstractC3820e.ad;
        f36650e = c12232e.vip(CachedPlaylistLibrary.class);
        f36648e = "CachedPlaylistLibrary";
        f36652e = AbstractC10064e.purchase(new C6571e("uid", new C6571e(c12232e.vip(Long.TYPE), C3502e.f7925e)), new C6571e("playlists", new C6571e(c12232e.vip(CachedPlaylist.class), C16403e.f32205e)));
        f36651e = C1350e.f4146e;
        f36649e = 1;
    }

    public final InterfaceC17101e ad() {
        C13655e c13655e = this.f36653e;
        if (c13655e == null) {
            return this.f36654e;
        }
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC7227e vip = c12232e.vip(CachedPlaylist.class);
        InterfaceC3055e ad = AbstractC2863e.ad(vip);
        int i = 2;
        if (ad != null) {
            i = ad.license() == 2 ? 4 : 3;
        } else if (!vip.equals(c12232e.vip(InterfaceC5045e.class))) {
            i = 1;
        }
        return C12575e.isVip(c13655e, c13655e.metrica("playlists"), vip, i, false, false);
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
        this.f36653e = c13655e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void license(long j) {
        C13655e c13655e = this.f36653e;
        if (c13655e == null) {
            this.f36655e = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(j);
        c13655e.ad();
        long j2 = c13655e.metrica("uid").license;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void metrica(defpackage.InterfaceC17101e r9) {
        /*
            r8 = this;
            eْۧ۠ r0 = r8.f36653e
            if (r0 != 0) goto L7
            r8.f36654e = r9
            return
        L7:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            eؙّؔ r1 = defpackage.AbstractC3820e.ad
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist> r2 = ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist.class
            eؚ٘ٚ r2 = r1.vip(r2)
            eؕؐۛ r3 = defpackage.AbstractC2863e.ad(r2)
            r7 = 2
            if (r3 != 0) goto L2c
            java.lang.Class<eؗٝۚ> r3 = defpackage.InterfaceC5045e.class
            eؚ٘ٚ r1 = r1.vip(r3)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L29
            r3 = r7
            goto L36
        L29:
            r1 = 1
        L2a:
            r3 = r1
            goto L36
        L2c:
            int r1 = r3.license()
            if (r1 != r7) goto L34
            r1 = 4
            goto L2a
        L34:
            r1 = 3
            goto L2a
        L36:
            java.lang.String r1 = "playlists"
            eٖٟۚ r1 = r0.metrica(r1)
            r4 = 0
            r5 = 0
            eٍۥّ r0 = defpackage.C12575e.isVip(r0, r1, r2, r3, r4, r5)
            boolean r1 = r9 instanceof defpackage.C9889e
            if (r1 == 0) goto L5f
            io.realm.kotlin.internal.interop.LongPointerWrapper r1 = r0.f19501e
            r2 = r9
            eٍۥّ r2 = (defpackage.C9889e) r2
            io.realm.kotlin.internal.interop.LongPointerWrapper r2 = r2.f19501e
            long r3 = r1.getPtr$cinterop_release()
            long r1 = r2.getPtr$cinterop_release()
            int r5 = defpackage.AbstractC6026e.ad
            boolean r1 = io.realm.kotlin.internal.interop.realmcJNI.realm_equals(r3, r1)
            if (r1 != 0) goto L5e
            goto L5f
        L5e:
            return
        L5f:
            r0.clear()
            eؘّٙ r1 = r0.f19500e
            int r0 = r0.subs()
            r1.inmobi(r0, r9, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary.metrica(eٗٚٛ):void");
    }

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF36653e() {
        return this.f36653e;
    }

    public final String toString() {
        return C12575e.premium(this);
    }

    public final long vip() {
        C13655e c13655e = this.f36653e;
        if (c13655e == null) {
            return this.f36655e;
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
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)) : null).longValue();
    }
}
