package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16510e {
    public InterfaceC12438e adcel;
    public InterfaceC2881e amazon;
    public InterfaceC12438e appmetrica;
    public HashSet billing;
    public Rect mopub;
    public InterfaceC12438e purchase;
    public InterfaceC2881e smaato;
    public C6884e startapp;
    public InterfaceC12438e yandex;
    public final HashSet ad = new HashSet();
    public final Object vip = new Object();
    public final Object metrica = new Object();
    public int license = 2;
    public Matrix advert = new Matrix();
    public C4909e loadAd = null;
    public final C2007e Signature = new C2007e(21, this);
    public C11469e admob = C11469e.ad();
    public C11469e subscription = C11469e.ad();

    public AbstractC16510e(InterfaceC12438e interfaceC12438e) {
        this.purchase = interfaceC12438e;
        this.yandex = interfaceC12438e;
    }

    public final void Signature() {
        this.license = 1;
        subscription();
    }

    public final void ad(C16990e c16990e, C6884e c6884e) {
        Range range = C6884e.yandex;
        if (!range.equals(c6884e.appmetrica)) {
            Range range2 = c6884e.appmetrica;
            C10379e c10379e = c16990e.vip;
            c10379e.getClass();
            ((C4069e) c10379e.f20510e).yandex(C9937e.purchase, range2);
            return;
        }
        synchronized (this.vip) {
            try {
                InterfaceC2881e interfaceC2881e = this.smaato;
                interfaceC2881e.getClass();
                ArrayList metrica = interfaceC2881e.subscription().firebase().metrica(AeFpsRangeQuirk.class);
                boolean z = true;
                if (metrica.size() > 1) {
                    z = false;
                }
                AbstractC4265e.license(z, "There should not have more than one AeFpsRangeQuirk.");
                if (!metrica.isEmpty()) {
                    Range range3 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) metrica.get(0))).ad.getValue();
                    if (range3 != null) {
                        range = range3;
                    }
                    C10379e c10379e2 = c16990e.vip;
                    c10379e2.getClass();
                    ((C4069e) c10379e2.f20510e).yandex(C9937e.purchase, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC2881e adcel() {
        InterfaceC2881e interfaceC2881e;
        synchronized (this.vip) {
            interfaceC2881e = this.amazon;
        }
        return interfaceC2881e;
    }

    public final void admob() {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC0876e) it.next()).metrica(this);
        }
    }

    public void ads() {
    }

    public abstract InterfaceC16100e advert(InterfaceC12330e interfaceC12330e);

    public final boolean amazon(InterfaceC2881e interfaceC2881e) {
        int amazon = ((InterfaceC13842e) this.yandex).amazon();
        if (amazon == -1 || amazon == 0) {
            return false;
        }
        if (amazon == 1) {
            return true;
        }
        if (amazon == 2) {
            return interfaceC2881e.license();
        }
        throw new AssertionError(AbstractC1786e.admob(amazon, "Unknown mirrorMode: "));
    }

    public abstract C6884e applovin(C6884e c6884e, C6884e c6884e2);

    public final InterfaceC3958e appmetrica() {
        synchronized (this.vip) {
            try {
                InterfaceC2881e interfaceC2881e = this.smaato;
                if (interfaceC2881e == null) {
                    return InterfaceC3958e.ad;
                }
                return interfaceC2881e.billing();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract InterfaceC12438e billing(boolean z, InterfaceC4311e interfaceC4311e);

    /* renamed from: class, reason: not valid java name */
    public final void m4158class(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.admob = (C11469e) list.get(0);
        if (list.size() > 1) {
            this.subscription = (C11469e) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC5113e abstractC5113e : ((C11469e) it.next()).vip()) {
                if (abstractC5113e.adcel == null) {
                    abstractC5113e.adcel = getClass();
                }
            }
        }
    }

    public void crashlytics(Rect rect) {
        this.mopub = rect;
    }

    public final void firebase(InterfaceC2881e interfaceC2881e) {
        ads();
        synchronized (this.vip) {
            try {
                InterfaceC2881e interfaceC2881e2 = this.smaato;
                if (interfaceC2881e == interfaceC2881e2) {
                    this.ad.remove(interfaceC2881e2);
                    this.smaato = null;
                }
                InterfaceC2881e interfaceC2881e3 = this.amazon;
                if (interfaceC2881e == interfaceC2881e3) {
                    this.ad.remove(interfaceC2881e3);
                    this.amazon = null;
                }
            } finally {
            }
        }
        synchronized (this.metrica) {
            try {
                C4909e c4909e = this.loadAd;
                if (c4909e != null) {
                    c4909e.vip(this.Signature);
                }
            } finally {
            }
        }
        this.startapp = null;
        this.mopub = null;
        this.yandex = this.purchase;
        this.appmetrica = null;
        this.adcel = null;
    }

    public void inmobi() {
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m4159interface(C6884e c6884e, C6884e c6884e2) {
        this.startapp = applovin(c6884e, c6884e2);
    }

    public C6884e isPro(InterfaceC12330e interfaceC12330e) {
        C6884e c6884e = this.startapp;
        if (c6884e == null) {
            throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
        }
        C10017e vip = c6884e.vip();
        vip.f19790e = interfaceC12330e;
        return vip.ad();
    }

    public void isVip() {
    }

    public final InterfaceC2881e license() {
        InterfaceC2881e interfaceC2881e;
        synchronized (this.vip) {
            interfaceC2881e = this.smaato;
        }
        return interfaceC2881e;
    }

    public final InterfaceC12438e loadAd(InterfaceC12424e interfaceC12424e, InterfaceC12438e interfaceC12438e, InterfaceC12438e interfaceC12438e2) {
        C4069e license;
        if (interfaceC12438e2 != null) {
            license = C4069e.purchase(interfaceC12438e2);
            license.adcel(InterfaceC7775e.f15761e);
        } else {
            license = C4069e.license();
        }
        TreeMap treeMap = license.f33330e;
        if (this.purchase.mo812extends(InterfaceC13842e.premium) || this.purchase.mo812extends(InterfaceC13842e.f27419class)) {
            C14326e c14326e = InterfaceC13842e.f27423native;
            if (treeMap.containsKey(c14326e)) {
                license.adcel(c14326e);
            }
        }
        InterfaceC12438e interfaceC12438e3 = this.purchase;
        C14326e c14326e2 = InterfaceC13842e.f27423native;
        if (interfaceC12438e3.mo812extends(c14326e2)) {
            C14326e c14326e3 = InterfaceC13842e.f27421goto;
            if (treeMap.containsKey(c14326e3) && ((C8070e) this.purchase.subscription(c14326e2)).vip != null) {
                license.adcel(c14326e3);
            }
        }
        Iterator it = this.purchase.admob().iterator();
        while (it.hasNext()) {
            AbstractC13501e.pro(license, license, this.purchase, (C14326e) it.next());
        }
        if (interfaceC12438e != null) {
            for (C14326e c14326e4 : interfaceC12438e.admob()) {
                if (!c14326e4.ad.equals(InterfaceC7775e.f15761e.ad)) {
                    AbstractC13501e.pro(license, license, interfaceC12438e, c14326e4);
                }
            }
        }
        if (treeMap.containsKey(InterfaceC13842e.f27419class)) {
            C14326e c14326e5 = InterfaceC13842e.premium;
            if (treeMap.containsKey(c14326e5)) {
                license.adcel(c14326e5);
            }
        }
        C14326e c14326e6 = InterfaceC13842e.f27423native;
        if (treeMap.containsKey(c14326e6)) {
            ((C8070e) license.subscription(c14326e6)).getClass();
        }
        AbstractC9464e.yandex("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.billing + ", this = " + this);
        HashSet<AbstractC3677e> hashSet = this.billing;
        if (hashSet != null) {
            int i = AbstractC5464e.ad;
            Range range = C6884e.yandex;
            int i2 = AbstractC4679e.ad;
            for (AbstractC3677e abstractC3677e : hashSet) {
                if (abstractC3677e instanceof AbstractC5464e) {
                    throw null;
                }
                if (abstractC3677e instanceof C4226e) {
                    throw null;
                }
            }
            if ((this instanceof C9301e) || AbstractC13350e.license(this)) {
                license.yandex(InterfaceC14405e.ads, C14677e.license);
            }
            license.yandex(InterfaceC12438e.f24889e, range);
            license.yandex(InterfaceC12438e.f24900e, 1);
            license.yandex(InterfaceC12438e.f24896e, 1);
        }
        return signatures(interfaceC12424e, advert(license));
    }

    public final Size metrica() {
        C6884e c6884e = this.startapp;
        if (c6884e != null) {
            return c6884e.ad;
        }
        return null;
    }

    public Set mopub() {
        return Collections.EMPTY_SET;
    }

    public void premium(Matrix matrix) {
        this.advert = new Matrix(matrix);
    }

    public void pro() {
    }

    public final String purchase() {
        InterfaceC2881e license = license();
        AbstractC4265e.billing(license, "No camera attached to use case: " + this);
        return license.subscription().billing();
    }

    public void remoteconfig() {
    }

    public InterfaceC12438e signatures(InterfaceC12424e interfaceC12424e, InterfaceC16100e interfaceC16100e) {
        return interfaceC16100e.mo819interface();
    }

    public boolean smaato() {
        return this instanceof C12477e;
    }

    public final int startapp(InterfaceC2881e interfaceC2881e, boolean z) {
        int signatures = interfaceC2881e.subscription().signatures(((InterfaceC13842e) this.yandex).mo1768else(0));
        return (interfaceC2881e.loadAd() || !z) ? signatures : AbstractC8261e.adcel(-signatures);
    }

    public final boolean subs(int i) {
        Size mo1772throw;
        int mo1768else = ((InterfaceC13842e) this.yandex).mo1768else(-1);
        if (mo1768else != -1 && mo1768else == i) {
            return false;
        }
        InterfaceC16100e advert = advert(this.purchase);
        InterfaceC13842e interfaceC13842e = (InterfaceC13842e) advert.mo819interface();
        int mo1768else2 = interfaceC13842e.mo1768else(-1);
        if (mo1768else2 == -1 || mo1768else2 != i) {
            C3186e c3186e = (C3186e) advert;
            switch (c3186e.f7298e) {
                case 0:
                    c3186e.f7297e.yandex(InterfaceC13842e.subs, Integer.valueOf(i));
                    break;
                case 1:
                    c3186e.f7297e.yandex(InterfaceC13842e.subs, Integer.valueOf(i));
                    break;
                case 2:
                    C4069e c4069e = c3186e.f7297e;
                    c4069e.yandex(InterfaceC13842e.subs, Integer.valueOf(i));
                    c4069e.yandex(InterfaceC13842e.crashlytics, Integer.valueOf(i));
                    break;
                default:
                    c3186e.f7297e.yandex(InterfaceC13842e.subs, Integer.valueOf(i));
                    break;
            }
        }
        if (mo1768else2 != -1 && i != -1 && mo1768else2 != i) {
            if (Math.abs(AbstractC3425e.billing(i) - AbstractC3425e.billing(mo1768else2)) % 180 == 90 && (mo1772throw = interfaceC13842e.mo1772throw()) != null) {
                C3186e c3186e2 = (C3186e) advert;
                Size size = new Size(mo1772throw.getHeight(), mo1772throw.getWidth());
                switch (c3186e2.f7298e) {
                    case 0:
                        c3186e2.f7297e.yandex(InterfaceC13842e.f27419class, size);
                        break;
                    case 1:
                        c3186e2.f7297e.yandex(InterfaceC13842e.f27419class, size);
                        break;
                    case 2:
                        c3186e2.f7297e.yandex(InterfaceC13842e.f27419class, size);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.purchase = advert.mo819interface();
        InterfaceC2881e license = license();
        if (license == null) {
            this.yandex = this.purchase;
            return true;
        }
        this.yandex = loadAd(license.subscription(), this.appmetrica, this.adcel);
        return true;
    }

    public final void subscription() {
        int m2467class = AbstractC8703e.m2467class(this.license);
        HashSet hashSet = this.ad;
        if (m2467class == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC0876e) it.next()).appmetrica(this);
            }
        } else {
            if (m2467class != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0876e) it2.next()).Signature(this);
            }
        }
    }

    public void tapsense(int i) {
        subs(i);
    }

    public final void vip(InterfaceC2881e interfaceC2881e, InterfaceC2881e interfaceC2881e2, InterfaceC12438e interfaceC12438e, InterfaceC12438e interfaceC12438e2) {
        synchronized (this.vip) {
            this.smaato = interfaceC2881e;
            this.amazon = interfaceC2881e2;
            this.ad.add(interfaceC2881e);
            if (interfaceC2881e2 != null) {
                this.ad.add(interfaceC2881e2);
            }
        }
        this.appmetrica = interfaceC12438e;
        this.adcel = interfaceC12438e2;
        this.yandex = loadAd(interfaceC2881e.subscription(), this.appmetrica, this.adcel);
        synchronized (this.metrica) {
            try {
                C4909e c4909e = this.loadAd;
                if (c4909e != null) {
                    c4909e.ad(AbstractC3062e.amazon(), this.Signature);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        remoteconfig();
    }

    public final String yandex() {
        String firebase = this.yandex.firebase("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(firebase);
        return firebase;
    }
}
