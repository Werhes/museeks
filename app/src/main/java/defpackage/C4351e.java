package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4351e extends AbstractC11130e {
    @Override // defpackage.InterfaceC2088e
    public final C11154e appmetrica() {
        C0142e c0142e = (C0142e) this.f22047e;
        if (!((Scanner) c0142e.f1373e).hasNext()) {
            throw new EOFException();
        }
        new ArrayList();
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                boolean z = true;
                if (!((Scanner) c0142e.f1373e).hasNext()) {
                    C11154e c11154e = new C11154e(null, new C2697e(arrayList, null, 0, null, 0, false, false, null), false, 1);
                    if (((Set) C5389e.pro(c11154e, C1400e.f4213e).f11540e).isEmpty()) {
                        return c11154e;
                    }
                    throw new C2123e(10);
                }
                String appmetrica = c0142e.appmetrica();
                if (!(appmetrica.indexOf("#") == 0) && appmetrica.length() != appmetrica.trim().length()) {
                    throw C15608e.ad(appmetrica, 39, BuildConfig.FLAVOR + appmetrica.length());
                }
                if (appmetrica.length() != 0) {
                    if (appmetrica.indexOf("#") != 0) {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(new C6900e(appmetrica, null, null, null, false, null, null));
                    }
                }
            }
        } catch (C15608e e) {
            Object obj = c0142e.f1375e;
            throw e;
        }
    }
}
