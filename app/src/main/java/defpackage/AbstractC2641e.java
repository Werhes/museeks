package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2641e {
    public static final Object ad = new Object();

    public static final void ad(InterfaceC12864e interfaceC12864e, Function1 function1, C13770e c13770e, int i) {
        c13770e.m3671package(1662841509);
        int i2 = (c13770e.yandex(function1) ? 32 : 16) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC16400e interfaceC16400e = (InterfaceC16400e) c13770e.adcel(AbstractC9179e.ad);
            InterfaceC12864e metrica = AbstractC16136e.metrica(interfaceC12864e, C3618e.vip, AbstractC10432e.ad);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            boolean yandex = c13770e.yandex(interfaceC16400e) | ((i2 & 112) == 32);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C12439e(interfaceC16400e, function1, 26);
                c13770e.m3682throws(m3681throw);
            }
            Function1 function12 = (Function1) m3681throw;
            C7913e c7913e = AbstractC18007e.metrica;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C17014e(26);
                c13770e.m3682throws(m3681throw2);
            }
            Function1 function13 = (Function1) m3681throw2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == c5170e) {
                m3681throw3 = new C17014e(27);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC9464e.vip(function12, c7913e, function13, (Function1) m3681throw3, c13770e, 27696, 4);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(interfaceC12864e, function1, i, 0);
        }
    }

    public static final boolean license(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static boolean metrica(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static void vip(StringBuilder sb, String str, Map map) {
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String name = key instanceof CameraCharacteristics.Key ? ((CameraCharacteristics.Key) key).getName() : key instanceof CaptureRequest.Key ? ((CaptureRequest.Key) key).getName() : key instanceof CaptureResult.Key ? ((CaptureResult.Key) key).getName() : String.valueOf(key);
            Object value = entry.getValue();
            arrayList.add(new C6571e(name, value instanceof Object[] ? AbstractC1660e.m669goto((Object[]) value, null, "[", "]", new C2163e(2), 25) : String.valueOf(value)));
        }
        for (C6571e c6571e : AbstractC13480e.m3577else(arrayList, new C11021e(18))) {
            sb.append("  " + AbstractC5304e.m1851break(50, (String) c6571e.f13544e) + ' ' + ((String) c6571e.f13543e) + '\n');
        }
    }
}
