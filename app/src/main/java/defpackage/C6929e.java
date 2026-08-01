package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6929e extends AbstractC15920e implements InterfaceC5757e, InterfaceC11845e {
    public boolean Signature;
    public final C16722e adcel;
    public String admob;
    public final EnumC6813e advert;
    public final C10068e amazon;
    public final C10195e loadAd;
    public final AbstractC0232e mopub;
    public final C6929e[] smaato;
    public String subscription;

    public C6929e(C16722e c16722e, AbstractC0232e abstractC0232e, EnumC6813e enumC6813e, C6929e[] c6929eArr) {
        this.adcel = c16722e;
        this.mopub = abstractC0232e;
        this.advert = enumC6813e;
        this.smaato = c6929eArr;
        this.amazon = abstractC0232e.vip;
        this.loadAd = abstractC0232e.ad;
        int ordinal = enumC6813e.ordinal();
        if (c6929eArr != null) {
            C6929e c6929e = c6929eArr[ordinal];
            if (c6929e == null && c6929e == this) {
                return;
            }
            c6929eArr[ordinal] = this;
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC11845e
    public final void Signature(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        if (obj != null || this.loadAd.appmetrica) {
            super.Signature(interfaceC9998e, i, interfaceC5372e, obj);
        }
    }

    @Override // defpackage.InterfaceC5757e
    public final C10068e ad() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final InterfaceC5757e adcel(InterfaceC9998e interfaceC9998e) {
        boolean ad = AbstractC17276e.ad(interfaceC9998e);
        EnumC6813e enumC6813e = this.advert;
        AbstractC0232e abstractC0232e = this.mopub;
        C16722e c16722e = this.adcel;
        if (ad) {
            if (!(c16722e instanceof C6161e)) {
                c16722e = new C6161e((InterfaceC9483e) c16722e.f32780e, this.Signature);
            }
            return new C6929e(c16722e, abstractC0232e, enumC6813e, null);
        }
        if (interfaceC9998e.yandex() && interfaceC9998e.equals(AbstractC12517e.ad)) {
            if (!(c16722e instanceof C5803e)) {
                c16722e = new C5803e((InterfaceC9483e) c16722e.f32780e, this.Signature);
            }
            return new C6929e(c16722e, abstractC0232e, enumC6813e, null);
        }
        if (this.admob != null) {
            this.subscription = interfaceC9998e.ad();
        }
        return this;
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void admob(long j) {
        if (this.Signature) {
            remoteconfig(String.valueOf(j));
        } else {
            this.adcel.subscription(j);
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void advert(char c) {
        remoteconfig(String.valueOf(c));
    }

    @Override // defpackage.InterfaceC5757e
    public final void amazon(InterfaceC9998e interfaceC9998e, int i) {
        remoteconfig(interfaceC9998e.billing(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r1 != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0038, code lost:
    
        if (defpackage.AbstractC7890e.billing(r1, defpackage.C6805e.purchase) == false) goto L19;
     */
    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(defpackage.InterfaceC5372e r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6929e.appmetrica(eؘؒٙ, java.lang.Object):void");
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void billing(short s) {
        if (this.Signature) {
            remoteconfig(String.valueOf((int) s));
        } else {
            this.adcel.pro(s);
        }
    }

    @Override // defpackage.InterfaceC5757e
    public final void license() {
        this.adcel.remoteconfig("null");
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void loadAd(int i) {
        if (this.Signature) {
            remoteconfig(String.valueOf(i));
        } else {
            this.adcel.admob(i);
        }
    }

    @Override // defpackage.InterfaceC5757e
    public final InterfaceC11845e metrica(InterfaceC9998e interfaceC9998e) {
        C6929e c6929e;
        AbstractC0232e abstractC0232e = this.mopub;
        EnumC6813e yandex = AbstractC18127e.yandex(abstractC0232e, interfaceC9998e);
        char c = yandex.f14032e;
        C16722e c16722e = this.adcel;
        c16722e.Signature(c);
        c16722e.f32781e = true;
        String str = this.admob;
        if (str != null) {
            String str2 = this.subscription;
            if (str2 == null) {
                str2 = interfaceC9998e.ad();
            }
            c16722e.amazon();
            remoteconfig(str);
            c16722e.Signature(':');
            remoteconfig(str2);
            this.admob = null;
            this.subscription = null;
        }
        if (this.advert == yandex) {
            return this;
        }
        C6929e[] c6929eArr = this.smaato;
        return (c6929eArr == null || (c6929e = c6929eArr[yandex.ordinal()]) == null) ? new C6929e(c16722e, abstractC0232e, yandex, c6929eArr) : c6929e;
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void mopub(float f) {
        boolean z = this.Signature;
        C16722e c16722e = this.adcel;
        if (z) {
            remoteconfig(String.valueOf(f));
        } else {
            ((InterfaceC9483e) c16722e.f32780e).mo2228this(String.valueOf(f));
        }
        if (!this.loadAd.startapp && Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC3421e.vip(Float.valueOf(f), ((InterfaceC9483e) c16722e.f32780e).toString());
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void purchase(double d) {
        boolean z = this.Signature;
        C16722e c16722e = this.adcel;
        if (z) {
            remoteconfig(String.valueOf(d));
        } else {
            ((InterfaceC9483e) c16722e.f32780e).mo2228this(String.valueOf(d));
        }
        if (!this.loadAd.startapp && Math.abs(d) > Double.MAX_VALUE) {
            throw AbstractC3421e.vip(Double.valueOf(d), ((InterfaceC9483e) c16722e.f32780e).toString());
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void remoteconfig(String str) {
        this.adcel.signatures(str);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void startapp(boolean z) {
        if (this.Signature) {
            remoteconfig(String.valueOf(z));
        } else {
            ((InterfaceC9483e) this.adcel.f32780e).mo2228this(String.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC11845e
    public final boolean subscription() {
        return this.loadAd.ad;
    }

    @Override // defpackage.AbstractC15920e
    public final void tapsense(InterfaceC9998e interfaceC9998e, int i) {
        int ordinal = this.advert.ordinal();
        C16722e c16722e = this.adcel;
        boolean z = true;
        if (ordinal == 1) {
            if (!c16722e.f32781e) {
                c16722e.Signature(',');
            }
            c16722e.amazon();
            return;
        }
        if (ordinal == 2) {
            if (c16722e.f32781e) {
                this.Signature = true;
                c16722e.amazon();
                return;
            }
            if (i % 2 == 0) {
                c16722e.Signature(',');
                c16722e.amazon();
            } else {
                c16722e.Signature(':');
                c16722e.inmobi();
                z = false;
            }
            this.Signature = z;
            return;
        }
        if (ordinal != 3) {
            if (!c16722e.f32781e) {
                c16722e.Signature(',');
            }
            c16722e.amazon();
            AbstractC6629e.loadAd(this.mopub, interfaceC9998e);
            remoteconfig(interfaceC9998e.billing(i));
            c16722e.Signature(':');
            c16722e.inmobi();
            return;
        }
        if (i == 0) {
            this.Signature = true;
        }
        if (i == 1) {
            c16722e.Signature(',');
            c16722e.inmobi();
            this.Signature = false;
        }
    }

    @Override // defpackage.InterfaceC11845e
    public final void vip(InterfaceC9998e interfaceC9998e) {
        C16722e c16722e = this.adcel;
        c16722e.getClass();
        c16722e.f32781e = false;
        c16722e.Signature(this.advert.f14031e);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void yandex(byte b) {
        if (this.Signature) {
            remoteconfig(String.valueOf((int) b));
        } else {
            this.adcel.loadAd(b);
        }
    }
}
