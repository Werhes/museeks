package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٝٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7315e implements Handler.Callback {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f14975e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC14239e f14976e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC3317e f14977e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC6690e f14978e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11981e f14979e = new C11981e(this);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C9203e f14980e;

    public C7315e(C9203e c9203e) {
        this.f14980e = c9203e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f14975e) {
            return true;
        }
        int i = message.what;
        if (i == 1) {
            AbstractC3317e license = this.f14980e.ad.license((C1962e) message.obj);
            this.f14977e = license;
            license.mopub(this.f14979e, null, C5350e.metrica);
            this.f14980e.metrica.billing(2);
            return true;
        }
        if (i == 2) {
            try {
                InterfaceC14239e interfaceC14239e = this.f14976e;
                if (interfaceC14239e == null) {
                    AbstractC3317e abstractC3317e = this.f14977e;
                    abstractC3317e.getClass();
                    abstractC3317e.adcel();
                } else {
                    interfaceC14239e.billing();
                }
                this.f14980e.metrica.yandex(2, 100);
                return true;
            } catch (IOException e) {
                this.f14980e.appmetrica.ad(e);
                this.f14980e.ad();
                return true;
            }
        }
        if (i == 3) {
            InterfaceC14239e interfaceC14239e2 = this.f14976e;
            interfaceC14239e2.getClass();
            C4042e c4042e = new C4042e();
            c4042e.ad = 0L;
            interfaceC14239e2.loadAd(new C6576e(c4042e));
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (this.f14976e != null) {
            AbstractC3317e abstractC3317e2 = this.f14977e;
            abstractC3317e2.getClass();
            abstractC3317e2.amazon(this.f14976e);
        }
        AbstractC3317e abstractC3317e3 = this.f14977e;
        if (abstractC3317e3 != null) {
            abstractC3317e3.loadAd(this.f14979e);
        }
        this.f14980e.metrica.appmetrica();
        C14241e c14241e = C9203e.billing;
        synchronized (c14241e) {
            try {
                int i2 = c14241e.metrica - 1;
                c14241e.metrica = i2;
                if (i2 == 0) {
                    HandlerThread handlerThread = c14241e.vip;
                    handlerThread.getClass();
                    handlerThread.quit();
                    c14241e.vip = null;
                    c14241e.ad.clear();
                } else {
                    c14241e.ad();
                }
            } finally {
            }
        }
        this.f14975e = true;
        return true;
    }
}
