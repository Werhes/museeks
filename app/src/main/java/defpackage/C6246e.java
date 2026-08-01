package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6246e implements InterfaceC8246e {
    public static final List billing = AbstractC16286e.mopub(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List yandex = AbstractC16286e.mopub(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final C0177e ad;
    public final EnumC12473e appmetrica;
    public volatile C10420e license;
    public final C10142e metrica;
    public volatile boolean purchase;
    public final C9840e vip;

    public C6246e(C1343e c1343e, C0177e c0177e, C9840e c9840e, C10142e c10142e) {
        this.ad = c0177e;
        this.vip = c9840e;
        this.metrica = c10142e;
        List list = c1343e.subscription;
        EnumC12473e enumC12473e = EnumC12473e.H2_PRIOR_KNOWLEDGE;
        this.appmetrica = list.contains(enumC12473e) ? enumC12473e : EnumC12473e.HTTP_2;
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC2537e ad(C11058e c11058e) {
        return this.license.f20598e;
    }

    @Override // defpackage.InterfaceC8246e
    public final void adcel(C8650e c8650e) {
        int i;
        C10420e c10420e;
        boolean z;
        if (this.license != null) {
            return;
        }
        boolean z2 = c8650e.license != null;
        C15793e c15793e = c8650e.metrica;
        ArrayList arrayList = new ArrayList(c15793e.size() + 4);
        arrayList.add(new C4861e(C4861e.purchase, c8650e.vip));
        C0193e c0193e = C4861e.billing;
        C15718e c15718e = c8650e.ad;
        String vip = c15718e.vip();
        String license = c15718e.license();
        if (license != null) {
            vip = AbstractC0869e.tapsense('?', vip, license);
        }
        arrayList.add(new C4861e(c0193e, vip));
        String appmetrica = c15793e.appmetrica("Host");
        if (appmetrica != null) {
            arrayList.add(new C4861e(C4861e.startapp, appmetrica));
        }
        arrayList.add(new C4861e(C4861e.yandex, c15718e.ad));
        int size = c15793e.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = c15793e.billing(i2).toLowerCase(Locale.US);
            if (!billing.contains(lowerCase) || (lowerCase.equals("te") && c15793e.adcel(i2).equals("trailers"))) {
                arrayList.add(new C4861e(lowerCase, c15793e.adcel(i2)));
            }
        }
        C10142e c10142e = this.metrica;
        boolean z3 = !z2;
        synchronized (c10142e.f20074e) {
            synchronized (c10142e) {
                try {
                    if (c10142e.f20056e > 1073741823) {
                        c10142e.loadAd(8);
                    }
                    if (c10142e.f20079e) {
                        throw new IOException();
                    }
                    i = c10142e.f20056e;
                    c10142e.f20056e = i + 2;
                    c10420e = new C10420e(i, c10142e, z3, false, null);
                    z = !z2 || c10142e.f20080e >= c10142e.f20061e || c10420e.f20600e >= c10420e.f20592e;
                    if (c10420e.yandex()) {
                        c10142e.f20064e.put(Integer.valueOf(i), c10420e);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c10142e.f20074e.loadAd(z3, i, arrayList);
        }
        if (z) {
            c10142e.f20074e.flush();
        }
        this.license = c10420e;
        if (this.purchase) {
            this.license.appmetrica(9);
            throw new IOException("Canceled");
        }
        C6880e c6880e = this.license.f20596e;
        long j = this.vip.license;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6880e.billing(j, timeUnit);
        this.license.f20599e.billing(this.vip.appmetrica, timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // defpackage.InterfaceC8246e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C7677e appmetrica(boolean r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6246e.appmetrica(boolean):eًْؓ");
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC17357e billing() {
        return this.license;
    }

    @Override // defpackage.InterfaceC8246e
    public final void cancel() {
        this.purchase = true;
        C10420e c10420e = this.license;
        if (c10420e != null) {
            c10420e.appmetrica(9);
        }
    }

    @Override // defpackage.InterfaceC8246e
    public final long license(C11058e c11058e) {
        if (AbstractC1277e.ad(c11058e)) {
            return AbstractC16286e.appmetrica(c11058e);
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC8246e
    public final boolean metrica() {
        boolean z;
        C10420e c10420e = this.license;
        if (c10420e == null) {
            return false;
        }
        synchronized (c10420e) {
            C2777e c2777e = c10420e.f20598e;
            if (c2777e.f6691e) {
                if (c2777e.f6692e.yandex()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // defpackage.InterfaceC8246e
    public final void purchase() {
        this.metrica.f20074e.flush();
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC4586e startapp() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC8246e
    public final void vip() {
        this.license.f20601e.close();
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC0274e yandex(C8650e c8650e, long j) {
        return this.license.f20601e;
    }
}
