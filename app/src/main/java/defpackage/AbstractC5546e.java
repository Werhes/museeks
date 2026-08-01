package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.adcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5546e {
    public static final C4526e ad = new C4526e(25);
    public static final C14028e vip = new C14028e(2);

    public static final int ad(AbstractC9292e abstractC9292e, AbstractC17016e abstractC17016e) {
        AbstractC9292e mo1471switch = abstractC9292e.mo1471switch();
        if (mo1471switch == null) {
            AbstractC14070e.metrica("Child of " + abstractC9292e + " cannot be null when calculating alignment line");
        }
        if (abstractC9292e.mo1469e().ad().containsKey(abstractC17016e)) {
            Integer num = (Integer) abstractC9292e.mo1469e().ad().get(abstractC17016e);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int mo393try = mo1471switch.mo393try(abstractC17016e);
            if (mo393try != Integer.MIN_VALUE) {
                mo1471switch.f18511e = true;
                abstractC9292e.f18514e = true;
                abstractC9292e.mo1463e();
                mo1471switch.f18511e = false;
                abstractC9292e.f18514e = false;
                return mo393try + ((int) (abstractC17016e instanceof C4782e ? mo1471switch.mo1467e() & 4294967295L : mo1471switch.mo1467e() >> 32));
            }
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public static final int appmetrica(C13770e c13770e) {
        long j = c13770e.f27286case;
        return (int) (j ^ (j >>> 32));
    }

    public static final C14725e billing(C13770e c13770e) {
        C13770e c13770e2;
        c13770e.m3656catch(206, AbstractC1889e.appmetrica);
        if (c13770e.f27292implements) {
            C14479e.applovin(c13770e.f27296this);
        }
        Object crashlytics = c13770e.crashlytics();
        InterfaceC9374e interfaceC9374e = crashlytics instanceof InterfaceC9374e ? (InterfaceC9374e) crashlytics : null;
        if (interfaceC9374e == null) {
            c13770e2 = c13770e;
            interfaceC9374e = new C6673e(new C5598e(new C14725e(c13770e2, c13770e.f27286case, c13770e.admob, c13770e.subs, c13770e.yandex.f34307e)), -1);
            c13770e2.m3663finally(interfaceC9374e);
        } else {
            c13770e2 = c13770e;
        }
        C5598e c5598e = (C5598e) interfaceC9374e.applovin();
        c5598e.f11954e.purchase.setValue(c13770e2.advert());
        c13770e2.Signature(false);
        return c5598e.f11954e;
    }

    public static int license(C6226e c6226e, AbstractC6945e abstractC6945e, View view, View view2, adcel adcelVar, boolean z) {
        if (adcelVar.tapsense() == 0 || c6226e.vip() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c6226e.vip();
        }
        return (int) (((abstractC6945e.vip(view2) - abstractC6945e.appmetrica(view)) / (Math.abs(adcel.m145extends(view) - adcel.m145extends(view2)) + 1)) * c6226e.vip());
    }

    public static int metrica(C6226e c6226e, AbstractC6945e abstractC6945e, View view, View view2, adcel adcelVar, boolean z, boolean z2) {
        if (adcelVar.tapsense() == 0 || c6226e.vip() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c6226e.vip() - Math.max(adcel.m145extends(view), adcel.m145extends(view2))) - 1) : Math.max(0, Math.min(adcel.m145extends(view), adcel.m145extends(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC6945e.vip(view2) - abstractC6945e.appmetrica(view)) / (Math.abs(adcel.m145extends(view) - adcel.m145extends(view2)) + 1))) + (abstractC6945e.mopub() - abstractC6945e.appmetrica(view)));
        }
        return max;
    }

    public static final void purchase() {
        throw new IllegalStateException("Invalid applier");
    }

    public static int vip(C6226e c6226e, AbstractC6945e abstractC6945e, View view, View view2, adcel adcelVar, boolean z) {
        if (adcelVar.tapsense() == 0 || c6226e.vip() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(adcel.m145extends(view) - adcel.m145extends(view2)) + 1;
        }
        return Math.min(abstractC6945e.advert(), abstractC6945e.vip(view2) - abstractC6945e.appmetrica(view));
    }
}
