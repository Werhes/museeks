package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17858e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EnumC13839e f35039e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f35040e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f35041e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public EnumC7709e f35042e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f35043e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f35044e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35045e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eُ٘ٛ, eٍٜ٘] */
    public static C17858e billing() {
        ?? abstractC9594e = new AbstractC9594e();
        abstractC9594e.f35039e = EnumC13839e.ERROR;
        abstractC9594e.f35042e = EnumC7709e.LANGUAGE_VERSION;
        return abstractC9594e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        yandex((C12994e) abstractC2649e);
        return this;
    }

    public final Object clone() {
        C17858e billing = billing();
        billing.yandex(purchase());
        return billing;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r2, defpackage.C18521e r3) {
        /*
            r1 = this;
            r3 = 0
            eٌُْ r0 = defpackage.C12994e.f25900e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eْؓؔ r0 = new eْؓؔ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.yandex(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            eؙِۛ r0 = r2.f28108e     // Catch: java.lang.Throwable -> Lf
            eْؓؔ r0 = (defpackage.C12994e) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.yandex(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17858e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C12994e purchase = purchase();
        purchase.ad();
        return purchase;
    }

    public final C12994e purchase() {
        C12994e c12994e = new C12994e(this);
        int i = this.f35041e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c12994e.f25903e = this.f35040e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c12994e.f25907e = this.f35043e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c12994e.f25902e = this.f35039e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c12994e.f25911e = this.f35045e;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c12994e.f25910e = this.f35044e;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        c12994e.f25906e = this.f35042e;
        c12994e.f25905e = i2;
        return c12994e;
    }

    public final void yandex(C12994e c12994e) {
        if (c12994e == C12994e.f25901e) {
            return;
        }
        int i = c12994e.f25905e;
        if ((i & 1) == 1) {
            int i2 = c12994e.f25903e;
            this.f35041e = 1 | this.f35041e;
            this.f35040e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c12994e.f25907e;
            this.f35041e = 2 | this.f35041e;
            this.f35043e = i3;
        }
        if ((i & 4) == 4) {
            EnumC13839e enumC13839e = c12994e.f25902e;
            enumC13839e.getClass();
            this.f35041e = 4 | this.f35041e;
            this.f35039e = enumC13839e;
        }
        int i4 = c12994e.f25905e;
        if ((i4 & 8) == 8) {
            int i5 = c12994e.f25911e;
            this.f35041e = 8 | this.f35041e;
            this.f35045e = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = c12994e.f25910e;
            this.f35041e = 16 | this.f35041e;
            this.f35044e = i6;
        }
        if ((i4 & 32) == 32) {
            EnumC7709e enumC7709e = c12994e.f25906e;
            enumC7709e.getClass();
            this.f35041e = 32 | this.f35041e;
            this.f35042e = enumC7709e;
        }
        this.f19037e = this.f19037e.billing(c12994e.f25909e);
    }
}
