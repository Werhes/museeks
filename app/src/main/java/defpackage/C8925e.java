package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۘؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8925e extends AbstractC6285e {
    public final long ad;
    public final byte[] appmetrica;
    public final long billing;
    public final long license;
    public final AbstractC16287e metrica;
    public final String purchase;
    public final AbstractC7197e startapp;
    public final Integer vip;
    public final AbstractC16369e yandex;

    public C8925e(long j, Integer num, AbstractC16287e abstractC16287e, long j2, byte[] bArr, String str, long j3, AbstractC16369e abstractC16369e, AbstractC7197e abstractC7197e) {
        this.ad = j;
        this.vip = num;
        this.metrica = abstractC16287e;
        this.license = j2;
        this.appmetrica = bArr;
        this.purchase = str;
        this.billing = j3;
        this.yandex = abstractC16369e;
        this.startapp = abstractC7197e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        AbstractC16287e abstractC16287e;
        String str;
        AbstractC16369e abstractC16369e;
        AbstractC7197e abstractC7197e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6285e) {
            AbstractC6285e abstractC6285e = (AbstractC6285e) obj;
            C8925e c8925e = (C8925e) abstractC6285e;
            AbstractC7197e abstractC7197e2 = c8925e.startapp;
            AbstractC16369e abstractC16369e2 = c8925e.yandex;
            String str2 = c8925e.purchase;
            AbstractC16287e abstractC16287e2 = c8925e.metrica;
            Integer num2 = c8925e.vip;
            if (this.ad == c8925e.ad && ((num = this.vip) != null ? num.equals(num2) : num2 == null) && ((abstractC16287e = this.metrica) != null ? abstractC16287e.equals(abstractC16287e2) : abstractC16287e2 == null) && this.license == c8925e.license) {
                if (Arrays.equals(this.appmetrica, abstractC6285e instanceof C8925e ? ((C8925e) abstractC6285e).appmetrica : c8925e.appmetrica) && ((str = this.purchase) != null ? str.equals(str2) : str2 == null) && this.billing == c8925e.billing && ((abstractC16369e = this.yandex) != null ? abstractC16369e.equals(abstractC16369e2) : abstractC16369e2 == null) && ((abstractC7197e = this.startapp) != null ? abstractC7197e.equals(abstractC7197e2) : abstractC7197e2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.vip;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC16287e abstractC16287e = this.metrica;
        int hashCode2 = (hashCode ^ (abstractC16287e == null ? 0 : abstractC16287e.hashCode())) * 1000003;
        long j2 = this.license;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.appmetrica)) * 1000003;
        String str = this.purchase;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.billing;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC16369e abstractC16369e = this.yandex;
        int hashCode5 = (i2 ^ (abstractC16369e == null ? 0 : abstractC16369e.hashCode())) * 1000003;
        AbstractC7197e abstractC7197e = this.startapp;
        return hashCode5 ^ (abstractC7197e != null ? abstractC7197e.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.ad + ", eventCode=" + this.vip + ", complianceData=" + this.metrica + ", eventUptimeMs=" + this.license + ", sourceExtension=" + Arrays.toString(this.appmetrica) + ", sourceExtensionJsonProto3=" + this.purchase + ", timezoneOffsetSeconds=" + this.billing + ", networkConnectionInfo=" + this.yandex + ", experimentIds=" + this.startapp + "}";
    }
}
