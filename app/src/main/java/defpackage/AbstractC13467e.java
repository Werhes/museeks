package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13467e {
    public static final C12916e ad = new C12916e(12, (Object) (-1));
    public static C13391e appmetrica;
    public static final C12916e license;
    public static final C12916e metrica;
    public static final C12916e vip;

    static {
        int i = 12;
        Object obj = null;
        vip = new C12916e(i, obj);
        metrica = new C12916e(i, obj);
        license = new C12916e(i, obj);
    }

    public static InterfaceC8528e ad(String str, List list) {
        C9494e c9494e;
        C15587e c15587e = new C15587e();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c9494e = C9494e.vip;
            if (!hasNext) {
                break;
            }
            InterfaceC8528e interfaceC8528e = (InterfaceC8528e) it.next();
            if (interfaceC8528e != c9494e) {
                if (interfaceC8528e instanceof C14310e) {
                    AbstractC13480e.isPro(c15587e, ((C14310e) interfaceC8528e).metrica);
                } else {
                    c15587e.add(interfaceC8528e);
                }
            }
        }
        int i = c15587e.f30752e;
        return i != 0 ? i != 1 ? new C14310e(str, (InterfaceC8528e[]) c15587e.toArray(new InterfaceC8528e[0])) : (InterfaceC8528e) c15587e.get(0) : c9494e;
    }

    public static void metrica(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AbstractC5096e.subscription(window, z);
        } else {
            if (i >= 30) {
                AbstractC5096e.admob(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final boolean vip(InterfaceC8826e interfaceC8826e) {
        return interfaceC8826e.pro() != C11625e.f23330e;
    }
}
