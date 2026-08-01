package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2593e implements InterfaceC15834e {
    public final Uri ad;
    public C2435e adcel;
    public boolean advert;
    public final C12594e appmetrica;
    public volatile boolean billing;
    public final C7340e license;
    public final C18478e metrica;
    public InterfaceC18147e mopub;
    public final /* synthetic */ C7340e smaato;
    public long startapp;
    public final C9344e vip;
    public final C14829e purchase = new C14829e(1);
    public boolean yandex = true;

    public C2593e(C7340e c7340e, Uri uri, InterfaceC9660e interfaceC9660e, C18478e c18478e, C7340e c7340e2, C12594e c12594e) {
        this.smaato = c7340e;
        this.ad = uri;
        this.vip = new C9344e(interfaceC9660e);
        this.metrica = c18478e;
        this.license = c7340e2;
        this.appmetrica = c12594e;
        C6913e.billing.getAndIncrement();
        this.adcel = metrica(0L, null);
    }

    @Override // defpackage.InterfaceC15834e
    public final void ad() {
        InterfaceC9660e interfaceC9660e;
        InterfaceC1272e interfaceC1272e;
        int i;
        int i2 = 0;
        String str = null;
        while (i2 == 0 && !this.billing) {
            try {
                long j = this.purchase.f29362e;
                C2435e metrica = metrica(j, str);
                this.adcel = metrica;
                long metrica2 = this.vip.metrica(metrica);
                if (this.billing) {
                    if (i2 != 1 && this.metrica.m4547native() != -1) {
                        this.purchase.f29362e = this.metrica.m4547native();
                    }
                    AbstractC16136e.license(this.vip);
                    return;
                }
                List list = (List) this.vip.f18617e.advert().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (metrica2 != -1) {
                    metrica2 += j;
                    C7340e c7340e = this.smaato;
                    c7340e.f15027e.post(new RunnableC1354e(c7340e, 0));
                }
                long j2 = metrica2;
                this.smaato.f15062e = C9498e.license(this.vip.f18617e.advert());
                C9344e c9344e = this.vip;
                C9498e c9498e = this.smaato.f15062e;
                if (c9498e == null || (i = c9498e.purchase) == -1) {
                    interfaceC9660e = c9344e;
                } else {
                    interfaceC9660e = new C11404e(c9344e, i, this);
                    InterfaceC18147e crashlytics = this.smaato.crashlytics(new C8366e(0, true));
                    this.mopub = crashlytics;
                    crashlytics.billing(C7340e.f15018e);
                }
                this.metrica.m4527abstract(interfaceC9660e, this.ad, this.vip.f18617e.advert(), j, j2, this.license);
                if (this.smaato.f15062e != null && (interfaceC1272e = (InterfaceC1272e) this.metrica.f36227e) != null) {
                    InterfaceC1272e ad = interfaceC1272e.ad();
                    if (ad instanceof C0689e) {
                        ((C0689e) ad).remoteconfig = true;
                    }
                }
                if (this.yandex) {
                    C18478e c18478e = this.metrica;
                    long j3 = this.startapp;
                    InterfaceC1272e interfaceC1272e2 = (InterfaceC1272e) c18478e.f36227e;
                    interfaceC1272e2.getClass();
                    interfaceC1272e2.license(j, j3);
                    this.yandex = false;
                }
                while (i2 == 0 && !this.billing) {
                    try {
                        this.appmetrica.ad();
                        C18478e c18478e2 = this.metrica;
                        C14829e c14829e = this.purchase;
                        InterfaceC1272e interfaceC1272e3 = (InterfaceC1272e) c18478e2.f36227e;
                        interfaceC1272e3.getClass();
                        C14446e c14446e = (C14446e) c18478e2.f36229e;
                        c14446e.getClass();
                        i2 = interfaceC1272e3.vip(c14446e, c14829e);
                        long m4547native = this.metrica.m4547native();
                        if (m4547native > this.smaato.f15024e + j) {
                            C12594e c12594e = this.appmetrica;
                            synchronized (c12594e) {
                                c12594e.vip = false;
                            }
                            C7340e c7340e2 = this.smaato;
                            c7340e2.f15027e.post(c7340e2.f15033e);
                            j = m4547native;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.metrica.m4547native() != -1) {
                    this.purchase.f29362e = this.metrica.m4547native();
                }
                AbstractC16136e.license(this.vip);
            } catch (Throwable th) {
                if (i2 != 1 && this.metrica.m4547native() != -1) {
                    this.purchase.f29362e = this.metrica.m4547native();
                }
                AbstractC16136e.license(this.vip);
                throw th;
            }
        }
    }

    public final C2435e metrica(long j, String str) {
        Map map = C7340e.f15017e;
        if (str != null && !str.startsWith("W/")) {
            map = AbstractC8507e.ad().mo3902catch(map).mo3904implements("If-Range", str).advert();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.smaato.f15053e;
        Uri uri = this.ad;
        AbstractC2301e.amazon(uri, "The uri must be set.");
        return new C2435e(uri, 0L, 1, null, map, j, -1L, str2, 6, null);
    }

    @Override // defpackage.InterfaceC15834e
    public final void vip() {
        this.billing = true;
    }
}
