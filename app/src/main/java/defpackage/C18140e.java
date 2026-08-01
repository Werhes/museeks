package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18140e extends C12478e {
    public boolean Signature;
    public final C12478e loadAd;

    public C18140e(long j, C11353e c11353e, Function1 function1, Function1 function12, C12478e c12478e) {
        super(j, c11353e, function1, function12);
        this.loadAd = c12478e;
        c12478e.mopub();
    }

    @Override // defpackage.C12478e
    public final AbstractC11912e isVip() {
        C18140e c18140e;
        C12478e c12478e = this.loadAd;
        if (c12478e.smaato || c12478e.metrica) {
            return new C5834e(this);
        }
        C12618e c12618e = this.yandex;
        long j = this.vip;
        HashMap vip = c12618e != null ? AbstractC12909e.vip(c12478e.billing(), this, this.loadAd.license()) : null;
        synchronized (AbstractC12909e.metrica) {
            try {
                AbstractC12909e.metrica(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c12618e == null || c12618e.license == 0) {
                    c18140e = this;
                    ad();
                    Unit unit = Unit.INSTANCE;
                } else {
                    c18140e = this;
                    AbstractC11912e applovin = c18140e.applovin(this.loadAd.billing(), c12618e, vip, this.loadAd.license());
                    if (!applovin.equals(C2449e.metrica)) {
                        return applovin;
                    }
                    C12618e inmobi = c18140e.loadAd.inmobi();
                    if (inmobi != null) {
                        inmobi.mopub(c12618e);
                    } else {
                        c18140e.loadAd.subs(c12618e);
                        c18140e.yandex = null;
                    }
                }
                if (AbstractC7890e.startapp(c18140e.loadAd.billing(), j) < 0) {
                    c18140e.loadAd.tapsense();
                }
                C12478e c12478e2 = c18140e.loadAd;
                c12478e2.subscription(c12478e2.license().billing(j).appmetrica(c18140e.adcel));
                c18140e.loadAd.ads(j);
                C12478e c12478e3 = c18140e.loadAd;
                int i = c18140e.license;
                c18140e.license = -1;
                if (i >= 0) {
                    int[] iArr = c12478e3.mopub;
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    c12478e3.mopub = copyOf;
                } else {
                    c12478e3.getClass();
                }
                c18140e.loadAd.premium(c18140e.adcel);
                C12478e c12478e4 = c18140e.loadAd;
                int[] iArr2 = c18140e.mopub;
                c12478e4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = c12478e4.mopub;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                        iArr2 = copyOf2;
                    }
                    c12478e4.mopub = iArr2;
                }
                Unit unit2 = Unit.INSTANCE;
                c18140e.smaato = true;
                if (!c18140e.Signature) {
                    c18140e.Signature = true;
                    c18140e.loadAd.advert();
                }
                return C2449e.metrica;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void metrica() {
        if (this.metrica) {
            return;
        }
        super.metrica();
        if (this.Signature) {
            return;
        }
        this.Signature = true;
        this.loadAd.advert();
    }
}
