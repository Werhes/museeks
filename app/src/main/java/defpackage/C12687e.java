package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.MigrationCallback;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_class_info_t;
import io.realm.kotlin.internal.interop.realm_property_info_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12687e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ MigrationCallback f25427e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f25428e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f25429e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ long f25430e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14918e f25431e;

    public /* synthetic */ C12687e(C14918e c14918e, int i, long j, AbstractC8677e abstractC8677e, long j2, C11565e c11565e) {
        this.f25431e = c14918e;
        this.f25429e = i;
        this.f25428e = j;
        this.f25430e = j2;
        this.f25427e = c11565e;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, eٌؓۙ] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C8451e c8451e;
        long j;
        int i;
        NativePointer nativePointer = (NativePointer) obj;
        C14918e c14918e = this.f25431e;
        String str = c14918e.metrica;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_config_set_path(ptr$cinterop_release, str);
        realmcJNI.realm_config_set_schema_mode(longPointerWrapper.getPtr$cinterop_release(), AbstractC8703e.m2467class(this.f25429e));
        realmcJNI.realm_config_set_schema_version(longPointerWrapper.getPtr$cinterop_release(), this.f25428e);
        Collection values = c14918e.appmetrica.values();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            C11974e appmetrica = ((InterfaceC3055e) it.next()).appmetrica();
            arrayList.add(new C6571e(appmetrica.ad, AbstractC13480e.m3577else(appmetrica.vip, new C11021e(15))));
        }
        int size = arrayList.size();
        int i3 = AbstractC6026e.ad;
        long new_classArray = realmcJNI.new_classArray(size);
        long j2 = 0;
        int i4 = 0;
        Throwable th = null;
        realm_class_info_t realm_class_info_tVar = new_classArray == 0 ? null : new realm_class_info_t(new_classArray, false);
        long new_propertyArrayArray = realmcJNI.new_propertyArrayArray(size);
        if (new_propertyArrayArray == 0) {
            c8451e = null;
        } else {
            ?? obj2 = new Object();
            obj2.ad = new_propertyArrayArray;
            c8451e = obj2;
        }
        Iterator it2 = arrayList.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            int i6 = i5 + 1;
            C6571e c6571e = (C6571e) it2.next();
            C18234e c18234e = (C18234e) c6571e.f13544e;
            List list = (List) c6571e.f13543e;
            if (list == null || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                int i7 = i4;
                while (it3.hasNext()) {
                    long j3 = j2;
                    if (((C16427e) it3.next()).smaato && (i7 = i7 + 1) < 0) {
                        AbstractC6874e.loadAd();
                        throw th;
                    }
                    j2 = j3;
                }
                j = j2;
                i = i7;
            } else {
                j = j2;
                i = i4;
            }
            realm_class_info_t realm_class_info_tVar2 = new realm_class_info_t();
            realmcJNI.realm_class_info_t_name_set(realm_class_info_tVar2.ad, realm_class_info_tVar2, c18234e.ad);
            realmcJNI.realm_class_info_t_primary_key_set(realm_class_info_tVar2.ad, realm_class_info_tVar2, c18234e.vip);
            Iterator it4 = it2;
            LongPointerWrapper longPointerWrapper2 = longPointerWrapper;
            realmcJNI.realm_class_info_t_num_properties_set(realm_class_info_tVar2.ad, realm_class_info_tVar2, list.size() - r16);
            realmcJNI.realm_class_info_t_num_computed_properties_set(realm_class_info_tVar2.ad, realm_class_info_tVar2, i);
            realmcJNI.realm_class_info_t_key_set(realm_class_info_tVar2.ad, realm_class_info_tVar2, AbstractC15871e.metrica());
            realmcJNI.realm_class_info_t_flags_set(realm_class_info_tVar2.ad, realm_class_info_tVar2, c18234e.purchase);
            long new_propertyArray = realmcJNI.new_propertyArray(list.size());
            realm_property_info_t realm_property_info_tVar = new_propertyArray == j ? null : new realm_property_info_t(new_propertyArray, false);
            Iterator it5 = list.iterator();
            int i8 = 0;
            while (it5.hasNext()) {
                C16427e c16427e = (C16427e) it5.next();
                realm_property_info_t realm_property_info_tVar2 = new realm_property_info_t(realmcJNI.new_realm_property_info_t(), true);
                realmcJNI.realm_property_info_t_name_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, c16427e.ad);
                realmcJNI.realm_property_info_t_public_name_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, c16427e.vip);
                realmcJNI.realm_property_info_t_type_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, AbstractC1634e.purchase(c16427e.metrica));
                realmcJNI.realm_property_info_t_collection_type_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, AbstractC13501e.license(c16427e.license));
                realmcJNI.realm_property_info_t_link_target_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, c16427e.appmetrica);
                realmcJNI.realm_property_info_t_link_origin_property_name_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, c16427e.purchase);
                realmcJNI.realm_property_info_t_key_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, ((C1235e) AbstractC15871e.vip.getValue()).ad);
                realmcJNI.realm_property_info_t_flags_set(realm_property_info_tVar2.ad, realm_property_info_tVar2, c16427e.yandex);
                realmcJNI.propertyArray_setitem(realm_property_info_t.vip(realm_property_info_tVar), realm_property_info_tVar, i8, realm_property_info_tVar2.ad, realm_property_info_tVar2);
                it5 = it5;
                i8++;
            }
            realmcJNI.classArray_setitem(realm_class_info_t.vip(realm_class_info_tVar), realm_class_info_tVar, i5, realm_class_info_tVar2.ad, realm_class_info_tVar2);
            realmcJNI.propertyArrayArray_setitem(c8451e == null ? j : c8451e.ad, i5, realm_property_info_t.vip(realm_property_info_tVar), realm_property_info_tVar);
            i5 = i6;
            longPointerWrapper = longPointerWrapper2;
            j2 = j;
            it2 = it4;
            i4 = 0;
            th = null;
        }
        LongPointerWrapper longPointerWrapper3 = longPointerWrapper;
        long j4 = j2;
        try {
            LongPointerWrapper longPointerWrapper4 = new LongPointerWrapper(realmcJNI.realm_schema_new(realm_class_info_t.vip(realm_class_info_tVar), realm_class_info_tVar, size, c8451e == null ? j4 : c8451e.ad), false, 2, null);
            for (int i9 = 0; i9 < size; i9++) {
                realm_class_info_t realm_class_info_tVar3 = new realm_class_info_t(realmcJNI.classArray_getitem(realm_class_info_t.vip(realm_class_info_tVar), realm_class_info_tVar, i9), true);
                long propertyArrayArray_getitem = realmcJNI.propertyArrayArray_getitem(c8451e == null ? j4 : c8451e.ad, i9);
                realm_property_info_t realm_property_info_tVar3 = propertyArrayArray_getitem == j4 ? null : new realm_property_info_t(propertyArrayArray_getitem, false);
                long j5 = j4;
                for (long realm_class_info_t_num_computed_properties_get = realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar3.ad, realm_class_info_tVar3) + realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar3.ad, realm_class_info_tVar3); j5 < realm_class_info_t_num_computed_properties_get; realm_class_info_t_num_computed_properties_get = realm_class_info_t_num_computed_properties_get) {
                    realm_property_info_t realm_property_info_tVar4 = new realm_property_info_t(realmcJNI.propertyArray_getitem(realm_property_info_t.vip(realm_property_info_tVar3), realm_property_info_tVar3, (int) j5), true);
                    realmcJNI.realm_property_info_t_cleanup(realm_property_info_tVar4.ad, realm_property_info_tVar4);
                    realm_property_info_tVar4.ad();
                    j5++;
                }
                realmcJNI.delete_propertyArray(realm_property_info_t.vip(realm_property_info_tVar3), realm_property_info_tVar3);
                realmcJNI.realm_class_info_t_cleanup(realm_class_info_tVar3.ad, realm_class_info_tVar3);
                realm_class_info_tVar3.ad();
            }
            realmcJNI.delete_propertyArrayArray(c8451e == null ? j4 : c8451e.ad);
            realmcJNI.delete_classArray(realm_class_info_t.vip(realm_class_info_tVar), realm_class_info_tVar);
            realmcJNI.realm_config_set_schema(longPointerWrapper3.getPtr$cinterop_release(), longPointerWrapper4.getPtr$cinterop_release());
            realmcJNI.realm_config_set_max_number_of_active_versions(longPointerWrapper3.getPtr$cinterop_release(), this.f25430e);
            MigrationCallback migrationCallback = this.f25427e;
            if (migrationCallback != null) {
                realmcJNI.realm_config_set_migration_function(longPointerWrapper3.getPtr$cinterop_release(), migrationCallback);
            }
            realmcJNI.realm_config_set_automatic_backlink_handling(longPointerWrapper3.getPtr$cinterop_release(), false);
            realmcJNI.realm_config_set_in_memory(longPointerWrapper3.getPtr$cinterop_release(), false);
            return nativePointer;
        } catch (Throwable th2) {
            th = th2;
            int i10 = 0;
            while (i10 < size) {
                realm_class_info_t realm_class_info_tVar4 = new realm_class_info_t(realmcJNI.classArray_getitem(realm_class_info_t.vip(realm_class_info_tVar), realm_class_info_tVar, i10), true);
                long propertyArrayArray_getitem2 = realmcJNI.propertyArrayArray_getitem(c8451e == null ? j4 : c8451e.ad, i10);
                realm_property_info_t realm_property_info_tVar5 = propertyArrayArray_getitem2 == j4 ? null : new realm_property_info_t(propertyArrayArray_getitem2, false);
                long realm_class_info_t_num_computed_properties_get2 = realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar4.ad, realm_class_info_tVar4) + realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar4.ad, realm_class_info_tVar4);
                long j6 = j4;
                while (j6 < realm_class_info_t_num_computed_properties_get2) {
                    realm_property_info_t realm_property_info_tVar6 = new realm_property_info_t(realmcJNI.propertyArray_getitem(realm_property_info_t.vip(realm_property_info_tVar5), realm_property_info_tVar5, (int) j6), true);
                    realmcJNI.realm_property_info_t_cleanup(realm_property_info_tVar6.ad, realm_property_info_tVar6);
                    realm_property_info_tVar6.ad();
                    j6++;
                    th = th;
                }
                realmcJNI.delete_propertyArray(realm_property_info_t.vip(realm_property_info_tVar5), realm_property_info_tVar5);
                realmcJNI.realm_class_info_t_cleanup(realm_class_info_tVar4.ad, realm_class_info_tVar4);
                realm_class_info_tVar4.ad();
                i10++;
                th = th;
            }
            Throwable th3 = th;
            realmcJNI.delete_propertyArrayArray(c8451e == null ? j4 : c8451e.ad);
            realmcJNI.delete_classArray(realm_class_info_t.vip(realm_class_info_tVar), realm_class_info_tVar);
            throw th3;
        }
    }
}
