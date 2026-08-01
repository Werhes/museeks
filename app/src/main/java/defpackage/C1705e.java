package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705e {
    public final InterfaceC5482e ad;
    public C15910e adcel;
    public long appmetrica;
    public OutputStream billing;
    public C2435e license;
    public final int metrica;
    public File purchase;
    public long startapp;
    public final long vip;
    public long yandex;

    public C1705e(InterfaceC5482e interfaceC5482e, long j) {
        AbstractC2301e.admob("fragmentSize must be positive or C.LENGTH_UNSET.", j > 0 || j == -1);
        if (j != -1 && j < 2097152) {
            AbstractC2803e.smaato("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        interfaceC5482e.getClass();
        this.ad = interfaceC5482e;
        this.vip = j == -1 ? Long.MAX_VALUE : j;
        this.metrica = 20480;
    }

    public final void ad() {
        OutputStream outputStream = this.billing;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            AbstractC9413e.yandex(this.billing);
            this.billing = null;
            File file = this.purchase;
            this.purchase = null;
            InterfaceC5482e interfaceC5482e = this.ad;
            long j = this.yandex;
            C8531e c8531e = (C8531e) interfaceC5482e;
            synchronized (c8531e) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    C7747e vip = C7747e.vip(file, j, -9223372036854775807L, c8531e.metrica);
                    vip.getClass();
                    C15514e m928package = c8531e.metrica.m928package(vip.f6202e);
                    m928package.getClass();
                    AbstractC2301e.subscription(m928package.ad(vip.f6200e, vip.f6199e));
                    long vip2 = AbstractC13501e.vip(m928package.appmetrica);
                    if (vip2 != -1) {
                        AbstractC2301e.subscription(vip.f6200e + vip.f6199e <= vip2);
                    }
                    if (c8531e.license != null) {
                        try {
                            c8531e.license.m4215extends(file.getName(), vip.f6199e, vip.f6203e);
                        } catch (IOException e) {
                            throw new IOException(e);
                        }
                    }
                    c8531e.vip(vip);
                    try {
                        c8531e.metrica.m907e();
                        c8531e.notifyAll();
                    } catch (IOException e2) {
                        throw new IOException(e2);
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC9413e.yandex(this.billing);
            this.billing = null;
            File file2 = this.purchase;
            this.purchase = null;
            file2.delete();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [eٖؑ, java.io.BufferedOutputStream] */
    public final void vip(C2435e c2435e) {
        File metrica;
        long j = c2435e.billing;
        long min = j == -1 ? -1L : Math.min(j - this.startapp, this.appmetrica);
        InterfaceC5482e interfaceC5482e = this.ad;
        String str = c2435e.yandex;
        String str2 = AbstractC9413e.ad;
        long j2 = c2435e.purchase + this.startapp;
        C8531e c8531e = (C8531e) interfaceC5482e;
        synchronized (c8531e) {
            try {
                c8531e.license();
                C15514e m928package = c8531e.metrica.m928package(str);
                m928package.getClass();
                AbstractC2301e.subscription(m928package.ad(j2, min));
                if (!c8531e.ad.exists()) {
                    C8531e.appmetrica(c8531e.ad);
                    c8531e.smaato();
                }
                C5889e c5889e = c8531e.vip;
                if (min != -1) {
                    c5889e.ad(c8531e, min);
                } else {
                    c5889e.getClass();
                }
                File file = new File(c8531e.ad, Integer.toString(c8531e.purchase.nextInt(10)));
                if (!file.exists()) {
                    C8531e.appmetrica(file);
                }
                metrica = C7747e.metrica(file, m928package.ad, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.purchase = metrica;
        FileOutputStream fileOutputStream = new FileOutputStream(this.purchase);
        if (this.metrica > 0) {
            C15910e c15910e = this.adcel;
            if (c15910e == null) {
                this.adcel = new BufferedOutputStream(fileOutputStream, this.metrica);
            } else {
                c15910e.ad(fileOutputStream);
            }
            this.billing = this.adcel;
        } else {
            this.billing = fileOutputStream;
        }
        this.yandex = 0L;
    }
}
