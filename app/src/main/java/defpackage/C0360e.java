package defpackage;

import android.util.Size;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360e implements InterfaceC6744e {
    public final C13410e appmetrica;
    public final List license;
    public final InterfaceC12424e metrica;
    public final C5363e purchase = new C5363e(new C10479e(18, this));
    public final LinkedHashMap billing = new LinkedHashMap();

    public C0360e(InterfaceC12424e interfaceC12424e, List list, C13410e c13410e) {
        this.metrica = interfaceC12424e;
        this.license = list;
        this.appmetrica = c13410e;
    }

    public static C1900e metrica(C0360e c0360e, int i, int i2, int i3) {
        return new C1900e(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
    }

    @Override // defpackage.InterfaceC6744e
    public final boolean ad(int i) {
        return license(i) != null;
    }

    public final InterfaceC16104e license(int i) {
        int i2;
        Object obj;
        int i3;
        C1900e metrica;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.billing;
        if (linkedHashMap.containsKey(valueOf)) {
            return (InterfaceC16104e) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = this.license.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = i;
                obj = null;
                break;
            }
            obj = it.next();
            i2 = i;
            if (((C18525e) obj).ad == i2) {
                break;
            }
        }
        C18525e c18525e = obj instanceof C18525e ? (C18525e) obj : null;
        if (c18525e != null) {
            for (Size size : c18525e.license) {
                if (((List) this.purchase.getValue()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (c18525e.equals(C18525e.yandex)) {
                        i3 = 40000000;
                    } else if (c18525e.equals(C18525e.billing)) {
                        i3 = 10000000;
                    } else if (c18525e.equals(C18525e.purchase)) {
                        i3 = 4000000;
                    } else {
                        if (!c18525e.equals(C18525e.appmetrica)) {
                            throw new IllegalArgumentException("Undefined bitrate for quality: " + c18525e);
                        }
                        i3 = 2000000;
                    }
                    metrica = metrica(this, width, height, i3);
                    InterfaceC18315e ad = this.appmetrica.ad("video/avc");
                    if (ad != null && ad.mo386e(width, height)) {
                        Integer num = (Integer) ad.mo384e().clamp(Integer.valueOf(i3));
                        if (num == null || num.intValue() != i3) {
                            metrica = metrica(this, width, height, num.intValue());
                        }
                    } else {
                        metrica = null;
                    }
                    if (metrica != null) {
                        break;
                    }
                }
            }
        }
        metrica = null;
        C9219e appmetrica = metrica != null ? C9219e.appmetrica(60, 2, Collections.singletonList(new C0194e(3, 96000, 44100, 1, 2, "audio/mp4a-latm")), Collections.singletonList(metrica)) : null;
        linkedHashMap.put(Integer.valueOf(i2), appmetrica);
        return appmetrica;
    }

    @Override // defpackage.InterfaceC6744e
    public final InterfaceC16104e vip(int i) {
        return license(i);
    }
}
