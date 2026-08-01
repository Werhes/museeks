package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9286e extends AbstractC14681e {
    public final String[] appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final AbstractC14681e[] purchase;
    public final String vip;

    public C9286e(String str, boolean z, boolean z2, String[] strArr, AbstractC14681e[] abstractC14681eArr) {
        super("CTOC");
        this.vip = str;
        this.metrica = z;
        this.license = z2;
        this.appmetrica = strArr;
        this.purchase = abstractC14681eArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9286e.class == obj.getClass()) {
            C9286e c9286e = (C9286e) obj;
            if (this.metrica == c9286e.metrica && this.license == c9286e.license && Objects.equals(this.vip, c9286e.vip) && Arrays.equals(this.appmetrica, c9286e.appmetrica) && Arrays.equals(this.purchase, c9286e.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.metrica ? 1 : 0)) * 31) + (this.license ? 1 : 0)) * 31;
        String str = this.vip;
        return i + (str != null ? str.hashCode() : 0);
    }
}
