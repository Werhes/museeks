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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6600e {
    public final realm_value_t ad;

    public /* synthetic */ C6600e(realm_value_t realm_value_tVar) {
        this.ad = realm_value_tVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6600e) {
            return AbstractC7890e.billing(this.ad, ((C6600e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        int i;
        Object obj;
        String str;
        realm_value_t realm_value_tVar = this.ad;
        int realm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar);
        int[] m2468interface = AbstractC8703e.m2468interface(14);
        int length = m2468interface.length;
        int i2 = 0;
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
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                obj = "null";
                break;
            case 1:
                obj = Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar));
                break;
            case 2:
                obj = Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar));
                break;
            case 3:
                obj = realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
                break;
            case 4:
                realm_binary_t ad = realm_value_tVar.ad();
                obj = realmcJNI.realm_binary_t_data_get(ad.ad, ad).toString();
                break;
            case 5:
                obj = AbstractC15871e.vip(realm_value_tVar).toString();
                break;
            case 6:
                obj = Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.ad, realm_value_tVar));
                break;
            case 7:
                obj = Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.ad, realm_value_tVar));
                break;
            case 8:
                realm_decimal128_t metrica = realm_value_tVar.metrica();
                long[] realm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(metrica.ad, metrica);
                obj = C15571e.appmetrica(Arrays.copyOf(realm_decimal128_t_w_get, realm_decimal128_t_w_get.length));
                break;
            case 9:
                byte[] bArr = new byte[12];
                realm_object_id_t license = realm_value_tVar.license();
                short[] realm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(license.ad, license);
                ArrayList arrayList = new ArrayList(realm_object_id_t_bytes_get.length);
                int length2 = realm_object_id_t_bytes_get.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    bArr[i5] = (byte) realm_object_id_t_bytes_get[i4];
                    arrayList.add(Unit.INSTANCE);
                    i4++;
                    i5++;
                }
                obj = bArr.toString();
                break;
            case 10:
                obj = AbstractC15871e.ad(realm_value_tVar).toString();
                break;
            case 11:
                byte[] bArr2 = new byte[16];
                realm_uuid_t appmetrica = realm_value_tVar.appmetrica();
                short[] realm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(appmetrica.ad, appmetrica);
                ArrayList arrayList2 = new ArrayList(realm_uuid_t_bytes_get.length);
                int length3 = realm_uuid_t_bytes_get.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length3) {
                    bArr2[i7] = (byte) realm_uuid_t_bytes_get[i6];
                    arrayList2.add(Unit.INSTANCE);
                    i6++;
                    i7++;
                }
                obj = bArr2.toString();
                break;
            default:
                obj = "RealmValueTransport{type: UNKNOWN, value: UNKNOWN}";
                break;
        }
        int realm_value_t_type_get2 = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar);
        int[] m2468interface2 = AbstractC8703e.m2468interface(14);
        int length4 = m2468interface2.length;
        int i8 = 0;
        while (true) {
            if (i8 < length4) {
                int i9 = m2468interface2[i8];
                if (AbstractC8703e.m2467class(i9) == realm_value_t_type_get2) {
                    i2 = i9;
                } else {
                    i8++;
                }
            }
        }
        if (i2 == 0) {
            throw new IllegalStateException(("Unknown value type: " + realm_value_t_type_get2).toString());
        }
        StringBuilder sb = new StringBuilder("RealmValueTransport{type: ");
        switch (i2) {
            case 1:
                str = "RLM_TYPE_NULL";
                break;
            case 2:
                str = "RLM_TYPE_INT";
                break;
            case 3:
                str = "RLM_TYPE_BOOL";
                break;
            case 4:
                str = "RLM_TYPE_STRING";
                break;
            case 5:
                str = "RLM_TYPE_BINARY";
                break;
            case 6:
                str = "RLM_TYPE_TIMESTAMP";
                break;
            case 7:
                str = "RLM_TYPE_FLOAT";
                break;
            case 8:
                str = "RLM_TYPE_DOUBLE";
                break;
            case 9:
                str = "RLM_TYPE_DECIMAL128";
                break;
            case 10:
                str = "RLM_TYPE_OBJECT_ID";
                break;
            case 11:
                str = "RLM_TYPE_LINK";
                break;
            case 12:
                str = "RLM_TYPE_UUID";
                break;
            case 13:
                str = "RLM_TYPE_LIST";
                break;
            case 14:
                str = "RLM_TYPE_DICTIONARY";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", value: ");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
