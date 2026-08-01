package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8170e extends AbstractC15186e {

    /* renamed from: while, reason: not valid java name */
    public static final AtomicInteger f16634while = new AtomicInteger();
    public final InterfaceC9660e Signature;
    public final C2435e admob;
    public final boolean ads;
    public final int advert;
    public final boolean amazon;
    public final C1292e applovin;

    /* renamed from: class, reason: not valid java name */
    public boolean f16635class;
    public C2220e crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public long f16636extends;
    public int firebase;

    /* renamed from: goto, reason: not valid java name */
    public boolean f16637goto;
    public final C9284e inmobi;

    /* renamed from: interface, reason: not valid java name */
    public volatile boolean f16638interface;
    public final C7931e isPro;
    public final List isVip;
    public final int loadAd;
    public final int mopub;

    /* renamed from: native, reason: not valid java name */
    public boolean f16639native;
    public final boolean premium;
    public final boolean pro;
    public final boolean remoteconfig;
    public final C8010e signatures;
    public final Uri smaato;
    public C12344e subs;
    public final C12344e subscription;
    public final crashlytics tapsense;

    /* renamed from: this, reason: not valid java name */
    public AbstractC17475e f16640this;

    /* renamed from: throw, reason: not valid java name */
    public boolean f16641throw;

    public C8170e(crashlytics crashlyticsVar, InterfaceC9660e interfaceC9660e, C2435e c2435e, C16975e c16975e, boolean z, InterfaceC9660e interfaceC9660e2, C2435e c2435e2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C8010e c8010e, C9284e c9284e, C12344e c12344e, C7931e c7931e, C1292e c1292e, boolean z6, boolean z7, C5350e c5350e) {
        super(interfaceC9660e, c2435e, c16975e, i, obj, j, j2, j3);
        this.ads = z;
        this.loadAd = i2;
        this.f16636extends = z3 ? j2 - j : -9223372036854775807L;
        this.advert = i3;
        this.admob = c2435e2;
        this.Signature = interfaceC9660e2;
        this.f16635class = c2435e2 != null;
        this.premium = z2;
        this.smaato = uri;
        this.remoteconfig = z5;
        this.signatures = c8010e;
        this.pro = z4;
        this.tapsense = crashlyticsVar;
        this.isVip = list;
        this.inmobi = c9284e;
        this.subscription = c12344e;
        this.isPro = c7931e;
        this.applovin = c1292e;
        this.f16641throw = z6;
        this.amazon = z7;
        C2171e c2171e = AbstractC17475e.f34223e;
        this.f16640this = C1410e.f4222e;
        this.mopub = f16634while.getAndIncrement();
    }

    public static byte[] license(String str) {
        if (AbstractC3628e.tapsense(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.InterfaceC15834e
    public final void ad() {
        C12344e c12344e;
        this.crashlytics.getClass();
        if (this.subs == null && (c12344e = this.subscription) != null) {
            InterfaceC1272e ad = ((InterfaceC1272e) c12344e.f24749e).ad();
            if ((ad instanceof C6928e) || (ad instanceof C15789e)) {
                this.subs = this.subscription;
                this.f16635class = false;
            }
        }
        C2435e c2435e = this.admob;
        InterfaceC9660e interfaceC9660e = this.Signature;
        if (this.f16635class) {
            interfaceC9660e.getClass();
            c2435e.getClass();
            metrica(interfaceC9660e, c2435e, this.premium, false);
            this.firebase = 0;
            this.f16635class = false;
        }
        if (this.f16638interface) {
            return;
        }
        if (!this.pro) {
            metrica(this.startapp, this.vip, this.ads, true);
        }
        this.f16637goto = !this.f16638interface;
    }

    public final int appmetrica(int i) {
        AbstractC2301e.subscription(!this.f16641throw);
        if (i >= this.f16640this.size()) {
            return 0;
        }
        return ((Integer) this.f16640this.get(i)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x00a8, code lost:
    
        if (((defpackage.C10852e) r13).vip.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v22, types: [eْؖۧ] */
    /* JADX WARN: Type inference failed for: r5v12, types: [eْؖۧ] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C14446e billing(defpackage.InterfaceC9660e r34, defpackage.C2435e r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8170e.billing(eٍۖؔ, eؚؔۜ, boolean):eٟٔؑ");
    }

    public final void metrica(InterfaceC9660e interfaceC9660e, C2435e c2435e, boolean z, boolean z2) {
        C2435e metrica;
        boolean z3;
        long j;
        if (z) {
            z3 = this.firebase != 0;
            metrica = c2435e;
        } else {
            long j2 = this.firebase;
            long j3 = c2435e.billing;
            metrica = c2435e.metrica(j2, j3 != -1 ? j3 - j2 : -1L);
            z3 = false;
        }
        try {
            C14446e billing = billing(interfaceC9660e, metrica, z2);
            if (z3) {
                billing.purchase(this.firebase, false);
            }
            while (!this.f16638interface && ((InterfaceC1272e) this.subs.f24749e).vip(billing, C12344e.f24747e) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.license.purchase & 16384) == 0) {
                            throw e;
                        }
                        ((InterfaceC1272e) this.subs.f24749e).license(0L, 0L);
                        j = billing.f28558e;
                    }
                } catch (Throwable th) {
                    this.firebase = (int) (billing.f28558e - c2435e.purchase);
                    throw th;
                }
            }
            j = billing.f28558e;
            this.firebase = (int) (j - c2435e.purchase);
        } finally {
            AbstractC16136e.license(interfaceC9660e);
        }
    }

    public final boolean purchase() {
        return this.f16636extends != -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC15834e
    public final void vip() {
        this.f16638interface = true;
    }
}
