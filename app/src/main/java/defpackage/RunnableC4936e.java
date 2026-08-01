package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4936e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C18424e f10443e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6584e f10444e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10445e;

    public /* synthetic */ RunnableC4936e(C6584e c6584e, C18424e c18424e, int i) {
        this.f10445e = i;
        this.f10444e = c6584e;
        this.f10443e = c18424e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set unmodifiableSet;
        switch (this.f10445e) {
            case 0:
                C6584e c6584e = this.f10444e;
                C18424e c18424e = this.f10443e;
                if (c6584e.loadAd()) {
                    return;
                }
                InterfaceC10645e interfaceC10645e = c18424e.license;
                interfaceC10645e.getClass();
                synchronized (c6584e) {
                    try {
                        C17249e c17249e = c6584e.f13590goto;
                        Collection collection = (Collection) c17249e.f4930e.remove(interfaceC10645e);
                        if (collection == null) {
                            unmodifiableSet = Collections.EMPTY_SET;
                        } else {
                            C11313e appmetrica = C11313e.appmetrica(c17249e.f33786e);
                            appmetrica.addAll(collection);
                            c17249e.f4931e -= collection.size();
                            collection.clear();
                            unmodifiableSet = DesugarCollections.unmodifiableSet(appmetrica);
                        }
                        Iterator it = unmodifiableSet.iterator();
                        while (it.hasNext()) {
                            c6584e.f13591interface.remove((String) it.next(), c18424e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c6584e.ads) {
                    if (C6584e.Signature(c18424e)) {
                        return;
                    }
                    if (c6584e.amazon(c18424e)) {
                        c6584e.ads = false;
                    }
                }
                c6584e.appmetrica.getClass();
                return;
            case 1:
                this.f10444e.billing.m4327e(this.f10443e, RecyclerView.UNDEFINED_DURATION, 9, BinderC17428e.m4321e(new C13415e(28)));
                return;
            case 2:
                this.f10444e.billing.m4327e(this.f10443e, RecyclerView.UNDEFINED_DURATION, 7, BinderC17428e.m4321e(new C13415e(24)));
                return;
            case 3:
                this.f10444e.billing.m4327e(this.f10443e, RecyclerView.UNDEFINED_DURATION, 12, BinderC17428e.m4321e(new C13415e(27)));
                return;
            case 4:
                this.f10444e.billing.m4327e(this.f10443e, RecyclerView.UNDEFINED_DURATION, 11, BinderC17428e.m4321e(new C13415e(23)));
                return;
            case 5:
                this.f10444e.billing.m4327e(this.f10443e, RecyclerView.UNDEFINED_DURATION, 3, BinderC17428e.m4321e(new C15945e(2)));
                return;
            case 6:
                this.f10444e.billing.m4327e(this.f10443e, RecyclerView.UNDEFINED_DURATION, 1, BinderC17428e.m4321e(new C13415e(20)));
                return;
            case 7:
                this.f10444e.billing.m4328e(this.f10443e, RecyclerView.UNDEFINED_DURATION);
                return;
            case 8:
                this.f10444e.billing.m4328e(this.f10443e, RecyclerView.UNDEFINED_DURATION);
                return;
            default:
                this.f10444e.billing.m4327e(this.f10443e, RecyclerView.UNDEFINED_DURATION, 1, BinderC17428e.m4321e(new C13415e(20)));
                return;
        }
    }
}
