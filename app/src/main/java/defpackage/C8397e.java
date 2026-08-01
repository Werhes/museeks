package defpackage;

import android.util.Rational;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8397e implements InterfaceC6744e {
    public final InterfaceC6744e appmetrica;
    public final Object purchase;
    public final /* synthetic */ int metrica = 2;
    public final HashMap license = new HashMap();

    public C8397e(InterfaceC6744e interfaceC6744e, C3909e c3909e) {
        this.appmetrica = interfaceC6744e;
        this.purchase = c3909e;
    }

    public C8397e(InterfaceC6744e interfaceC6744e, C14677e c14677e) {
        this.appmetrica = interfaceC6744e;
        this.purchase = c14677e;
    }

    public C8397e(C8397e c8397e, C13410e c13410e) {
        this.appmetrica = c8397e;
        this.purchase = c13410e;
    }

    @Override // defpackage.InterfaceC6744e
    public final boolean ad(int i) {
        switch (this.metrica) {
            case 0:
                return ((C8397e) this.appmetrica).ad(i) && metrica(i) != null;
            case 1:
                return this.appmetrica.ad(i) && license(i) != null;
            default:
                return this.appmetrica.ad(i) && appmetrica(i) != null;
        }
    }

    public InterfaceC16104e appmetrica(int i) {
        InterfaceC16104e interfaceC16104e;
        Size size;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.license;
        if (hashMap.containsKey(valueOf)) {
            return (InterfaceC16104e) hashMap.get(Integer.valueOf(i));
        }
        InterfaceC6744e interfaceC6744e = this.appmetrica;
        if (interfaceC6744e.ad(i)) {
            InterfaceC16104e vip = interfaceC6744e.vip(i);
            Objects.requireNonNull(vip);
            Iterator it = ((C3909e) this.purchase).metrica(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                    if (i == 4) {
                        size = new Size(640, 480);
                    } else if (i == 5) {
                        size = new Size(960, 720);
                    } else if (i == 6) {
                        size = new Size(1440, 1080);
                    }
                }
            }
            size = null;
            if (size == null) {
                interfaceC16104e = vip;
            } else {
                ArrayList arrayList = new ArrayList();
                for (C1900e c1900e : vip.license()) {
                    arrayList.add(new C1900e(c1900e.ad, c1900e.vip, c1900e.metrica, c1900e.license, size.getWidth(), size.getHeight(), c1900e.billing, c1900e.yandex, c1900e.startapp, c1900e.adcel));
                }
                if (!arrayList.isEmpty()) {
                    interfaceC16104e = C9219e.appmetrica(vip.ad(), vip.vip(), vip.metrica(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), interfaceC16104e);
            return interfaceC16104e;
        }
        interfaceC16104e = null;
        hashMap.put(Integer.valueOf(i), interfaceC16104e);
        return interfaceC16104e;
    }

    public InterfaceC16104e license(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.license;
        if (hashMap.containsKey(valueOf)) {
            return (InterfaceC16104e) hashMap.get(Integer.valueOf(i));
        }
        InterfaceC6744e interfaceC6744e = this.appmetrica;
        C9219e c9219e = null;
        if (interfaceC6744e.ad(i)) {
            InterfaceC16104e vip = interfaceC6744e.vip(i);
            C14677e c14677e = (C14677e) this.purchase;
            if (vip != null) {
                ArrayList arrayList = new ArrayList();
                for (C1900e c1900e : vip.license()) {
                    if (AbstractC6814e.ad(c1900e, c14677e)) {
                        arrayList.add(c1900e);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c9219e = C9219e.appmetrica(vip.ad(), vip.vip(), vip.metrica(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), c9219e);
        }
        return c9219e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, eَؙٖ] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    public InterfaceC16104e metrica(int i) {
        C1900e c1900e;
        int i2;
        int i3;
        C1900e c1900e2;
        int i4;
        C1900e c1900e3;
        InterfaceC18315e ad;
        ?? appmetrica;
        C8397e c8397e = (C8397e) this.appmetrica;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.license;
        if (hashMap.containsKey(valueOf)) {
            return (InterfaceC16104e) hashMap.get(Integer.valueOf(i));
        }
        if (!c8397e.ad(i)) {
            return null;
        }
        InterfaceC16104e appmetrica2 = c8397e.appmetrica(i);
        if (appmetrica2 == null) {
            appmetrica = 0;
        } else {
            ArrayList arrayList = new ArrayList(appmetrica2.license());
            Iterator it = appmetrica2.license().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c1900e = null;
                    break;
                }
                c1900e = (C1900e) it.next();
                if (c1900e.adcel == 0) {
                    break;
                }
            }
            if (c1900e == null) {
                c1900e3 = null;
                c1900e2 = null;
            } else {
                int i5 = c1900e.ad;
                String str = c1900e.vip;
                int i6 = c1900e.billing;
                if (1 != c1900e.adcel) {
                    i5 = 5;
                    str = "video/hevc";
                    i2 = 2;
                } else {
                    i2 = i6;
                }
                int i7 = i5;
                String str2 = str;
                int i8 = c1900e.metrica;
                int i9 = c1900e.yandex;
                if (10 == i9) {
                    i4 = i8;
                    i3 = 10;
                    c1900e2 = null;
                } else {
                    i3 = 10;
                    int doubleValue = (int) (i8 * new Rational(10, i9).doubleValue());
                    if (AbstractC9464e.smaato("BackupHdrProfileEncoderProfilesProvider")) {
                        c1900e2 = null;
                        AbstractC9464e.yandex("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i8), 10, Integer.valueOf(i9), Integer.valueOf(doubleValue)));
                    } else {
                        c1900e2 = null;
                    }
                    i4 = doubleValue;
                }
                c1900e3 = new C1900e(i7, str2, i4, c1900e.license, c1900e.appmetrica, c1900e.purchase, i2, i3, c1900e.startapp, 1);
            }
            C13410e c13410e = (C13410e) this.purchase;
            if (c1900e3 == null || (ad = c13410e.ad(c1900e3.vip)) == null || !ad.mo386e(c1900e3.appmetrica, c1900e3.purchase)) {
                c1900e3 = c1900e2;
            } else {
                int i10 = c1900e3.metrica;
                int intValue = ((Integer) ad.mo384e().clamp(Integer.valueOf(i10))).intValue();
                if (intValue != i10) {
                    c1900e3 = new C1900e(c1900e3.ad, c1900e3.vip, intValue, c1900e3.license, c1900e3.appmetrica, c1900e3.purchase, c1900e3.billing, c1900e3.yandex, c1900e3.startapp, c1900e3.adcel);
                }
            }
            if (c1900e3 != null) {
                arrayList.add(c1900e3);
            }
            appmetrica = arrayList.isEmpty() ? c1900e2 : C9219e.appmetrica(appmetrica2.ad(), appmetrica2.vip(), appmetrica2.metrica(), arrayList);
        }
        hashMap.put(Integer.valueOf(i), appmetrica);
        return appmetrica;
    }

    @Override // defpackage.InterfaceC6744e
    public final InterfaceC16104e vip(int i) {
        switch (this.metrica) {
            case 0:
                return metrica(i);
            case 1:
                return license(i);
            default:
                return appmetrica(i);
        }
    }
}
