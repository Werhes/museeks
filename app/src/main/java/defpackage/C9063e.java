package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9063e extends AbstractC6036e {
    public final String ad;
    public final byte[] vip;

    public C9063e(String str, byte[] bArr) {
        this.ad = str;
        this.vip = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6036e) {
            AbstractC6036e abstractC6036e = (AbstractC6036e) obj;
            C9063e c9063e = (C9063e) abstractC6036e;
            if (this.ad.equals(c9063e.ad)) {
                if (Arrays.equals(this.vip, abstractC6036e instanceof C9063e ? ((C9063e) abstractC6036e).vip : c9063e.vip)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.vip);
    }

    public final String toString() {
        return "File{filename=" + this.ad + ", contents=" + Arrays.toString(this.vip) + "}";
    }
}
