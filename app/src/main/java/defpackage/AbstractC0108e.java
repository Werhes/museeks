package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0108e {
    public static final C5363e ad = new C5363e(new C13564e(3));
    public static final C5363e vip = new C5363e(new C13564e(4));

    public static ArrayList ad(EnumC15386e enumC15386e, EnumC15386e enumC15386e2) {
        ArrayList arrayList = new ArrayList();
        C6404e c6404e = new C6404e();
        EnumC2392e enumC2392e = C4637e.appmetrica;
        EnumC14212e enumC14212e = EnumC14212e.f28078e;
        c6404e.ad(C16728e.amazon(enumC14212e, enumC15386e));
        C6404e remoteconfig = AbstractC0869e.remoteconfig(EnumC14212e.f28075e, enumC15386e2, c6404e, arrayList, c6404e);
        remoteconfig.ad(C16728e.amazon(enumC14212e, enumC15386e));
        remoteconfig.ad(C16728e.amazon(EnumC14212e.f28077e, enumC15386e2));
        arrayList.add(remoteconfig);
        return arrayList;
    }

    public static ArrayList vip(InterfaceC2531e interfaceC2531e, int i) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            Object metrica = ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION);
            if (metrica == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int intValue = ((Number) metrica).intValue();
            if (intValue >= 35 && i != 3) {
                arrayList.addAll((List) ad.getValue());
            }
            if (intValue >= 36 && i != 4) {
                arrayList.addAll((List) vip.getValue());
                return arrayList;
            }
        }
        return arrayList;
    }
}
