package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9288e implements InterfaceC9018e {
    public C10348e appmetrica;
    public ByteBuffer billing;
    public C10348e license;
    public C10348e metrica;
    public ByteBuffer purchase;
    public C10348e vip;
    public boolean yandex;

    public AbstractC9288e() {
        ByteBuffer byteBuffer = InterfaceC9018e.ad;
        this.purchase = byteBuffer;
        this.billing = byteBuffer;
        C10348e c10348e = C10348e.appmetrica;
        this.license = c10348e;
        this.appmetrica = c10348e;
        this.vip = c10348e;
        this.metrica = c10348e;
    }

    public abstract C10348e ad(C10348e c10348e);

    @Override // defpackage.InterfaceC9018e
    public final void advert() {
        this.yandex = true;
        metrica();
    }

    public final ByteBuffer appmetrica(int i) {
        if (this.purchase.capacity() < i) {
            this.purchase = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.purchase.clear();
        }
        ByteBuffer byteBuffer = this.purchase;
        this.billing = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC9018e
    public boolean billing() {
        return this.yandex && this.billing == InterfaceC9018e.ad;
    }

    public void license() {
    }

    public void metrica() {
    }

    @Override // defpackage.InterfaceC9018e
    public final C10348e mopub(C10348e c10348e) {
        this.license = c10348e;
        this.appmetrica = ad(c10348e);
        return purchase() ? this.appmetrica : C10348e.appmetrica;
    }

    @Override // defpackage.InterfaceC9018e
    public boolean purchase() {
        return this.appmetrica != C10348e.appmetrica;
    }

    @Override // defpackage.InterfaceC9018e
    public final void reset() {
        ByteBuffer byteBuffer = InterfaceC9018e.ad;
        this.billing = byteBuffer;
        this.yandex = false;
        this.purchase = byteBuffer;
        C10348e c10348e = C10348e.appmetrica;
        this.license = c10348e;
        this.appmetrica = c10348e;
        this.vip = c10348e;
        this.metrica = c10348e;
        license();
    }

    @Override // defpackage.InterfaceC9018e
    public long smaato(long j) {
        return j;
    }

    @Override // defpackage.InterfaceC9018e
    public final void startapp(C2976e c2976e) {
        this.billing = InterfaceC9018e.ad;
        this.yandex = false;
        this.vip = this.license;
        this.metrica = this.appmetrica;
        vip();
    }

    public void vip() {
    }

    @Override // defpackage.InterfaceC9018e
    public ByteBuffer yandex() {
        ByteBuffer byteBuffer = this.billing;
        this.billing = InterfaceC9018e.ad;
        return byteBuffer;
    }
}
