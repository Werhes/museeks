package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919e implements InterfaceC1272e {
    public C1292e Signature;
    public final InterfaceC7854e ad;
    public final ArrayList adcel;
    public int admob;
    public long ads;
    public int advert;
    public long amazon;
    public boolean applovin;
    public final C1292e appmetrica;
    public final C1292e billing;

    /* renamed from: class, reason: not valid java name */
    public C0713e f5115class;
    public long[][] crashlytics;
    public int firebase;
    public long inmobi;
    public boolean isPro;
    public boolean isVip;
    public final C1292e license;
    public int loadAd;
    public final boolean metrica;
    public C1410e mopub;
    public InterfaceC5483e premium;
    public int pro;
    public final C1292e purchase;
    public int remoteconfig;
    public boolean signatures;
    public int smaato;
    public final C7536e startapp;
    public C1485e[] subs;
    public int subscription;
    public boolean tapsense;
    public final int vip;
    public final ArrayDeque yandex;

    public C1919e(InterfaceC7854e interfaceC7854e, int i) {
        this.ad = interfaceC7854e;
        this.vip = i;
        this.metrica = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        C2171e c2171e = AbstractC17475e.f34223e;
        this.mopub = C1410e.f4222e;
        this.advert = (i & 4) != 0 ? 3 : 0;
        this.startapp = new C7536e();
        this.adcel = new ArrayList();
        this.billing = new C1292e(16);
        this.yandex = new ArrayDeque();
        this.license = new C1292e(AbstractC17595e.ad);
        this.appmetrica = new C1292e(6);
        this.purchase = new C1292e();
        this.admob = -1;
        this.premium = InterfaceC5483e.isVip;
        this.subs = new C1485e[0];
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        return this.mopub;
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x0135, code lost:
    
        if (((defpackage.C9635e) r13).ad.equals("auxiliary.tracks.offset") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (((defpackage.C9635e) r3).ad.equals("auxiliary.tracks.interleaved") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (((defpackage.C9635e) r12).ad.equals("auxiliary.tracks.map") != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing(long r48) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1919e.billing(long):void");
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.yandex.clear();
        this.loadAd = 0;
        this.admob = -1;
        this.subscription = 0;
        this.remoteconfig = 0;
        this.pro = 0;
        this.signatures = false;
        this.applovin = false;
        if (j == 0) {
            if (this.advert != 3) {
                this.advert = 0;
                this.loadAd = 0;
                return;
            } else {
                C7536e c7536e = this.startapp;
                c7536e.ad.clear();
                c7536e.vip = 0;
                this.adcel.clear();
                return;
            }
        }
        for (C1485e c1485e : this.subs) {
            C5085e c5085e = c1485e.vip;
            int ad = c5085e.ad(j2);
            if (ad == -1) {
                ad = c5085e.vip(j2);
            }
            c1485e.appmetrica = ad;
            C13811e c13811e = c1485e.license;
            if (c13811e != null) {
                c13811e.vip = false;
                c13811e.metrica = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C1410e c1410e;
        InterfaceC5204e mopub = AbstractC5418e.mopub(interfaceC2283e, false, (this.vip & 2) != 0);
        if (mopub != null) {
            c1410e = AbstractC17475e.ads(mopub);
        } else {
            C2171e c2171e = AbstractC17475e.f34223e;
            c1410e = C1410e.f4222e;
        }
        this.mopub = c1410e;
        return mopub == null;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        if ((this.vip & 16) == 0) {
            interfaceC5483e = new C5609e(interfaceC5483e, this.ad);
        }
        this.premium = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x063c, code lost:
    
        throw defpackage.C15125e.metrica("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e A[EDGE_INSN: B:29:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:8:0x0012->B:28:0x0012], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eََ, java.lang.Object] */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r43, defpackage.C14829e r44) {
        /*
            Method dump skipped, instructions count: 1942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1919e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
