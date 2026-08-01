package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5092e {
    public static final Object ad = new Object();
    public static C4473e vip;

    public static final long ad(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void appmetrica() {
        try {
            if (vip == null) {
                vip = (C4473e) ((C0498e) ((InterfaceC12823e) C14679e.metrica().vip(InterfaceC12823e.class))).loadAd.get();
            }
            C4473e c4473e = vip;
            if ((c4473e != null ? c4473e : null).startapp) {
                if (c4473e == null) {
                    c4473e = null;
                }
                c4473e.vip();
            }
        } catch (Exception unused) {
        }
    }

    public static ArrayList billing(Collection collection, InterfaceC8223e interfaceC8223e) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) interfaceC8223e.apply(it.next()));
        }
        return arrayList;
    }

    public static final long license(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static C1410e metrica(InterfaceC8223e interfaceC8223e, List list) {
        C13304e Signature = AbstractC17475e.Signature();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            Signature.metrica(interfaceC8223e.apply(bundle));
        }
        return Signature.billing();
    }

    public static final InterfaceC12864e purchase(float f, float f2) {
        boolean isNaN = Float.isNaN(f);
        InterfaceC12864e interfaceC12864e = C0115e.f1276e;
        C13236e c13236e = !isNaN ? new C13236e(AbstractC14806e.ad, f, Float.NaN) : interfaceC12864e;
        if (!Float.isNaN(f2)) {
            interfaceC12864e = new C13236e(AbstractC14806e.vip, Float.NaN, f2);
        }
        return c13236e.premium(interfaceC12864e);
    }

    public static C9364e vip(Object obj, String str) {
        AbstractC9528e.adcel(obj, "Listener must not be null");
        AbstractC9528e.billing(str, "Listener type must not be empty");
        return new C9364e(obj, str);
    }
}
