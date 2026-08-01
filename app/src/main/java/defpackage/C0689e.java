package defpackage;

import java.io.EOFException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۥَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689e implements InterfaceC1272e {
    public long Signature;
    public final long ad;
    public int adcel;
    public int admob;
    public C17750e advert;
    public long amazon;
    public final C16089e appmetrica;
    public InterfaceC5483e billing;
    public final C10082e license;
    public long loadAd;
    public final C10177e metrica;
    public C17750e mopub;
    public boolean pro;
    public final C6891e purchase;
    public boolean remoteconfig;
    public long signatures;
    public long smaato;
    public InterfaceC18147e startapp;
    public InterfaceC5825e subscription;
    public final C1292e vip;
    public InterfaceC18147e yandex;

    public C0689e(int i) {
        this(-9223372036854775807L);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eََ, java.lang.Object] */
    public C0689e(long j) {
        this.ad = j;
        this.vip = new C1292e(10);
        this.metrica = new Object();
        this.license = new C10082e();
        this.smaato = -9223372036854775807L;
        this.appmetrica = new C16089e(13);
        C6891e c6891e = new C6891e();
        this.purchase = c6891e;
        this.startapp = c6891e;
        this.Signature = -1L;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final void billing() {
        InterfaceC5825e interfaceC5825e = this.subscription;
        if ((interfaceC5825e instanceof C11368e) && ((C11368e) interfaceC5825e).vip()) {
            long j = this.Signature;
            if (j == -1 || j == this.subscription.ad()) {
                return;
            }
            C11368e c11368e = (C11368e) this.subscription;
            this.subscription = new C11368e(this.Signature, c11368e.startapp, c11368e.adcel, c11368e.mopub, c11368e.advert, false);
            InterfaceC5483e interfaceC5483e = this.billing;
            interfaceC5483e.getClass();
            interfaceC5483e.pro(this.subscription);
            InterfaceC18147e interfaceC18147e = this.yandex;
            interfaceC18147e.getClass();
            interfaceC18147e.license(this.subscription.billing());
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.adcel = 0;
        this.smaato = -9223372036854775807L;
        this.amazon = 0L;
        this.admob = 0;
        this.Signature = -1L;
        this.signatures = j2;
        if (this.subscription instanceof AbstractC18309e) {
            throw null;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        return startapp(interfaceC2283e, true);
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.billing = interfaceC5483e;
        InterfaceC18147e Signature = interfaceC5483e.Signature(0, 1);
        this.yandex = Signature;
        this.startapp = Signature;
        this.billing.mopub();
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    public final boolean startapp(InterfaceC2283e interfaceC2283e, boolean z) {
        int i;
        int i2;
        int metrica;
        interfaceC2283e.smaato();
        if (interfaceC2283e.getPosition() == 0) {
            C17750e m4119while = this.appmetrica.m4119while(interfaceC2283e, null, 131072);
            this.mopub = m4119while;
            if (m4119while != null) {
                this.license.vip(m4119while);
            }
            i = (int) interfaceC2283e.yandex();
            if (!z) {
                interfaceC2283e.amazon(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!yandex(interfaceC2283e)) {
                C1292e c1292e = this.vip;
                c1292e.m571try(0);
                int smaato = c1292e.smaato();
                if ((i2 == 0 || ((-128000) & smaato) == (i2 & (-128000))) && (metrica = AbstractC16704e.metrica(smaato)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.metrica.ad(smaato);
                        i2 = smaato;
                    }
                    interfaceC2283e.startapp(metrica - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        billing();
                        throw new EOFException();
                    }
                    if (z) {
                        interfaceC2283e.smaato();
                        interfaceC2283e.startapp(i + i5);
                    } else {
                        interfaceC2283e.amazon(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                billing();
                throw new EOFException();
            }
        }
        if (z) {
            interfaceC2283e.amazon(i + i4);
        } else {
            interfaceC2283e.smaato();
        }
        this.adcel = i2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r3 != 1231971951) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0353, code lost:
    
        if (defpackage.EnumC10158e.f20098e.apply(r9) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x038c, code lost:
    
        if (((defpackage.C14500e) r10).ad.equals("TLEN") != false) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0332  */
    /* JADX WARN: Type inference failed for: r2v62, types: [eؘۢۛ] */
    /* JADX WARN: Type inference failed for: r2v9, types: [e٘ۦ۟] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r58v0, types: [eَؔؐ, eٕۘؗ] */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r58, defpackage.C14829e r59) {
        /*
            Method dump skipped, instructions count: 1469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0689e.vip(eَؔؐ, eٜٔؓ):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.yandex() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean yandex(defpackage.InterfaceC2283e r9) {
        /*
            r8 = this;
            eؘۖۛ r0 = r8.subscription
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.ad()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.yandex()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            eؒۙۚ r0 = r8.vip     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.ad     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.billing(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0689e.yandex(eَؔؐ):boolean");
    }
}
