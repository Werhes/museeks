package defpackage;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۟ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8250e {
    public static final String ad = C5401e.crashlytics("Schedulers");

    public static void ad(C11224e c11224e, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C4956e amazon = workDatabase.amazon();
        workDatabase.metrica();
        try {
            int i = c11224e.metrica;
            if (Build.VERSION.SDK_INT == 23) {
                i /= 2;
            }
            ArrayList yandex = amazon.yandex(i);
            ArrayList purchase = amazon.purchase();
            if (yandex.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = yandex.iterator();
                while (it.hasNext()) {
                    amazon.remoteconfig(currentTimeMillis, ((C13394e) it.next()).ad);
                }
            }
            workDatabase.yandex();
            workDatabase.purchase();
            if (yandex.size() > 0) {
                C13394e[] c13394eArr = (C13394e[]) yandex.toArray(new C13394e[yandex.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC11096e interfaceC11096e = (InterfaceC11096e) it2.next();
                    if (interfaceC11096e.vip()) {
                        interfaceC11096e.appmetrica(c13394eArr);
                    }
                }
            }
            if (purchase.size() > 0) {
                C13394e[] c13394eArr2 = (C13394e[]) purchase.toArray(new C13394e[purchase.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC11096e interfaceC11096e2 = (InterfaceC11096e) it3.next();
                    if (!interfaceC11096e2.vip()) {
                        interfaceC11096e2.appmetrica(c13394eArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.purchase();
            throw th;
        }
    }
}
