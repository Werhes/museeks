package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14573e extends AbstractC3199e {
    public long[] adcel;
    public final crashlytics appmetrica;
    public boolean billing;
    public final AbstractC10129e license;
    public int purchase = -1;
    public boolean startapp;
    public int yandex;

    public C14573e(AbstractC10129e abstractC10129e, crashlytics crashlyticsVar) {
        this.license = abstractC10129e;
        this.appmetrica = crashlyticsVar;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final void Signature() {
        long[] jArr = this.adcel;
        crashlytics crashlyticsVar = this.appmetrica;
        crashlyticsVar.remoteconfig(jArr);
        int i = crashlyticsVar.f1117e;
        if (i == 246) {
            crashlyticsVar.m201while(246);
        } else if (i == 160) {
            crashlyticsVar.m201while(160);
        }
    }

    @Override // defpackage.InterfaceC2043e
    public final C10068e ad() {
        return this.license.vip;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final byte ads() {
        long[] jArr = this.adcel;
        crashlytics crashlyticsVar = this.appmetrica;
        crashlyticsVar.remoteconfig(jArr);
        long premium = crashlyticsVar.premium();
        crashlyticsVar.inmobi();
        return (byte) premium;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int amazon() {
        long[] jArr = this.adcel;
        crashlytics crashlyticsVar = this.appmetrica;
        crashlyticsVar.remoteconfig(jArr);
        long premium = crashlyticsVar.premium();
        crashlyticsVar.inmobi();
        return (int) premium;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean appmetrica() {
        boolean z;
        long[] jArr = this.adcel;
        crashlytics crashlyticsVar = this.appmetrica;
        crashlyticsVar.remoteconfig(jArr);
        int i = crashlyticsVar.f1117e;
        if (i == 244) {
            z = false;
        } else {
            if (i != 245) {
                throw AbstractC18489e.ad(i, "boolean value");
            }
            z = true;
        }
        crashlyticsVar.inmobi();
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (defpackage.AbstractC12797e.inmobi(r0, 0) != false) goto L19;
     */
    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object billing(defpackage.InterfaceC5372e r4) {
        /*
            r3 = this;
            boolean r0 = r3.startapp
            if (r0 != 0) goto L5
            goto L31
        L5:
            eًَؒ r0 = r4.appmetrica()
            eؚْۘ r1 = defpackage.C7400e.metrica
            eؖؗ٘ r1 = r1.vip
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r1)
            if (r0 == 0) goto L31
            long[] r4 = r3.adcel
            crashlytics r0 = r3.appmetrica
            r0.remoteconfig(r4)
            int r4 = r0.f1117e
            r1 = r4 & 224(0xe0, float:3.14E-43)
            r2 = 64
            if (r1 != r2) goto L2a
            byte[] r4 = r0.applovin()
            r0.inmobi()
            return r4
        L2a:
            java.lang.String r0 = "start of byte string"
            eؑٛۘ r4 = defpackage.AbstractC18489e.ad(r4, r0)
            throw r4
        L31:
            boolean r0 = r3.startapp
            if (r0 != 0) goto L46
            eًَؒ r0 = r4.appmetrica()
            boolean r1 = r0.yandex()
            r2 = 0
            if (r1 == 0) goto L47
            boolean r0 = defpackage.AbstractC12797e.inmobi(r0, r2)
            if (r0 == 0) goto L47
        L46:
            r2 = 1
        L47:
            r3.startapp = r2
            java.lang.Object r4 = r4.metrica(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14573e.billing(eؘؒٙ):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    /* renamed from: class */
    public final double mo501class() {
        float ad;
        double d;
        crashlytics crashlyticsVar = this.appmetrica;
        C17041e c17041e = (C17041e) crashlyticsVar.f1119e;
        crashlyticsVar.remoteconfig(this.adcel);
        int i = crashlyticsVar.f1117e;
        int i2 = 0;
        switch (i) {
            case 249:
                ad = AbstractC1020e.ad((short) (c17041e.vip() | (c17041e.vip() << 8)));
                d = ad;
                crashlyticsVar.inmobi();
                return d;
            case 250:
                int i3 = 0;
                while (i2 < 4) {
                    i3 = (i3 << 8) | c17041e.vip();
                    i2++;
                }
                ad = Float.intBitsToFloat(i3);
                d = ad;
                crashlyticsVar.inmobi();
                return d;
            case 251:
                long j = 0;
                while (i2 < 8) {
                    j = (j << 8) | c17041e.vip();
                    i2++;
                }
                d = Double.longBitsToDouble(j);
                crashlyticsVar.inmobi();
                return d;
            default:
                throw AbstractC18489e.ad(i, "double header");
        }
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final float crashlytics() {
        float ad;
        crashlytics crashlyticsVar = this.appmetrica;
        C17041e c17041e = (C17041e) crashlyticsVar.f1119e;
        crashlyticsVar.remoteconfig(this.adcel);
        int i = crashlyticsVar.f1117e;
        if (i == 249) {
            ad = AbstractC1020e.ad((short) (c17041e.vip() | (c17041e.vip() << 8)));
        } else {
            if (i != 250) {
                throw AbstractC18489e.ad(i, "float header");
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                i2 = (i2 << 8) | c17041e.vip();
            }
            ad = Float.intBitsToFloat(i2);
        }
        crashlyticsVar.inmobi();
        return ad;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean isVip() {
        int i = this.appmetrica.f1117e;
        return !(i == 246 || i == 160);
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final InterfaceC2043e metrica(InterfaceC9998e interfaceC9998e) {
        C14573e c14573e;
        boolean remoteconfig = AbstractC12797e.remoteconfig(interfaceC9998e);
        crashlytics crashlyticsVar = this.appmetrica;
        AbstractC10129e abstractC10129e = this.license;
        if (remoteconfig) {
            c14573e = new C14573e(abstractC10129e, crashlyticsVar);
        } else {
            AbstractC8457e appmetrica = interfaceC9998e.appmetrica();
            c14573e = (AbstractC7890e.billing(appmetrica, C3016e.appmetrica) || (appmetrica instanceof AbstractC13637e)) ? new C14573e(abstractC10129e, crashlyticsVar) : AbstractC7890e.billing(appmetrica, C18215e.appmetrica) ? new C14573e(abstractC10129e, crashlyticsVar) : new C14573e(abstractC10129e, crashlyticsVar);
        }
        long[] Signature = abstractC10129e.ad.billing ? AbstractC12797e.Signature(interfaceC9998e) : null;
        long[] jArr = this.adcel;
        if (jArr != null) {
            if (Signature != null) {
                Csuper csuper = new Csuper((byte) 0, 16);
                csuper.purchase(jArr);
                csuper.purchase(Signature);
                long[] jArr2 = (long[]) csuper.f36471e;
                jArr = new long[csuper.m4658transient()];
                csuper.m4646instanceof(jArr2, jArr);
            }
            Signature = jArr;
        }
        c14573e.mo3234throw(Signature);
        return c14573e;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final String pro() {
        return this.appmetrica.smaato(this.adcel);
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final char purchase() {
        long[] jArr = this.adcel;
        crashlytics crashlyticsVar = this.appmetrica;
        crashlyticsVar.remoteconfig(jArr);
        long premium = crashlyticsVar.premium();
        crashlyticsVar.inmobi();
        return (char) premium;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int signatures(InterfaceC9998e interfaceC9998e) {
        return AbstractC1020e.vip(interfaceC9998e, this.appmetrica.smaato(this.adcel));
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final short subs() {
        long[] jArr = this.adcel;
        crashlytics crashlyticsVar = this.appmetrica;
        crashlyticsVar.remoteconfig(jArr);
        long premium = crashlyticsVar.premium();
        crashlyticsVar.inmobi();
        return (short) premium;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final long tapsense() {
        long[] jArr = this.adcel;
        crashlytics crashlyticsVar = this.appmetrica;
        crashlyticsVar.remoteconfig(jArr);
        long premium = crashlyticsVar.premium();
        crashlyticsVar.inmobi();
        return premium;
    }

    /* renamed from: throw */
    public void mo3234throw(long[] jArr) {
        int m200try = this.appmetrica.m200try(jArr, 191, 160, "map");
        if (m200try >= 0) {
            this.billing = true;
            this.purchase = m200try;
        }
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC2043e
    public final void vip(InterfaceC9998e interfaceC9998e) {
        if (this.billing) {
            return;
        }
        this.appmetrica.m201while(255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        throw defpackage.AbstractC18489e.ad(r7.f1117e, "next data item");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int yandex(defpackage.InterfaceC9998e r18) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14573e.yandex(eًَؒ):int");
    }
}
