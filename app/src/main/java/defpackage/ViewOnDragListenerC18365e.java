package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC18365e implements View.OnDragListener, InterfaceC6199e {
    public final C7556e ad = new C7556e(null, 3);
    public final C17548e vip = new C17548e(0);
    public final C10414e metrica = new C10414e(this);

    public ViewOnDragListenerC18365e(C9335e c9335e) {
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [eٍؚؔ, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C6057e c6057e = new C6057e(dragEvent);
        int action = dragEvent.getAction();
        C17548e c17548e = this.vip;
        C7556e c7556e = this.ad;
        switch (action) {
            case 1:
                ?? obj = new Object();
                C7314e c7314e = new C7314e(3, c6057e, c7556e, obj);
                if (c7314e.invoke(c7556e) == EnumC9253e.f18468e) {
                    AbstractC14114e.mopub(c7556e, c7314e);
                }
                boolean z = obj.f18534e;
                c17548e.getClass();
                C6748e c6748e = new C6748e(c17548e);
                while (c6748e.hasNext()) {
                    ((InterfaceC13418e) c6748e.next()).mo2052continue(c6057e);
                }
                return z;
            case 2:
                c7556e.mo2054e(c6057e);
                return false;
            case 3:
                return c7556e.mo2053e(c6057e);
            case 4:
                c7556e.mo2055goto(c6057e);
                c17548e.clear();
                return false;
            case 5:
                c7556e.inmobi(c6057e);
                return false;
            case 6:
                c7556e.mo2056static(c6057e);
                return false;
            default:
                return false;
        }
    }
}
