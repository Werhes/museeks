package defpackage;

import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import org.mongodb.kbson.BsonObjectId$Companion;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0373e extends AbstractC8176e {
    public final /* synthetic */ int ad;
    public static final C0373e vip = new C0373e(0);
    public static final C0373e metrica = new C0373e(1);
    public static final C0373e license = new C0373e(2);
    public static final C0373e appmetrica = new C0373e(3);
    public static final C0373e purchase = new C0373e(4);
    public static final C0373e billing = new C0373e(5);
    public static final C0373e yandex = new C0373e(6);
    public static final C0373e startapp = new C0373e(7);
    public static final C0373e adcel = new C0373e(8);
    public static final C0373e mopub = new C0373e(9);

    public /* synthetic */ C0373e(int i) {
        this.ad = i;
    }

    @Override // defpackage.AbstractC8441e
    public final realm_value_t purchase(C15816e c15816e, Object obj) {
        switch (this.ad) {
            case 0:
                return c15816e.adcel((Boolean) obj);
            case 1:
                return c15816e.advert((byte[]) obj);
            case 2:
                return c15816e.inmobi((C12355e) obj);
            case 3:
                return c15816e.applovin((Double) obj);
            case 4:
                return c15816e.firebase((Float) obj);
            case 5:
                return c15816e.m4025while((Long) obj);
            case 6:
                C2453e c2453e = (C2453e) obj;
                return C12575e.f25237e.applovin(c2453e != null ? c2453e.yandex() : null);
            case 7:
                InterfaceC6025e interfaceC6025e = (InterfaceC6025e) obj;
                return c15816e.m4019implements(interfaceC6025e != null ? (InterfaceC4476e) interfaceC6025e : null);
            case 8:
                InterfaceC17159e interfaceC17159e = (InterfaceC17159e) obj;
                return C12575e.f25237e.m3368interface(interfaceC17159e != null ? ((C7588e) interfaceC17159e).ad : null);
            default:
                return c15816e.m4015default((String) obj);
        }
    }

    @Override // defpackage.AbstractC8441e
    public final Object vip(realm_value_t realm_value_tVar) {
        switch (this.ad) {
            case 0:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                return Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar));
            case 1:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                realm_binary_t ad = realm_value_tVar.ad();
                return realmcJNI.realm_binary_t_data_get(ad.ad, ad);
            case 2:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                realm_decimal128_t metrica2 = realm_value_tVar.metrica();
                long[] realm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(metrica2.ad, metrica2);
                long[] copyOf = Arrays.copyOf(realm_decimal128_t_w_get, realm_decimal128_t_w_get.length);
                C9131e c9131e = C12355e.Companion;
                long j = copyOf[1];
                long j2 = copyOf[0];
                c9131e.getClass();
                return C9131e.ad(j, j2);
            case 3:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                return Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.ad, realm_value_tVar));
            case 4:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                return Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.ad, realm_value_tVar));
            case 5:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                return Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar));
            case 6:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                BsonObjectId$Companion bsonObjectId$Companion = C2453e.Companion;
                byte[] bArr = new byte[12];
                realm_object_id_t license2 = realm_value_tVar.license();
                short[] realm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(license2.ad, license2);
                ArrayList arrayList = new ArrayList(realm_object_id_t_bytes_get.length);
                int length = realm_object_id_t_bytes_get.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    bArr[i2] = (byte) realm_object_id_t_bytes_get[i];
                    arrayList.add(Unit.INSTANCE);
                    i++;
                    i2++;
                }
                bsonObjectId$Companion.getClass();
                return BsonObjectId$Companion.ad(bArr);
            case 7:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                return new C2577e(AbstractC15871e.vip(realm_value_tVar));
            case 8:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                byte[] bArr2 = new byte[16];
                realm_uuid_t appmetrica2 = realm_value_tVar.appmetrica();
                short[] realm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(appmetrica2.ad, appmetrica2);
                ArrayList arrayList2 = new ArrayList(realm_uuid_t_bytes_get.length);
                int length2 = realm_uuid_t_bytes_get.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    bArr2[i4] = (byte) realm_uuid_t_bytes_get[i3];
                    arrayList2.add(Unit.INSTANCE);
                    i3++;
                    i4++;
                }
                return new C7588e(bArr2);
            default:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
                    return null;
                }
                return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
    }
}
