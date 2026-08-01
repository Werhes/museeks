package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16216e {
    public final Context ad;
    public final InterfaceC6823e vip;

    public C16216e(Context context, InterfaceC6823e interfaceC6823e) {
        this.ad = context;
        this.vip = interfaceC6823e;
    }

    public final boolean equals(Object obj) {
        InterfaceC6823e interfaceC6823e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16216e) {
            C16216e c16216e = (C16216e) obj;
            InterfaceC6823e interfaceC6823e2 = c16216e.vip;
            if (this.ad.equals(c16216e.ad) && ((interfaceC6823e = this.vip) != null ? interfaceC6823e.equals(interfaceC6823e2) : interfaceC6823e2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() ^ 1000003;
        InterfaceC6823e interfaceC6823e = this.vip;
        return (hashCode * 1000003) ^ (interfaceC6823e == null ? 0 : interfaceC6823e.hashCode());
    }

    public final String toString() {
        String obj = this.ad.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.vip);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        AbstractC13501e.Signature(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
