package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۧۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6074e extends AbstractC13920e {
    public final int ad;
    public final long appmetrica;
    public final long billing;
    public final int license;
    public final int metrica;
    public final long purchase;
    public final List startapp;
    public final String vip;
    public final String yandex;

    public C6074e(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.ad = i;
        this.vip = str;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = j;
        this.purchase = j2;
        this.billing = j3;
        this.yandex = str2;
        this.startapp = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13920e) {
            C6074e c6074e = (C6074e) ((AbstractC13920e) obj);
            List list2 = c6074e.startapp;
            String str2 = c6074e.yandex;
            if (this.ad == c6074e.ad && this.vip.equals(c6074e.vip) && this.metrica == c6074e.metrica && this.license == c6074e.license && this.appmetrica == c6074e.appmetrica && this.purchase == c6074e.purchase && this.billing == c6074e.billing && ((str = this.yandex) != null ? str.equals(str2) : str2 == null) && ((list = this.startapp) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.ad ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica) * 1000003) ^ this.license) * 1000003;
        long j = this.appmetrica;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.purchase;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.billing;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.yandex;
        int hashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.startapp;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.ad + ", processName=" + this.vip + ", reasonCode=" + this.metrica + ", importance=" + this.license + ", pss=" + this.appmetrica + ", rss=" + this.purchase + ", timestamp=" + this.billing + ", traceFile=" + this.yandex + ", buildIdMappingForArch=" + this.startapp + "}";
    }
}
