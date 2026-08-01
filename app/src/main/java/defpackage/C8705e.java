package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8705e implements InterfaceC10260e, InterfaceC6428e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public float f17570e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17571e;

    public C8705e(float f) {
        this.f17571e = 4;
        this.f17570e = f;
    }

    public C8705e(int i) {
        this.f17571e = i;
        switch (i) {
            case 1:
                this.f17570e = 0;
                return;
            case 2:
                this.f17570e = 0;
                return;
            case 3:
                this.f17570e = 0;
                return;
            default:
                this.f17570e = 0;
                return;
        }
    }

    public /* synthetic */ C8705e(int i, boolean z) {
        this.f17571e = i;
    }

    @Override // defpackage.InterfaceC10260e
    public float appmetrica() {
        switch (this.f17571e) {
            case 0:
                return this.f17570e;
            case 1:
                return this.f17570e;
            case 2:
                return this.f17570e;
            case 3:
                return this.f17570e;
            default:
                return this.f17570e;
        }
    }

    @Override // defpackage.InterfaceC6428e
    public void billing(InterfaceC14388e interfaceC14388e, int i, int[] iArr, int[] iArr2) {
        switch (this.f17571e) {
            case 0:
                AbstractC16497e.ad(i, iArr, iArr2, false);
                return;
            case 1:
                AbstractC16497e.license(i, iArr, iArr2, false);
                return;
            case 2:
                AbstractC16497e.appmetrica(i, iArr, iArr2, false);
                return;
            default:
                AbstractC16497e.purchase(i, iArr, iArr2, false);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC10260e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tapsense(defpackage.InterfaceC14388e r9, int r10, int[] r11, defpackage.EnumC7792e r12, int[] r13) {
        /*
            r8 = this;
            int r0 = r8.f17571e
            switch(r0) {
                case 0: goto L62;
                case 1: goto L54;
                case 2: goto L46;
                case 3: goto L38;
                default: goto L5;
            }
        L5:
            int r0 = r11.length
            if (r0 != 0) goto L9
            goto L37
        L9:
            float r0 = r8.f17570e
            int r9 = r9.mo493e(r0)
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        L13:
            if (r2 >= r0) goto L37
            r4 = r11[r2]
            int r5 = r3 + 1
            if (r3 == 0) goto L21
            r6 = 1
            if (r3 == r6) goto L26
            r6 = 2
            if (r3 == r6) goto L23
        L21:
            r6 = r1
            goto L29
        L23:
            int r6 = r10 - r4
            goto L29
        L26:
            r6 = r11[r1]
            int r6 = r6 + r9
        L29:
            eًؚٙ r7 = defpackage.EnumC7792e.f15794e
            if (r12 != r7) goto L2e
            goto L31
        L2e:
            int r6 = r10 - r6
            int r6 = r6 - r4
        L31:
            r13[r3] = r6
            int r2 = r2 + 1
            r3 = r5
            goto L13
        L37:
            return
        L38:
            eًؚٙ r9 = defpackage.EnumC7792e.f15794e
            if (r12 != r9) goto L41
            r9 = 0
            defpackage.AbstractC16497e.purchase(r10, r11, r13, r9)
            goto L45
        L41:
            r9 = 1
            defpackage.AbstractC16497e.purchase(r10, r11, r13, r9)
        L45:
            return
        L46:
            eًؚٙ r9 = defpackage.EnumC7792e.f15794e
            if (r12 != r9) goto L4f
            r9 = 0
            defpackage.AbstractC16497e.appmetrica(r10, r11, r13, r9)
            goto L53
        L4f:
            r9 = 1
            defpackage.AbstractC16497e.appmetrica(r10, r11, r13, r9)
        L53:
            return
        L54:
            eًؚٙ r9 = defpackage.EnumC7792e.f15794e
            if (r12 != r9) goto L5d
            r9 = 0
            defpackage.AbstractC16497e.license(r10, r11, r13, r9)
            goto L61
        L5d:
            r9 = 1
            defpackage.AbstractC16497e.license(r10, r11, r13, r9)
        L61:
            return
        L62:
            eًؚٙ r9 = defpackage.EnumC7792e.f15794e
            if (r12 != r9) goto L6b
            r9 = 0
            defpackage.AbstractC16497e.ad(r10, r11, r13, r9)
            goto L6f
        L6b:
            r9 = 1
            defpackage.AbstractC16497e.ad(r10, r11, r13, r9)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8705e.tapsense(eٓۦۣ, int, int[], eًؚٙ, int[]):void");
    }

    public String toString() {
        switch (this.f17571e) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
