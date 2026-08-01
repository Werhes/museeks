package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۤٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16611e {
    public final String ad;
    public final byte[] adcel;
    public final long appmetrica;
    public final Integer billing;
    public final long license;
    public final C0974e metrica;
    public final Map purchase;
    public final byte[] startapp;
    public final Integer vip;
    public final String yandex;

    public C16611e(String str, Integer num, C0974e c0974e, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.ad = str;
        this.vip = num;
        this.metrica = c0974e;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = hashMap;
        this.billing = num2;
        this.yandex = str2;
        this.startapp = bArr;
        this.adcel = bArr2;
    }

    public final String ad(String str) {
        String str2 = (String) this.purchase.get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16611e) {
            C16611e c16611e = (C16611e) obj;
            String str2 = c16611e.yandex;
            Integer num3 = c16611e.billing;
            Integer num4 = c16611e.vip;
            if (this.ad.equals(c16611e.ad) && ((num = this.vip) != null ? num.equals(num4) : num4 == null) && this.metrica.equals(c16611e.metrica) && this.license == c16611e.license && this.appmetrica == c16611e.appmetrica && this.purchase.equals(c16611e.purchase) && ((num2 = this.billing) != null ? num2.equals(num3) : num3 == null) && ((str = this.yandex) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.startapp, c16611e.startapp) && Arrays.equals(this.adcel, c16611e.adcel)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() ^ 1000003) * 1000003;
        Integer num = this.vip;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.metrica.hashCode()) * 1000003;
        long j = this.license;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.appmetrica;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.purchase.hashCode()) * 1000003;
        Integer num2 = this.billing;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.yandex;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.startapp)) * 1000003) ^ Arrays.hashCode(this.adcel);
    }

    public final C14742e metrica() {
        C14742e c14742e = new C14742e(1);
        String str = this.ad;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c14742e.vip = str;
        c14742e.metrica = this.vip;
        c14742e.yandex = this.billing;
        c14742e.startapp = this.yandex;
        c14742e.adcel = this.startapp;
        c14742e.mopub = this.adcel;
        C0974e c0974e = this.metrica;
        if (c0974e == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c14742e.license = c0974e;
        c14742e.appmetrica = Long.valueOf(this.license);
        c14742e.purchase = Long.valueOf(this.appmetrica);
        c14742e.billing = new HashMap(this.purchase);
        return c14742e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.ad + ", code=" + this.vip + ", encodedPayload=" + this.metrica + ", eventMillis=" + this.license + ", uptimeMillis=" + this.appmetrica + ", autoMetadata=" + this.purchase + ", productId=" + this.billing + ", pseudonymousId=" + this.yandex + ", experimentIdsClear=" + Arrays.toString(this.startapp) + ", experimentIdsEncrypted=" + Arrays.toString(this.adcel) + "}";
    }

    public final int vip(String str) {
        String str2 = (String) this.purchase.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }
}
