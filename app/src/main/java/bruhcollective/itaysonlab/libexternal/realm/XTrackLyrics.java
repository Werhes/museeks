package bruhcollective.itaysonlab.libexternal.realm;

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
import defpackage.C12232e;
import defpackage.C1235e;
import defpackage.C12575e;
import defpackage.C12923e;
import defpackage.C13044e;
import defpackage.C13655e;
import defpackage.C14803e;
import defpackage.C15816e;
import defpackage.C16406e;
import defpackage.C18085e;
import defpackage.C18234e;
import defpackage.C6571e;
import defpackage.C6863e;
import defpackage.C7290e;
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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbruhcollective/itaysonlab/libexternal/realm/XTrackLyrics;", "Le٘ؕۚ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class XTrackLyrics implements InterfaceC17544e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final String f632e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int f633e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final InterfaceC7227e f634e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C13044e f635e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Object f636e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13655e f637e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f639e = BuildConfig.FLAVOR;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f638e = BuildConfig.FLAVOR;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbruhcollective/itaysonlab/libexternal/realm/XTrackLyrics$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return XTrackLyrics.f632e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            return new C11974e(new C18234e("XTrackLyrics", "id", 2L, 0L, AbstractC15871e.metrica(), 0), AbstractC6874e.startapp(AbstractC6762e.metrica("id", 3, 1, null, BuildConfig.FLAVOR, false, true, false), AbstractC6762e.metrica("content", 3, 1, null, BuildConfig.FLAVOR, false, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            return XTrackLyrics.f635e;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return XTrackLyrics.f633e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return XTrackLyrics.f636e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new XTrackLyrics();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return XTrackLyrics.f634e;
        }
    }

    static {
        C12232e c12232e = AbstractC3820e.ad;
        f634e = c12232e.vip(XTrackLyrics.class);
        f632e = "XTrackLyrics";
        f636e = AbstractC10064e.purchase(new C6571e("id", new C6571e(c12232e.vip(String.class), C6863e.f14113e)), new C6571e("content", new C6571e(c12232e.vip(String.class), C12923e.f25786e)));
        f635e = C13044e.f25974e;
        f633e = 1;
    }

    public final String ad() {
        C13655e c13655e = this.f637e;
        if (c13655e == null) {
            return this.f638e;
        }
        long j = c13655e.metrica("content").license;
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
        this.f637e = c13655e;
    }

    public final void license(String str) {
        C13655e c13655e = this.f637e;
        if (c13655e == null) {
            this.f639e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("id").license;
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

    public final void metrica(String str) {
        C13655e c13655e = this.f637e;
        if (c13655e == null) {
            this.f638e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("content").license;
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

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF637e() {
        return this.f637e;
    }

    public final String toString() {
        return C12575e.premium(this);
    }

    public final String vip() {
        C13655e c13655e = this.f637e;
        if (c13655e == null) {
            return this.f639e;
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
