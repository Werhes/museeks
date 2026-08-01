package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11661e extends AbstractC13101e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC11661e(InterfaceC11542e interfaceC11542e) {
        super(interfaceC11542e);
        if (interfaceC11542e != null) {
        } else {
            yandex(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void yandex(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11661e.yandex(int):void");
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        AbstractC13270e appmetrica = AbstractC2876e.appmetrica(advert());
        if (appmetrica != null) {
            return appmetrica;
        }
        yandex(1);
        throw null;
    }

    @Override // defpackage.AbstractC13101e
    public final AbstractC1186e metrica() {
        InterfaceC5052e advert = advert();
        if (advert == null) {
            AbstractC13270e.ad(107);
            throw null;
        }
        C0520e c0520e = AbstractC13270e.appmetrica;
        if (AbstractC13270e.vip(advert, AbstractC0206e.ad) || AbstractC13270e.vip(advert, AbstractC0206e.vip)) {
            return null;
        }
        return amazon().appmetrica();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (defpackage.AbstractC7890e.billing(((defpackage.AbstractC14941e) ((defpackage.InterfaceC9646e) r0)).f29618e, ((defpackage.AbstractC14941e) ((defpackage.InterfaceC9646e) r6)).f29618e) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        r6 = true;
     */
    @Override // defpackage.AbstractC13101e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean purchase(defpackage.InterfaceC4077e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.InterfaceC5052e
            r1 = 0
            if (r0 == 0) goto L6e
            eؗٞؓ r0 = r5.advert()
            eؑۘٛ r2 = r0.getName()
            eؑۘٛ r3 = r6.getName()
            boolean r2 = defpackage.AbstractC7890e.billing(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1a
        L18:
            r6 = r1
            goto L6b
        L1a:
            eِٕٖ r0 = r0.mo1351switch()
            eِٕٖ r6 = r6.mo1351switch()
        L22:
            if (r0 == 0) goto L4c
            if (r6 == 0) goto L4c
            boolean r2 = r0 instanceof defpackage.InterfaceC5334e
            if (r2 == 0) goto L2d
            boolean r6 = r6 instanceof defpackage.InterfaceC5334e
            goto L6b
        L2d:
            boolean r2 = r6 instanceof defpackage.InterfaceC5334e
            if (r2 == 0) goto L32
            goto L18
        L32:
            boolean r2 = r0 instanceof defpackage.InterfaceC9646e
            if (r2 == 0) goto L4e
            boolean r2 = r6 instanceof defpackage.InterfaceC9646e
            if (r2 == 0) goto L18
            eٍؚٟ r0 = (defpackage.InterfaceC9646e) r0
            eۣٔۙ r0 = (defpackage.AbstractC14941e) r0
            eّۡۜ r0 = r0.f29618e
            eٍؚٟ r6 = (defpackage.InterfaceC9646e) r6
            eۣٔۙ r6 = (defpackage.AbstractC14941e) r6
            eّۡۜ r6 = r6.f29618e
            boolean r6 = defpackage.AbstractC7890e.billing(r0, r6)
            if (r6 == 0) goto L18
        L4c:
            r6 = r3
            goto L6b
        L4e:
            boolean r2 = r6 instanceof defpackage.InterfaceC9646e
            if (r2 == 0) goto L53
            goto L18
        L53:
            eؑۘٛ r2 = r0.getName()
            eؑۘٛ r4 = r6.getName()
            boolean r2 = defpackage.AbstractC7890e.billing(r2, r4)
            if (r2 != 0) goto L62
            goto L18
        L62:
            eِٕٖ r0 = r0.mo1351switch()
            eِٕٖ r6 = r6.mo1351switch()
            goto L22
        L6b:
            if (r6 == 0) goto L6e
            return r3
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11661e.purchase(eْؖٝ):boolean");
    }

    @Override // defpackage.InterfaceC5021e
    /* renamed from: startapp, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC5052e advert();
}
