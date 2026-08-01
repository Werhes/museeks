package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7791e {
    public static final C4986e Companion = new Object();
    public static final InterfaceC3477e[] mopub = {null, null, AbstractC18039e.appmetrica(2, new C14582e(2)), AbstractC18039e.appmetrica(2, new C14582e(3)), null, null, null, null, null, null};
    public final Boolean ad;
    public final String adcel;
    public final Boolean appmetrica;
    public final Boolean billing;
    public final List license;
    public final EnumC8985e metrica;
    public final String purchase;
    public final C0942e startapp;
    public final Boolean vip;
    public final String yandex;

    public /* synthetic */ C7791e(int i, Boolean bool, Boolean bool2, EnumC8985e enumC8985e, List list, Boolean bool3, String str, Boolean bool4, String str2, C0942e c0942e, String str3) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = bool;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = bool2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = enumC8985e;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = list;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = bool3;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = bool4;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str2;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = c0942e;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = null;
        } else {
            this.adcel = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7791e)) {
            return false;
        }
        C7791e c7791e = (C7791e) obj;
        return AbstractC7890e.billing(this.ad, c7791e.ad) && AbstractC7890e.billing(this.vip, c7791e.vip) && this.metrica == c7791e.metrica && AbstractC7890e.billing(this.license, c7791e.license) && AbstractC7890e.billing(this.appmetrica, c7791e.appmetrica) && AbstractC7890e.billing(this.purchase, c7791e.purchase) && AbstractC7890e.billing(this.billing, c7791e.billing) && AbstractC7890e.billing(this.yandex, c7791e.yandex) && AbstractC7890e.billing(this.startapp, c7791e.startapp) && AbstractC7890e.billing(this.adcel, c7791e.adcel);
    }

    public final int hashCode() {
        Boolean bool = this.ad;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.vip;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EnumC8985e enumC8985e = this.metrica;
        int hashCode3 = (hashCode2 + (enumC8985e == null ? 0 : enumC8985e.hashCode())) * 31;
        List list = this.license;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.appmetrica;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.purchase;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.billing;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.yandex;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C0942e c0942e = this.startapp;
        int hashCode9 = (hashCode8 + (c0942e == null ? 0 : c0942e.hashCode())) * 31;
        String str3 = this.adcel;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AuthValidateAccountResponseDto(isPhone=" + this.ad + ", isEmail=" + this.vip + ", flowName=" + this.metrica + ", flowNames=" + this.license + ", ads=" + this.appmetrica + ", sid=" + this.purchase + ", passSid=" + this.billing + ", login=" + this.yandex + ", nextStep=" + this.startapp + ", rememberHash=" + this.adcel + ")";
    }
}
