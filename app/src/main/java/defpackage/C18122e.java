package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۥَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18122e implements InterfaceC13140e {
    public final int ad;
    public final String appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final int vip;

    public C18122e(int i, int i2, boolean z, boolean z2, String str) {
        this.ad = i;
        this.vip = i2;
        this.metrica = z;
        this.license = z2;
        this.appmetrica = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[RETURN] */
    @Override // defpackage.InterfaceC13140e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ad(defpackage.AbstractC14697e r8) {
        /*
            r7 = this;
            boolean r0 = r7.license
            java.lang.String r1 = r7.appmetrica
            if (r0 == 0) goto Lc
            if (r1 != 0) goto Lc
            java.lang.String r1 = r8.amazon()
        Lc:
            eۗۜ r0 = r8.vip
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3c
            java.util.List r0 = r0.getChildren()
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
            r5 = r4
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r0.next()
            eٖٟ۠ r6 = (defpackage.AbstractC16408e) r6
            eٔٓؐ r6 = (defpackage.AbstractC14697e) r6
            if (r6 != r8) goto L2d
            r4 = r5
        L2d:
            if (r1 == 0) goto L39
            java.lang.String r6 = r6.amazon()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L1c
        L39:
            int r5 = r5 + 1
            goto L1c
        L3c:
            r4 = r2
            r5 = r3
        L3e:
            boolean r8 = r7.metrica
            if (r8 == 0) goto L44
            int r4 = r4 + r3
            goto L46
        L44:
            int r4 = r5 - r4
        L46:
            int r8 = r7.ad
            int r0 = r7.vip
            if (r8 != 0) goto L4f
            if (r4 != r0) goto L65
            goto L64
        L4f:
            int r4 = r4 - r0
            int r0 = r4 % r8
            if (r0 != 0) goto L65
            int r0 = java.lang.Integer.signum(r4)
            if (r0 == 0) goto L64
            int r0 = java.lang.Integer.signum(r4)
            int r8 = java.lang.Integer.signum(r8)
            if (r0 != r8) goto L65
        L64:
            return r3
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18122e.ad(eٔٓؐ):boolean");
    }

    public final String toString() {
        String str = this.metrica ? BuildConfig.FLAVOR : "last-";
        boolean z = this.license;
        int i = this.vip;
        int i2 = this.ad;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.appmetrica) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
