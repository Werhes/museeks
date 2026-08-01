package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۡۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9051e implements InterfaceC9018e {
    public C14351e adcel;
    public ByteBuffer advert;
    public long amazon;
    public C10348e appmetrica;
    public C10348e billing;
    public float license;
    public boolean loadAd;
    public float metrica;
    public ByteBuffer mopub;
    public C10348e purchase;
    public long smaato;
    public boolean startapp;
    public int vip;
    public C10348e yandex;

    @Override // defpackage.InterfaceC9018e
    public final void adcel(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C14351e c14351e = this.adcel;
            c14351e.getClass();
            this.smaato += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i = c14351e.vip;
            InterfaceC10166e interfaceC10166e = c14351e.startapp;
            int loadAd = remaining / (interfaceC10166e.loadAd() * i);
            interfaceC10166e.Signature(loadAd);
            interfaceC10166e.ad(remaining, byteBuffer);
            c14351e.adcel += loadAd;
            c14351e.vip();
        }
    }

    @Override // defpackage.InterfaceC9018e
    public final void advert() {
        C14351e c14351e = this.adcel;
        if (c14351e != null) {
            int i = c14351e.adcel;
            float f = c14351e.metrica;
            float f2 = c14351e.license;
            double d = f / f2;
            int i2 = c14351e.mopub + ((int) (((((((i - r6) / d) + c14351e.loadAd) + c14351e.admob) + c14351e.advert) / (c14351e.appmetrica * f2)) + 0.5d));
            c14351e.admob = 0.0d;
            InterfaceC10166e interfaceC10166e = c14351e.startapp;
            int i3 = c14351e.yandex * 2;
            interfaceC10166e.Signature(i3 + i);
            interfaceC10166e.license(i * c14351e.vip, i3);
            c14351e.adcel = i3 + c14351e.adcel;
            c14351e.vip();
            if (c14351e.mopub > i2) {
                c14351e.mopub = Math.max(i2, 0);
            }
            c14351e.adcel = 0;
            c14351e.loadAd = 0;
            c14351e.advert = 0;
        }
        this.loadAd = true;
    }

    @Override // defpackage.InterfaceC9018e
    public final boolean billing() {
        if (this.loadAd) {
            C14351e c14351e = this.adcel;
            if (c14351e != null) {
                AbstractC2301e.subscription(c14351e.mopub >= 0);
                if (c14351e.startapp.loadAd() * c14351e.mopub * c14351e.vip == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC9018e
    public final C10348e mopub(C10348e c10348e) {
        int i = c10348e.metrica;
        if (i != 2 && i != 4) {
            throw new C6721e(c10348e);
        }
        int i2 = this.vip;
        if (i2 == -1) {
            i2 = c10348e.ad;
        }
        this.appmetrica = c10348e;
        C10348e c10348e2 = new C10348e(i2, c10348e.vip, i);
        this.purchase = c10348e2;
        this.startapp = true;
        return c10348e2;
    }

    @Override // defpackage.InterfaceC9018e
    public final boolean purchase() {
        if (this.purchase.ad != -1) {
            return Math.abs(this.metrica - 1.0f) >= 1.0E-4f || Math.abs(this.license - 1.0f) >= 1.0E-4f || this.purchase.ad != this.appmetrica.ad;
        }
        return false;
    }

    @Override // defpackage.InterfaceC9018e
    public final void reset() {
        this.metrica = 1.0f;
        this.license = 1.0f;
        C10348e c10348e = C10348e.appmetrica;
        this.appmetrica = c10348e;
        this.purchase = c10348e;
        this.billing = c10348e;
        this.yandex = c10348e;
        ByteBuffer byteBuffer = InterfaceC9018e.ad;
        this.mopub = byteBuffer;
        this.advert = byteBuffer;
        this.vip = -1;
        this.startapp = false;
        this.adcel = null;
        this.smaato = 0L;
        this.amazon = 0L;
        this.loadAd = false;
    }

    @Override // defpackage.InterfaceC9018e
    public final long smaato(long j) {
        if (this.amazon < 1024) {
            return (long) (j / this.metrica);
        }
        long j2 = this.smaato;
        this.adcel.getClass();
        long loadAd = j2 - (r2.startapp.loadAd() * (r2.adcel * r2.vip));
        int i = this.yandex.ad;
        int i2 = this.billing.ad;
        return i == i2 ? AbstractC9413e.m2555import(j, this.amazon, loadAd, RoundingMode.DOWN) : AbstractC9413e.m2555import(j, this.amazon * i2, loadAd * i, RoundingMode.DOWN);
    }

    @Override // defpackage.InterfaceC9018e
    public final void startapp(C2976e c2976e) {
        if (purchase()) {
            C10348e c10348e = this.appmetrica;
            this.billing = c10348e;
            C10348e c10348e2 = this.purchase;
            this.yandex = c10348e2;
            if (this.startapp) {
                this.adcel = new C14351e(c10348e.ad, c10348e.vip, this.metrica, this.license, c10348e2.ad, c10348e.metrica == 4);
            } else {
                C14351e c14351e = this.adcel;
                if (c14351e != null) {
                    c14351e.adcel = 0;
                    c14351e.mopub = 0;
                    c14351e.advert = 0;
                    c14351e.smaato = 0;
                    c14351e.amazon = 0;
                    c14351e.loadAd = 0;
                    c14351e.Signature = 0;
                    c14351e.admob = 0.0d;
                    c14351e.startapp.flush();
                }
            }
        }
        this.advert = InterfaceC9018e.ad;
        this.smaato = 0L;
        this.amazon = 0L;
        this.loadAd = false;
    }

    @Override // defpackage.InterfaceC9018e
    public final ByteBuffer yandex() {
        C14351e c14351e = this.adcel;
        if (c14351e != null) {
            InterfaceC10166e interfaceC10166e = c14351e.startapp;
            int i = c14351e.vip;
            AbstractC2301e.subscription(c14351e.mopub >= 0);
            int loadAd = interfaceC10166e.loadAd() * c14351e.mopub * i;
            if (loadAd > 0) {
                if (this.mopub.capacity() < loadAd) {
                    this.mopub = ByteBuffer.allocateDirect(loadAd).order(ByteOrder.nativeOrder());
                } else {
                    this.mopub.clear();
                }
                ByteBuffer byteBuffer = this.mopub;
                AbstractC2301e.subscription(c14351e.mopub >= 0);
                int min = Math.min(byteBuffer.remaining() / (interfaceC10166e.loadAd() * i), c14351e.mopub);
                interfaceC10166e.vip(min, byteBuffer);
                c14351e.mopub -= min;
                System.arraycopy(interfaceC10166e.startapp(), min * i, interfaceC10166e.startapp(), 0, c14351e.mopub * i);
                this.mopub.flip();
                this.amazon += loadAd;
                this.advert = this.mopub;
            }
        }
        ByteBuffer byteBuffer2 = this.advert;
        this.advert = InterfaceC9018e.ad;
        return byteBuffer2;
    }
}
