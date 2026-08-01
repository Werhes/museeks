package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘۦۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6064e {
    public static final C2027e Companion = new Object();
    public static final InterfaceC3477e[] purchase = {AbstractC18039e.appmetrica(2, new C0996e(24)), null, null, null, null};
    public final EnumC10783e ad;
    public final Boolean appmetrica;
    public final String license;
    public final Integer metrica;
    public final Integer vip;

    public /* synthetic */ C6064e(int i, EnumC10783e enumC10783e, Integer num, Integer num2, String str, Boolean bool) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = enumC10783e;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = num;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = num2;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6064e)) {
            return false;
        }
        C6064e c6064e = (C6064e) obj;
        return this.ad == c6064e.ad && AbstractC7890e.billing(this.vip, c6064e.vip) && AbstractC7890e.billing(this.metrica, c6064e.metrica) && AbstractC7890e.billing(this.license, c6064e.license) && AbstractC7890e.billing(this.appmetrica, c6064e.appmetrica);
    }

    public final int hashCode() {
        EnumC10783e enumC10783e = this.ad;
        int hashCode = (enumC10783e == null ? 0 : enumC10783e.hashCode()) * 31;
        Integer num = this.vip;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.metrica;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.license;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.appmetrica;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EcosystemVerificationMethodDto(name=" + this.ad + ", priority=" + this.vip + ", timeout=" + this.metrica + ", info=" + this.license + ", canFallback=" + this.appmetrica + ")";
    }
}
