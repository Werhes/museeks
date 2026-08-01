package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4203e extends AbstractC0241e implements Handler.Callback {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final Handler f9256e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public long f9257e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C17750e f9258e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public boolean f9259e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C16890e f9260e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public long f9261e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C9616e f9262e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public AbstractC9743e f9263e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public boolean f9264e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC0960e f9265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [eؚ۠ۢ, eٌُٗ] */
    public C4203e(SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e, Looper looper) {
        super(5);
        Handler handler;
        C9616e c9616e = C9616e.f19081e;
        this.f9265e = surfaceHolderCallbackC0960e;
        if (looper == null) {
            handler = null;
        } else {
            String str = AbstractC9413e.ad;
            handler = new Handler(looper, this);
        }
        this.f9256e = handler;
        this.f9262e = c9616e;
        this.f9260e = new C7507e(1);
        this.f9261e = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC0241e
    public final void adcel() {
        this.f9258e = null;
        this.f9263e = null;
        this.f9261e = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC0241e
    public final void advert(long j, boolean z, boolean z2) {
        this.f9258e = null;
        this.f9264e = false;
        this.f9259e = false;
    }

    /* renamed from: class, reason: not valid java name */
    public final long m1508class(long j) {
        AbstractC2301e.subscription(j != -9223372036854775807L);
        AbstractC2301e.subscription(this.f9261e != -9223372036854775807L);
        return j - this.f9261e;
    }

    public final void firebase(C17750e c17750e, ArrayList arrayList) {
        int i = 0;
        while (true) {
            InterfaceC16707e[] interfaceC16707eArr = c17750e.ad;
            if (i >= interfaceC16707eArr.length) {
                return;
            }
            C16975e ad = interfaceC16707eArr[i].ad();
            if (ad != null) {
                C9616e c9616e = this.f9262e;
                if (c9616e.loadAd(ad)) {
                    AbstractC9743e mopub = c9616e.mopub(ad);
                    byte[] metrica = interfaceC16707eArr[i].metrica();
                    metrica.getClass();
                    C16890e c16890e = this.f9260e;
                    c16890e.amazon();
                    c16890e.admob(metrica.length);
                    c16890e.f15296e.put(metrica);
                    c16890e.subscription();
                    C17750e purchase = mopub.purchase(c16890e);
                    if (purchase != null) {
                        firebase(purchase, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(interfaceC16707eArr[i]);
            i++;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m1509interface((C17750e) message.obj);
        return true;
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m1509interface(C17750e c17750e) {
        SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = this.f9265e;
        C17148e c17148e = surfaceHolderCallbackC0960e.ad;
        C12053e c12053e = c17148e.f33581e;
        C0222e c0222e = c17148e.f33577e;
        C4761e ad = c12053e.ad();
        int i = 0;
        while (true) {
            InterfaceC16707e[] interfaceC16707eArr = c17750e.ad;
            if (i >= interfaceC16707eArr.length) {
                break;
            }
            interfaceC16707eArr[i].vip(ad);
            i++;
        }
        c17148e.f33581e = new C12053e(ad);
        C12053e m4266e = c17148e.m4266e();
        if (!m4266e.equals(c17148e.f33623e)) {
            c17148e.f33623e = m4266e;
            c0222e.metrica(14, new C17687e(0, surfaceHolderCallbackC0960e));
        }
        c0222e.metrica(28, new C17687e(1, c17750e));
        c0222e.vip();
    }

    @Override // defpackage.AbstractC0241e
    public final int premium(C16975e c16975e) {
        if (this.f9262e.loadAd(c16975e)) {
            return AbstractC0054e.tapsense(c16975e.f33278break == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC0054e.tapsense(0, 0, 0, 0);
    }

    @Override // defpackage.AbstractC0241e
    public final String purchase() {
        return "MetadataRenderer";
    }

    @Override // defpackage.AbstractC0241e
    public final void signatures(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f9264e && this.f9258e == null) {
                C16890e c16890e = this.f9260e;
                c16890e.amazon();
                C13391e c13391e = this.f1492e;
                c13391e.advert();
                int pro = pro(c13391e, c16890e, 0);
                if (pro == -4) {
                    if (c16890e.metrica(4)) {
                        this.f9264e = true;
                    } else if (c16890e.f15301e >= this.f1491e) {
                        c16890e.f33103e = this.f9257e;
                        c16890e.subscription();
                        AbstractC9743e abstractC9743e = this.f9263e;
                        String str = AbstractC9413e.ad;
                        C17750e purchase = abstractC9743e.purchase(c16890e);
                        if (purchase != null) {
                            ArrayList arrayList = new ArrayList(purchase.ad.length);
                            firebase(purchase, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f9258e = new C17750e(m1508class(c16890e.f15301e), (InterfaceC16707e[]) arrayList.toArray(new InterfaceC16707e[0]));
                            }
                        }
                    }
                } else if (pro == -5) {
                    C16975e c16975e = (C16975e) c13391e.f26644e;
                    c16975e.getClass();
                    this.f9257e = c16975e.pro;
                }
            }
            C17750e c17750e = this.f9258e;
            if (c17750e == null || c17750e.vip > m1508class(j)) {
                z = false;
            } else {
                C17750e c17750e2 = this.f9258e;
                Handler handler = this.f9256e;
                if (handler != null) {
                    handler.obtainMessage(1, c17750e2).sendToTarget();
                } else {
                    m1509interface(c17750e2);
                }
                this.f9258e = null;
                z = true;
            }
            if (this.f9264e && this.f9258e == null) {
                this.f9259e = true;
            }
        }
    }

    @Override // defpackage.AbstractC0241e
    public final boolean startapp() {
        return true;
    }

    @Override // defpackage.AbstractC0241e
    public final void subscription(C16975e[] c16975eArr, long j, long j2, C18208e c18208e) {
        this.f9263e = this.f9262e.mopub(c16975eArr[0]);
        C17750e c17750e = this.f9258e;
        if (c17750e != null) {
            long j3 = c17750e.vip;
            long j4 = (this.f9261e + j3) - j2;
            if (j3 != j4) {
                c17750e = new C17750e(j4, c17750e.ad);
            }
            this.f9258e = c17750e;
        }
        this.f9261e = j2;
    }

    @Override // defpackage.AbstractC0241e
    public final boolean yandex() {
        return this.f9259e;
    }
}
