package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11739e {
    public final C17841e ad;
    public final C12434e vip;

    public C11739e(C17841e c17841e, C12434e c12434e) {
        this.ad = c17841e;
        this.vip = c12434e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11739e) {
            C11739e c11739e = (C11739e) obj;
            C17841e c17841e = c11739e.ad;
            C17841e c17841e2 = this.ad;
            if (c17841e2 != null ? c17841e2.equals(c17841e) : c17841e == null) {
                if (this.vip.equals(c11739e.vip)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        C17841e c17841e = this.ad;
        return (((c17841e == null ? 0 : c17841e.hashCode()) ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.ad);
        String obj = this.vip.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        AbstractC13501e.Signature(sb, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb.append("}");
        return sb.toString();
    }
}
