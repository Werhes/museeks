package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3818e extends AbstractC9288e {
    public int adcel;
    public int advert;
    public int amazon;
    public long loadAd;
    public boolean mopub;
    public byte[] smaato;
    public int startapp;

    @Override // defpackage.AbstractC9288e
    public final C10348e ad(C10348e c10348e) {
        if (!AbstractC9413e.m2572try(c10348e.metrica)) {
            throw new C6721e(c10348e);
        }
        this.mopub = true;
        return (this.startapp == 0 && this.adcel == 0) ? C10348e.appmetrica : c10348e;
    }

    @Override // defpackage.InterfaceC9018e
    public final void adcel(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.advert);
        this.loadAd += min / this.vip.license;
        this.advert -= min;
        byteBuffer.position(position + min);
        if (this.advert > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.amazon + i2) - this.smaato.length;
        ByteBuffer appmetrica = appmetrica(length);
        int adcel = AbstractC9413e.adcel(length, 0, this.amazon);
        appmetrica.put(this.smaato, 0, adcel);
        int adcel2 = AbstractC9413e.adcel(length - adcel, 0, i2);
        byteBuffer.limit(byteBuffer.position() + adcel2);
        appmetrica.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - adcel2;
        int i4 = this.amazon - adcel;
        this.amazon = i4;
        byte[] bArr = this.smaato;
        System.arraycopy(bArr, adcel, bArr, 0, i4);
        byteBuffer.get(this.smaato, this.amazon, i3);
        this.amazon += i3;
        appmetrica.flip();
    }

    @Override // defpackage.AbstractC9288e, defpackage.InterfaceC9018e
    public final boolean billing() {
        return super.billing() && this.amazon == 0;
    }

    @Override // defpackage.AbstractC9288e
    public final void license() {
        this.smaato = AbstractC9413e.vip;
    }

    @Override // defpackage.AbstractC9288e
    public final void metrica() {
        if (this.mopub) {
            if (this.amazon > 0) {
                this.loadAd += r0 / this.vip.license;
            }
            this.amazon = 0;
        }
    }

    @Override // defpackage.AbstractC9288e, defpackage.InterfaceC9018e
    public final long smaato(long j) {
        return Math.max(0L, j - AbstractC9413e.m2560package(this.vip.ad, this.adcel + this.startapp));
    }

    @Override // defpackage.AbstractC9288e
    public final void vip() {
        if (this.mopub) {
            this.mopub = false;
            int i = this.adcel;
            int i2 = this.vip.license;
            this.smaato = new byte[i * i2];
            this.advert = this.startapp * i2;
        }
        this.amazon = 0;
    }

    @Override // defpackage.AbstractC9288e, defpackage.InterfaceC9018e
    public final ByteBuffer yandex() {
        int i;
        if (super.billing() && (i = this.amazon) > 0) {
            appmetrica(i).put(this.smaato, 0, this.amazon).flip();
            this.amazon = 0;
        }
        return super.yandex();
    }
}
