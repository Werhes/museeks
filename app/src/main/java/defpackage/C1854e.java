package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1854e {
    public final Object ad;
    public final String appmetrica;
    public final C16308e license;
    public final Object metrica;
    public final Object vip;

    public C1854e(Object obj, Object obj2, C16308e c16308e, C16308e c16308e2, String str) {
        this.ad = obj;
        this.vip = obj2;
        this.metrica = c16308e;
        this.license = c16308e2;
        this.appmetrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1854e)) {
            return false;
        }
        C1854e c1854e = (C1854e) obj;
        return this.ad.equals(c1854e.ad) && AbstractC7890e.billing(this.vip, c1854e.vip) && AbstractC7890e.billing(this.metrica, c1854e.metrica) && this.license.equals(c1854e.license) && AbstractC7890e.billing(this.appmetrica, c1854e.appmetrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        Object obj = this.vip;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.metrica;
        return this.appmetrica.hashCode() + ((this.license.hashCode() + ((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.ad);
        sb.append(", compilerVersion=");
        sb.append(this.vip);
        sb.append(", languageVersion=");
        sb.append(this.metrica);
        sb.append(", expectedVersion=");
        sb.append(this.license);
        sb.append(", filePath=");
        return AbstractC4653e.applovin(sb, this.appmetrica, ')');
    }
}
