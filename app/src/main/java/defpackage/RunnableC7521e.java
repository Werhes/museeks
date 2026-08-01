package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7521e extends AbstractC15825e implements Runnable, InterfaceC0569e, View.OnAttachStateChangeListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C12948e f15327e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f15328e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C12328e f15329e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f15330e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C12742e f15331e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C16330e f15332e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0583e f15333e;

    public RunnableC7521e() {
        super(1);
        C0583e c0583e = new C0583e(9);
        InterfaceC11214e.ad.getClass();
        c0583e.amazon(C7732e.vip, new C8694e("caption bar"));
        c0583e.amazon(C7732e.metrica, new C8694e("display cutout"));
        c0583e.amazon(C7732e.license, new C8694e("ime"));
        c0583e.amazon(C7732e.appmetrica, new C8694e("mandatory system gestures"));
        c0583e.amazon(C7732e.purchase, new C8694e("navigation bars"));
        c0583e.amazon(C7732e.billing, new C8694e("status bars"));
        c0583e.amazon(C7732e.yandex, new C8694e("system gestures"));
        c0583e.amazon(C7732e.startapp, new C8694e("tappable element"));
        c0583e.amazon(C7732e.adcel, new C8694e("waterfall"));
        this.f15333e = c0583e;
        this.f15332e = new C16330e(0);
        this.f15329e = new C12328e(4);
        this.f15331e = new C12742e();
    }

    @Override // defpackage.AbstractC15825e
    public final void advert(C12773e c12773e) {
        boolean z = false;
        this.f15328e = false;
        int license = c12773e.ad.license();
        this.f15330e &= ~license;
        this.f15327e = null;
        InterfaceC11214e interfaceC11214e = (InterfaceC11214e) AbstractC0919e.ad.vip(license);
        if (interfaceC11214e != null) {
            C8694e c8694e = (C8694e) this.f15333e.billing(interfaceC11214e);
            c8694e.metrica.startapp(0.0f);
            c8694e.appmetrica.startapp(1.0f);
            c8694e.license.startapp(0L);
            c8694e.metrica.startapp(0.0f);
            c8694e.vip.setValue(Boolean.FALSE);
            c8694e.adcel = -1L;
            c8694e.mopub = -1L;
            C16330e c16330e = this.f15332e;
            c16330e.startapp(c16330e.purchase() + 1);
            synchronized (AbstractC12909e.metrica) {
                C12618e c12618e = AbstractC12909e.adcel.yandex;
                if (c12618e != null) {
                    if (c12618e.startapp()) {
                        z = true;
                    }
                }
            }
            if (z) {
                AbstractC12909e.ad();
            }
        }
    }

    @Override // defpackage.AbstractC15825e
    public final C12948e amazon(C12948e c12948e, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C12773e c12773e = (C12773e) list.get(i);
            InterfaceC11214e interfaceC11214e = (InterfaceC11214e) AbstractC0919e.ad.vip(c12773e.ad.license());
            if (interfaceC11214e != null) {
                C8694e c8694e = (C8694e) this.f15333e.billing(interfaceC11214e);
                if (((Boolean) c8694e.vip.getValue()).booleanValue()) {
                    AbstractC12564e abstractC12564e = c12773e.ad;
                    c8694e.metrica.startapp(abstractC12564e.metrica());
                    c8694e.appmetrica.startapp(abstractC12564e.ad());
                    c8694e.license.startapp(abstractC12564e.vip());
                }
            }
        }
        m2294try(c12948e);
        return c12948e;
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public final C12948e mo378extends(View view, C12948e c12948e) {
        if (this.f15328e) {
            this.f15327e = c12948e;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c12948e;
            }
        } else if (this.f15330e == 0) {
            m2294try(c12948e);
        }
        return c12948e;
    }

    @Override // defpackage.AbstractC15825e
    public final C7302e loadAd(C12773e c12773e, C7302e c7302e) {
        C12948e c12948e = this.f15327e;
        boolean z = false;
        this.f15328e = false;
        this.f15327e = null;
        if (c12773e.ad.vip() > 0 && c12948e != null) {
            int license = c12773e.ad.license();
            this.f15330e |= license;
            InterfaceC11214e interfaceC11214e = (InterfaceC11214e) AbstractC0919e.ad.vip(license);
            if (interfaceC11214e != null) {
                C8694e c8694e = (C8694e) this.f15333e.billing(interfaceC11214e);
                C7088e startapp = c12948e.ad.startapp(license);
                long j = (startapp.ad << 48) | (startapp.vip << 32) | (startapp.metrica << 16) | startapp.license;
                long j2 = c8694e.yandex;
                if (!AbstractC1358e.purchase(j, j2)) {
                    c8694e.adcel = j2;
                    c8694e.mopub = j;
                    c8694e.vip.setValue(Boolean.TRUE);
                    AbstractC12564e abstractC12564e = c12773e.ad;
                    c8694e.metrica.startapp(abstractC12564e.metrica());
                    c8694e.appmetrica.startapp(abstractC12564e.ad());
                    c8694e.license.startapp(abstractC12564e.vip());
                    C16330e c16330e = this.f15332e;
                    c16330e.startapp(c16330e.purchase() + 1);
                    synchronized (AbstractC12909e.metrica) {
                        C12618e c12618e = AbstractC12909e.adcel.yandex;
                        if (c12618e != null) {
                            if (c12618e.startapp()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        AbstractC12909e.ad();
                        return c7302e;
                    }
                }
            }
        }
        return c7302e;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        AbstractC4387e.metrica(view, this);
        AbstractC2016e.subscription(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        AbstractC4387e.metrica(view, null);
        AbstractC2016e.subscription(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15328e) {
            this.f15330e = 0;
            this.f15328e = false;
            C12948e c12948e = this.f15327e;
            if (c12948e != null) {
                m2294try(c12948e);
                this.f15327e = null;
            }
        }
    }

    @Override // defpackage.AbstractC15825e
    public final void smaato(C12773e c12773e) {
        this.f15328e = true;
    }

    /* renamed from: try, reason: not valid java name */
    public final void m2294try(C12948e c12948e) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        C3123e c3123e = AbstractC0919e.ad;
        int[] iArr3 = c3123e.vip;
        Object[] objArr3 = c3123e.metrica;
        long[] jArr3 = c3123e.ad;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            InterfaceC11214e interfaceC11214e = (InterfaceC11214e) objArr3[i6];
                            C7088e startapp = c12948e.ad.startapp(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (startapp.ad << 48) | (startapp.vip << 32) | (startapp.metrica << 16) | startapp.license;
                            C8694e c8694e = (C8694e) this.f15333e.billing(interfaceC11214e);
                            j2 = j3;
                            if (!AbstractC1358e.purchase(j4, c8694e.yandex)) {
                                c8694e.yandex = j4;
                                z2 = true;
                                if (!AbstractC1358e.purchase(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                C7088e adcel = c12948e.ad.adcel(i7);
                                objArr2 = objArr3;
                                long j5 = (adcel.vip << 32) | (adcel.ad << 48) | (adcel.metrica << 16) | adcel.license;
                                if (!AbstractC1358e.purchase(c8694e.startapp, j5)) {
                                    c8694e.startapp = j5;
                                    z2 = true;
                                    if (!AbstractC1358e.purchase(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            c8694e.ad.setValue(Boolean.valueOf(c12948e.ad.signatures(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        C10119e yandex = c12948e.ad.yandex();
        if (yandex == null) {
            j = 0;
        } else {
            C7088e ad = yandex.ad();
            j = (ad.ad << c3) | (ad.vip << c2) | (ad.metrica << c) | ad.license;
        }
        C0583e c0583e = this.f15333e;
        InterfaceC11214e.ad.getClass();
        C8694e c8694e2 = (C8694e) c0583e.billing(C7732e.adcel);
        c8694e2.ad.setValue(Boolean.valueOf(!AbstractC1358e.purchase(j, 0L)));
        if (!AbstractC1358e.purchase(c8694e2.yandex, j)) {
            c8694e2.yandex = j;
            c8694e2.startapp = j;
            z2 = z;
            if (!AbstractC1358e.purchase(j, 0L)) {
                z3 = z2;
            }
        }
        if (yandex == null) {
            C12328e c12328e = this.f15329e;
            if (c12328e.vip > 0) {
                c12328e.purchase();
                this.f15331e.clear();
                z2 = z;
            }
        } else {
            List admob = Build.VERSION.SDK_INT >= 28 ? AbstractC17305e.admob(yandex.ad) : Collections.EMPTY_LIST;
            int size = admob.size();
            C12328e c12328e2 = this.f15329e;
            if (size < c12328e2.vip) {
                c12328e2.amazon(admob.size(), this.f15329e.vip);
                this.f15331e.startapp(admob.size(), this.f15331e.size());
                z2 = z;
            } else {
                int size2 = admob.size() - this.f15329e.vip;
                int i8 = 0;
                while (i8 < size2) {
                    C12328e c12328e3 = this.f15329e;
                    c12328e3.ad(AbstractC14533e.startapp(admob.get(c12328e3.vip)));
                    this.f15331e.add(new C15051e("display cutout rect " + this.f15329e.vip));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = admob.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) admob.get(i9);
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f15329e.yandex(i9);
                if (!AbstractC7890e.billing(interfaceC3314e.getValue(), rect)) {
                    interfaceC3314e.setValue(rect);
                    z2 = z;
                }
            }
            if (!admob.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.f15332e.purchase() != 0) && z2) {
            C16330e c16330e = this.f15332e;
            c16330e.startapp(c16330e.purchase() + 1);
            synchronized (AbstractC12909e.metrica) {
                C12618e c12618e = AbstractC12909e.adcel.yandex;
                if (c12618e != null) {
                    boolean z5 = z;
                    z4 = c12618e.startapp() == z5 ? z5 : false;
                }
            }
            if (z4) {
                AbstractC12909e.ad();
            }
        }
    }
}
