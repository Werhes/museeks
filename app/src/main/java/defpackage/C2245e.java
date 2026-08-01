package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2245e {
    public final /* synthetic */ int ad;
    public Object adcel;
    public Object advert;
    public final Object appmetrica;
    public Object billing;
    public Object license;
    public final Object metrica;
    public Object mopub;
    public Object purchase;
    public Object startapp;
    public int vip;
    public Object yandex;

    public C2245e() {
        this.ad = 0;
        long[] jArr = AbstractC12981e.ad;
        this.metrica = new C0583e();
        C12618e c12618e = AbstractC1710e.ad;
        this.appmetrica = new C12618e();
        this.purchase = new ArrayList();
        this.billing = new ArrayList();
        this.yandex = new ArrayList();
        this.startapp = new ArrayList();
        this.adcel = new ArrayList();
        this.advert = new C8755e(this);
    }

    public C2245e(C11180e c11180e, ExecutorC12245e executorC12245e, Executor executor) {
        this.ad = 1;
        this.purchase = null;
        this.billing = null;
        this.yandex = null;
        this.vip = 1;
        this.startapp = new C4065e(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.adcel = null;
        this.mopub = new C4065e(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.advert = null;
        this.metrica = executor;
        this.license = executorC12245e;
        this.appmetrica = c11180e;
    }

    public static int adcel(int[] iArr, InterfaceC8848e interfaceC8848e) {
        int amazon = interfaceC8848e.amazon();
        int yandex = interfaceC8848e.yandex() + amazon;
        int i = 0;
        while (amazon < yandex) {
            int billing = interfaceC8848e.billing() + iArr[amazon];
            iArr[amazon] = billing;
            i = Math.max(i, billing);
            amazon++;
        }
        return i;
    }

    public static void license(InterfaceC8848e interfaceC8848e, int i, C12703e c12703e) {
        int i2 = 0;
        long smaato = interfaceC8848e.smaato(0);
        long ad = interfaceC8848e.mopub() ? C11490e.ad(0, i, 1, smaato) : C11490e.ad(i, 0, 2, smaato);
        C0110e[] c0110eArr = c12703e.ad;
        int length = c0110eArr.length;
        int i3 = 0;
        while (i2 < length) {
            C0110e c0110e = c0110eArr[i2];
            int i4 = i3 + 1;
            if (c0110e != null) {
                c0110e.advert = C11490e.license(ad, C11490e.metrica(interfaceC8848e.smaato(i3), smaato));
            }
            i2++;
            i3 = i4;
        }
    }

    public void ad() {
        int m2467class = AbstractC8703e.m2467class(this.vip);
        if (m2467class == 0 || m2467class == 1) {
            startapp();
            return;
        }
        if (m2467class == 2 || m2467class == 3) {
            AbstractC9464e.yandex("VideoEncoderSession", "closeInternal in " + AbstractC8647e.m2463while(this.vip) + " state");
            this.vip = 3;
            return;
        }
        if (m2467class == 4) {
            AbstractC9464e.yandex("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + AbstractC8647e.m2463while(this.vip) + " is not handled");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x055f  */
    /* JADX WARN: Type inference failed for: r11v24, types: [eٌِٞ] */
    /* JADX WARN: Type inference failed for: r1v36, types: [eٌؑؗ[]] */
    /* JADX WARN: Type inference failed for: r9v34, types: [eٌؑؗ[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void appmetrica(int r52, int r53, int r54, java.util.ArrayList r55, defpackage.Csuper r56, defpackage.Cpackage r57, boolean r58, boolean r59, int r60, boolean r61, int r62, int r63, defpackage.InterfaceC18435e r64, defpackage.InterfaceC2661e r65) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2245e.appmetrica(int, int, int, java.util.ArrayList, super, package, boolean, boolean, int, boolean, int, int, eۡۦ, eؔ٘ۨ):void");
    }

    public void billing(Object obj) {
        C0110e[] c0110eArr;
        C12703e c12703e = (C12703e) ((C0583e) this.metrica).advert(obj);
        if (c12703e == null || (c0110eArr = c12703e.ad) == null) {
            return;
        }
        for (C0110e c0110e : c0110eArr) {
            if (c0110e != null) {
                c0110e.license();
            }
        }
    }

    public long metrica() {
        ArrayList arrayList = (ArrayList) this.adcel;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0110e c0110e = (C0110e) arrayList.get(i);
            C16446e c16446e = c0110e.amazon;
            if (c16446e != null) {
                j = (Math.max((int) (j & 4294967295L), ((int) (c0110e.advert & 4294967295L)) + ((int) (c16446e.signatures & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), ((int) (c0110e.advert >> 32)) + ((int) (c16446e.signatures >> 32))) << 32);
            }
        }
        return j;
    }

    public void purchase() {
        C0583e c0583e = (C0583e) this.metrica;
        if (c0583e.adcel()) {
            Object[] objArr = c0583e.metrica;
            long[] jArr = c0583e.ad;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (C0110e c0110e : ((C12703e) objArr[(i << 3) + i3]).ad) {
                                    if (c0110e != null) {
                                        c0110e.license();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            c0583e.ad();
        }
    }

    public void startapp() {
        int m2467class = AbstractC8703e.m2467class(this.vip);
        if (m2467class == 0) {
            this.vip = 5;
            return;
        }
        if (m2467class != 1 && m2467class != 2 && m2467class != 3) {
            if (m2467class != 4) {
                throw new IllegalStateException("State " + AbstractC8647e.m2463while(this.vip) + " is not handled");
            }
            AbstractC9464e.yandex("VideoEncoderSession", "terminateNow in " + AbstractC8647e.m2463while(this.vip) + ", No-op");
            return;
        }
        this.vip = 5;
        ((C7169e) this.advert).ad((C18405e) this.purchase);
        this.yandex = null;
        if (((C18405e) this.purchase) == null) {
            AbstractC9464e.remoteconfig("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            ((C7169e) this.adcel).ad(null);
            return;
        }
        AbstractC9464e.yandex("VideoEncoderSession", "VideoEncoder is releasing: " + ((C18405e) this.purchase));
        C18405e c18405e = (C18405e) this.purchase;
        c18405e.yandex.execute(new RunnableC4127e(c18405e, 3));
        ((C18405e) this.purchase).startapp.ad(new RunnableC1352e(15, this), (Executor) this.license);
        this.purchase = null;
    }

    public String toString() {
        switch (this.ad) {
            case 1:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((C6122e) this.yandex, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public C0110e vip(int i, Object obj) {
        C12703e c12703e = (C12703e) ((C0583e) this.metrica).billing(obj);
        if (c12703e != null) {
            return c12703e.ad[i];
        }
        return null;
    }

    public void yandex(InterfaceC8848e interfaceC8848e, boolean z) {
        C0110e[] c0110eArr = ((C12703e) ((C0583e) this.metrica).billing(interfaceC8848e.getKey())).ad;
        int length = c0110eArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C0110e c0110e = c0110eArr[i];
            int i3 = i2 + 1;
            if (c0110e != null) {
                long smaato = interfaceC8848e.smaato(i2);
                long j = c0110e.advert;
                if (!C11490e.vip(j, C0110e.remoteconfig) && !C11490e.vip(j, smaato)) {
                    long metrica = C11490e.metrica(smaato, j);
                    InterfaceC6512e interfaceC6512e = c0110e.appmetrica;
                    if (interfaceC6512e != null) {
                        long metrica2 = C11490e.metrica(((C11490e) c0110e.admob.getValue()).ad, metrica);
                        c0110e.yandex(metrica2);
                        c0110e.billing(true);
                        c0110e.billing = z;
                        AbstractC5336e.purchase(c0110e.ad, null, 0, new C5840e(c0110e, interfaceC6512e, metrica2, null), 3);
                        c0110e.advert = smaato;
                    }
                }
                c0110e.advert = smaato;
            }
            i++;
            i2 = i3;
        }
    }
}
