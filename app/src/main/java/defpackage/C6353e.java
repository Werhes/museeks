package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6353e extends AbstractC1984e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f13203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6353e(InterfaceC9543e interfaceC9543e, int i) {
        super(interfaceC9543e);
        this.f13203e = i;
    }

    @Override // defpackage.AbstractC1984e
    public final Object Signature(Object obj) {
        switch (this.f13203e) {
            case 0:
                return new C5220e(AbstractC15792e.admob((C13655e) obj), 0);
            case 1:
                return new C7249e(2);
            case 2:
                return new C10659e(2);
            case 3:
                return new C8455e(2);
            default:
                return new C0306e((C1649e) obj, 0);
        }
    }

    @Override // defpackage.AbstractC1984e
    /* renamed from: class */
    public final Object mo740class(Object obj, NativePointer nativePointer) {
        int i = 12;
        int i2 = 1;
        switch (this.f13203e) {
            case 0:
                C13655e c13655e = (C13655e) obj;
                InterfaceC10518e admob = AbstractC15792e.admob(c13655e);
                LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i3 = AbstractC6026e.ad;
                long realm_object_changes_get_num_modified_properties = realmcJNI.realm_object_changes_get_num_modified_properties(ptr$cinterop_release);
                int i4 = (int) realm_object_changes_get_num_modified_properties;
                long[] jArr = new long[i4];
                realmcJNI.realm_object_changes_get_modified_properties(longPointerWrapper.getPtr$cinterop_release(), jArr, realm_object_changes_get_num_modified_properties);
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(new C1235e(jArr[i5]));
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C16406e ad = c13655e.f27076e.ad(((C1235e) it.next()).ad);
                    arrayList2.add(ad != null ? ad.vip : BuildConfig.FLAVOR);
                }
                return new C5220e(admob, 1);
            case 1:
                long[] jArr2 = {0};
                long[] jArr3 = {0};
                long[] jArr4 = {0};
                LongPointerWrapper longPointerWrapper2 = (LongPointerWrapper) nativePointer;
                long ptr$cinterop_release2 = longPointerWrapper2.getPtr$cinterop_release();
                int i6 = AbstractC6026e.ad;
                realmcJNI.realm_dictionary_get_changes(ptr$cinterop_release2, jArr2, jArr3, jArr4, new boolean[1]);
                realm_value_t metrica = AbstractC6026e.metrica((int) jArr2[0]);
                realm_value_t metrica2 = AbstractC6026e.metrica((int) jArr3[0]);
                realm_value_t metrica3 = AbstractC6026e.metrica((int) jArr4[0]);
                realmcJNI.realm_dictionary_get_changed_keys(longPointerWrapper2.getPtr$cinterop_release(), realm_value_t.vip(metrica), metrica, jArr2, realm_value_t.vip(metrica2), metrica2, jArr3, realm_value_t.vip(metrica3), metrica3, jArr4, new boolean[]{false});
                C7266e subscription = AbstractC3062e.subscription(jArr2[0]);
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(subscription, 10));
                Iterator it2 = subscription.iterator();
                while (true) {
                    C12027e c12027e = (C12027e) it2;
                    if (c12027e.f24048e) {
                        realm_value_t realm_value_tVar = new realm_value_t(realmcJNI.valueArray_getitem(realm_value_t.vip(metrica), metrica, (int) c12027e.nextLong()), true);
                        arrayList3.add(realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar));
                    } else {
                        C7266e subscription2 = AbstractC3062e.subscription(jArr3[0]);
                        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(subscription2, 10));
                        Iterator it3 = subscription2.iterator();
                        while (true) {
                            C12027e c12027e2 = (C12027e) it3;
                            if (c12027e2.f24048e) {
                                realm_value_t realm_value_tVar2 = new realm_value_t(realmcJNI.valueArray_getitem(realm_value_t.vip(metrica2), metrica2, (int) c12027e2.nextLong()), true);
                                arrayList4.add(realmcJNI.realm_value_t_string_get(realm_value_tVar2.ad, realm_value_tVar2));
                            } else {
                                C7266e subscription3 = AbstractC3062e.subscription(jArr4[0]);
                                ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(subscription3, 10));
                                Iterator it4 = subscription3.iterator();
                                while (true) {
                                    C12027e c12027e3 = (C12027e) it4;
                                    if (!c12027e3.f24048e) {
                                        realmcJNI.delete_valueArray(realm_value_t.vip(metrica), metrica);
                                        realmcJNI.delete_valueArray(realm_value_t.vip(metrica2), metrica2);
                                        realmcJNI.delete_valueArray(realm_value_t.vip(metrica3), metrica3);
                                        return new C16728e(i);
                                    }
                                    realm_value_t realm_value_tVar3 = new realm_value_t(realmcJNI.valueArray_getitem(realm_value_t.vip(metrica3), metrica3, (int) c12027e3.nextLong()), true);
                                    arrayList5.add(realmcJNI.realm_value_t_string_get(realm_value_tVar3.ad, realm_value_tVar3));
                                }
                            }
                        }
                    }
                }
            case 2:
                AbstractC14228e abstractC14228e = new AbstractC14228e(nativePointer);
                Object[] objArr = (Object[]) abstractC14228e.ad;
                if (objArr == null) {
                    objArr = null;
                }
                Object[] objArr2 = (Object[]) abstractC14228e.vip;
                if (objArr2 == null) {
                    objArr2 = null;
                }
                Object[] objArr3 = (Object[]) abstractC14228e.license;
                return new C0136e(11);
            case 3:
                new AbstractC14228e(nativePointer);
                return new C10215e(i);
            default:
                C1649e c1649e = (C1649e) obj;
                AbstractC14228e abstractC14228e2 = new AbstractC14228e(nativePointer);
                Object[] objArr4 = (Object[]) abstractC14228e2.ad;
                if (objArr4 == null) {
                    objArr4 = null;
                }
                Object[] objArr5 = (Object[]) abstractC14228e2.vip;
                if (objArr5 == null) {
                    objArr5 = null;
                }
                Object[] objArr6 = (Object[]) abstractC14228e2.license;
                return new C0306e(c1649e, i2);
        }
    }

    @Override // defpackage.AbstractC1984e
    public final Object license() {
        switch (this.f13203e) {
            case 0:
                return new C1679e(0);
            case 1:
                new LinkedHashMap(new LinkedHashMap());
                return new C14914e(27);
            case 2:
                new ArrayList();
                return new C9616e(27);
            case 3:
                new LinkedHashSet();
                return new C15802e(27);
            default:
                throw new RuntimeException("Results should never have been deleted");
        }
    }
}
