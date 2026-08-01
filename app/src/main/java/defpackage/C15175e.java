package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٕؒٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15175e {
    public static final C17746e Companion = new Object();
    public static final InterfaceC3477e[] adcel = {null, null, null, null, AbstractC18039e.appmetrica(2, new C0996e(21)), null, AbstractC18039e.appmetrica(2, new C0996e(22)), null, null};
    public final String ad;
    public final EnumC14970e appmetrica;
    public final List billing;
    public final Boolean license;
    public final C5809e metrica;
    public final String purchase;
    public final C12735e startapp;
    public final boolean vip;
    public final C11782e yandex;

    public /* synthetic */ C15175e(int i, String str, boolean z, C5809e c5809e, Boolean bool, EnumC14970e enumC14970e, String str2, List list, C11782e c11782e, C12735e c12735e) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C15054e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = z;
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = c5809e;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = bool;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = enumC14970e;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str2;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = list;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = c11782e;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = c12735e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15175e)) {
            return false;
        }
        C15175e c15175e = (C15175e) obj;
        return AbstractC7890e.billing(this.ad, c15175e.ad) && this.vip == c15175e.vip && AbstractC7890e.billing(this.metrica, c15175e.metrica) && AbstractC7890e.billing(this.license, c15175e.license) && this.appmetrica == c15175e.appmetrica && AbstractC7890e.billing(this.purchase, c15175e.purchase) && AbstractC7890e.billing(this.billing, c15175e.billing) && AbstractC7890e.billing(this.yandex, c15175e.yandex) && AbstractC7890e.billing(this.startapp, c15175e.startapp);
    }

    public final int hashCode() {
        int hashCode = ((this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237)) * 31;
        C5809e c5809e = this.metrica;
        int hashCode2 = (hashCode + (c5809e == null ? 0 : c5809e.hashCode())) * 31;
        Boolean bool = this.license;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        EnumC14970e enumC14970e = this.appmetrica;
        int hashCode4 = (hashCode3 + (enumC14970e == null ? 0 : enumC14970e.hashCode())) * 31;
        String str = this.purchase;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.billing;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        C11782e c11782e = this.yandex;
        int hashCode7 = (hashCode6 + (c11782e == null ? 0 : c11782e.hashCode())) * 31;
        C12735e c12735e = this.startapp;
        return hashCode7 + (c12735e != null ? c12735e.hashCode() : 0);
    }

    public final String toString() {
        return "EcosystemCheckOtpResponseDto(sid=" + this.ad + ", profileExist=" + this.vip + ", profile=" + this.metrica + ", canSkipPassword=" + this.license + ", nextStep=" + this.appmetrica + ", signupRestrictionReason=" + this.purchase + ", signupFields=" + this.billing + ", signupFieldsValues=" + this.yandex + ", signupParams=" + this.startapp + ")";
    }
}
