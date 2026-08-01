package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17138e {
    public final /* synthetic */ int ad;
    public static final C2892e vip = new C2892e(-361328572, false, new C11832e(25));
    public static final C2892e metrica = new C2892e(1231257479, false, new C15480e(7));
    public static final C2892e license = new C2892e(-1200006547, false, new C11832e(26));
    public static final C2892e appmetrica = new C2892e(1197487432, false, new C11832e(27));
    public static final C2892e purchase = new C2892e(266831088, false, new C15480e(8));
    public static final C2892e billing = new C2892e(-145004178, false, new C11832e(28));
    public static final C2892e yandex = new C2892e(701669733, false, new C15480e(9));

    public /* synthetic */ C17138e(int i) {
        this.ad = i;
    }

    public static C11447e ad(C11447e c11447e, int i, BlurMaskFilter blurMaskFilter, int i2) {
        long j = C3618e.vip;
        if ((i2 & 2) != 0) {
            i = 3;
        }
        if ((i2 & 4) != 0) {
            blurMaskFilter = null;
        }
        int i3 = (i2 & 8) != 0 ? 0 : 1;
        c11447e.appmetrica(j);
        c11447e.license(i);
        c11447e.smaato(i3);
        AbstractC17331e.license(c11447e).setMaskFilter(blurMaskFilter);
        return c11447e;
    }

    public static ArrayList appmetrica(Iterable iterable) {
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C14609e(AbstractC11263e.Signature().ad(), (AbstractC16049e) it.next()));
        }
        return arrayList;
    }

    public static final void metrica(InterfaceC2235e interfaceC2235e, C16446e c16446e) {
        C11648e c11648e;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC14576e m4557this = interfaceC2235e.mo782finally().m4557this();
        C16446e c16446e2 = (C16446e) interfaceC2235e.mo782finally().f36227e;
        InterfaceC3828e interfaceC3828e = c16446e.ad;
        if (c16446e.remoteconfig) {
            return;
        }
        c16446e.ad();
        if (!interfaceC3828e.admob()) {
            try {
                c16446e.ad.mo275class(c16446e.vip, c16446e.metrica, c16446e, c16446e.appmetrica);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = interfaceC3828e.mo283throw() > 0.0f;
        if (z4) {
            m4557this.signatures();
        }
        Canvas canvas = AbstractC16863e.ad;
        C11648e c11648e2 = (C11648e) m4557this;
        Canvas canvas2 = c11648e2.ad;
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            c11648e = c11648e2;
        } else {
            long j = c16446e.pro;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            long j2 = c16446e.signatures;
            c11648e = c11648e2;
            float f3 = ((int) (j2 >> 32)) + f;
            float f4 = f2 + ((int) (j2 & 4294967295L));
            float ad = interfaceC3828e.ad();
            C2815e amazon = interfaceC3828e.amazon();
            int mo281protected = interfaceC3828e.mo281protected();
            if (ad < 1.0f || mo281protected != 3 || amazon != null || interfaceC3828e.smaato() == 1) {
                C11447e c11447e = c16446e.Signature;
                if (c11447e == null) {
                    c11447e = AbstractC17331e.vip();
                    c16446e.Signature = c11447e;
                }
                c11447e.metrica(ad);
                c11447e.license(mo281protected);
                c11447e.purchase(amazon);
                canvas2.saveLayer(f, f2, f3, f4, AbstractC17331e.license(c11447e));
            } else {
                canvas2.save();
            }
            canvas2.translate(f, f2);
            canvas2.concat(interfaceC3828e.mo280native());
        }
        boolean z5 = !isHardwareAccelerated && c16446e.isVip;
        if (z5) {
            m4557this.billing();
            AbstractC14073e license2 = c16446e.license();
            if (license2 instanceof C14340e) {
                m4557this.remoteconfig(((C14340e) license2).appmetrica);
            } else if (license2 instanceof C2904e) {
                C17985e c17985e = c16446e.smaato;
                if (c17985e != null) {
                    c17985e.startapp();
                } else {
                    c17985e = AbstractC11972e.ad();
                    c16446e.smaato = c17985e;
                }
                AbstractC1634e.license(c17985e, ((C2904e) license2).appmetrica);
                m4557this.smaato(c17985e);
            } else {
                if (!(license2 instanceof C10435e)) {
                    throw new C14803e(10);
                }
                m4557this.smaato(((C10435e) license2).appmetrica);
            }
        }
        if (c16446e2 != null) {
            C12344e c12344e = c16446e2.subscription;
            if (!c12344e.f24750e) {
                AbstractC18019e.ad("Only add dependencies during a tracking");
            }
            C12618e c12618e = (C12618e) c12344e.f24748e;
            if (c12618e != null) {
                c12618e.ad(c16446e);
            } else if (((C16446e) c12344e.f24749e) != null) {
                C12618e c12618e2 = AbstractC1710e.ad;
                C12618e c12618e3 = new C12618e();
                c12618e3.ad((C16446e) c12344e.f24749e);
                c12618e3.ad(c16446e);
                c12344e.f24748e = c12618e3;
                c12344e.f24749e = null;
            } else {
                c12344e.f24749e = c16446e;
            }
            C12618e c12618e4 = (C12618e) c12344e.f24753e;
            if (c12618e4 != null) {
                z3 = !c12618e4.smaato(c16446e);
            } else if (((C16446e) c12344e.f24751e) != c16446e) {
                z3 = true;
            } else {
                c12344e.f24751e = null;
                z3 = false;
            }
            if (z3) {
                c16446e.admob++;
            }
        }
        if (c11648e.ad.isHardwareAccelerated()) {
            z = z4;
            z2 = isHardwareAccelerated;
            interfaceC3828e.advert(m4557this);
        } else {
            C14434e c14434e = c16446e.loadAd;
            if (c14434e == null) {
                c14434e = new C14434e();
                c16446e.loadAd = c14434e;
            }
            C18478e c18478e = c14434e.f28537e;
            InterfaceC14388e interfaceC14388e = c16446e.vip;
            EnumC7792e enumC7792e = c16446e.metrica;
            long startapp = AbstractC8116e.startapp(c16446e.signatures);
            InterfaceC14388e m4534extends = c18478e.m4534extends();
            EnumC7792e m4562while = c18478e.m4562while();
            InterfaceC14576e m4557this2 = c18478e.m4557this();
            z2 = isHardwareAccelerated;
            long m4560try = c18478e.m4560try();
            z = z4;
            C16446e c16446e3 = (C16446e) c18478e.f36227e;
            c18478e.m4532const(interfaceC14388e);
            c18478e.m4542for(enumC7792e);
            c18478e.m4541finally(m4557this);
            c18478e.m4533continue(startapp);
            c18478e.f36227e = c16446e;
            m4557this.billing();
            try {
                c16446e.metrica(c14434e);
            } finally {
                m4557this.admob();
                c18478e.m4532const(m4534extends);
                c18478e.m4542for(m4562while);
                c18478e.m4541finally(m4557this2);
                c18478e.m4533continue(m4560try);
                c18478e.f36227e = c16446e3;
            }
        }
        if (z5) {
            m4557this.admob();
        }
        if (z) {
            m4557this.adcel();
        }
        if (z2) {
            return;
        }
        canvas2.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r26 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int license(java.lang.String r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17138e.license(java.lang.String, byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String vip(int r11, int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17138e.vip(int, int, byte[]):java.lang.String");
    }
}
