package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10922e implements InterfaceC6744e {
    public final HashMap license;
    public final InterfaceC6744e metrica;

    public C10922e(InterfaceC6744e interfaceC6744e, C3909e c3909e, InterfaceC12424e interfaceC12424e, C13410e c13410e) {
        List license;
        this.metrica = interfaceC6744e;
        ArrayList metrica = c3909e.metrica(ExtraSupportedQualityQuirk.class);
        if (metrica.isEmpty()) {
            return;
        }
        Map map = null;
        AbstractC4265e.yandex(null, metrica.size() == 1);
        ((ExtraSupportedQualityQuirk) metrica.get(0)).getClass();
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            map = Collections.EMPTY_MAP;
        } else if ("1".equals(interfaceC12424e.billing()) && !interfaceC6744e.ad(4)) {
            InterfaceC16104e vip = interfaceC6744e.vip(1);
            C1900e c1900e = (vip == null || (license = vip.license()) == null) ? null : (C1900e) AbstractC13480e.m3604this(license);
            if (c1900e != null) {
                InterfaceC18315e ad = c13410e.ad(c1900e.vip);
                Range mo384e = ad != null ? ad.mo384e() : Range.create(0, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
                Size size = AbstractC2084e.license;
                int i = c1900e.metrica;
                int i2 = c1900e.yandex;
                int i3 = c1900e.license;
                C9219e appmetrica = C9219e.appmetrica(vip.ad(), vip.vip(), vip.metrica(), Collections.singletonList(new C1900e(c1900e.ad, c1900e.vip, ((Number) mo384e.clamp(Integer.valueOf(AbstractC14417e.license(i, i2, i2, i3, i3, size.getWidth(), c1900e.appmetrica, size.getHeight(), c1900e.purchase)))).intValue(), c1900e.license, size.getWidth(), size.getHeight(), c1900e.billing, c1900e.yandex, c1900e.startapp, c1900e.adcel)));
                HashMap hashMap = new HashMap();
                hashMap.put(4, appmetrica);
                Size ad2 = c1900e.ad();
                if (size.getHeight() * size.getWidth() > ad2.getHeight() * ad2.getWidth()) {
                    hashMap.put(1, appmetrica);
                }
                map = hashMap;
            }
        }
        if (map != null) {
            this.license = new HashMap(map);
        }
    }

    @Override // defpackage.InterfaceC6744e
    public final boolean ad(int i) {
        return metrica(i) != null;
    }

    public final InterfaceC16104e metrica(int i) {
        HashMap hashMap = this.license;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(i))) ? this.metrica.vip(i) : (InterfaceC16104e) hashMap.get(Integer.valueOf(i));
    }

    @Override // defpackage.InterfaceC6744e
    public final InterfaceC16104e vip(int i) {
        return metrica(i);
    }
}
