package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279e extends C9645e {
    @Override // defpackage.C18507e, defpackage.C7788e, defpackage.AbstractC6560e
    public void vip(C15013e c15013e, C15013e c15013e2, Window window, View view, boolean z, boolean z2) {
        AbstractC13467e.metrica(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        c15013e.getClass();
        c15013e2.getClass();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof AbstractC12824e)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        C2691e c2691e = new C2691e(view);
        int i3 = Build.VERSION.SDK_INT;
        AbstractC12501e c12643e = i3 >= 35 ? new C12643e(window, c2691e) : i3 >= 30 ? new C12643e(window, c2691e) : i3 >= 26 ? new C2309e(window, c2691e) : new C2309e(window, c2691e);
        c12643e.mopub(!z);
        c12643e.adcel(true ^ z2);
    }
}
