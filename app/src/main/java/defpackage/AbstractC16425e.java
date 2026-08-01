package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16425e {
    public static final C2892e ad = new C2892e(-1002388094, false, new C9012e(0));
    public static final C2892e vip = new C2892e(-1600792149, false, new C9012e(1));
    public static final C2892e metrica = new C2892e(-903720551, false, new C9012e(2));
    public static final C2892e license = new C2892e(827335806, false, new C9012e(3));

    public static String appmetrica(String str) {
        str.getClass();
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    public static String license(String str) {
        str.getClass();
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? BuildConfig.FLAVOR : name.substring(lastIndexOf + 1);
    }

    public static C15073e metrica(double d, double d2) {
        C13797e c13797e;
        C6567e c6567e = new C6567e(d, d2);
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                c13797e = new C13797e(AbstractC5190e.adcel(c6567e.ad, c6567e.vip, i2));
                break;
            }
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = c6567e.ad(i3) < c6567e.ad(i4);
            if (c6567e.ad(i3) >= c6567e.vip - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        c13797e = new C13797e(AbstractC5190e.adcel(c6567e.ad, c6567e.vip, i2));
                        break;
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        return new C15073e(d, d2, c13797e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void purchase(AbstractC13616e abstractC13616e, Function0 function0) {
        C5028e c5028e = abstractC13616e.f27023e;
        if (c5028e == null) {
            c5028e = new C5028e((InterfaceC0479e) abstractC13616e);
            abstractC13616e.f27023e = c5028e;
        }
        C15087e snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(abstractC13616e)).getSnapshotObserver();
        snapshotObserver.ad.metrica(c5028e, C8082e.f16409e, function0);
    }

    public static void vip(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    public boolean ad() {
        return false;
    }

    public void billing() {
    }

    public abstract void startapp();

    public abstract void yandex();
}
