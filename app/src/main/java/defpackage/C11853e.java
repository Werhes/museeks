package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٛۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11853e extends AbstractC9555e {
    public final InterfaceC2102e[] license;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11853e(int r5, defpackage.InterfaceC2102e[] r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L35
            int r0 = r6.length
            r1 = 1
            int r0 = r0 - r1
            if (r0 != 0) goto L8
            goto L12
        L8:
            r2 = 31
        La:
            if (r2 < 0) goto L1d
            int r3 = r1 << r2
            r3 = r3 & r0
            if (r3 == 0) goto L1a
            int r1 = r1 + r2
        L12:
            r0 = 0
            r2 = 0
            r4.<init>(r5, r1, r0, r2)
            r4.license = r6
            return
        L1a:
            int r2 = r2 + (-1)
            goto La
        L1d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty enum: "
            r0.<init>(r1)
            java.lang.Class r6 = r6.getClass()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11853e.<init>(int, eؓۛۦ[]):void");
    }

    @Override // defpackage.AbstractC9555e
    public final Object appmetrica(int i) {
        int i2 = (1 << this.metrica) - 1;
        int i3 = this.vip;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC2102e interfaceC2102e : this.license) {
            if (interfaceC2102e.ad() == i4) {
                return interfaceC2102e;
            }
        }
        return null;
    }
}
