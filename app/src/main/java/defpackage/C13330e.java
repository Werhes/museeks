package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13330e implements InterfaceC14230e, InterfaceC11149e {
    public C8419e Signature;
    public final C13825e ad;
    public final Integer adcel;
    public C8419e admob;
    public final ArrayList advert;
    public C8823e amazon;
    public final InterfaceC2786e appmetrica;
    public Rational billing;
    public final C8591e license;
    public C8823e loadAd;
    public final C11744e metrica;
    public final boolean mopub;
    public InterfaceC7865e purchase;
    public final ArrayList smaato;
    public final Integer startapp;
    public final InterfaceC5592e vip;
    public final Integer yandex;

    public C13330e(C13825e c13825e, InterfaceC5592e interfaceC5592e, C11744e c11744e, C8591e c8591e, InterfaceC2786e interfaceC2786e) {
        ArrayList arrayList;
        Object obj;
        this.ad = c13825e;
        this.vip = interfaceC5592e;
        this.metrica = c11744e;
        this.license = c8591e;
        this.appmetrica = interfaceC2786e;
        Object metrica = ((C9000e) c13825e.vip).metrica(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        this.yandex = (Integer) (metrica == null ? r9 : metrica);
        Object metrica2 = ((C9000e) c13825e.vip).metrica(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        this.startapp = (Integer) (metrica2 == null ? r9 : metrica2);
        Object metrica3 = ((C9000e) c13825e.vip).metrica(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        this.adcel = (Integer) (metrica3 != null ? metrica3 : 0);
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e interfaceC2531e = c13825e.vip;
        c6434e.getClass();
        this.mopub = C6434e.ad(interfaceC2531e);
        int[] iArr = (int[]) ((C9000e) c13825e.vip).metrica(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = C6510e.vip;
                arrayList.add(AbstractC12797e.advert(i));
            }
        } else {
            arrayList = null;
        }
        this.advert = arrayList;
        int[] iArr2 = (int[]) ((C9000e) this.ad.vip).metrica(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            ArrayList arrayList3 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = C2548e.vip.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((C2548e) obj).ad == i2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                arrayList3.add((C2548e) obj);
            }
            arrayList2 = arrayList3;
        }
        this.smaato = arrayList2;
    }

    @Override // defpackage.InterfaceC11149e
    public final void ad(LinkedHashSet linkedHashSet) {
        Size metrica;
        this.billing = null;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            if ((abstractC16510e instanceof C9301e) && (metrica = ((C9301e) abstractC16510e).metrica()) != null) {
                this.billing = new Rational(metrica.getWidth(), metrica.getHeight());
            }
        }
    }

    public final Rational metrica() {
        Rational rational = this.billing;
        if (rational != null) {
            return rational;
        }
        InterfaceC2786e interfaceC2786e = this.appmetrica;
        return new Rational(interfaceC2786e.adcel().width(), interfaceC2786e.adcel().height());
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        this.billing = null;
        C8823e c8823e = new C8823e();
        InterfaceC7865e interfaceC7865e = this.purchase;
        if (interfaceC7865e == null) {
            AbstractC17861e.isPro("Camera is not active.", c8823e);
            return;
        }
        C8419e c8419e = this.Signature;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        C8419e c8419e2 = this.admob;
        if (c8419e2 != null) {
            c8419e2.Signature(null);
        }
        C8823e c8823e2 = this.loadAd;
        if (c8823e2 != null) {
            AbstractC17861e.isPro("Cancelled by another cancelFocusAndMetering()", c8823e2);
        }
        this.loadAd = c8823e;
        C8823e c8823e3 = this.amazon;
        if (c8823e3 != null) {
            AbstractC17861e.isPro("Cancelled by cancelFocusAndMetering()", c8823e3);
        }
        C11744e c11744e = this.metrica;
        synchronized (c11744e.license) {
            c11744e.advert = null;
            Unit unit = Unit.INSTANCE;
        }
        c11744e.purchase();
        AbstractC16398e.metrica(interfaceC7865e.mopub(), c8823e);
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.purchase = interfaceC7865e;
    }
}
