package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.mongodb.kbson.BsonObjectId$Companion;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18013e implements InterfaceC3529e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f35330e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC8441e f35331e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC15348e f35332e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final LongPointerWrapper f35333e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17974e f35334e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f35335e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f35336e;

    public C18013e(C17974e c17974e, InterfaceC15348e interfaceC15348e, AbstractC8441e abstractC8441e, LongPointerWrapper longPointerWrapper, boolean z, boolean z2) {
        this.f35334e = c17974e;
        this.f35332e = interfaceC15348e;
        this.f35331e = abstractC8441e;
        this.f35333e = longPointerWrapper;
        this.f35330e = z;
        this.f35336e = z2;
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e Signature(int i) {
        this.f35332e.mo3328goto();
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_t realm_value_tVar2 = new realm_value_t();
        long ptr$cinterop_release = this.f35333e.getPtr$cinterop_release();
        long j = i;
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar, realm_value_tVar2.ad, realm_value_tVar2);
        Object license = this.f35331e.license(realm_value_tVar);
        return new C6571e(license, ad(license));
    }

    public final C8648e ad(Object obj) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = this.f35331e.metrica(c15816e, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = this.f35333e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
        C8648e license = license(realm_value_tVar, metrica);
        c15816e.m4020interface();
        return license;
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e admob(Object obj) {
        return AbstractC5087e.metrica(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e ads(Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        return AbstractC5087e.billing(this, obj, (InterfaceC5045e) obj2, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e advert(final Object obj, Object obj2, final int i, final Map map) {
        InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj2;
        C15816e c15816e = new C15816e(15);
        final realm_value_t metrica = this.f35331e.metrica(c15816e, obj);
        C17874e c17874e = new C17874e(c15816e, this, metrica);
        C4788e c4788e = new C4788e(this, i, map, c15816e, metrica);
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: eٟ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C18013e f36057e;

            {
                this.f36057e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i3 = i2;
                Map map2 = map;
                int i4 = i;
                realm_value_t realm_value_tVar = metrica;
                Object obj4 = obj;
                C18013e c18013e = this.f36057e;
                InterfaceC5045e interfaceC5045e2 = (InterfaceC5045e) obj3;
                switch (i3) {
                    case 0:
                        C8648e ad = c18013e.ad(obj4);
                        long ptr$cinterop_release = c18013e.f35333e.getPtr$cinterop_release();
                        int i5 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_list(ptr$cinterop_release, realm_value_t.vip(realm_value_tVar), realm_value_tVar), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC5087e.yandex(new C6613e(c18013e.f35334e, c18013e.f35332e, longPointerWrapper, c18013e.f35330e, c18013e.f35336e), 0, (InterfaceC17101e) ((C8648e) interfaceC5045e2).advert(12), i4, map2);
                        return new C6571e(ad, Boolean.TRUE);
                    default:
                        C8648e ad2 = c18013e.ad(obj4);
                        long ptr$cinterop_release2 = c18013e.f35333e.getPtr$cinterop_release();
                        int i6 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_dictionary(ptr$cinterop_release2, realm_value_t.vip(realm_value_tVar), realm_value_tVar), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC5087e.pro(AbstractC6022e.yandex(c18013e.f35334e, c18013e.f35332e, longPointerWrapper2, c18013e.f35330e, c18013e.f35336e), (InterfaceC6128e) ((C8648e) interfaceC5045e2).advert(13), i4, map2);
                        return new C6571e(ad2, Boolean.TRUE);
                }
            }
        };
        final int i3 = 1;
        return (C6571e) AbstractC6503e.vip(c15816e, interfaceC5045e, c17874e, c4788e, function1, new Function1(this) { // from class: eٟ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C18013e f36057e;

            {
                this.f36057e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i32 = i3;
                Map map2 = map;
                int i4 = i;
                realm_value_t realm_value_tVar = metrica;
                Object obj4 = obj;
                C18013e c18013e = this.f36057e;
                InterfaceC5045e interfaceC5045e2 = (InterfaceC5045e) obj3;
                switch (i32) {
                    case 0:
                        C8648e ad = c18013e.ad(obj4);
                        long ptr$cinterop_release = c18013e.f35333e.getPtr$cinterop_release();
                        int i5 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_list(ptr$cinterop_release, realm_value_t.vip(realm_value_tVar), realm_value_tVar), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC5087e.yandex(new C6613e(c18013e.f35334e, c18013e.f35332e, longPointerWrapper, c18013e.f35330e, c18013e.f35336e), 0, (InterfaceC17101e) ((C8648e) interfaceC5045e2).advert(12), i4, map2);
                        return new C6571e(ad, Boolean.TRUE);
                    default:
                        C8648e ad2 = c18013e.ad(obj4);
                        long ptr$cinterop_release2 = c18013e.f35333e.getPtr$cinterop_release();
                        int i6 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_dictionary(ptr$cinterop_release2, realm_value_t.vip(realm_value_tVar), realm_value_tVar), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC5087e.pro(AbstractC6022e.yandex(c18013e.f35334e, c18013e.f35332e, longPointerWrapper2, c18013e.f35330e, c18013e.f35336e), (InterfaceC6128e) ((C8648e) interfaceC5045e2).advert(13), i4, map2);
                        return new C6571e(ad2, Boolean.TRUE);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC3529e
    public final int appmetrica() {
        return AbstractC5087e.purchase(this);
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: class */
    public final boolean mo1370class(Object obj, Object obj2) {
        return AbstractC7890e.billing((InterfaceC5045e) obj, (InterfaceC5045e) obj2);
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
        realm_value_t m4012break;
        InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj;
        this.f35332e.mo3328goto();
        C12575e c12575e = C12575e.f25237e;
        if ((interfaceC5045e != null ? ((C8648e) interfaceC5045e).ad : 0) == 11) {
            if (!C7290e.yandex(((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC10518e.class)))) {
                return false;
            }
        }
        C15816e c15816e = new C15816e(15);
        if (interfaceC5045e == null) {
            m4012break = c15816e.m4024try();
        } else {
            C8648e c8648e = (C8648e) interfaceC5045e;
            int i = c8648e.ad;
            switch (AbstractC8703e.m2467class(i)) {
                case 10:
                    InterfaceC14287e startapp = c8648e.startapp(AbstractC3820e.ad.vip(InterfaceC14287e.class));
                    if (startapp != null) {
                        C13655e f36708e = ((InterfaceC10518e) startapp).getF36708e();
                        r0 = f36708e != null ? f36708e : null;
                        if (r0 == null) {
                            throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
                        }
                    }
                    m4012break = c15816e.m4012break(r0);
                    break;
                case 11:
                case 12:
                    throw new IllegalArgumentException("Cannot pass unmanaged collections as input argument");
                default:
                    switch (AbstractC8703e.m2467class(i)) {
                        case 0:
                            m4012break = c15816e.m4025while(Long.valueOf(c8648e.purchase()));
                            break;
                        case 1:
                            m4012break = c15816e.adcel(Boolean.valueOf(c8648e.ad()));
                            break;
                        case 2:
                            m4012break = c15816e.m4015default(c8648e.mopub());
                            break;
                        case 3:
                            m4012break = c15816e.advert(c8648e.vip());
                            break;
                        case 4:
                            m4012break = c15816e.m4019implements((C2577e) c8648e.yandex());
                            break;
                        case 5:
                            m4012break = c15816e.firebase(Float.valueOf(c8648e.appmetrica()));
                            break;
                        case 6:
                            m4012break = c15816e.applovin(Double.valueOf(c8648e.license()));
                            break;
                        case 7:
                            m4012break = c15816e.inmobi(c8648e.metrica());
                            break;
                        case 8:
                            m4012break = c12575e.applovin(c8648e.billing().yandex());
                            break;
                        case 9:
                            m4012break = c12575e.m3368interface(((C7588e) c8648e.adcel()).ad);
                            break;
                        default:
                            throw new UnsupportedOperationException("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                    }
            }
        }
        realm_value_t realm_value_tVar = m4012break;
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f35333e.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_contains_value(ptr$cinterop_release, realm_value_tVar.ad, realm_value_tVar, jArr);
        boolean z = jArr[0] != -1;
        c15816e.m4020interface();
        return z;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object get(Object obj) {
        this.f35332e.mo3328goto();
        return ad(obj);
    }

    public final C8648e license(realm_value_t realm_value_tVar, realm_value_t realm_value_tVar2) {
        int i;
        InterfaceC7227e interfaceC7227e;
        InterfaceC7227e vip;
        int i2 = 0;
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (!z) {
            if (z) {
                throw new C14803e(10);
            }
            int realm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar);
            int[] m2468interface = AbstractC8703e.m2468interface(14);
            int length = m2468interface.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i = 0;
                    break;
                }
                i = m2468interface[i3];
                if (AbstractC8703e.m2467class(i) == realm_value_t_type_get) {
                    break;
                }
                i3++;
            }
            if (i == 0) {
                throw new IllegalStateException(("Unknown value type: " + realm_value_t_type_get).toString());
            }
            int m2467class = AbstractC8703e.m2467class(i);
            LongPointerWrapper longPointerWrapper = this.f35333e;
            C17974e c17974e = this.f35334e;
            InterfaceC15348e interfaceC15348e = this.f35332e;
            boolean z2 = this.f35330e;
            boolean z3 = this.f35336e;
            switch (m2467class) {
                case 0:
                    break;
                case 1:
                    return new C8648e(1, AbstractC3820e.ad.vip(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)));
                case 2:
                    return new C8648e(2, AbstractC3820e.ad.vip(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)));
                case 3:
                    return new C8648e(3, AbstractC3820e.ad.vip(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar));
                case 4:
                    realm_binary_t ad = realm_value_tVar.ad();
                    return new C8648e(4, AbstractC3820e.ad.vip(byte[].class), realmcJNI.realm_binary_t_data_get(ad.ad, ad));
                case 5:
                    return new C8648e(5, AbstractC3820e.ad.vip(InterfaceC6025e.class), new C2577e(AbstractC15871e.vip(realm_value_tVar)));
                case 6:
                    return new C8648e(6, AbstractC3820e.ad.vip(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.ad, realm_value_tVar)));
                case 7:
                    return new C8648e(7, AbstractC3820e.ad.vip(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.ad, realm_value_tVar)));
                case 8:
                    realm_decimal128_t metrica = realm_value_tVar.metrica();
                    long[] realm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(metrica.ad, metrica);
                    long[] copyOf = Arrays.copyOf(realm_decimal128_t_w_get, realm_decimal128_t_w_get.length);
                    C9131e c9131e = C12355e.Companion;
                    long j = copyOf[1];
                    long j2 = copyOf[0];
                    c9131e.getClass();
                    return new C8648e(8, AbstractC3820e.ad.vip(C12355e.class), C9131e.ad(j, j2));
                case 9:
                    BsonObjectId$Companion bsonObjectId$Companion = C2453e.Companion;
                    byte[] bArr = new byte[12];
                    realm_object_id_t license = realm_value_tVar.license();
                    short[] realm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(license.ad, license);
                    ArrayList arrayList = new ArrayList(realm_object_id_t_bytes_get.length);
                    int length2 = realm_object_id_t_bytes_get.length;
                    int i4 = 0;
                    while (i2 < length2) {
                        bArr[i4] = (byte) realm_object_id_t_bytes_get[i2];
                        arrayList.add(Unit.INSTANCE);
                        i2++;
                        i4++;
                    }
                    bsonObjectId$Companion.getClass();
                    return new C8648e(9, AbstractC3820e.ad.vip(C2453e.class), BsonObjectId$Companion.ad(bArr));
                case 10:
                    if (!z2) {
                        C18085e vip2 = interfaceC15348e.advert().vip(AbstractC15871e.ad(realm_value_tVar).ad);
                        if (vip2 == null || (interfaceC7227e = vip2.startapp) == null) {
                            throw new IllegalArgumentException("The object class is not present in the current schema - are you using an outdated schema version?");
                        }
                        return new C8648e(11, interfaceC7227e, (InterfaceC17544e) ((InterfaceC1340e) (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 0 ? AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), interfaceC7227e, c17974e, interfaceC15348e) : null)));
                    }
                    if (z3) {
                        vip = AbstractC3820e.ad.vip(DynamicMutableRealmObject.class);
                    } else {
                        if (z3) {
                            throw new C14803e(10);
                        }
                        vip = AbstractC3820e.ad.vip(InterfaceC16120e.class);
                    }
                    return new C8648e(11, AbstractC3820e.ad.vip(InterfaceC16120e.class), (InterfaceC16120e) (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 0 ? AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), vip, c17974e, interfaceC15348e) : null));
                case 11:
                    byte[] bArr2 = new byte[16];
                    realm_uuid_t appmetrica = realm_value_tVar.appmetrica();
                    short[] realm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(appmetrica.ad, appmetrica);
                    ArrayList arrayList2 = new ArrayList(realm_uuid_t_bytes_get.length);
                    int length3 = realm_uuid_t_bytes_get.length;
                    int i5 = 0;
                    while (i2 < length3) {
                        bArr2[i5] = (byte) realm_uuid_t_bytes_get[i2];
                        arrayList2.add(Unit.INSTANCE);
                        i2++;
                        i5++;
                    }
                    return new C8648e(10, AbstractC3820e.ad.vip(InterfaceC17159e.class), new C7588e(bArr2));
                case 12:
                    long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                    int i6 = AbstractC6026e.ad;
                    LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_dictionary_get_list(ptr$cinterop_release, realm_value_t.vip(realm_value_tVar2), realm_value_tVar2), false, 2, null);
                    return new C8648e(12, AbstractC3820e.ad.vip(InterfaceC5045e.class), new C9889e(null, longPointerWrapper2, new C6613e(c17974e, interfaceC15348e, longPointerWrapper2, z2, z3)));
                case 13:
                    long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                    int i7 = AbstractC6026e.ad;
                    LongPointerWrapper longPointerWrapper3 = new LongPointerWrapper(realmcJNI.realm_dictionary_get_dictionary(ptr$cinterop_release2, realm_value_t.vip(realm_value_tVar2), realm_value_tVar2), false, 2, null);
                    return new C8648e(13, AbstractC3820e.ad.vip(InterfaceC5045e.class), new AbstractC8807e(null, longPointerWrapper3, AbstractC6022e.yandex(c17974e, interfaceC15348e, longPointerWrapper3, z2, z3)));
                default:
                    throw new IllegalArgumentException("Unsupported type: ".concat(AbstractC8647e.m2456extends(i)));
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object loadAd(Object obj, Object obj2, int i, Map map) {
        return (InterfaceC5045e) AbstractC5087e.remoteconfig(this, obj, (InterfaceC5045e) obj2, i, map);
    }

    @Override // defpackage.InterfaceC3529e
    public final InterfaceC3529e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        return new C18013e(this.f35334e, interfaceC15348e, this.f35331e, longPointerWrapper, this.f35330e, this.f35336e);
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: native */
    public final void mo1371native(InterfaceC6128e interfaceC6128e, int i, Map map) {
        AbstractC5087e.pro(this, interfaceC6128e, i, map);
    }

    @Override // defpackage.InterfaceC3529e
    public final Object premium(NativePointer nativePointer, int i) {
        int i2;
        InterfaceC7227e interfaceC7227e;
        InterfaceC7227e vip;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i3 = AbstractC6026e.ad;
        realmcJNI.realm_results_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (!z) {
            if (z) {
                throw new C14803e(10);
            }
            int realm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar);
            int[] m2468interface = AbstractC8703e.m2468interface(14);
            int length = m2468interface.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i2 = 0;
                    break;
                }
                i2 = m2468interface[i4];
                if (AbstractC8703e.m2467class(i2) == realm_value_t_type_get) {
                    break;
                }
                i4++;
            }
            if (i2 == 0) {
                throw new IllegalStateException(("Unknown value type: " + realm_value_t_type_get).toString());
            }
            int m2467class = AbstractC8703e.m2467class(i2);
            C17974e c17974e = this.f35334e;
            InterfaceC15348e interfaceC15348e = this.f35332e;
            boolean z2 = this.f35330e;
            boolean z3 = this.f35336e;
            switch (m2467class) {
                case 0:
                    break;
                case 1:
                    return new C8648e(1, AbstractC3820e.ad.vip(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)));
                case 2:
                    return new C8648e(2, AbstractC3820e.ad.vip(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)));
                case 3:
                    return new C8648e(3, AbstractC3820e.ad.vip(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar));
                case 4:
                    realm_binary_t ad = realm_value_tVar.ad();
                    return new C8648e(4, AbstractC3820e.ad.vip(byte[].class), realmcJNI.realm_binary_t_data_get(ad.ad, ad));
                case 5:
                    return new C8648e(5, AbstractC3820e.ad.vip(InterfaceC6025e.class), new C2577e(AbstractC15871e.vip(realm_value_tVar)));
                case 6:
                    return new C8648e(6, AbstractC3820e.ad.vip(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.ad, realm_value_tVar)));
                case 7:
                    return new C8648e(7, AbstractC3820e.ad.vip(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.ad, realm_value_tVar)));
                case 8:
                    realm_decimal128_t metrica = realm_value_tVar.metrica();
                    long[] realm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(metrica.ad, metrica);
                    long[] copyOf = Arrays.copyOf(realm_decimal128_t_w_get, realm_decimal128_t_w_get.length);
                    C9131e c9131e = C12355e.Companion;
                    long j2 = copyOf[1];
                    long j3 = copyOf[0];
                    c9131e.getClass();
                    return new C8648e(8, AbstractC3820e.ad.vip(C12355e.class), C9131e.ad(j2, j3));
                case 9:
                    BsonObjectId$Companion bsonObjectId$Companion = C2453e.Companion;
                    byte[] bArr = new byte[12];
                    realm_object_id_t license = realm_value_tVar.license();
                    short[] realm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(license.ad, license);
                    ArrayList arrayList = new ArrayList(realm_object_id_t_bytes_get.length);
                    int length2 = realm_object_id_t_bytes_get.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length2) {
                        bArr[i6] = (byte) realm_object_id_t_bytes_get[i5];
                        arrayList.add(Unit.INSTANCE);
                        i5++;
                        i6++;
                    }
                    bsonObjectId$Companion.getClass();
                    return new C8648e(9, AbstractC3820e.ad.vip(C2453e.class), BsonObjectId$Companion.ad(bArr));
                case 10:
                    if (!z2) {
                        C18085e vip2 = interfaceC15348e.advert().vip(AbstractC15871e.ad(realm_value_tVar).ad);
                        if (vip2 == null || (interfaceC7227e = vip2.startapp) == null) {
                            throw new IllegalArgumentException("The object class is not present in the current schema - are you using an outdated schema version?");
                        }
                        return new C8648e(11, interfaceC7227e, (InterfaceC17544e) ((InterfaceC1340e) (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 0 ? AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), interfaceC7227e, c17974e, interfaceC15348e) : null)));
                    }
                    if (z3) {
                        vip = AbstractC3820e.ad.vip(DynamicMutableRealmObject.class);
                    } else {
                        if (z3) {
                            throw new C14803e(10);
                        }
                        vip = AbstractC3820e.ad.vip(InterfaceC16120e.class);
                    }
                    return new C8648e(11, AbstractC3820e.ad.vip(InterfaceC16120e.class), (InterfaceC16120e) (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 0 ? AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), vip, c17974e, interfaceC15348e) : null));
                case 11:
                    byte[] bArr2 = new byte[16];
                    realm_uuid_t appmetrica = realm_value_tVar.appmetrica();
                    short[] realm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(appmetrica.ad, appmetrica);
                    ArrayList arrayList2 = new ArrayList(realm_uuid_t_bytes_get.length);
                    int length3 = realm_uuid_t_bytes_get.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length3) {
                        bArr2[i8] = (byte) realm_uuid_t_bytes_get[i7];
                        arrayList2.add(Unit.INSTANCE);
                        i7++;
                        i8++;
                    }
                    return new C8648e(10, AbstractC3820e.ad.vip(InterfaceC17159e.class), new C7588e(bArr2));
                case 12:
                    long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                    int i9 = AbstractC6026e.ad;
                    LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_results_get_list(ptr$cinterop_release2, j), false, 2, null);
                    return new C8648e(12, AbstractC3820e.ad.vip(InterfaceC5045e.class), new C9889e(null, longPointerWrapper2, new C6613e(c17974e, interfaceC15348e, longPointerWrapper2, z2, z3)));
                case 13:
                    long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
                    int i10 = AbstractC6026e.ad;
                    LongPointerWrapper longPointerWrapper3 = new LongPointerWrapper(realmcJNI.realm_results_get_dictionary(ptr$cinterop_release3, j), false, 2, null);
                    return new C8648e(13, AbstractC3820e.ad.vip(InterfaceC5045e.class), new AbstractC8807e(null, longPointerWrapper3, AbstractC6022e.yandex(c17974e, interfaceC15348e, longPointerWrapper3, z2, z3)));
                default:
                    throw new IllegalArgumentException("Unsupported type: ".concat(AbstractC8647e.m2456extends(i2)));
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC3529e
    public final void purchase(int i) {
        this.f35335e = i;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object remove(Object obj) {
        return (InterfaceC5045e) AbstractC5087e.signatures(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public final C6571e smaato(Object obj) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = this.f35331e.metrica(c15816e, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        LongPointerWrapper longPointerWrapper = this.f35333e;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_erase(longPointerWrapper.getPtr$cinterop_release(), metrica.ad, metrica, zArr);
        C6571e c6571e = new C6571e(license(realm_value_tVar, metrica), Boolean.valueOf(zArr[0]));
        c15816e.m4020interface();
        return c6571e;
    }

    @Override // defpackage.InterfaceC3529e
    public final int startapp() {
        return this.f35335e;
    }

    @Override // defpackage.InterfaceC3529e
    public final Object subscription(NativePointer nativePointer, int i) {
        return AbstractC5087e.appmetrica(this, nativePointer, i);
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: throw */
    public final AbstractC8441e mo1372throw() {
        return this.f35331e;
    }

    @Override // defpackage.InterfaceC3529e
    public final NativePointer vip() {
        return this.f35333e;
    }

    @Override // defpackage.InterfaceC2750e
    public final InterfaceC15348e yandex() {
        return this.f35332e;
    }
}
