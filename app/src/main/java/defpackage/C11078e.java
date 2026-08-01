package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11078e extends AbstractC9876e implements InterfaceC5606e {
    public final long appmetrica;
    public final int billing;
    public final List license;
    public final List metrica;
    public final long purchase;

    public C11078e(List list, List list2, long j, long j2, int i) {
        this.metrica = list;
        this.license = list2;
        this.appmetrica = j;
        this.purchase = j2;
        this.billing = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11078e)) {
            return false;
        }
        C11078e c11078e = (C11078e) obj;
        return this.metrica.equals(c11078e.metrica) && AbstractC7890e.billing(this.license, c11078e.license) && C2152e.vip(this.appmetrica, c11078e.appmetrica) && C2152e.vip(this.purchase, c11078e.purchase) && this.billing == c11078e.billing;
    }

    public final int hashCode() {
        int hashCode = this.metrica.hashCode() * 31;
        List list = this.license;
        return ((C2152e.billing(this.purchase) + ((C2152e.billing(this.appmetrica) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31) + this.billing;
    }

    @Override // defpackage.AbstractC9876e
    public final Shader metrica(long j) {
        long j2 = this.appmetrica;
        float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : j2 & 4294967295L));
        long j3 = this.purchase;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j3 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : j3 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j3 & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : j3 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.metrica;
        List list2 = this.license;
        AbstractC8306e.yandex(list, list2);
        int vip = AbstractC8306e.vip(list);
        return new LinearGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), AbstractC8306e.appmetrica(vip, list), AbstractC8306e.purchase(vip, list2, list), AbstractC12110e.license(this.billing));
    }

    public final String toString() {
        String str;
        long j = this.appmetrica;
        long j2 = (((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String str2 = BuildConfig.FLAVOR;
        if (j2 == 0) {
            str = "start=" + ((Object) C2152e.mopub(j)) + ", ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        long j3 = this.purchase;
        if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C2152e.mopub(j3)) + ", ";
        }
        return "LinearGradient(colors=" + this.metrica + ", stops=" + this.license + ", " + str + str2 + "tileMode=" + ((Object) AbstractC8228e.appmetrica(this.billing)) + ')';
    }

    @Override // defpackage.InterfaceC5606e
    public final Object vip(Object obj, float f) {
        if (obj == null) {
            obj = new C18466e(C3618e.startapp);
        }
        boolean z = obj instanceof C18466e;
        List list = this.metrica;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3618e) list.get(i)).getClass();
                arrayList.add(new C3618e(((C18466e) obj).ad));
            }
            obj = new C11078e(arrayList, this.license, this.appmetrica, this.purchase, this.billing);
        }
        if (!(obj instanceof C11078e)) {
            return null;
        }
        C11078e c11078e = (C11078e) obj;
        return new C11078e(AbstractC7595e.vip(list, c11078e.metrica, f), AbstractC7595e.metrica(this.license, c11078e.license, f), AbstractC7595e.license(this.appmetrica, c11078e.appmetrica, f), AbstractC7595e.license(this.purchase, c11078e.purchase, f), f < 0.5f ? this.billing : c11078e.billing);
    }
}
