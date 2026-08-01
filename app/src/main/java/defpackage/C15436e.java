package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15436e {
    public final C3031e ad;
    public final C17974e metrica;
    public final LinkedHashMap vip = new LinkedHashMap();

    public C15436e(StreamConfigurationMap streamConfigurationMap, C3031e c3031e) {
        this.ad = c3031e;
        new LinkedHashMap();
        new LinkedHashMap();
        this.metrica = Build.VERSION.SDK_INT >= 34 ? new C17974e(25, streamConfigurationMap) : new C17974e(25, streamConfigurationMap);
    }

    public final Size[] ad(int i) {
        int i2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.vip;
        Size[] sizeArr = null;
        if (linkedHashMap.containsKey(valueOf)) {
            Size[] sizeArr2 = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr2 != null) {
                return (Size[]) sizeArr2.clone();
            }
            return null;
        }
        try {
            sizeArr = this.metrica.signatures(i);
        } catch (Throwable th) {
            AbstractC9464e.pro("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (sizeArr == null || sizeArr.length == 0) {
            AbstractC9464e.remoteconfig("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return sizeArr;
        }
        C3031e c3031e = this.ad;
        c3031e.getClass();
        ArrayList arrayList = new ArrayList(new C4613e(sizeArr, false));
        if (c3031e.metrica != null) {
            Size[] sizeArr3 = (i == 34 && (AbstractC6507e.loadAd(Build.MANUFACTURER, "Motorola", true) || AbstractC6507e.loadAd(Build.BRAND, "Motorola", true)) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr3.length != 0) {
                AbstractC13480e.isPro(arrayList, sizeArr3);
            }
        }
        InterfaceC2531e interfaceC2531e = c3031e.ad;
        if (interfaceC2531e == null || c3031e.vip == null) {
            i2 = 0;
        } else {
            String str = ((C9000e) interfaceC2531e).f18066e;
            boolean purchase = AbstractC12315e.purchase();
            i2 = 0;
            Collection<?> collection = C13664e.f27089e;
            if (purchase) {
                if (AbstractC7890e.billing(str, "0") && i == 256) {
                    collection = AbstractC6874e.startapp(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (AbstractC12315e.billing()) {
                if (AbstractC7890e.billing(str, "0") && i == 256) {
                    collection = AbstractC6874e.startapp(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (AbstractC12315e.license()) {
                if (AbstractC7890e.billing(str, "0") && (i == 34 || i == 35)) {
                    collection = AbstractC6874e.startapp(new Size(720, 720), new Size(400, 400));
                }
            } else if (AbstractC12315e.mopub()) {
                if (AbstractC7890e.billing(str, "0")) {
                    if (i == 34) {
                        collection = AbstractC6874e.startapp(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collection = AbstractC6874e.startapp(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (AbstractC7890e.billing(str, "1") && (i == 34 || i == 35)) {
                    collection = AbstractC6874e.startapp(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (AbstractC12315e.adcel()) {
                if (AbstractC7890e.billing(str, "0")) {
                    if (i == 34) {
                        collection = AbstractC6874e.startapp(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collection = AbstractC6874e.startapp(new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (AbstractC7890e.billing(str, "1") && (i == 34 || i == 35)) {
                    collection = AbstractC6874e.startapp(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (AbstractC12315e.yandex()) {
                if (AbstractC7890e.billing(str, "0") && i == 256) {
                    collection = Collections.singletonList(new Size(9280, 6944));
                }
            } else if (AbstractC12315e.startapp()) {
                if (i == 35) {
                    collection = AbstractC6874e.startapp(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440));
                }
            } else if (AbstractC12315e.appmetrica()) {
                if (i == 35) {
                    collection = AbstractC6874e.startapp(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448));
                }
            } else if (!AbstractC12315e.advert()) {
                AbstractC9464e.remoteconfig("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
            } else if (AbstractC7890e.billing(str, "1") && i == 35) {
                collection = AbstractC6874e.startapp(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712));
            }
            Collection<?> collection2 = collection;
            if (!collection2.isEmpty()) {
                arrayList.removeAll(collection2);
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC9464e.remoteconfig("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr4 = (Size[]) arrayList.toArray(new Size[i2]);
        linkedHashMap.put(Integer.valueOf(i), sizeArr4);
        return (Size[]) sizeArr4.clone();
    }
}
