package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5236e implements InterfaceC12556e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f11139e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final LongPointerWrapper f11140e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC15348e f11141e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC7227e f11142e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17974e f11143e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f11144e;

    public C5236e(C17974e c17974e, InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper, InterfaceC7227e interfaceC7227e, long j, int i) {
        this.f11144e = i;
        this.f11143e = c17974e;
        this.f11141e = interfaceC15348e;
        this.f11140e = longPointerWrapper;
        this.f11142e = interfaceC7227e;
        this.f11139e = j;
    }

    @Override // defpackage.InterfaceC12556e
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final InterfaceC14287e get(int i) {
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = this.f11140e.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_list_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            return null;
        }
        return AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), this.f11142e, this.f11143e, this.f11141e);
    }

    @Override // defpackage.InterfaceC12556e
    public final boolean contains(Object obj) {
        return indexOf((InterfaceC14287e) obj) != -1;
    }

    @Override // defpackage.InterfaceC12556e
    public final Object firebase(int i, Object obj, int i2, LinkedHashMap linkedHashMap) {
        int i3 = this.f11144e;
        LongPointerWrapper longPointerWrapper = this.f11140e;
        InterfaceC15348e interfaceC15348e = this.f11141e;
        C17974e c17974e = this.f11143e;
        switch (i3) {
            case 0:
                InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                realm_value_t realm_value_tVar = new realm_value_t();
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i4 = AbstractC6026e.ad;
                realm_link_t realm_link_tVar = new realm_link_t(realmcJNI.realm_object_as_link(realmcJNI.realm_list_set_embedded(ptr$cinterop_release, i)), true);
                realm_value_tVar.billing(10);
                realm_value_tVar.purchase(realm_link_tVar);
                InterfaceC10518e Signature = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 0 ? AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), this.f11142e, c17974e, interfaceC15348e) : null;
                C12575e.amazon(Signature, interfaceC14287e, i2, linkedHashMap);
                for (Object obj2 : linkedHashSet) {
                    if (obj2 instanceof realm_value_t) {
                        realm_value_t realm_value_tVar2 = (realm_value_t) obj2;
                        int i5 = AbstractC6026e.ad;
                        realmcJNI.realm_value_t_cleanup(realm_value_tVar2.ad, realm_value_tVar2);
                    } else if (obj2 instanceof C10896e) {
                        realm_query_arg_t realm_query_arg_tVar = ((C10896e) obj2).vip;
                        int i6 = AbstractC6026e.ad;
                        realmcJNI.delete_queryArgArray(realm_query_arg_t.ad(realm_query_arg_tVar), realm_query_arg_tVar);
                    } else if (obj2 instanceof C9900e) {
                        realm_value_t realm_value_tVar3 = (realm_value_t) ((C9900e) obj2).ad.f26878e;
                        realmcJNI.delete_valueArray(realm_value_t.vip(realm_value_tVar3), realm_value_tVar3);
                    }
                }
                return Signature;
            default:
                InterfaceC14287e interfaceC14287e2 = (InterfaceC14287e) obj;
                C15816e c15816e = new C15816e(15);
                if (interfaceC14287e2 != null) {
                    C13655e f36708e = ((InterfaceC10518e) interfaceC14287e2).getF36708e();
                    if (f36708e == null) {
                        interfaceC14287e2 = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), interfaceC14287e2, i2, linkedHashMap);
                    } else if (!AbstractC7890e.billing(f36708e.f27072e, interfaceC15348e)) {
                        throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    interfaceC14287e2 = null;
                }
                realm_value_t m4012break = c15816e.m4012break(interfaceC14287e2 != null ? ((InterfaceC10518e) interfaceC14287e2).getF36708e() : null);
                InterfaceC14287e interfaceC14287e3 = get(i);
                long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                int i7 = AbstractC6026e.ad;
                realmcJNI.realm_list_set(ptr$cinterop_release2, i, m4012break.ad, m4012break);
                c15816e.m4020interface();
                return interfaceC14287e3;
        }
    }

    @Override // defpackage.InterfaceC12556e
    public final int indexOf(Object obj) {
        InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
        if (interfaceC14287e != null && !C7290e.yandex((InterfaceC10518e) interfaceC14287e)) {
            return -1;
        }
        C15816e c15816e = new C15816e(15);
        if (interfaceC14287e != null) {
            C13655e f36708e = ((InterfaceC10518e) interfaceC14287e).getF36708e();
            r1 = f36708e != null ? f36708e : null;
            if (r1 == null) {
                throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
            }
        }
        realm_value_t m4012break = c15816e.m4012break(r1);
        long[] jArr = new long[1];
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = this.f11140e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_find(ptr$cinterop_release, m4012break.ad, m4012break, jArr, zArr);
        int i2 = (int) (zArr[0] ? jArr[0] : -1L);
        c15816e.m4020interface();
        return i2;
    }

    @Override // defpackage.InterfaceC12556e
    public final boolean inmobi(int i, Collection collection, int i2, Map map) {
        return AbstractC5087e.yandex(this, i, collection, i2, map);
    }

    @Override // defpackage.InterfaceC12556e
    public final void isVip(int i, Object obj, int i2, Map map) {
        int i3 = this.f11144e;
        LongPointerWrapper longPointerWrapper = this.f11140e;
        InterfaceC15348e interfaceC15348e = this.f11141e;
        C17974e c17974e = this.f11143e;
        switch (i3) {
            case 0:
                InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i4 = AbstractC6026e.ad;
                C12575e.amazon(AbstractC15792e.subscription(new LongPointerWrapper(realmcJNI.realm_list_insert_embedded(ptr$cinterop_release, i), false, 2, null), AbstractC3820e.ad.vip(interfaceC14287e.getClass()), c17974e, interfaceC15348e), interfaceC14287e, i2, map);
                return;
            default:
                InterfaceC14287e interfaceC14287e2 = (InterfaceC14287e) obj;
                C15816e c15816e = new C15816e(15);
                if (interfaceC14287e2 != null) {
                    C13655e f36708e = ((InterfaceC10518e) interfaceC14287e2).getF36708e();
                    if (f36708e == null) {
                        interfaceC14287e2 = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), interfaceC14287e2, i2, map);
                    } else if (!AbstractC7890e.billing(f36708e.f27072e, interfaceC15348e)) {
                        throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    interfaceC14287e2 = null;
                }
                realm_value_t m4012break = c15816e.m4012break(interfaceC14287e2 != null ? ((InterfaceC10518e) interfaceC14287e2).getF36708e() : null);
                long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                int i5 = AbstractC6026e.ad;
                realmcJNI.realm_list_insert(ptr$cinterop_release2, i, m4012break.ad, m4012break);
                Unit unit = Unit.INSTANCE;
                c15816e.m4020interface();
                return;
        }
    }

    @Override // defpackage.InterfaceC12556e
    public final InterfaceC12556e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        switch (this.f11144e) {
            case 0:
                return new C5236e(this.f11143e, interfaceC15348e, longPointerWrapper, this.f11142e, this.f11139e, 0);
            default:
                return new C5236e(this.f11143e, interfaceC15348e, longPointerWrapper, this.f11142e, this.f11139e, 1);
        }
    }

    @Override // defpackage.InterfaceC12556e
    public final boolean remove(Object obj) {
        return AbstractC5087e.tapsense(this, (InterfaceC14287e) obj);
    }

    @Override // defpackage.InterfaceC12556e
    public final NativePointer vip() {
        return this.f11140e;
    }

    @Override // defpackage.InterfaceC2750e
    public final InterfaceC15348e yandex() {
        return this.f11141e;
    }
}
