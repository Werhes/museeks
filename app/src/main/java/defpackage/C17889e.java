package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17889e extends AbstractC1675e {
    public final C17681e appmetrica;
    public final Integer license;
    public final Integer metrica;
    public final boolean purchase;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v1, types: [eٖؑۡ, eُۙۨ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17889e(java.lang.Integer r2, java.lang.Integer r3, defpackage.C17681e r4, java.lang.String r5, boolean r6) {
        /*
            r1 = this;
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = 0
        L9:
            r1.<init>(r0, r5)
            r1.metrica = r2
            r1.license = r3
            r1.appmetrica = r4
            r1.purchase = r6
            if (r0 == 0) goto L49
            eٖؑۡ r2 = new eٖؑۡ
            r3 = 9
            r4 = 1
            r2.<init>(r4, r3, r4)
            int r3 = r0.intValue()
            boolean r2 = r2.appmetrica(r3)
            if (r2 == 0) goto L29
            goto L49
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid length for field "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17889e.<init>(java.lang.Integer, java.lang.Integer, eُ٘ٓ, java.lang.String, boolean):void");
    }

    @Override // defpackage.AbstractC1675e
    public final InterfaceC10459e ad(Object obj, CharSequence charSequence, int i, int i2) {
        Integer valueOf;
        Integer num = this.license;
        if (num != null && i2 - i > num.intValue()) {
            return new C5401e(num.intValue(), 12, (byte) 0);
        }
        Integer num2 = this.metrica;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new C5401e(num2.intValue(), 11, (byte) 0);
        }
        int i3 = 0;
        while (true) {
            if (i >= i2) {
                valueOf = Integer.valueOf(i3);
                break;
            }
            i3 = (i3 * 10) + (charSequence.charAt(i) - '0');
            if (i3 < 0) {
                valueOf = null;
                break;
            }
            i++;
        }
        if (valueOf == null) {
            return C9616e.f19080e;
        }
        boolean z = this.purchase;
        int intValue = valueOf.intValue();
        if (z) {
            intValue = -intValue;
        }
        Object ad = this.appmetrica.ad(obj, Integer.valueOf(intValue));
        if (ad == null) {
            return null;
        }
        return new C13935e(ad);
    }
}
