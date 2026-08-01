package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1243e extends AbstractC3199e implements InterfaceC1527e {
    public final C10195e adcel;
    public final EnumC6813e appmetrica;
    public final C10068e billing;
    public final AbstractC0232e license;
    public final C13891e mopub;
    public final AbstractC8712e purchase;
    public C0680e startapp;
    public int yandex = -1;

    public C1243e(AbstractC0232e abstractC0232e, EnumC6813e enumC6813e, AbstractC8712e abstractC8712e, InterfaceC9998e interfaceC9998e, C0680e c0680e) {
        this.license = abstractC0232e;
        this.appmetrica = enumC6813e;
        this.purchase = abstractC8712e;
        this.billing = abstractC0232e.vip;
        this.startapp = c0680e;
        C10195e c10195e = abstractC0232e.ad;
        this.adcel = c10195e;
        this.mopub = c10195e.appmetrica ? null : new C13891e(interfaceC9998e);
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final void Signature() {
    }

    @Override // defpackage.InterfaceC2043e
    public final C10068e ad() {
        return this.billing;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final InterfaceC11754e admob(InterfaceC9998e interfaceC9998e) {
        return AbstractC17276e.ad(interfaceC9998e) ? new C16337e(this.purchase, this.license) : this;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final byte ads() {
        AbstractC8712e abstractC8712e = this.purchase;
        long startapp = abstractC8712e.startapp();
        byte b = (byte) startapp;
        if (startapp == b) {
            return b;
        }
        AbstractC8712e.admob(abstractC8712e, "Failed to parse byte for input '" + startapp + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int amazon() {
        AbstractC8712e abstractC8712e = this.purchase;
        long startapp = abstractC8712e.startapp();
        int i = (int) startapp;
        if (startapp == i) {
            return i;
        }
        AbstractC8712e.admob(abstractC8712e, "Failed to parse int for input '" + startapp + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean appmetrica() {
        boolean z;
        boolean z2;
        AbstractC8712e abstractC8712e = this.purchase;
        int premium = abstractC8712e.premium();
        if (premium == abstractC8712e.remoteconfig().length()) {
            AbstractC8712e.admob(abstractC8712e, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC8712e.remoteconfig().charAt(premium) == '\"') {
            premium++;
            z = true;
        } else {
            z = false;
        }
        int isPro = abstractC8712e.isPro(premium);
        if (isPro >= abstractC8712e.remoteconfig().length() || isPro == -1) {
            AbstractC8712e.admob(abstractC8712e, "EOF", 0, null, 6);
            throw null;
        }
        int i = isPro + 1;
        int charAt = abstractC8712e.remoteconfig().charAt(isPro) | ' ';
        if (charAt == 102) {
            abstractC8712e.license(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                AbstractC8712e.admob(abstractC8712e, "Expected valid boolean literal prefix, but had '" + abstractC8712e.advert() + '\'', 0, null, 6);
                throw null;
            }
            abstractC8712e.license(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (abstractC8712e.vip == abstractC8712e.remoteconfig().length()) {
            AbstractC8712e.admob(abstractC8712e, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC8712e.remoteconfig().charAt(abstractC8712e.vip) == '\"') {
            abstractC8712e.vip++;
            return z2;
        }
        AbstractC8712e.admob(abstractC8712e, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Type inference failed for: r0v7, types: [eؑۤۨ, java.lang.Object] */
    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object billing(defpackage.InterfaceC5372e r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1243e.billing(eؘؒٙ):java.lang.Object");
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    /* renamed from: class, reason: not valid java name */
    public final double mo501class() {
        AbstractC8712e abstractC8712e = this.purchase;
        String advert = abstractC8712e.advert();
        try {
            double parseDouble = Double.parseDouble(advert);
            if (this.license.ad.startapp || Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            AbstractC8712e.admob(abstractC8712e, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC8712e.admob(abstractC8712e, AbstractC17861e.advert('\'', "Failed to parse type 'double' for input '", advert), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final float crashlytics() {
        AbstractC8712e abstractC8712e = this.purchase;
        String advert = abstractC8712e.advert();
        try {
            float parseFloat = Float.parseFloat(advert);
            if (this.license.ad.startapp || Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            AbstractC8712e.admob(abstractC8712e, "Unexpected special floating-point value " + Float.valueOf(parseFloat) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC8712e.admob(abstractC8712e, AbstractC17861e.advert('\'', "Failed to parse type 'float' for input '", advert), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC1527e
    public final AbstractC0232e isPro() {
        return this.license;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean isVip() {
        C13891e c13891e = this.mopub;
        return ((c13891e != null ? c13891e.vip : false) || this.purchase.firebase(true)) ? false : true;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final InterfaceC2043e metrica(InterfaceC9998e interfaceC9998e) {
        AbstractC0232e abstractC0232e = this.license;
        EnumC6813e yandex = AbstractC18127e.yandex(abstractC0232e, interfaceC9998e);
        AbstractC8712e abstractC8712e = this.purchase;
        Csuper csuper = (Csuper) abstractC8712e.metrica;
        int i = csuper.f36470e + 1;
        csuper.f36470e = i;
        if (i == ((Object[]) csuper.f36469e).length) {
            csuper.m4653strictfp();
        }
        ((Object[]) csuper.f36469e)[i] = interfaceC9998e;
        abstractC8712e.yandex(yandex.f14032e);
        if (abstractC8712e.isVip() != 4) {
            int ordinal = yandex.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new C1243e(this.license, yandex, abstractC8712e, interfaceC9998e, this.startapp) : (this.appmetrica == yandex && abstractC0232e.ad.appmetrica) ? this : new C1243e(this.license, yandex, abstractC8712e, interfaceC9998e, this.startapp);
        }
        AbstractC8712e.admob(abstractC8712e, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.InterfaceC1527e
    public final AbstractC1948e mopub() {
        return new crashlytics(this.license.ad, this.purchase).signatures();
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final String pro() {
        boolean z = this.adcel.metrica;
        AbstractC8712e abstractC8712e = this.purchase;
        return z ? abstractC8712e.smaato() : abstractC8712e.adcel();
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final char purchase() {
        AbstractC8712e abstractC8712e = this.purchase;
        String advert = abstractC8712e.advert();
        if (advert.length() == 1) {
            return advert.charAt(0);
        }
        AbstractC8712e.admob(abstractC8712e, AbstractC17861e.advert('\'', "Expected single char, but got '", advert), 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int signatures(InterfaceC9998e interfaceC9998e) {
        return AbstractC6629e.mopub(interfaceC9998e, this.license, pro(), " at path " + ((Csuper) this.purchase.metrica).crashlytics());
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final short subs() {
        AbstractC8712e abstractC8712e = this.purchase;
        long startapp = abstractC8712e.startapp();
        short s = (short) startapp;
        if (startapp == s) {
            return s;
        }
        AbstractC8712e.admob(abstractC8712e, "Failed to parse short for input '" + startapp + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC2043e
    public final Object subscription(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        boolean z = this.appmetrica == EnumC6813e.f14025e && (i & 1) == 0;
        AbstractC8712e abstractC8712e = this.purchase;
        if (z) {
            Csuper csuper = (Csuper) abstractC8712e.metrica;
            int[] iArr = (int[]) csuper.f36471e;
            int i2 = csuper.f36470e;
            if (iArr[i2] == -2) {
                ((Object[]) csuper.f36469e)[i2] = C9616e.f19064e;
            }
        }
        Object billing = billing(interfaceC5372e);
        if (z) {
            Csuper csuper2 = (Csuper) abstractC8712e.metrica;
            int[] iArr2 = (int[]) csuper2.f36471e;
            int i3 = csuper2.f36470e;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                csuper2.f36470e = i4;
                if (i4 == ((Object[]) csuper2.f36469e).length) {
                    csuper2.m4653strictfp();
                }
            }
            Object[] objArr = (Object[]) csuper2.f36469e;
            int i5 = csuper2.f36470e;
            objArr[i5] = billing;
            ((int[]) csuper2.f36471e)[i5] = -2;
        }
        return billing;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final long tapsense() {
        return this.purchase.startapp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (defpackage.AbstractC6629e.advert(r2, r6) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (yandex(r6) != (-1)) goto L20;
     */
    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC2043e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(defpackage.InterfaceC9998e r6) {
        /*
            r5 = this;
            int r0 = r6.purchase()
            r1 = -1
            eَؑۥ r2 = r5.license
            if (r0 != 0) goto L15
            boolean r0 = defpackage.AbstractC6629e.advert(r2, r6)
            if (r0 == 0) goto L15
        Lf:
            int r0 = r5.yandex(r6)
            if (r0 != r1) goto Lf
        L15:
            eٌٕۗ r6 = r5.purchase
            boolean r0 = r6.crashlytics()
            if (r0 != 0) goto L40
            eؙۧۚ r0 = r5.appmetrica
            char r0 = r0.f14031e
            r6.yandex(r0)
            java.lang.Object r6 = r6.metrica
            super r6 = (defpackage.Csuper) r6
            int r0 = r6.f36470e
            java.lang.Object r2 = r6.f36471e
            int[] r2 = (int[]) r2
            r3 = r2[r0]
            r4 = -2
            if (r3 != r4) goto L38
            r2[r0] = r1
            int r0 = r0 + r1
            r6.f36470e = r0
        L38:
            int r0 = r6.f36470e
            if (r0 == r1) goto L3f
            int r0 = r0 + r1
            r6.f36470e = r0
        L3f:
            return
        L40:
            eَُۖ r0 = r2.ad
            java.lang.String r0 = ""
            defpackage.AbstractC3421e.yandex(r6, r0)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1243e.vip(eًَؒ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0123, code lost:
    
        r1 = r15.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0127, code lost:
    
        if (r7 >= 64) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0129, code lost:
    
        r1.f32196e |= 1 << r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0133, code lost:
    
        r2 = (r7 >>> 6) - 1;
        r1 = (long[]) r1.f32195e;
        r1[r2] = (1 << (r7 & 63)) | r1[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0164, code lost:
    
        r1 = r3.f36470e;
        r4 = (int[]) r3.f36471e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016d, code lost:
    
        if (r4[r1] != (-2)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016f, code lost:
    
        r4[r1] = r19;
        r3.f36470e = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0175, code lost:
    
        r1 = r3.f36470e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0179, code lost:
    
        if (r1 == r19) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017b, code lost:
    
        r3.f36470e = r1 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017e, code lost:
    
        r1 = defpackage.AbstractC5304e.m1878throw(0, 6, r2.subs(0, r2.vip), r6);
        r5 = defpackage.AbstractC10257e.smaato("Encountered an unknown key '", r6, "' at offset ", r1, " at path: ");
        r5.append(r3.crashlytics());
        r5.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r5.append((java.lang.Object) defpackage.AbstractC3421e.adcel(r2.remoteconfig(), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b3, code lost:
    
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2043e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int yandex(defpackage.InterfaceC9998e r23) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1243e.yandex(eًَؒ):int");
    }
}
