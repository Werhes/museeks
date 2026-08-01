package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7582e {
    public final /* synthetic */ int ad;
    public final SideSheetBehavior vip;
    public static final int[] metrica = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE, 12000, 11025, 8000, 7350};
    public static final int[] license = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final Object appmetrica = new Object();

    public /* synthetic */ C7582e(SideSheetBehavior sideSheetBehavior, int i) {
        this.ad = i;
        this.vip = sideSheetBehavior;
    }

    public static final void Signature(float[] fArr, float[] fArr2) {
        float billing = billing(0, 0, fArr2, fArr);
        float billing2 = billing(0, 1, fArr2, fArr);
        float billing3 = billing(0, 2, fArr2, fArr);
        float billing4 = billing(0, 3, fArr2, fArr);
        float billing5 = billing(1, 0, fArr2, fArr);
        float billing6 = billing(1, 1, fArr2, fArr);
        float billing7 = billing(1, 2, fArr2, fArr);
        float billing8 = billing(1, 3, fArr2, fArr);
        float billing9 = billing(2, 0, fArr2, fArr);
        float billing10 = billing(2, 1, fArr2, fArr);
        float billing11 = billing(2, 2, fArr2, fArr);
        float billing12 = billing(2, 3, fArr2, fArr);
        float billing13 = billing(3, 0, fArr2, fArr);
        float billing14 = billing(3, 1, fArr2, fArr);
        float billing15 = billing(3, 2, fArr2, fArr);
        float billing16 = billing(3, 3, fArr2, fArr);
        fArr[0] = billing;
        fArr[1] = billing2;
        fArr[2] = billing3;
        fArr[3] = billing4;
        fArr[4] = billing5;
        fArr[5] = billing6;
        fArr[6] = billing7;
        fArr[7] = billing8;
        fArr[8] = billing9;
        fArr[9] = billing10;
        fArr[10] = billing11;
        fArr[11] = billing12;
        fArr[12] = billing13;
        fArr[13] = billing14;
        fArr[14] = billing15;
        fArr[15] = billing16;
    }

    public static final boolean ad(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static int admob(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static final int advert(C12742e c12742e) {
        return ((C4646e) AbstractC12909e.yandex(c12742e.f25493e)).appmetrica;
    }

    public static final boolean amazon(C12742e c12742e, Function1 function1) {
        int i;
        AbstractC8218e abstractC8218e;
        Object invoke;
        AbstractC13717e adcel;
        boolean metrica2;
        do {
            synchronized (appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(c12742e.f25493e);
                i = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            C0316e mo289this = abstractC8218e.mo289this();
            invoke = function1.invoke(mo289this);
            AbstractC8218e m301class = mo289this.m301class();
            if (AbstractC7890e.billing(m301class, abstractC8218e)) {
                break;
            }
            C4646e c4646e2 = c12742e.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica2 = metrica((C4646e) AbstractC12909e.inmobi(c4646e2, c12742e, adcel), i, m301class, true);
            }
            AbstractC12909e.loadAd(adcel, c12742e);
        } while (!metrica2);
        return ((Boolean) invoke).booleanValue();
    }

    public static final void appmetrica(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
    }

    public static final float billing(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final void license(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
    }

    public static Cimport loadAd(C2125e c2125e, boolean z) {
        int billing = c2125e.billing(5);
        if (billing == 31) {
            billing = c2125e.billing(6) + 32;
        }
        int mopub = mopub(c2125e);
        int billing2 = c2125e.billing(4);
        String admob = AbstractC1786e.admob(billing, "mp4a.40.");
        if (billing == 5 || billing == 29) {
            mopub = mopub(c2125e);
            int billing3 = c2125e.billing(5);
            if (billing3 == 31) {
                billing3 = c2125e.billing(6) + 32;
            }
            billing = billing3;
            if (billing == 22) {
                billing2 = c2125e.billing(4);
            }
        }
        if (z) {
            if (billing != 1 && billing != 2 && billing != 3 && billing != 4 && billing != 6 && billing != 7 && billing != 17) {
                switch (billing) {
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C15125e.metrica("Unsupported audio object type: " + billing);
                }
            }
            if (c2125e.purchase()) {
                AbstractC2803e.smaato("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c2125e.purchase()) {
                c2125e.loadAd(14);
            }
            boolean purchase = c2125e.purchase();
            if (billing2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (billing == 6 || billing == 20) {
                c2125e.loadAd(3);
            }
            if (purchase) {
                if (billing == 22) {
                    c2125e.loadAd(16);
                }
                if (billing == 17 || billing == 19 || billing == 20 || billing == 23) {
                    c2125e.loadAd(3);
                }
                c2125e.loadAd(1);
            }
            switch (billing) {
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                    int billing4 = c2125e.billing(2);
                    if (billing4 == 2 || billing4 == 3) {
                        throw C15125e.metrica("Unsupported epConfig: " + billing4);
                    }
            }
        }
        int i = license[billing2];
        if (i != -1) {
            return new Cimport(mopub, i, admob);
        }
        throw C15125e.ad(null, null);
    }

    public static final boolean metrica(C4646e c4646e, int i, AbstractC8218e abstractC8218e, boolean z) {
        boolean z2;
        synchronized (appmetrica) {
            try {
                int i2 = c4646e.license;
                if (i2 == i) {
                    c4646e.metrica = abstractC8218e;
                    z2 = true;
                    if (z) {
                        c4646e.appmetrica++;
                    }
                    c4646e.license = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static int mopub(C2125e c2125e) {
        int billing = c2125e.billing(4);
        if (billing == 15) {
            if (c2125e.vip() >= 24) {
                return c2125e.billing(24);
            }
            throw C15125e.ad(null, "AAC header insufficient data");
        }
        if (billing < 13) {
            return metrica[billing];
        }
        throw C15125e.ad(null, "AAC header wrong Sampling Frequency Index");
    }

    public static final void purchase(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            pro.append(i3);
            throw new IndexOutOfBoundsException(pro.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void smaato(InterfaceC8850e interfaceC8850e, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC15943e.ad.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC12088e) it.next()).mo2160break(interfaceC8850e, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC13362e.license(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC13362e.license(th, new C0239e(interfaceC8850e));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void vip(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public final int adcel(View view) {
        switch (this.ad) {
            case 0:
                return view.getRight() + this.vip.loadAd;
            default:
                return view.getLeft() - this.vip.loadAd;
        }
    }

    public final int startapp() {
        switch (this.ad) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.vip;
                return (-sideSheetBehavior.advert) - sideSheetBehavior.loadAd;
            default:
                return this.vip.smaato;
        }
    }

    public final int yandex() {
        switch (this.ad) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.vip;
                return Math.max(0, sideSheetBehavior.amazon + sideSheetBehavior.loadAd);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.vip;
                return Math.max(0, (sideSheetBehavior2.smaato - sideSheetBehavior2.advert) - sideSheetBehavior2.loadAd);
        }
    }
}
