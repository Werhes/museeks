package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5492e implements InterfaceC5066e {
    public long Signature = AbstractC1961e.ad();
    public final int ad;
    public Object adcel;
    public boolean admob;
    public C10722e advert;
    public long amazon;
    public InterfaceC16638e appmetrica;
    public boolean billing;
    public C5602e license;
    public long loadAd;
    public final Function1 metrica;
    public boolean mopub;
    public InterfaceC16836e purchase;
    public boolean smaato;
    public boolean startapp;
    public final /* synthetic */ C5609e subscription;
    public final C12894e vip;
    public boolean yandex;

    public C5492e(C5609e c5609e, int i, C12894e c12894e, Function1 function1) {
        this.subscription = c5609e;
        this.ad = i;
        this.vip = c12894e;
        this.metrica = function1;
    }

    @Override // defpackage.InterfaceC5066e
    public final void ad() {
        this.smaato = true;
    }

    public final boolean appmetrica() {
        InterfaceC16836e interfaceC16836e;
        return this.startapp || ((interfaceC16836e = this.purchase) != null && interfaceC16836e.adcel());
    }

    public final boolean billing(long j, long j2) {
        if (this.smaato) {
            j2 = 0;
        }
        return j > j2;
    }

    @Override // defpackage.InterfaceC5066e
    public final void cancel() {
        if (this.yandex) {
            return;
        }
        this.yandex = true;
        vip();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f5 A[Catch: all -> 0x01c1, LOOP:2: B:99:0x01c7->B:110:0x01f5, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x01c1, blocks: (B:83:0x0180, B:85:0x0188, B:87:0x018e, B:90:0x019c, B:92:0x01a8, B:93:0x01be, B:94:0x01ab, B:98:0x01c3, B:99:0x01c7, B:101:0x01cf, B:103:0x01d9, B:107:0x01e2, B:108:0x01e7, B:110:0x01f5, B:117:0x01fb, B:119:0x020a), top: B:82:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r9v22, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [eٖ۠۟, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean license(defpackage.C14033e r22) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5492e.license(eٓٗۢ):boolean");
    }

    public final boolean metrica(C14033e c14033e) {
        boolean license;
        if (!this.subscription.f11963e) {
            return false;
        }
        if (this.smaato) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                license = license(c14033e);
            } finally {
                Trace.endSection();
            }
        } else {
            license = license(c14033e);
        }
        AbstractC14204e.m3773final(-1L, "compose:lazy:prefetch:execute:item");
        return license;
    }

    public final void purchase(Object obj, Object obj2, C16556e c16556e) {
        InterfaceC16836e c17424e;
        InterfaceC16836e interfaceC16836e = this.purchase;
        if (interfaceC16836e == null) {
            C5609e c5609e = this.subscription;
            Function2 ad = ((C10350e) c5609e.f11962e).ad(this.ad, obj, obj2);
            C10014e ad2 = ((C15533e) c5609e.f11964e).ad();
            if (ad2.f19781e.m3708extends()) {
                ad2.advert(obj, ad, true);
                c17424e = new C17424e(ad2, obj, false, 28);
            } else {
                c17424e = new C13391e(ad2, obj, 29);
            }
            interfaceC16836e = c17424e;
            this.purchase = interfaceC16836e;
            this.adcel = obj;
        }
        this.admob = false;
        while (!interfaceC16836e.adcel() && !this.admob) {
            interfaceC16836e.ad(new C18070e(this, c16556e, 19));
        }
        yandex();
        if (this.admob) {
            c16556e.vip = C16556e.ad(this.loadAd, c16556e.vip);
        } else {
            c16556e.ad = C16556e.ad(this.loadAd, c16556e.ad);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.ad);
        sb.append(", constraints = ");
        sb.append(this.license);
        sb.append(", isComposed = ");
        sb.append(appmetrica());
        sb.append(", isMeasured = ");
        sb.append(this.billing);
        sb.append(", isCanceled = ");
        return AbstractC8703e.signatures(sb, this.yandex, " }");
    }

    public final void vip() {
        InterfaceC16836e interfaceC16836e = this.purchase;
        if (interfaceC16836e != null) {
            interfaceC16836e.cancel();
        }
        this.purchase = null;
        InterfaceC16638e interfaceC16638e = this.appmetrica;
        if (interfaceC16638e != null) {
            interfaceC16638e.ad();
        }
        this.appmetrica = null;
        this.advert = null;
    }

    public final void yandex() {
        long ad = AbstractC1961e.ad();
        long ad2 = C16194e.ad(ad, this.Signature);
        long j = ad2 >> 1;
        C17647e c17647e = C14157e.f27993e;
        if ((((int) ad2) & 1) != 0) {
            j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
        }
        this.loadAd = j;
        long j2 = this.amazon - j;
        this.amazon = j2;
        this.Signature = ad;
        AbstractC14204e.m3773final(j2, "compose:lazy:prefetch:available_time_nanos");
    }
}
