package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17767e extends AbstractC15920e {
    public final AbstractC10129e adcel;
    public boolean advert;
    public final C17041e mopub;
    public boolean smaato;

    public AbstractC17767e(AbstractC10129e abstractC10129e, C17041e c17041e) {
        this.adcel = abstractC10129e;
        this.mopub = c17041e;
    }

    @Override // defpackage.InterfaceC5757e
    public final C10068e ad() {
        return this.adcel.vip;
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void admob(long j) {
        C4094e.appmetrica(mo1036class(), j);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void advert(char c) {
        C4094e.appmetrica(mo1036class(), c);
    }

    @Override // defpackage.InterfaceC5757e
    public final void amazon(InterfaceC9998e interfaceC9998e, int i) {
        C17041e mo1036class = mo1036class();
        byte[] bytes = interfaceC9998e.billing(i).getBytes(AbstractC5508e.ad);
        C4094e.vip(mo1036class, bytes.length, 96);
        C17041e.startapp(mo1036class, bytes, 0, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (defpackage.AbstractC12797e.inmobi(r0, 0) != false) goto L15;
     */
    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(defpackage.InterfaceC5372e r5, java.lang.Object r6) {
        /*
            r4 = this;
            boolean r0 = r4.smaato
            r1 = 0
            if (r0 != 0) goto L6
            goto L26
        L6:
            eًَؒ r0 = r5.appmetrica()
            eؚْۘ r2 = defpackage.C7400e.metrica
            eؖؗ٘ r2 = r2.vip
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r2)
            if (r0 == 0) goto L26
            eٖٗٓ r5 = r4.mo1036class()
            byte[] r6 = (byte[]) r6
            int r0 = r6.length
            long r2 = (long) r0
            r0 = 64
            defpackage.C4094e.vip(r5, r2, r0)
            r0 = 6
            defpackage.C17041e.startapp(r5, r6, r1, r0)
            return
        L26:
            boolean r0 = r4.smaato
            if (r0 != 0) goto L3a
            eًَؒ r0 = r5.appmetrica()
            boolean r2 = r0.yandex()
            if (r2 == 0) goto L3b
            boolean r0 = defpackage.AbstractC12797e.inmobi(r0, r1)
            if (r0 == 0) goto L3b
        L3a:
            r1 = 1
        L3b:
            r4.smaato = r1
            r5.ad(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17767e.appmetrica(eؘؒٙ, java.lang.Object):void");
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void billing(short s) {
        C4094e.appmetrica(mo1036class(), s);
    }

    /* renamed from: class */
    public abstract C17041e mo1036class();

    /* renamed from: interface */
    public abstract void mo1037interface();

    @Override // defpackage.InterfaceC5757e
    public final void license() {
        if (this.advert) {
            mo1036class().yandex(160);
        } else {
            mo1036class().yandex(246);
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void loadAd(int i) {
        C4094e.appmetrica(mo1036class(), i);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void mopub(float f) {
        C17041e mo1036class = mo1036class();
        mo1036class.yandex(250);
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        for (int i = 0; i < 4; i++) {
            mo1036class.yandex((floatToRawIntBits >> (24 - (i * 8))) & 255);
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void purchase(double d) {
        C17041e mo1036class = mo1036class();
        mo1036class.yandex(251);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        for (int i = 0; i < 8; i++) {
            mo1036class.yandex((int) ((doubleToRawLongBits >> (56 - (i * 8))) & 255));
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void remoteconfig(String str) {
        C17041e mo1036class = mo1036class();
        byte[] bytes = str.getBytes(AbstractC5508e.ad);
        C4094e.vip(mo1036class, bytes.length, 96);
        C17041e.startapp(mo1036class, bytes, 0, 6);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void startapp(boolean z) {
        mo1036class().yandex(z ? 245 : 244);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC11845e
    public final boolean subscription() {
        return false;
    }

    @Override // defpackage.AbstractC15920e
    public final void tapsense(InterfaceC9998e interfaceC9998e, int i) {
        long[] admob;
        long[] loadAd;
        C10836e c10836e = this.adcel.ad;
        C17041e mo1036class = mo1036class();
        this.advert = AbstractC7890e.billing(interfaceC9998e.adcel(i).appmetrica(), C6805e.appmetrica);
        this.smaato = AbstractC12797e.inmobi(interfaceC9998e, i);
        String billing = interfaceC9998e.billing(i);
        if (!AbstractC12797e.remoteconfig(interfaceC9998e)) {
            if (c10836e.vip && (loadAd = AbstractC12797e.loadAd(interfaceC9998e, i)) != null) {
                int i2 = 0;
                while (true) {
                    if (!(i2 < loadAd.length)) {
                        break;
                    }
                    if (i2 >= loadAd.length) {
                        throw new NoSuchElementException(String.valueOf(i2));
                    }
                    C4094e.vip(mo1036class, new C10994e(loadAd[i2]).f21777e, 192);
                    i2++;
                }
            }
            if (!(interfaceC9998e.appmetrica() instanceof C3016e) && !(interfaceC9998e.appmetrica() instanceof C18215e) && !(interfaceC9998e.appmetrica() instanceof AbstractC13637e)) {
                Long amazon = AbstractC12797e.amazon(interfaceC9998e, i);
                if (!c10836e.startapp || amazon == null) {
                    byte[] bytes = billing.getBytes(AbstractC5508e.ad);
                    C4094e.vip(mo1036class, bytes.length, 96);
                    C17041e.startapp(mo1036class, bytes, 0, 6);
                } else {
                    C4094e.appmetrica(mo1036class, amazon.longValue());
                }
            }
        }
        if (c10836e.metrica && (admob = AbstractC12797e.admob(interfaceC9998e, i)) != null) {
            int i3 = 0;
            while (true) {
                if (!(i3 < admob.length)) {
                    break;
                }
                if (i3 >= admob.length) {
                    throw new NoSuchElementException(String.valueOf(i3));
                }
                C4094e.vip(mo1036class, new C10994e(admob[i3]).f21777e, 192);
                i3++;
            }
        }
        mo1037interface();
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void yandex(byte b) {
        C4094e.appmetrica(mo1036class(), b);
    }
}
