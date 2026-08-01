package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0142e implements InterfaceC14309e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f1373e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f1374e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f1375e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f1376e = true;

    public C9919e ad() {
        return new C9919e(this.f1376e, this.f1374e, (String[]) this.f1373e, (String[]) this.f1375e);
    }

    public String appmetrica() {
        String next = ((Scanner) this.f1373e).next();
        if (this.f1376e && !this.f1374e) {
            if (!next.isEmpty() && next.charAt(0) == 65279) {
                next = next.substring(1);
            }
            this.f1374e = true;
        }
        StringBuilder sb = (StringBuilder) this.f1375e;
        sb.append(next);
        sb.append("\n");
        return next;
    }

    @Override // defpackage.InterfaceC14309e
    public void license(Object obj) {
        final C9035e c9035e = (C9035e) obj;
        C6584e c6584e = ((C5537e) this.f1375e).yandex;
        Handler handler = c6584e.advert;
        final C18424e c18424e = (C18424e) this.f1373e;
        final boolean z = this.f1376e;
        final boolean z2 = this.f1374e;
        AbstractC9413e.m2565strictfp(handler, new RunnableC7410e(c6584e, c18424e, new Runnable() { // from class: eِؚؓ
            @Override // java.lang.Runnable
            public final void run() {
                C6584e c6584e2 = ((C5537e) C0142e.this.f1375e).yandex;
                C6268e c6268e = c6584e2.pro;
                AbstractC1008e.purchase(c6268e, c9035e);
                int billing = c6268e.billing();
                if (z) {
                    if (billing == 1) {
                        if (c6268e.mo2107e(2)) {
                            c6268e.license();
                        }
                    } else if (billing == 4 && c6268e.mo2107e(4)) {
                        c6268e.mo2125final();
                    }
                }
                boolean z3 = z2;
                if (z3 && c6268e.mo2107e(1)) {
                    c6268e.pro();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i : new int[]{31, 2}) {
                    AbstractC2301e.subscription(!false);
                    sparseBooleanArray.append(i, true);
                }
                if (z3) {
                    AbstractC2301e.subscription(!false);
                    sparseBooleanArray.append(1, true);
                }
                AbstractC2301e.subscription(!false);
                c6584e2.ads(c18424e);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r14v33, types: [eٌۧۦ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eۣٓٚ, java.lang.Object] */
    public AbstractC0241e[] metrica(Handler handler, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e2, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e3, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f1373e;
        boolean z = this.f1376e;
        C2735e c2735e = new C2735e(context);
        C2362e c2362e = (C2362e) this.f1375e;
        c2735e.metrica = c2362e;
        c2735e.license = 5000L;
        c2735e.appmetrica = z;
        c2735e.purchase = handler;
        c2735e.billing = surfaceHolderCallbackC0960e;
        c2735e.yandex = 50;
        AbstractC2301e.subscription(!c2735e.vip);
        Handler handler2 = c2735e.purchase;
        AbstractC2301e.subscription((handler2 == null && c2735e.billing == null) || !(handler2 == null || c2735e.billing == null));
        c2735e.vip = true;
        arrayList.add(new C15960e(c2735e));
        boolean z2 = this.f1374e;
        ?? obj = new Object();
        obj.f28367e = context;
        obj.f28370e = C16717e.purchase;
        obj.f28371e = z2;
        AbstractC2301e.subscription(!obj.f28368e);
        obj.f28368e = true;
        if (((C12894e) obj.f28366e) == null) {
            obj.f28366e = new C12894e(new InterfaceC9018e[0]);
        }
        if (((C8577e) obj.f28372e) == null) {
            if (((C13179e) obj.f28369e) == null) {
                obj.f28369e = new C13179e(context);
            }
            if (((C1400e) obj.f28373e) == null) {
                obj.f28373e = C1400e.f4212e;
            }
            ?? obj2 = new Object();
            obj2.vip = context != null ? context.getApplicationContext() : null;
            obj2.license = C1400e.f4212e;
            if (context == null) {
                obj2.appmetrica = C16717e.purchase;
            }
            obj2.ad = 8.0f;
            C16717e c16717e = context != null ? null : (C16717e) obj.f28370e;
            Context context2 = (Context) obj2.vip;
            if (context2 == null) {
                obj2.appmetrica = c16717e;
            }
            C13179e c13179e = (C13179e) obj.f28369e;
            obj2.metrica = c13179e;
            obj2.license = (C1400e) obj.f28373e;
            if (c13179e == null) {
                obj2.metrica = new C13179e(context2);
            }
            obj.f28372e = new C8577e(obj2);
        } else {
            AbstractC2301e.subscription(((C13179e) obj.f28369e) == null);
            AbstractC2301e.subscription(((C1400e) obj.f28373e) == null);
        }
        arrayList.add(new C9860e((Context) this.f1373e, c2362e, this.f1376e, handler, surfaceHolderCallbackC0960e2, new C18536e(obj)));
        arrayList.add(new C12063e(surfaceHolderCallbackC0960e3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new C4203e(surfaceHolderCallbackC0960e4, looper));
        }
        arrayList.add(new C2476e());
        arrayList.add(new C10547e(new C6594e(context)));
        return (AbstractC0241e[]) arrayList.toArray(new AbstractC0241e[0]);
    }

    public void purchase(EnumC17692e... enumC17692eArr) {
        if (!this.f1376e) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC17692eArr.length);
        for (EnumC17692e enumC17692e : enumC17692eArr) {
            arrayList.add(enumC17692e.f34679e);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f1376e) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr2.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f1375e = (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }

    public void vip(C6893e... c6893eArr) {
        if (!this.f1376e) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c6893eArr.length);
        for (C6893e c6893e : c6893eArr) {
            arrayList.add(c6893e.ad);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f1376e) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr2.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f1373e = (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }

    @Override // defpackage.InterfaceC14309e
    public void yandex(Throwable th) {
    }
}
