package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٌٖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942e {
    public static final C4920e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {AbstractC18039e.appmetrica(2, new C14582e(0)), null, null, AbstractC18039e.appmetrica(2, new C14582e(1))};
    public final EnumC10783e ad;
    public final EnumC6059e license;
    public final String metrica;
    public final Boolean vip;

    public /* synthetic */ C0942e(int i, EnumC10783e enumC10783e, Boolean bool, String str, EnumC6059e enumC6059e) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = enumC10783e;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = bool;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = enumC6059e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0942e)) {
            return false;
        }
        C0942e c0942e = (C0942e) obj;
        return this.ad == c0942e.ad && AbstractC7890e.billing(this.vip, c0942e.vip) && AbstractC7890e.billing(this.metrica, c0942e.metrica) && this.license == c0942e.license;
    }

    public final int hashCode() {
        EnumC10783e enumC10783e = this.ad;
        int hashCode = (enumC10783e == null ? 0 : enumC10783e.hashCode()) * 31;
        Boolean bool = this.vip;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.metrica;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC6059e enumC6059e = this.license;
        return hashCode3 + (enumC6059e != null ? enumC6059e.hashCode() : 0);
    }

    public final String toString() {
        return "AuthValidateAccountNextStepDto(verificationMethod=" + this.ad + ", hasAnotherVerificationMethods=" + this.vip + ", externalId=" + this.metrica + ", serviceCode=" + this.license + ")";
    }
}
