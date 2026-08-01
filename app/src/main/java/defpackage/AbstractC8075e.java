package defpackage;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8075e {
    public static final C16694e ad;
    public static final ArrayList metrica;
    public static final ThreadLocal vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eْ٘ۤ, eؘٗؑ] */
    static {
        ?? abstractC18109e = new AbstractC18109e();
        abstractC18109e.f32752e = new ArrayList();
        abstractC18109e.f32750e = false;
        abstractC18109e.f32755e = 0;
        abstractC18109e.f32751e = false;
        abstractC18109e.m4175while(new C15554e(2));
        abstractC18109e.m4175while(new AbstractC18109e());
        abstractC18109e.m4175while(new C15554e(1));
        ad = abstractC18109e;
        vip = new ThreadLocal();
        metrica = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, eؚْۚ] */
    public static void ad(FrameLayout frameLayout, AbstractC18109e abstractC18109e) {
        ArrayList arrayList = metrica;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC18109e == null) {
            abstractC18109e = ad;
        }
        AbstractC18109e clone = abstractC18109e.clone();
        ArrayList arrayList2 = (ArrayList) vip().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC18109e) it.next()).isPro(frameLayout);
            }
        }
        clone.yandex(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ?? obj = new Object();
        obj.f26090e = clone;
        obj.f26089e = frameLayout;
        frameLayout.addOnAttachStateChangeListener(obj);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eٕ٘ؔ, eؓۨۖ, java.lang.Object] */
    public static C2271e vip() {
        C2271e c2271e;
        ThreadLocal threadLocal = vip;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2271e = (C2271e) weakReference.get()) != null) {
            return c2271e;
        }
        ?? c17519e = new C17519e(0);
        threadLocal.set(new WeakReference(c17519e));
        return c17519e;
    }
}
