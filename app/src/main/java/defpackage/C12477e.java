package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12477e extends AbstractC16510e {
    public static final C7868e premium = new Object();
    public C12417e ads;
    public C1385e applovin;
    public Matrix inmobi;
    public C16990e isPro;
    public Rect isVip;
    public AbstractC17977e pro;
    public final Object remoteconfig;
    public Executor signatures;
    public InterfaceC0778e tapsense;

    public C12477e(C9654e c9654e) {
        super(c9654e);
        this.remoteconfig = new Object();
    }

    @Override // defpackage.AbstractC16510e
    public final void ads() {
        AbstractC13062e.metrica();
        C12417e c12417e = this.ads;
        if (c12417e != null) {
            c12417e.vip();
            this.ads = null;
        }
        C1385e c1385e = this.applovin;
        if (c1385e != null) {
            c1385e.ad();
            this.applovin = null;
        }
        synchronized (this.remoteconfig) {
            AbstractC17977e abstractC17977e = this.pro;
            abstractC17977e.f35242e = false;
            abstractC17977e.license();
            this.pro = null;
        }
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC16100e advert(InterfaceC12330e interfaceC12330e) {
        return new C3186e(C4069e.purchase(interfaceC12330e), 0);
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e applovin(C6884e c6884e, C6884e c6884e2) {
        AbstractC9464e.yandex("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c6884e + ", secondaryStreamSpec " + c6884e2);
        C9654e c9654e = (C9654e) this.yandex;
        purchase();
        C16990e m3352goto = m3352goto(c9654e, c6884e);
        this.isPro = m3352goto;
        Object[] objArr = {m3352goto.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        return c6884e;
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e billing(boolean z, InterfaceC4311e interfaceC4311e) {
        premium.getClass();
        C9654e c9654e = C7868e.ad;
        c9654e.getClass();
        InterfaceC12330e ad = interfaceC4311e.ad(AbstractC8647e.ad(c9654e), 1);
        if (z) {
            ad = AbstractC13501e.remoteconfig(ad, c9654e);
        }
        if (ad == null) {
            return null;
        }
        return new C9654e(C17015e.vip(((C3186e) advert(ad)).f7297e));
    }

    @Override // defpackage.AbstractC16510e
    public final void crashlytics(Rect rect) {
        this.mopub = rect;
        synchronized (this.remoteconfig) {
            try {
                AbstractC17977e abstractC17977e = this.pro;
                if (abstractC17977e != null) {
                    abstractC17977e.advert(rect);
                }
                this.isVip = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m3351extends() {
        InterfaceC0778e interfaceC0778e;
        synchronized (this.remoteconfig) {
            try {
                C9654e c9654e = (C9654e) this.yandex;
                if (((Integer) ((C17015e) c9654e.mopub()).smaato(C9654e.f19136e, 0)).intValue() == 1) {
                    this.pro = new AbstractC17977e();
                } else {
                    this.pro = new C2601e(AbstractC1786e.vip(c9654e, AbstractC3062e.advert()));
                }
                this.pro.f35252e = m3353native();
                AbstractC17977e abstractC17977e = this.pro;
                C9654e c9654e2 = (C9654e) this.yandex;
                Boolean bool = Boolean.FALSE;
                c9654e2.getClass();
                abstractC17977e.f35237e = ((Boolean) AbstractC0054e.Signature(c9654e2, C9654e.f19138e, bool)).booleanValue();
                InterfaceC2881e license = license();
                C9654e c9654e3 = (C9654e) this.yandex;
                c9654e3.getClass();
                Boolean bool2 = (Boolean) AbstractC0054e.Signature(c9654e3, C9654e.f19139e, null);
                boolean ad = license != null ? license.subscription().firebase().ad(OnePixelShiftQuirk.class) : false;
                AbstractC17977e abstractC17977e2 = this.pro;
                if (bool2 != null) {
                    ad = bool2.booleanValue();
                }
                abstractC17977e2.f35256e = ad;
                if (license != null) {
                    this.pro.f35245e = startapp(license, false);
                }
                Rect rect = this.isVip;
                if (rect != null) {
                    this.pro.advert(rect);
                }
                Matrix matrix = this.inmobi;
                if (matrix != null) {
                    this.pro.mopub(matrix);
                }
                Executor executor = this.signatures;
                if (executor != null && (interfaceC0778e = this.tapsense) != null) {
                    this.pro.startapp(executor, interfaceC0778e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x010a, code lost:
    
        if (r14.equals((java.lang.Boolean) defpackage.AbstractC0054e.Signature(r15, defpackage.C9654e.f19139e, null)) != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009f  */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C16990e m3352goto(defpackage.C9654e r17, defpackage.C6884e r18) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12477e.m3352goto(eٍٟۛ, eؚؓٝ):eؘٗٓ");
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e isPro(InterfaceC12330e interfaceC12330e) {
        this.isPro.ad(interfaceC12330e);
        Object[] objArr = {this.isPro.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        C10017e vip = this.startapp.vip();
        vip.f19790e = interfaceC12330e;
        return vip.ad();
    }

    /* renamed from: native, reason: not valid java name */
    public final int m3353native() {
        C9654e c9654e = (C9654e) this.yandex;
        c9654e.getClass();
        return ((Integer) AbstractC0054e.Signature(c9654e, C9654e.f19134e, 1)).intValue();
    }

    @Override // defpackage.AbstractC16510e
    public final void premium(Matrix matrix) {
        super.premium(matrix);
        synchronized (this.remoteconfig) {
            try {
                AbstractC17977e abstractC17977e = this.pro;
                if (abstractC17977e != null) {
                    abstractC17977e.mopub(matrix);
                }
                this.inmobi = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e signatures(InterfaceC12424e interfaceC12424e, InterfaceC16100e interfaceC16100e) {
        Size ad;
        C6029e subscription;
        synchronized (this.remoteconfig) {
            try {
                InterfaceC0778e interfaceC0778e = this.tapsense;
                ad = interfaceC0778e != null ? interfaceC0778e.ad() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ad == null) {
            return interfaceC16100e.mo819interface();
        }
        if (interfaceC12424e.signatures(((Integer) ((C17015e) interfaceC16100e.isVip()).smaato(InterfaceC13842e.subs, 0)).intValue()) % 180 == 90) {
            ad = new Size(ad.getHeight(), ad.getWidth());
        }
        InterfaceC12438e mo819interface = interfaceC16100e.mo819interface();
        C14326e c14326e = InterfaceC13842e.f27419class;
        if (!mo819interface.mo812extends(c14326e)) {
            ((C4069e) interfaceC16100e.isVip()).yandex(c14326e, ad);
        }
        InterfaceC12438e mo819interface2 = interfaceC16100e.mo819interface();
        C14326e c14326e2 = InterfaceC13842e.f27423native;
        if (mo819interface2.mo812extends(c14326e2)) {
            C8070e c8070e = (C8070e) this.purchase.smaato(c14326e2, null);
            if (c8070e == null) {
                subscription = new C6029e((byte) 0, 0);
                subscription.f12699e = C5401e.f11579e;
                subscription.f12698e = null;
                subscription.f12700e = null;
            } else {
                subscription = C6029e.subscription(c8070e);
            }
            if (c8070e == null || c8070e.vip == null) {
                subscription.f12698e = new C10492e(ad);
            }
            if (c8070e == null) {
                subscription.f12700e = new C17687e(10, ad);
            }
            ((C4069e) interfaceC16100e.isVip()).yandex(c14326e2, new C8070e((C5401e) subscription.f12699e, (C10492e) subscription.f12698e, (C17687e) subscription.f12700e));
        }
        return interfaceC16100e.mo819interface();
    }

    @Override // defpackage.AbstractC16510e
    public final void tapsense(int i) {
        if (subs(i)) {
            m3356while();
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final int m3354this() {
        C9654e c9654e = (C9654e) this.yandex;
        c9654e.getClass();
        return ((Integer) AbstractC0054e.Signature(c9654e, C9654e.f19135e, 6)).intValue();
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m3355throw(Executor executor, C10697e c10697e) {
        synchronized (this.remoteconfig) {
            try {
                AbstractC17977e abstractC17977e = this.pro;
                if (abstractC17977e != null) {
                    abstractC17977e.startapp(executor, new C17687e(9, c10697e));
                }
                if (this.tapsense == null) {
                    Signature();
                }
                this.signatures = executor;
                this.tapsense = c10697e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return "ImageAnalysis:".concat(yandex());
    }

    /* renamed from: while, reason: not valid java name */
    public final void m3356while() {
        synchronized (this.remoteconfig) {
            try {
                InterfaceC2881e license = license();
                if (license != null) {
                    this.pro.f35245e = startapp(license, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
