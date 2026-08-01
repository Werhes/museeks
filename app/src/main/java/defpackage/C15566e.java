package defpackage;

import java.io.Serializable;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15566e implements Serializable {
    public static final C13321e Companion = new Object();

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final InterfaceC3477e[] f30726e = {null, null, AbstractC18039e.appmetrica(2, new C13630e(27)), null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C13630e(28))};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C17476e f30727e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final EnumC6792e f30728e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Map f30729e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f30730e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f30731e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Integer f30732e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f30733e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f30734e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f30735e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f30736e;

    public /* synthetic */ C15566e(int i, String str, String str2, EnumC6792e enumC6792e, Integer num, C17476e c17476e, String str3, String str4, boolean z, boolean z2, Map map) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C5006e.ad.appmetrica());
            throw null;
        }
        this.f30734e = str;
        this.f30730e = str2;
        if ((i & 4) == 0) {
            this.f30728e = EnumC6792e.f13999e;
        } else {
            this.f30728e = enumC6792e;
        }
        if ((i & 8) == 0) {
            this.f30732e = null;
        } else {
            this.f30732e = num;
        }
        if ((i & 16) == 0) {
            this.f30727e = null;
        } else {
            this.f30727e = c17476e;
        }
        if ((i & 32) == 0) {
            this.f30736e = null;
        } else {
            this.f30736e = str3;
        }
        if ((i & 64) == 0) {
            this.f30735e = null;
        } else {
            this.f30735e = str4;
        }
        if ((i & 128) == 0) {
            this.f30731e = false;
        } else {
            this.f30731e = z;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f30733e = false;
        } else {
            this.f30733e = z2;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.f30729e = C9139e.f18290e;
        } else {
            this.f30729e = map;
        }
    }

    public C15566e(String str, String str2, EnumC6792e enumC6792e, Integer num, C17476e c17476e, String str3, String str4, boolean z, boolean z2, Map map) {
        this.f30734e = str;
        this.f30730e = str2;
        this.f30728e = enumC6792e;
        this.f30732e = num;
        this.f30727e = c17476e;
        this.f30736e = str3;
        this.f30735e = str4;
        this.f30731e = z;
        this.f30733e = z2;
        this.f30729e = map;
    }

    public static C15566e ad(C15566e c15566e, String str, String str2, int i) {
        String str3 = c15566e.f30734e;
        String str4 = c15566e.f30730e;
        EnumC6792e enumC6792e = c15566e.f30728e;
        Integer num = c15566e.f30732e;
        C17476e c17476e = c15566e.f30727e;
        if ((i & 32) != 0) {
            str = c15566e.f30736e;
        }
        String str5 = str;
        if ((i & 64) != 0) {
            str2 = c15566e.f30735e;
        }
        return new C15566e(str3, str4, enumC6792e, num, c17476e, str5, str2, c15566e.f30731e, c15566e.f30733e, c15566e.f30729e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15566e)) {
            return false;
        }
        C15566e c15566e = (C15566e) obj;
        return AbstractC7890e.billing(this.f30734e, c15566e.f30734e) && AbstractC7890e.billing(this.f30730e, c15566e.f30730e) && this.f30728e == c15566e.f30728e && AbstractC7890e.billing(this.f30732e, c15566e.f30732e) && AbstractC7890e.billing(this.f30727e, c15566e.f30727e) && AbstractC7890e.billing(this.f30736e, c15566e.f30736e) && AbstractC7890e.billing(this.f30735e, c15566e.f30735e) && this.f30731e == c15566e.f30731e && this.f30733e == c15566e.f30733e && AbstractC7890e.billing(this.f30729e, c15566e.f30729e);
    }

    public final int hashCode() {
        int hashCode = (this.f30728e.hashCode() + AbstractC1786e.advert(this.f30734e.hashCode() * 31, 31, this.f30730e)) * 31;
        Integer num = this.f30732e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        C17476e c17476e = this.f30727e;
        int hashCode3 = (hashCode2 + (c17476e == null ? 0 : c17476e.hashCode())) * 31;
        String str = this.f30736e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30735e;
        return this.f30729e.hashCode() + ((((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f30731e ? 1231 : 1237)) * 31) + (this.f30733e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Cookie(name=" + this.f30734e + ", value=" + this.f30730e + ", encoding=" + this.f30728e + ", maxAge=" + this.f30732e + ", expires=" + this.f30727e + ", domain=" + this.f30736e + ", path=" + this.f30735e + ", secure=" + this.f30731e + ", httpOnly=" + this.f30733e + ", extensions=" + this.f30729e + ')';
    }
}
