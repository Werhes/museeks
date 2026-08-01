package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّۚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12735e {
    public static final C9513e Companion = new Object();
    public final Integer ad;
    public final String vip;

    public /* synthetic */ C12735e(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = num;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12735e)) {
            return false;
        }
        C12735e c12735e = (C12735e) obj;
        return AbstractC7890e.billing(this.ad, c12735e.ad) && AbstractC7890e.billing(this.vip, c12735e.vip);
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.vip;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AuthValidateSignupParamsDto(passwordMinLength=" + this.ad + ", birthDateMax=" + this.vip + ")";
    }
}
