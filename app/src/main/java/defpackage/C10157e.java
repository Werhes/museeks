package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10157e extends AbstractC9876e implements InterfaceC5606e {
    public final long appmetrica;
    public final int billing;
    public final List license;
    public final List metrica;
    public final float purchase;

    public C10157e(List list, List list2, long j, float f, int i) {
        this.metrica = list;
        this.license = list2;
        this.appmetrica = j;
        this.purchase = f;
        this.billing = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10157e)) {
            return false;
        }
        C10157e c10157e = (C10157e) obj;
        return this.metrica.equals(c10157e.metrica) && AbstractC7890e.billing(this.license, c10157e.license) && C2152e.vip(this.appmetrica, c10157e.appmetrica) && this.purchase == c10157e.purchase && this.billing == c10157e.billing;
    }

    public final int hashCode() {
        int hashCode = this.metrica.hashCode() * 31;
        List list = this.license;
        return AbstractC1414e.license((C2152e.billing(this.appmetrica) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, this.purchase, 31) + this.billing;
    }

    @Override // defpackage.AbstractC9876e
    public final Shader metrica(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.appmetrica;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long license = AbstractC5092e.license(j);
            intBitsToFloat = Float.intBitsToFloat((int) (license >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (license & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.purchase;
        if (f == Float.POSITIVE_INFINITY) {
            f = C2108e.appmetrica(j) / 2;
        }
        float f2 = f;
        List list = this.metrica;
        List list2 = this.license;
        AbstractC8306e.yandex(list, list2);
        int vip = AbstractC8306e.vip(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, AbstractC8306e.appmetrica(vip, list), AbstractC8306e.purchase(vip, list2, list), AbstractC12110e.license(this.billing));
    }

    public final String toString() {
        String str;
        long j = this.appmetrica;
        long j2 = 9223372034707292159L & j;
        String str2 = BuildConfig.FLAVOR;
        if (j2 != 9205357640488583168L) {
            str = "center=" + ((Object) C2152e.mopub(j)) + ", ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        float f = this.purchase;
        if ((Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.metrica + ", stops=" + this.license + ", " + str + str2 + "tileMode=" + ((Object) AbstractC8228e.appmetrica(this.billing)) + ')';
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
            obj = new C10157e(arrayList, this.license, this.appmetrica, this.purchase, this.billing);
        }
        if (!(obj instanceof C10157e)) {
            return null;
        }
        C10157e c10157e = (C10157e) obj;
        return new C10157e(AbstractC7595e.vip(list, c10157e.metrica, f), AbstractC7595e.metrica(this.license, c10157e.license, f), AbstractC12246e.yandex(this.appmetrica, c10157e.appmetrica, f), AbstractC15842e.startapp(this.purchase, c10157e.purchase, f), f < 0.5f ? this.billing : c10157e.billing);
    }
}
