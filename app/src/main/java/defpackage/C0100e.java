package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0100e {
    public static final /* synthetic */ int yandex = 0;
    public final String ad;
    public final long appmetrica;
    public final String billing;
    public final String license;
    public final String metrica;
    public final long purchase;
    public final int vip;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }

    public C0100e(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.ad = str;
        this.vip = i;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = j;
        this.purchase = j2;
        this.billing = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eًؓٗ] */
    public final C7679e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.billing = this.billing;
        obj.yandex = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0100e)) {
            return false;
        }
        C0100e c0100e = (C0100e) obj;
        String str = c0100e.billing;
        String str2 = c0100e.license;
        String str3 = c0100e.metrica;
        String str4 = c0100e.ad;
        String str5 = this.ad;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!AbstractC8703e.adcel(this.vip, c0100e.vip)) {
            return false;
        }
        String str6 = this.metrica;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.license;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.appmetrica != c0100e.appmetrica || this.purchase != c0100e.purchase) {
            return false;
        }
        String str8 = this.billing;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC8703e.m2467class(this.vip)) * 1000003;
        String str2 = this.metrica;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.license;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.appmetrica;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.purchase;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.billing;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.ad);
        sb.append(", registrationStatus=");
        int i = this.vip;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.metrica);
        sb.append(", refreshToken=");
        sb.append(this.license);
        sb.append(", expiresInSecs=");
        sb.append(this.appmetrica);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.purchase);
        sb.append(", fisError=");
        return AbstractC1786e.signatures(sb, this.billing, "}");
    }
}
