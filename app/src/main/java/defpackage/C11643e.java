package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11643e implements InterfaceC3529e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC7227e f23393e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC8441e f23394e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC15348e f23395e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f23396e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final LongPointerWrapper f23397e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17974e f23398e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f23399e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f23400e;

    public C11643e(C17974e c17974e, InterfaceC15348e interfaceC15348e, AbstractC8441e abstractC8441e, LongPointerWrapper longPointerWrapper, InterfaceC7227e interfaceC7227e, long j, int i) {
        this.f23396e = i;
        this.f23398e = c17974e;
        this.f23395e = interfaceC15348e;
        this.f23394e = abstractC8441e;
        this.f23397e = longPointerWrapper;
        this.f23393e = interfaceC7227e;
        this.f23400e = j;
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e Signature(int i) {
        InterfaceC15348e interfaceC15348e = this.f23395e;
        interfaceC15348e.mo3328goto();
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_t realm_value_tVar2 = new realm_value_t();
        long ptr$cinterop_release = this.f23397e.getPtr$cinterop_release();
        long j = i;
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar, realm_value_tVar2.ad, realm_value_tVar2);
        return new C6571e(this.f23394e.license(realm_value_tVar), realmcJNI.realm_value_t_type_get(realm_value_tVar2.ad, realm_value_tVar2) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar2), this.f23393e, this.f23398e, interfaceC15348e));
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e admob(Object obj) {
        return AbstractC5087e.metrica(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e ads(Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        return AbstractC5087e.billing(this, obj, (InterfaceC14287e) obj2, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e advert(Object obj, Object obj2, int i, Map map) {
        C6571e c6571e;
        int i2 = this.f23396e;
        InterfaceC7227e interfaceC7227e = this.f23393e;
        LongPointerWrapper longPointerWrapper = this.f23397e;
        InterfaceC15348e interfaceC15348e = this.f23395e;
        C17974e c17974e = this.f23398e;
        AbstractC8441e abstractC8441e = this.f23394e;
        switch (i2) {
            case 0:
                InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj2;
                C15816e c15816e = new C15816e(15);
                realm_value_t metrica = abstractC8441e.metrica(c15816e, obj);
                if (interfaceC14287e == null) {
                    realm_value_t m4012break = c15816e.m4012break(null);
                    realm_value_t realm_value_tVar = new realm_value_t();
                    long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                    int i3 = AbstractC6026e.ad;
                    realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
                    boolean[] zArr = new boolean[1];
                    realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), metrica.ad, metrica, m4012break.ad, m4012break, new long[1], zArr);
                    c6571e = new C6571e(realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), interfaceC7227e, c17974e, interfaceC15348e), Boolean.valueOf(zArr[0]));
                } else {
                    realm_value_t realm_value_tVar2 = new realm_value_t();
                    long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                    int i4 = AbstractC6026e.ad;
                    realm_link_t realm_link_tVar = new realm_link_t(realmcJNI.realm_object_as_link(realmcJNI.realm_dictionary_insert_embedded(ptr$cinterop_release2, metrica.ad, metrica)), true);
                    realm_value_tVar2.billing(10);
                    realm_value_tVar2.purchase(realm_link_tVar);
                    InterfaceC10518e Signature = realmcJNI.realm_value_t_type_get(realm_value_tVar2.ad, realm_value_tVar2) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar2), interfaceC7227e, c17974e, interfaceC15348e);
                    C12575e.amazon(Signature, interfaceC14287e, i, map);
                    c6571e = new C6571e(Signature, Boolean.TRUE);
                }
                c15816e.m4020interface();
                return c6571e;
            default:
                InterfaceC14287e interfaceC14287e2 = (InterfaceC14287e) obj2;
                C15816e c15816e2 = new C15816e(15);
                realm_value_t metrica2 = abstractC8441e.metrica(c15816e2, obj);
                if (interfaceC14287e2 != null) {
                    C13655e f36708e = ((InterfaceC10518e) interfaceC14287e2).getF36708e();
                    if (f36708e == null) {
                        interfaceC14287e2 = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), interfaceC14287e2, i, map);
                    } else if (!AbstractC7890e.billing(f36708e.f27072e, interfaceC15348e)) {
                        throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    interfaceC14287e2 = null;
                }
                realm_value_t m4012break2 = c15816e2.m4012break(interfaceC14287e2 != null ? ((InterfaceC10518e) interfaceC14287e2).getF36708e() : null);
                realm_value_t realm_value_tVar3 = new realm_value_t();
                long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
                int i5 = AbstractC6026e.ad;
                realmcJNI.realm_dictionary_find(ptr$cinterop_release3, metrica2.ad, metrica2, realm_value_tVar3.ad, realm_value_tVar3, new boolean[1]);
                boolean[] zArr2 = new boolean[1];
                realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), metrica2.ad, metrica2, m4012break2.ad, m4012break2, new long[1], zArr2);
                C6571e c6571e2 = new C6571e(realmcJNI.realm_value_t_type_get(realm_value_tVar3.ad, realm_value_tVar3) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar3), interfaceC7227e, c17974e, interfaceC15348e), Boolean.valueOf(zArr2[0]));
                c15816e2.m4020interface();
                return c6571e2;
        }
    }

    @Override // defpackage.InterfaceC3529e
    public final int appmetrica() {
        return AbstractC5087e.purchase(this);
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: class */
    public final boolean mo1370class(Object obj, Object obj2) {
        return ((InterfaceC14287e) obj) == ((InterfaceC14287e) obj2);
    }

    @Override // defpackage.InterfaceC3529e
    public final void clear() {
        AbstractC5087e.ad(this);
    }

    @Override // defpackage.InterfaceC3529e
    public final boolean containsKey(Object obj) {
        return AbstractC5087e.vip(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public final boolean containsValue(Object obj) {
        InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
        this.f23395e.mo3328goto();
        if (interfaceC14287e != null && !C7290e.yandex((InterfaceC10518e) interfaceC14287e)) {
            return false;
        }
        C15816e c15816e = new C15816e(15);
        Object obj2 = AbstractC6503e.ad;
        if (interfaceC14287e != null) {
            C13655e f36708e = ((InterfaceC10518e) interfaceC14287e).getF36708e();
            r2 = f36708e != null ? f36708e : null;
            if (r2 == null) {
                throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
            }
        }
        realm_value_t m4012break = c15816e.m4012break(r2);
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f23397e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_contains_value(ptr$cinterop_release, m4012break.ad, m4012break, jArr);
        boolean z = jArr[0] != -1;
        c15816e.m4020interface();
        return z;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object get(Object obj) {
        InterfaceC15348e interfaceC15348e = this.f23395e;
        interfaceC15348e.mo3328goto();
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = this.f23394e.metrica(c15816e, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = this.f23397e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
        InterfaceC10518e Signature = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), this.f23393e, this.f23398e, interfaceC15348e);
        c15816e.m4020interface();
        return Signature;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object loadAd(Object obj, Object obj2, int i, Map map) {
        return (InterfaceC14287e) AbstractC5087e.remoteconfig(this, obj, (InterfaceC14287e) obj2, i, map);
    }

    @Override // defpackage.InterfaceC3529e
    public final InterfaceC3529e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        return new C11643e(this.f23398e, interfaceC15348e, AbstractC6503e.ad(AbstractC3820e.ad.vip(String.class)), longPointerWrapper, this.f23393e, this.f23400e, 1);
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: native */
    public final void mo1371native(InterfaceC6128e interfaceC6128e, int i, Map map) {
        AbstractC5087e.pro(this, interfaceC6128e, i, map);
    }

    @Override // defpackage.InterfaceC3529e
    public final Object premium(NativePointer nativePointer, int i) {
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_results_get(ptr$cinterop_release, i, realm_value_tVar.ad, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            return null;
        }
        return AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), this.f23393e, this.f23398e, this.f23395e);
    }

    @Override // defpackage.InterfaceC3529e
    public final void purchase(int i) {
        this.f23399e = i;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object remove(Object obj) {
        return (InterfaceC14287e) AbstractC5087e.signatures(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e smaato(Object obj) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = this.f23394e.metrica(c15816e, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        LongPointerWrapper longPointerWrapper = this.f23397e;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_erase(longPointerWrapper.getPtr$cinterop_release(), metrica.ad, metrica, zArr);
        C6571e c6571e = new C6571e(realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), this.f23393e, this.f23398e, this.f23395e), Boolean.valueOf(zArr[0]));
        c15816e.m4020interface();
        return c6571e;
    }

    @Override // defpackage.InterfaceC3529e
    public final int startapp() {
        return this.f23399e;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object subscription(NativePointer nativePointer, int i) {
        return AbstractC5087e.appmetrica(this, nativePointer, i);
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: throw */
    public final AbstractC8441e mo1372throw() {
        return this.f23394e;
    }

    @Override // defpackage.InterfaceC3529e
    public final NativePointer vip() {
        return this.f23397e;
    }

    @Override // defpackage.InterfaceC2750e
    public final InterfaceC15348e yandex() {
        return this.f23395e;
    }
}
